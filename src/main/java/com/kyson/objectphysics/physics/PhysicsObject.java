package com.kyson.objectphysics.physics;

public class PhysicsObject {
    private final PhysicsMaterial material;
    private double x;
    private double y;
    private double z;
    private double velocityX;
    private double velocityY;
    private double velocityZ;
    private double massKg;
    private boolean active;

    public PhysicsObject(PhysicsMaterial material, double x, double y, double z, double massKg) {
        this.material = material;
        this.x = x;
        this.y = y;
        this.z = z;
        this.massKg = massKg;
        this.active = true;
    }

    public void applyAcceleration(double accelerationX, double accelerationY, double accelerationZ, double deltaSeconds) {
        velocityX += accelerationX * deltaSeconds;
        velocityY += accelerationY * deltaSeconds;
        velocityZ += accelerationZ * deltaSeconds;
    }

    public void integrate(double deltaSeconds) {
        x += velocityX * deltaSeconds;
        y += velocityY * deltaSeconds;
        z += velocityZ * deltaSeconds;
    }

    public void applyDamping(double dampingFactor) {
        velocityX *= dampingFactor;
        velocityY *= dampingFactor;
        velocityZ *= dampingFactor;
    }

    public void bounceY() {
        velocityY = -velocityY * material.restitution();
        velocityX *= 1.0 - material.friction();
        velocityZ *= 1.0 - material.friction();
    }

    public boolean shouldSleep(double velocityThreshold) {
        final double speedSquared = velocityX * velocityX + velocityY * velocityY + velocityZ * velocityZ;
        return speedSquared < velocityThreshold * velocityThreshold;
    }

    public PhysicsMaterial material() {
        return material;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public double z() {
        return z;
    }

    public double velocityY() {
        return velocityY;
    }

    public double massKg() {
        return massKg;
    }

    public boolean active() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setY(double y) {
        this.y = y;
    }
}
