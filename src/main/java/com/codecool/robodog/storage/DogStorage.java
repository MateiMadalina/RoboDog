package com.codecool.robodog.storage;

import com.codecool.robodog.model.Breed;
import com.codecool.robodog.model.Dog;
import com.codecool.robodog.service.DogCreator;

import java.util.List;
import java.util.stream.Collectors;

public class DogStorage {
   private List<Dog> dogs;
   private DogCreator dogCreator;

    public DogStorage(List<Dog> dogs, DogCreator dogCreator) {
        this.dogs = dogs;
        this.dogCreator = dogCreator;
    }

    public void addADog(Dog dog){
        dogs.add(dog);
    }

    public void createAndAddARandomDog(){
        Dog randomDog = dogCreator.createRandomDog();
        dogs.add(randomDog);
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void updateAgeAndBreedUsingByTheName(String name, int age, Breed breed){
        List<Dog> dogsFound = dogs.stream().filter(dog -> dog.getName().equals(name)).collect(Collectors.toList());
        Dog firstDog = dogsFound.get(0);
        firstDog.setAge(age);
        firstDog.setBreed(breed);
    }
}
