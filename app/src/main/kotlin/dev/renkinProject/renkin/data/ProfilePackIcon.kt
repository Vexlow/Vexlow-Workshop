package dev.renkinProject.renkin.data

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.net.Uri
import android.util.Base64
import java.io.ByteArrayOutputStream
import java.io.IOException

/**
 * Portable profile launcher icon. The database field predates this feature and is named
 * packIconPath, but it stores a small embedded PNG instead of a device-specific document URI.
 * This lets an exported profile carry its icon to a different device.
 */
object ProfilePackIcon {
    private const val PREFIX = "data:image/png;base64,"
    private const val SIZE = 384
    private const val MAX_ENCODED_LENGTH = 2_000_000

    /** Load, center-crop, resize and embed an image selected using Android's document picker. */
    @Throws(IOException::class)
    fun fromUri(context: Context, uri: Uri): String {
        val bounds = BitmapFactory.Options().apply { inJustDecodeBounds = true }
        val firstStream = context.contentResolver.openInputStream(uri)
            ?: throw IOException("Could not open image")
        firstStream.use { BitmapFactory.decodeStream(it, null, bounds) }
        if (bounds.outWidth <= 0 || bounds.outHeight <= 0) {
            throw IOException("Unsupported image")
        }

        var sample = 1
        while (bounds.outWidth / sample > 1024 || bounds.outHeight / sample > 1024) {
            sample *= 2
        }
        val decoded = context.contentResolver.openInputStream(uri)?.use { stream ->
            BitmapFactory.decodeStream(stream, null, BitmapFactory.Options().apply {
                inSampleSize = sample
            })
        } ?: throw IOException("Could not decode image")

        try {
            val side = minOf(decoded.width, decoded.height)
            val source = Rect(
                (decoded.width - side) / 2,
                (decoded.height - side) / 2,
                (decoded.width + side) / 2,
                (decoded.height + side) / 2
            )
            val square = Bitmap.createBitmap(SIZE, SIZE, Bitmap.Config.ARGB_8888)
            try {
                Canvas(square).drawBitmap(
                    decoded, source, Rect(0, 0, SIZE, SIZE), Paint(Paint.FILTER_BITMAP_FLAG)
                )
                val output = ByteArrayOutputStream()
                if (!square.compress(Bitmap.CompressFormat.PNG, 100, output)) {
                    throw IOException("Could not encode image")
                }
                val value = PREFIX + Base64.encodeToString(output.toByteArray(), Base64.NO_WRAP)
                if (value.length > MAX_ENCODED_LENGTH) throw IOException("Image is too large")
                return value
            } finally {
                square.recycle()
            }
        } finally {
            decoded.recycle()
        }
    }

    /** Old document URIs and invalid embedded data safely use the app's default icon. */
    fun decode(value: String): Bitmap? {
        if (!value.startsWith(PREFIX) || value.length > MAX_ENCODED_LENGTH) return null
        return runCatching {
            val bytes = Base64.decode(value.substring(PREFIX.length), Base64.DEFAULT)
            val bounds = BitmapFactory.Options().apply { inJustDecodeBounds = true }
            BitmapFactory.decodeByteArray(bytes, 0, bytes.size, bounds)
            require(bounds.outWidth in 1..1024 && bounds.outHeight in 1..1024)
            BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
        }.getOrNull()
    }
}
