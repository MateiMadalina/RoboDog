package com.codecool.robodog.controller;

import com.codecool.robodog.model.Dog;
import com.codecool.robodog.storage.DogStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class DogController {
    @Autowired
    private DogStorage dogStorage;

    @GetMapping(value = "dogs")
    public List<Dog> displayAllDog(){
        return dogStorage.getDogs();
    }

    @GetMapping(value = "randomDog")
    public Dog displayRandomDog(){
        return dogStorage.createAndAddARandomDog();
    }

    @PostMapping(value = "/newDog")
    public void addDog(@RequestBody Dog dog){
        dogStorage.addADog(dog);
        System.out.println("The dog was added!");
    }

    @PutMapping(value = "/updateDog/{name}")
    public void updateDog(@PathVariable String name, @RequestBody Dog updatedDog) {
        dogStorage.updateDogByName(name, updatedDog);
        System.out.println("The dog was updated!");
    }




}
