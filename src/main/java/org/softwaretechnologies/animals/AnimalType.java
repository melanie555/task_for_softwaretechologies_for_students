package org.softwaretechnologies.animals;

public enum AnimalType {
    CAT{
        @Override
        public Animal createAnimal(String name) {
            return new Animal.Cat(name);
        }
    }, DOG{
        @Override
        public Animal createAnimal(String name) {
            return new Animal.Dog(name);
        }
    }, COW{
        @Override
        public Animal createAnimal(String name) {
            return new Animal.Cow(name);
        }
    };

    public abstract Animal createAnimal(String name);
}
