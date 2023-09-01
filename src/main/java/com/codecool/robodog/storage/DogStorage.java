package com.codecool.robodog.storage;

import com.codecool.robodog.model.Breed;
import com.codecool.robodog.model.Dog;
import com.codecool.robodog.service.DogCreator;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class DogStorage {
   private List<Dog> dogs;
   private DogCreator dogCreator;

    public DogStorage(List<Dog> dogs) {
        this.dogs = dogs;
        this.dogCreator = new DogCreator();
    }

    public void addADog(Dog dog){
        dogs.add(dog);
    }

    public Dog createAndAddARandomDog(){
        Dog randomDog = dogCreator.createRandomDog();
        dogs.add(randomDog);
        return randomDog;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void updateDogByName(String name, Dog updatedDog){
        List<Dog> dogsFound = dogs.stream().filter(dog -> dog.getName().equals(name)).collect(Collectors.toList());
        Dog firstDog = dogsFound.get(0);
        firstDog.setAge(updatedDog.getAge());
        firstDog.setBreed(updatedDog.getBreed());
    }
}
