# Android XR Spatial Integration Starter Kit 👓

Welcome to the premium boilerplate for building "Heads-Up" applications for the Android XR ecosystem (Samsung Galaxy Glasses, XREAL Project Aura, Warby Parker, etc.).

As of May 2026, the standard has shifted from closed VR to open, phone-tethered split-compute spatial apps. This kit gets you from 0 to "glanceable XR companion" in 5 minutes.

## Features
- **Jetpack XR SDK configured**: Pre-configured with the latest `androidx.xr` dependencies.
- **SpatialPanel Scaffold**: Out-of-the-box `MainActivity` that renders a floating 3D panel.
- **Split-Compute Ready**: Architected to keep heavy logic on the phone while projecting lightweight UI to the glasses.
- **Emulator Ready**: Tested with the Android Studio AI Glasses emulator (70-degree FOV).

## Quick Start
1. Open this project in Android Studio (Iguana or later).
2. Start the **AI Glasses Emulator**.
3. Hit Run (`Shift + F10`).
4. You should see the floating "Welcome" panel in the spatial environment.

## Next Steps
Read the `docs/advanced-meshing.md` (Premium version only) to learn how to integrate Gemini Nano for object recognition directly from the glasses' camera feed.