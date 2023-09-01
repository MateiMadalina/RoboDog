package com.codecool.robodog.model;

public class Dog {
    private int age;
    private String name;
    private Breed breed;

    public Dog(int age, String name, Breed breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }
}
