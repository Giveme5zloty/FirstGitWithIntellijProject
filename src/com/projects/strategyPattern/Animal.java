package com.projects.strategyPattern;


public abstract class Animal {
    private String name;
    private double speed;
    private Flys flyingType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void fly(){
        flyingType.fly();
    }

    public void setFlyingType(Flys flyingType) {
        this.flyingType = flyingType;
    }
}
