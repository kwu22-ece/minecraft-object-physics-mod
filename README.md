# Minecraft Object Physics Mod

This project will focus on building a Fabric, Java Minecraft mod prototype for experimenting with simplified object physics, block/entity motion, collisions, and future implimenations. The scope intended is to explore how game objects could respond to mass, friction, restitution, density, and collision rules for future use in future VR Minecraft weapons mod.

## Motivation

Minecraft has many blocks that behave as static world elements, and adding a touch of interactive realism would make future projects possible. This project is a planned modding experiment for adding lightweight physical behavior to selected objects while keeping the design understandable and playable.

The project connects software engineering, physics simulation, and game systems design. It is structured like a real Java Fabric mod, then a finished gameplay mod with a few simple blocks and 3d object environments.

## Planned Features

- Physics material definitions for wood, stone, metal, glass, rubber, and other block-like materials.
- Simplified physics objects with position, velocity, mass, and collision properties.
- Prototype physics engine for gravity, damping, and collision response.
- Registry structure for future custom blocks and items.
- Fabric mod metadata and Gradle build files.
- Documentation for physics design, gameplay scope, and roadmap.

## Hardware Stack

No dedicated hardware is required for this step.

Development machine requirements:

- Java development environment.
- Gradle or Gradle wrapper once added.
- Minecraft client compatible with the selected Fabric version.

## Software Stack

- Language: Java.
- Mod loader: Fabric.
- Build system: Gradle with Fabric Loom.
- Target game: Minecraft, version to be selected and updated as dependencies change (26.1.2).
- IDE: IntelliJ IDEA, VS Code, Eclipse, or another Java-capable editor.

## Repo Structure

```text
minecraft-object-physics-mod/
  docs/       Project planning, physics design, gameplay scope, and roadmap
  src/        Fabric-style Java source and resources
  gradle/     Placeholder for Gradle wrapper files
```

## Setup

This scaffold includes Gradle configuration files, but the Minecraft version, Fabric loader version, Fabric API version, Yarn mappings, and Fabric Loom version may need to be updated before building.

Suggested setup:

```bash
git clone <repo-url>
cd minecraft-object-physics-mod
./gradlew genSources
./gradlew build
```

On Windows PowerShell, after adding a real Gradle wrapper:

```powershell
.\gradlew.bat genSources
.\gradlew.bat build
```

If the wrapper is not installed yet, use a local Gradle installation to generate one:

```bash
gradle wrapper
```

## Roadmap

- Confirm target Minecraft, Fabric loader, Fabric API, Loom, and Yarn mapping versions.
- Build a minimal Fabric mod that loads successfully.
- Add basic custom block or item registration.
- Implement deterministic physics object updates independent of Minecraft entities.
- Map selected block/material types to physics material values.
- Prototype collision detection and response for simplified bounding boxes.
- Decide how physics objects should appear in-game.
- Add tests or debug tools for physics calculations.
- Design and impliment non-block models for simulation.

## Current Status

Planning and scaffold stage. The repository contains documentation, Gradle/Fabric configuration, Java skeleton classes, placeholder assets, and material/physics design notes. It does not claim a working Minecraft gameplay physics system yet.

## Next Steps

- Update dependency versions in `gradle.properties`.
- Add a real Gradle wrapper if desired.
- Verify the mod loads in a Fabric development environment.
- Expand registry placeholders into actual blocks or items.
- Implement and test the physics engine behavior outside gameplay first.

## Portfolio Relevance

This project is intended to demonstrate Java project structure, modding architecture, simulation thinking, object-oriented design, material-inspired modeling, and game systems planning. It is relevant to software engineering, game development, physics simulation, and technical prototyping.
