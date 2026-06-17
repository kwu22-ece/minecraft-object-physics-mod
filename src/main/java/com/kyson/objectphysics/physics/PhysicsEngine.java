package com.kyson.objectphysics.physics;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class PhysicsEngine {
    private static final double GRAVITY_BLOCKS_PER_SECOND_SQUARED = -9.81;
    private static final double DEFAULT_DAMPING = 0.995;
    private static final double SLEEP_VELOCITY_THRESHOLD = 0.01;

    private final Map<String, PhysicsMaterial> materials = new LinkedHashMap<>();

    public void registerDefaultMaterials() {
        registerMaterial(PhysicsMaterial.WOOD);
        registerMaterial(PhysicsMaterial.STONE);
        registerMaterial(PhysicsMaterial.METAL);
        registerMaterial(PhysicsMaterial.GLASS);
        registerMaterial(PhysicsMaterial.RUBBER);
        registerMaterial(PhysicsMaterial.DIRT);
    }

    public void registerMaterial(PhysicsMaterial material) {
        materials.put(material.id(), material);
    }

    public Optional<PhysicsMaterial> material(String id) {
        return Optional.ofNullable(materials.get(id));
    }

    public Collection<PhysicsMaterial> materials() {
        return materials.values();
    }

    public void update(PhysicsObject object, double deltaSeconds) {
        if (!object.active()) {
            return;
        }

        object.applyAcceleration(0.0, GRAVITY_BLOCKS_PER_SECOND_SQUARED, 0.0, deltaSeconds);
        object.integrate(deltaSeconds);
        object.applyDamping(DEFAULT_DAMPING);

        // Placeholder ground-plane collision. Future versions should use Minecraft world collision shapes.
        if (object.y() <= 0.0 && object.velocityY() < 0.0) {
            object.setY(0.0);
            object.bounceY();
        }

        if (object.shouldSleep(SLEEP_VELOCITY_THRESHOLD)) {
            object.setActive(false);
        }
    }
}
