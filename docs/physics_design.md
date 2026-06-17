# Physics Design

## Design Goal

The physics system should be simple enough to understand and debug, while still creating interesting material-dependent behavior. The first implementation should favor clarity over physical realism.

## Planned Object State

Each physics object may track:

- Position.
- Velocity.
- Acceleration.
- Mass.
- Bounding box or simplified collision radius.
- Physics material.
- Sleep/active state.

## Planned Material Properties

Material definitions can include:

- `density`: relative mass per unit volume.
- `friction`: resistance to sliding.
- `restitution`: bounciness after collision.
- `hardness`: resistance to deformation or breaking.
- `brittleness`: likelihood of shattering or failing under impact.

## Placeholder Materials

Initial placeholders:

- Wood: moderate density, moderate friction, low bounce.
- Stone: high density, high hardness, low bounce.
- Metal: high density, moderate friction, low-to-moderate bounce.
- Glass: medium density, low toughness, high brittleness.
- Rubber: low-to-medium density, high friction, high bounce.

## Simulation Loop

Planned update steps:

1. Apply gravity and external forces.
2. Integrate velocity.
3. Integrate position.
4. Detect simple collisions.
5. Resolve collisions using friction and restitution.
6. Put inactive objects to sleep if they stop moving.

## Known Simplifications

- Full rigid-body rotation is out of scope for the first prototype.
- Minecraft block-grid collisions may be approximated at first.
- Server/client synchronization should be handled carefully later.
- Determinism is preferred for debugging.
