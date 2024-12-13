package org.softwaretechnologies.animals;

public abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }

        @Override
        public String sound() {
            return "meow";
        }
    }

    public static class Cow extends Animal{
        public Cow(String name) {
            super(name);
        }

        @Override
        public String sound() {
            return "moo";
        }
    }

    public static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override
        public String sound() {
            return "woof";
        }
    }

    public abstract String sound();
}
