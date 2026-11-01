package dev.renkinProject.renkin.ui.theme

import androidx.compose.ui.graphics.Color

// VIPD's stable black-and-green branding: separate from Android wallpaper colours.
// Role colours are intentionally softer than the neon VX launcher mark for readable UI.

val md_theme_light_primary = Color(0xFF236E2E)
val md_theme_light_onPrimary = Color(0xFFFFFFFF)
val md_theme_light_primaryContainer = Color(0xFFB8F5AF)
val md_theme_light_onPrimaryContainer = Color(0xFF0A3A16)
val md_theme_light_secondary = Color(0xFF4E6650)
val md_theme_light_onSecondary = Color(0xFFFFFFFF)
val md_theme_light_secondaryContainer = Color(0xFFD0EBD2)
val md_theme_light_onSecondaryContainer = Color(0xFF243C29)
val md_theme_light_tertiary = Color(0xFF536952)
val md_theme_light_onTertiary = Color(0xFFFFFFFF)
val md_theme_light_tertiaryContainer = Color(0xFFD6ECD2)
val md_theme_light_onTertiaryContainer = Color(0xFF1A351E)
val md_theme_light_error = Color(0xFFBA1A1A)
val md_theme_light_errorContainer = Color(0xFFFFDAD6)
val md_theme_light_onError = Color(0xFFFFFFFF)
val md_theme_light_onErrorContainer = Color(0xFF410002)
val md_theme_light_background = Color(0xFFFAFDF8)
val md_theme_light_onBackground = Color(0xFF171D16)
val md_theme_light_surface = Color(0xFFFAFDF8)
val md_theme_light_onSurface = Color(0xFF171D16)
val md_theme_light_surfaceVariant = Color(0xFFDDE8DB)
val md_theme_light_onSurfaceVariant = Color(0xFF404C40)
val md_theme_light_outline = Color(0xFF70806F)
val md_theme_light_inverseOnSurface = Color(0xFFF0F7EB)
val md_theme_light_inverseSurface = Color(0xFF2D342D)
val md_theme_light_inversePrimary = Color(0xFF91F47E)
val md_theme_light_shadow = Color(0xFF000000)
val md_theme_light_surfaceTint = Color(0xFF236E2E)
val md_theme_light_outlineVariant = Color(0xFFBECBBC)
val md_theme_light_scrim = Color(0xFF000000)

val md_theme_dark_primary = Color(0xFF91F47E)
val md_theme_dark_onPrimary = Color(0xFF092C0C)
val md_theme_dark_primaryContainer = Color(0xFF17652E)
val md_theme_dark_onPrimaryContainer = Color(0xFFE7FFE2)
val md_theme_dark_secondary = Color(0xFFA8DDAA)
val md_theme_dark_onSecondary = Color(0xFF153A1B)
val md_theme_dark_secondaryContainer = Color(0xFF23482B)
val md_theme_dark_onSecondaryContainer = Color(0xFFD7F6DB)
val md_theme_dark_tertiary = Color(0xFFB7D9B4)
val md_theme_dark_onTertiary = Color(0xFF233E22)
val md_theme_dark_tertiaryContainer = Color(0xFF3E553F)
val md_theme_dark_onTertiaryContainer = Color(0xFFF0FFEC)
val md_theme_dark_error = Color(0xFFFFB4AB)
val md_theme_dark_errorContainer = Color(0xFF93000A)
val md_theme_dark_onError = Color(0xFF690005)
val md_theme_dark_onErrorContainer = Color(0xFFFFDAD6)
val md_theme_dark_background = Color(0xFF151815)
val md_theme_dark_onBackground = Color(0xFFE5EEE4)
val md_theme_dark_surface = Color(0xFF151815)
val md_theme_dark_onSurface = Color(0xFFE5EEE4)
val md_theme_dark_surfaceVariant = Color(0xFF414941)
val md_theme_dark_onSurfaceVariant = Color(0xFFC2D0C0)
val md_theme_dark_outline = Color(0xFF8D9E8D)
val md_theme_dark_inverseOnSurface = Color(0xFF151815)
val md_theme_dark_inverseSurface = Color(0xFFE4EEE4)
val md_theme_dark_inversePrimary = Color(0xFF2A7B33)
val md_theme_dark_shadow = Color(0xFF000000)
val md_theme_dark_surfaceTint = Color(0xFF91F47E)
val md_theme_dark_outlineVariant = Color(0xFF414C41)
val md_theme_dark_scrim = Color(0xFF000000)


val seed = Color(0xFF4DFF00)

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