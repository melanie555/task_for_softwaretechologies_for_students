package org.softwaretechnologies;

import org.softwaretechnologies.animals.Animal;
import org.softwaretechnologies.animals.AnimalType;

public class AnimalFactory {




    public static Animal createAnimal(String name, AnimalType type) {
        return type.createAnimal(name);
    }
}