package com.vorozheykin.Animals;

public class CatDog {
    public Cat cat;
    public Dog dog;
    public String name;

    public CatDog(Cat cat, Dog dog){
        this.cat = cat;
        this.dog = dog;
        this.name = cat.getName() + dog.getName();
    }

    public Cat getCat() {
        return cat;
    }

    public CatDog setCat(Cat cat) {
        this.cat = cat;
        return this;
    }

    public Dog getDog() {
        return dog;
    }

    public CatDog setDog(Dog dog) {
        this.dog = dog;
        return this;
    }

    public String getName() {
        return name;
    }

    public CatDog setName(String name) {
        this.name = cat.getName() + dog.getName();
        return this;
    }

    @Override
    public String toString() {
        return "CatDog: " + getName();
    }

    public void voice() {
        System.out.println(getName() + ": ");
        cat.meow();
        dog.bark();
    }

    public void voice(int n) {
        System.out.print(getName() + ": ");
        for(int i = 0; i < n; i++){
            this.voice();
        }
        System.out.println("!");
    }
}
