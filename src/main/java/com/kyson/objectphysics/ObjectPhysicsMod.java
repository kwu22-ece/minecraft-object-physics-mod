package com.kyson.objectphysics;

import com.kyson.objectphysics.physics.PhysicsEngine;
import com.kyson.objectphysics.registry.ModBlocks;
import com.kyson.objectphysics.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObjectPhysicsMod implements ModInitializer {
    public static final String MOD_ID = "objectphysics";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private static final PhysicsEngine PHYSICS_ENGINE = new PhysicsEngine();

    @Override
    public void onInitialize() {
        ModBlocks.register();
        ModItems.register();
        PHYSICS_ENGINE.registerDefaultMaterials();

        LOGGER.info("Object Physics Mod scaffold initialized. Physics gameplay is still in progress.");
    }

    public static PhysicsEngine physicsEngine() {
        return PHYSICS_ENGINE;
    }
}
