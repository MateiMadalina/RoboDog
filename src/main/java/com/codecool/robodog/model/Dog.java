package com.codecool.robodog.model;

public class Dog {
    private int age;
    private final String name;
    private final Breed breed;

    public Dog(int age, String name, Breed breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }
}
