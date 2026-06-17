package com.kyson.objectphysics.physics;

public record PhysicsMaterial(
        String id,
        double density,
        double friction,
        double restitution,
        double hardness,
        double brittleness
) {
    public static final PhysicsMaterial WOOD = new PhysicsMaterial("wood", 0.55, 0.45, 0.20, 0.35, 0.20);
    public static final PhysicsMaterial STONE = new PhysicsMaterial("stone", 1.60, 0.60, 0.08, 0.85, 0.35);
    public static final PhysicsMaterial METAL = new PhysicsMaterial("metal", 2.40, 0.35, 0.18, 0.95, 0.10);
    public static final PhysicsMaterial GLASS = new PhysicsMaterial("glass", 1.20, 0.20, 0.12, 0.55, 0.90);
    public static final PhysicsMaterial RUBBER = new PhysicsMaterial("rubber", 0.90, 0.80, 0.75, 0.25, 0.05);
    public static final PhysicsMaterial DIRT = new PhysicsMaterial("dirt", 0.75, 0.70, 0.05, 0.20, 0.15);

    public PhysicsMaterial {
        validateUnitRange("friction", friction);
        validateUnitRange("restitution", restitution);
        validateUnitRange("brittleness", brittleness);

        if (density <= 0.0) {
            throw new IllegalArgumentException("density must be positive");
        }

        if (hardness < 0.0) {
            throw new IllegalArgumentException("hardness must be non-negative");
        }
    }

    private static void validateUnitRange(String name, double value) {
        if (value < 0.0 || value > 1.0) {
            throw new IllegalArgumentException(name + " must be between 0 and 1");
        }
    }
}
