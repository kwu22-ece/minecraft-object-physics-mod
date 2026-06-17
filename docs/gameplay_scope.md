# Gameplay Scope

## Initial Scope

The first playable prototype should be narrow. A good starting point is one custom item or block that spawns a debug physics object with visible behavior.

## In-Scope Ideas

- Debug physics object with gravity.
- Material selection through item variants or block type.
- Simple collisions with world blocks.
- Basic bounce and sliding behavior.
- Debug logging or overlay values during development.

## Out-of-Scope for First Prototype

- Replacing all Minecraft block physics.
- Realistic rigid-body rotation.
- Large-scale destruction simulation.
- Multiplayer synchronization for complex object fields.
- Production-quality asset packs.

## Gameplay Questions

- Should physics objects become entities, block entities, or custom rendered objects?
- Which blocks should have material mappings?
- Should objects damage blocks or only move around them?
- How should players interact with physics objects?
- What behavior is fun without becoming chaotic?

## Development Approach

Start with deterministic calculations outside game rendering, then connect the logic to a small in-game test object. Keep physics settings configurable so gameplay tuning does not require rewriting the engine.
