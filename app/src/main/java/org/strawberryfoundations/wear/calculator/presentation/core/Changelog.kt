package org.strawberryfoundations.wear.calculator.presentation.core

data class ChangelogEntry(
    val version: String,
    val date: String,
    val changes: List<String>
)

/// This project uses 'semver' to manage its versioning. (MAJOR.MINOR.PATCH)
/// MAJOR version when you make incompatible API changes,
/// MINOR version when you add functionality in a backwards-compatible manner,
/// PATCH version when you make backwards-compatible bug fixes.

object Changelog {
    val entries = listOf(
        ChangelogEntry(
            version = "1.1.0",
            date = "Jun 8, 2026",
            changes = listOf(
                "[UI] Improved Changelog UI",
                "[UI] Removed padding for Changelog & QR Code Buttons in Settings",
                "[PRJ] Dependency updates"
            )
        ),
        ChangelogEntry(
            version = "1.0.5",
            date = "May 8, 2026",
            changes = listOf(
                "[PRJ] Updated AGP to v9.2.1",
                "[PRJ] Dependency updates",
                "[UI] Small UI changes",
                "[NEW] Add QR Code to GitHub Repository"
            )
        ),
        ChangelogEntry(
            version = "1.0.4",
            date = "Apr 23, 2026",
            changes = listOf(
                "[PRJ] Updated AGP to v9.2.0",
                "[PRJ] Dependency updates",
                "[UX] Improve visibility handling in PagerChangePopup"
            )
        ),
        ChangelogEntry(
            version = "1.0.3",
            date = "Apr 7, 2026",
            changes = listOf(
                "[PRJ] New app name",
                "[UI] Added small pop-up when changing the view",
                "[NEW] Previous history entries are now reusable",
                "[PRJ] Gradle build config update to match Google's AGP 9.x version"
            )
        ),
        ChangelogEntry(
            version = "1.0.2",
            date = "Mar 29, 2026",
            changes = listOf(
                "[PRJ] Update libraries",
                "[FIX] Internal code optimizations & fixes"
            )
        ),
        ChangelogEntry(
            version = "1.0.1",
            date = "Mar 14, 2026",
            changes = listOf(
                "[FIX] Fixed scroll logic (rotaryStep) in bill split view",
                "[FIX] Fixed resetting bill split values when navigating away from the bill split view"
            )
        ),
        ChangelogEntry(
            version = "1.0.0",
            date = "Mar 14, 2026",
            changes = listOf(
                "[NEW] Initial full release",
                "[NEW] Basic calculator functionality",
                "[NEW] Bill splitting feature",
                "[UI] Customizable currency icons"
            )
        )
    )
}