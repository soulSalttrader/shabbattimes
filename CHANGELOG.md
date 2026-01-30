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

[v0.6.1]: https://github.com/soulSalttrader/shabbat-times/compare/v0.6.0...v0.6.1
[v0.6.0]: https://github.com/soulSalttrader/shabbat-times/compare/v0.5.0...v0.6.0
[v0.5.0]: https://github.com/soulSalttrader/shabbat-times/compare/v0.4.0...v0.5.0
[v0.4.0]: https://github.com/soulSalttrader/shabbat-times/compare/v0.3.0...v0.4.0
[v0.3.0]: https://github.com/soulSalttrader/shabbat-times/compare/v0.2.0...v0.3.0
[v0.2.0]: https://github.com/soulSalttrader/shabbat-times/compare/v0.1.0...v0.2.0
[v0.1.0]: https://github.com/soulSalttrader/shabbat-times/compare/v0.0.1...v0.1.0
[v0.0.1]: https://github.com/soulSalttrader/shabbat-times/releases/tag/v0.0.1
