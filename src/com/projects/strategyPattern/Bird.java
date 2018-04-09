package com.projects.strategyPattern;

public class Bird extends Animal {
    public Bird(){
        setFlyingType(new Fly());
    }
}
