package dev.renkinProject.renkin.ui.theme

import androidx.compose.ui.graphics.Color

// Vexlow Neon v1: colors sourced from design/vexlow-neon.tokens.json.
// Material3 dark roles match Studio; light roles maintain readable accessibility.
// Icon-pack artwork color selection remains independent from application UI branding.

val md_theme_light_primary = Color(0xFF246D53)
val md_theme_light_onPrimary = Color(0xFFFFFFFF)
val md_theme_light_primaryContainer = Color(0xFFC8F3DD)
val md_theme_light_onPrimaryContainer = Color(0xFF102C20)
val md_theme_light_secondary = Color(0xFF65559B)
val md_theme_light_onSecondary = Color(0xFFFFFFFF)
val md_theme_light_secondaryContainer = Color(0xFFE9DFFC)
val md_theme_light_onSecondaryContainer = Color(0xFF342454)
val md_theme_light_tertiary = Color(0xFF915552)
val md_theme_light_onTertiary = Color(0xFFFFFFFF)
val md_theme_light_tertiaryContainer = Color(0xFFFFE4DF)
val md_theme_light_onTertiaryContainer = Color(0xFF552A2D)
val md_theme_light_error = Color(0xFFBA1A1A)
val md_theme_light_errorContainer = Color(0xFFFFDAD6)
val md_theme_light_onError = Color(0xFFFFFFFF)
val md_theme_light_onErrorContainer = Color(0xFF410002)
val md_theme_light_background = Color(0xFFF5F7FC)
val md_theme_light_onBackground = Color(0xFF192639)
val md_theme_light_surface = Color(0xFFF5F7FC)
val md_theme_light_onSurface = Color(0xFF192639)
val md_theme_light_surfaceVariant = Color(0xFFE1E9F3)
val md_theme_light_onSurfaceVariant = Color(0xFF42546C)
val md_theme_light_outline = Color(0xFF718198)
val md_theme_light_inverseOnSurface = Color(0xFFECF2FF)
val md_theme_light_inverseSurface = Color(0xFF27384E)
val md_theme_light_inversePrimary = Color(0xFF58ECA8)
val md_theme_light_shadow = Color(0xFF000000)
val md_theme_light_surfaceTint = Color(0xFF246D53)
val md_theme_light_outlineVariant = Color(0xFFBDC9D7)
val md_theme_light_scrim = Color(0xFF000000)

val md_theme_dark_primary = Color(0xFF58ECA8)
val md_theme_dark_onPrimary = Color(0xFF081B15)
val md_theme_dark_primaryContainer = Color(0xFF233249)
val md_theme_dark_onPrimaryContainer = Color(0xFFF5F8FF)
val md_theme_dark_secondary = Color(0xFFAD91F5)
val md_theme_dark_onSecondary = Color(0xFF241638)
val md_theme_dark_secondaryContainer = Color(0xFF352B56)
val md_theme_dark_onSecondaryContainer = Color(0xFFEEE4FF)
val md_theme_dark_tertiary = Color(0xFFF38F8D)
val md_theme_dark_onTertiary = Color(0xFF391B21)
val md_theme_dark_tertiaryContainer = Color(0xFF50323D)
val md_theme_dark_onTertiaryContainer = Color(0xFFFFE7E5)
val md_theme_dark_error = Color(0xFFFFB4AB)
val md_theme_dark_errorContainer = Color(0xFF93000A)
val md_theme_dark_onError = Color(0xFF690005)
val md_theme_dark_onErrorContainer = Color(0xFFFFDAD6)
val md_theme_dark_background = Color(0xFF0B1220)
val md_theme_dark_onBackground = Color(0xFFF5F8FF)
val md_theme_dark_surface = Color(0xFF0B1220)
val md_theme_dark_onSurface = Color(0xFFF5F8FF)
val md_theme_dark_surfaceVariant = Color(0xFF233249)
val md_theme_dark_onSurfaceVariant = Color(0xFFB8C4D6)
val md_theme_dark_outline = Color(0xFF8998B3)
val md_theme_dark_inverseOnSurface = Color(0xFF0B1220)
val md_theme_dark_inverseSurface = Color(0xFFF5F8FF)
val md_theme_dark_inversePrimary = Color(0xFF237351)
val md_theme_dark_shadow = Color(0xFF000000)
val md_theme_dark_surfaceTint = Color(0xFF58ECA8)
val md_theme_dark_outlineVariant = Color(0xFF35445D)
val md_theme_dark_scrim = Color(0xFF000000)


val seed = Color(0xFF58ECA8)

// Marks icons added since the last build — the selection frame in the icon browser, the
// "new" dot in the build preview, and the green segment of the change bar.
val AddedGreen = Color(0xFF34C759)

// Marks icons changed (re-edited) since the last build, and the calendar "missing days"
// warning — distinct from AddedGreen so "new" and "changed" read differently in the preview.
val ChangedOrange = Color(0xFFFF9500)

// Marks icons dropped since the last build. Fixed rather than colorScheme.error: the error tone
// is wallpaper-derived, and on a warm Material You palette it came out close enough to the
// hero bar's primary that the removed segment disappeared into it.
val RemovedRed = Color(0xFFFF3B30)

// The hero completion bar's "everything themed and built" celebration: the gold fill and
// the lighter highlight that sweeps across it.
val GoldBase = Color(0xFFDAA520)
val GoldShimmer = Color(0xFFFFEFB0)