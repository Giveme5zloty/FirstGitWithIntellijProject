package com.projects;

import com.projects.strategyPattern.Animal;
import com.projects.strategyPattern.Bird;
import com.projects.strategyPattern.Dog;

public class Main {

    public static void main(String[] args) {

        Animal sparky = new Dog();
        Animal tweety = new Bird();
        System.out.println("Dog:");
        sparky.fly();
        System.out.println("Bird: ");
        tweety.fly();

    }

}
