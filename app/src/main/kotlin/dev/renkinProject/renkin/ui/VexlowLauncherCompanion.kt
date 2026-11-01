package dev.renkinProject.renkin.ui

import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Apps
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import dev.renkinProject.renkin.R
import dev.renkinProject.renkin.ui.theme.CardShape

/**
 * Vexlow Launcher is a separate app. Never use an invented Play Store URI
 * or confuse this product with VIVD's own theme/pack tools.
 */
@Composable
internal fun VexlowLauncherCompanion() {
    val context = LocalContext.current
    val storeUrl = stringResource(R.string.vexlowLauncherPlayUrl).trim()
    val hasListing = storeUrl.startsWith("https://play.google.com/store/apps/details?")
    Surface(
        color = MaterialTheme.colorScheme.surfaceContainer,
        shape = CardShape,
        modifier = Modifier
            .fillMaxWidth()
            .clickable(enabled = hasListing) {
                try {
                    context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(storeUrl)))
                } catch (_: Exception) {
                    Toast.makeText(context, "Unable to open Google Play", Toast.LENGTH_SHORT).show()
                }
            }
    ) {
        Row(
            Modifier.padding(horizontal = 16.dp, vertical = 15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Filled.Apps,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.secondary
            )
            Spacer(Modifier.width(14.dp))
            Column {
                Text(
                    text = stringResource(R.string.vexlowLauncherLabel),
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.titleSmall
                )
                Text(
                    text = if (hasListing) stringResource(R.string.vexlowLauncherStoreAction)
                           else stringResource(R.string.vexlowLauncherComingSoon),
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}
