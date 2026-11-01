# Vexlow Neon theme integration

This branch adopts [Vexlow Neon 1.0](../../design/vexlow-neon.tokens.json), the Vexlow-wide interface system.

- **Canonical design tokens** live in `Vexlow/Vexlow-Studio/design/vexlow-neon.tokens.json`.
- The copy in this repository is an exact mirror so VIVD can build independently/offline.
- Compose's existing Material3 dark/light roles now derive from these named colors. A light variant remains for the user's chosen appearance preference.
- The main icon-pack card now uses the shared midnight/violet hero treatment.
- The `VexlowNeon.kt` values are **for app UI**, not for recoloring the icons a customer creates.
- Keep VIVD's icons, pack-building functionality, icon colors, user themes and profile data unchanged.
- Vexlow Launcher is an **independent Android product** with its own future store page. Its app-store button must be an external link to a *verified* listing, not a setting inside VIVD.

## Sync procedure

1. Update the canonical JSON in Studio and increment its version.
2. Copy the complete JSON into VIVD and Launcher.
3. Adapt Compose roles and corresponding Studio/Launcher theme implementations.
4. Validate color readability (both themes) and test the main editor after changes.
5. Build test APKs before merging.

Note: This repository is a GPL-licensed Renkin derivative; keep all existing license/attribution obligations.
