package com.projects.strategyPattern;

public class CantFly implements Flys{
    public void fly(){
        System.out.println("Can't fly");
    }
}
