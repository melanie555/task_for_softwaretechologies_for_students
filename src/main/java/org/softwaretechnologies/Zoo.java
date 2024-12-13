package org.softwaretechnologies;

import org.softwaretechnologies.animals.Animal;
import org.softwaretechnologies.animals.AnimalType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Zoo {
    private final List<Animal> animalList = new ArrayList<>();
    public void addAnimal(Animal animal) {

        animalList.add(animal);
    }

    public List<String> soundAllAnimalsSortByName() {
        List<String> sounds = new ArrayList<>();
        List<Animal> sortedAnimals = new ArrayList<>(animalList);
        sortedAnimals.sort(Comparator.comparing(Animal::getName));
        for (Animal animal : sortedAnimals) {
            sounds.add(animal.sound());
        }
        return sounds;
    }


}