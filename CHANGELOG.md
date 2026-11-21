<!--
  This file owns the *history* of shabbattimes: what and when changed.
  It is the single source of truth for the chronological record of the shabbat-times.

  CONTRIBUTING.md owns *how* to write entries and the versioning rules.
  MAINTAINER.md owns *how* a release is actually cut and tagged.
  If you're about to write process steps or bump rules here, they
  belong in one of those files instead - link to them rather than
  duplicating.

  DRIFT GUARD: Keep entries feat-scoped and outcome-oriented.
  Do not put installation instructions, wiring details, or design
  rationale in this file. Those live in ARCHITECTURE.md.
-->

# Changelog

All notable changes to shabbattimes are documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/).
This project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).
Each entry links to the PR that introduced it; each release links to a diff against the previous one.

Versions v0.0.1 to v0.6.0 are milestones reconstructed from the history before the shabbattimes feature was extracted into this project.
They predate pull requests and the Gradle project, so they carry no PR links and cannot be built.

Later versions were renumbered from the original tags.

## [Unreleased]

### Changed

- Updated AGP, Kotlin, Hilt, and Gradle wrapper
- Updated project dependencies and SDK configuration

## [v0.12.4] - 2026-08-23

### Changed

- Bumped skills submodule to v0.1.1 [pull/30](https://github.com/soulSalttrader/shabbat-times/pull/30)

## [v0.12.3] - 2026-08-19

### Changed

- Restructured agent guidelines and adopted shared skill-kit [pull/28](https://github.com/soulSalttrader/shabbat-times/pull/28)

## [v0.12.2] - 2026-08-02

### Added

- Standardized Kotlin code style and introduced ktlint enforcement [pull/26](https://github.com/soulSalttrader/shabbat-times/pull/26)

## [v0.12.1] - 2026-07-28

### Added

- Introduced automated pull request generation workflow and agent skill [pull/24](https://github.com/soulSalttrader/shabbat-times/pull/24)

## [v0.12.0] - 2026-07-26

### Added

- Expanded Shabbat preferences, location handling, and connectivity support [pull/22](https://github.com/soulSalttrader/shabbat-times/pull/22)

## [v0.11.2] - 2026-06-13

### Changed

- Established comprehensive permission and UI testing infrastructure [pull/20](https://github.com/soulSalttrader/shabbat-times/pull/20)

## [v0.11.1] - 2026-05-25

### Changed

- Upgraded project infrastructure and standardized build configuration [pull/18](https://github.com/soulSalttrader/shabbat-times/pull/18)

## [v0.11.0] - 2026-05-24

### Added

- Introduced community traditions, settings screen, and improveded user feedback [pull/16](https://github.com/soulSalttrader/shabbat-times/pull/16)

## [v0.10.0] - 2026-05-16

### Added

- Introduced Room persistence and refined location permission handling [pull/14](https://github.com/soulSalttrader/shabbat-times/pull/14)

## [v0.9.1] - 2026-05-07

### Changed

- Introduced location-based architecture and decoupled GPS, search, and Shabbat flows [pull/12](https://github.com/soulSalttrader/shabbat-times/pull/12)

## [v0.9.0] - 2026-04-27

### Added

- Implemented reactive current location and decouple permission management [pull/9](https://github.com/soulSalttrader/shabbat-times/pull/9)

## [v0.8.0] - 2026-04-04

### Added

- Added reorderable location management and swipe-to-delete [pull/7](https://github.com/soulSalttrader/shabbat-times/pull/7)

## [v0.7.0] - 2026-03-14

### Changed

- Modernized Shabbat screen and introduce multi-location support [pull/4](https://github.com/soulSalttrader/shabbat-times/pull/4)

### Added

- Introduced reactive city search and modernize Shabbat data flows [pull/5](https://github.com/soulSalttrader/shabbat-times/pull/5)

## [v0.6.1] - 2026-01-31

### Added

- Added Gradle configuration and app shell after git filter-repo extraction [pull/1](https://github.com/soulSalttrader/shabbat-times/pull/1)
- Extracted NavController handlers with logging [pull/2](https://github.com/soulSalttrader/shabbat-times/pull/2)

## [v0.6.0] - 2026-01-22

### Added

- Introduced MVI-based runtime permission and location handling

## [v0.5.0] - 2025-12-23

### Added

- Unified MVI event handling and centralized app state management

## [v0.4.0] - 2025-12-03

### Added

- Implemented halachic times calculation and display

## [v0.3.0] - 2025-12-01

### Added

- Introduced Shabbat repository layer and MVVM/MVI comparison

## [v0.2.0] - 2025-11-30

### Added

- Added Shabbat screen with reactive UI state handling

## [v0.1.0] - 2025-11-25

### Added

- Introduced debug flag and state transition logging
- Introduced decoupled navigation architecture

## [v0.0.1] - 2025-10-15

- initial commit

[v0.12.4]: https://github.com/soulSalttrader/shabbat-times/compare/v0.12.3...v0.12.4
[v0.12.3]: https://github.com/soulSalttrader/shabbat-times/compare/v0.12.2...v0.12.3
[v0.12.2]: https://github.com/soulSalttrader/shabbat-times/compare/v0.12.1...v0.12.2
[v0.12.1]: https://github.com/soulSalttrader/shabbat-times/compare/v0.12.0...v0.12.1
[v0.12.0]: https://github.com/soulSalttrader/shabbat-times/compare/v0.11.2...v0.12.0
[v0.11.2]: https://github.com/soulSalttrader/shabbat-times/compare/v0.11.1...v0.11.2
[v0.11.1]: https://github.com/soulSalttrader/shabbat-times/compare/v0.11.0...v0.11.1
[v0.11.0]: https://github.com/soulSalttrader/shabbat-times/compare/v0.10.0...v0.11.0
[v0.10.0]: https://github.com/soulSalttrader/shabbat-times/compare/v0.9.1...v0.10.0
[v0.9.1]: https://github.com/soulSalttrader/shabbat-times/compare/v0.9.0...v0.9.1
[v0.9.0]: https://github.com/soulSalttrader/shabbat-times/compare/v0.8.0...v0.9.0
[v0.8.0]: https://github.com/soulSalttrader/shabbat-times/compare/v0.7.0...v0.8.0
[v0.7.0]: https://github.com/soulSalttrader/shabbat-times/compare/v0.6.1...v0.7.0
[v0.6.1]: https://github.com/soulSalttrader/shabbat-times/compare/v0.6.0...v0.6.1
[v0.6.0]: https://github.com/soulSalttrader/shabbat-times/compare/v0.5.0...v0.6.0
[v0.5.0]: https://github.com/soulSalttrader/shabbat-times/compare/v0.4.0...v0.5.0
[v0.4.0]: https://github.com/soulSalttrader/shabbat-times/compare/v0.3.0...v0.4.0
[v0.3.0]: https://github.com/soulSalttrader/shabbat-times/compare/v0.2.0...v0.3.0
[v0.2.0]: https://github.com/soulSalttrader/shabbat-times/compare/v0.1.0...v0.2.0
[v0.1.0]: https://github.com/soulSalttrader/shabbat-times/compare/v0.0.1...v0.1.0
[v0.0.1]: https://github.com/soulSalttrader/shabbat-times/releases/tag/v0.0.1
