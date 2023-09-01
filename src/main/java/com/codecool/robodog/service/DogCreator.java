package com.codecool.robodog.service;

import com.codecool.robodog.model.Breed;
import com.codecool.robodog.model.Dog;

import java.util.List;
import java.util.Random;

public class DogCreator {
    private List<String> dogNames = List.of( "Max", "Bella", "Rocky", "Luna", "Charlie",
            "Daisy", "Buddy", "Sadie", "Bailey", "Lucy",
            "Milo", "Rosie", "Duke", "Ruby", "Cooper",
            "Chloe", "Toby", "Lily", "Bear", "Zoey");
    private  Random random = new Random();
    private List<Breed> breeds = List.of(Breed.values());

    public Dog createRandomDog(){
        int age = random.nextInt(18) + 1;
        String name = dogNames.get(random.nextInt(dogNames.size()));
        Breed breed = breeds.get(random.nextInt(breeds.size()));
        return new Dog(age,name,breed);
    }

}
