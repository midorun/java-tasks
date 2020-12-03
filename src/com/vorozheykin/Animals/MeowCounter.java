package com.vorozheykin.Animals;

public class MeowCounter implements Meowable {
    public Meowable cat;
    public int count;

    public MeowCounter(Meowable cat) {
        this.cat = cat;
    }

    @Override
    public void meow(){
        cat.meow();
        count++;
    }
}
