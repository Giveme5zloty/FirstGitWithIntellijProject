package com.projects.strategyPattern;

public class Dog extends Animal {
    public Dog(){
        setFlyingType(new CantFly());
    }
}
