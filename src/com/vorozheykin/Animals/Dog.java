package com.vorozheykin.Animals;

public class Dog implements Barkable{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "dog: " + name;
    }

    @Override
    public void bark() {
        System.out.println(name + ": bark!");
    }

    public void meow(int n) {
        System.out.print(name + ": ");
        for(int i = 0; i < n; i++){
            if(i == 0) System.out.print("bark");
            else System.out.print("-bark");
        }
        System.out.println("!");
    }

}
