package com.vorozheykin.Animals;

public class Cuckoo extends Bird {

    @Override
    public Cuckoo sing(){
        for(int i = 0; i < Math.random() * 10; i++) {
            System.out.println("Cu-cu");
        }
        return this;
    }

}
