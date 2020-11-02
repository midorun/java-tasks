package com.vorozheykin.Animals;

import java.util.Random;

public class Parrot extends Bird {
    String text;
    private Random random = new Random();

    public Parrot(String text){
        this.text = text;
    }

    public Parrot sing(){
        String newSong = randomizeText(1);
        System.out.println(newSong);
        return this;
    }

    public Parrot sing(int count){
        String newSong = randomizeText(count);
        System.out.println(newSong);
        return this;
    }

    public String  randomizeText(int count) {
        char[] newText =  text.toCharArray();

        for(int i = 0; i < count; i++) {

            int firstSymbol = random.nextInt(newText.length);
            int secondSymbol = random.nextInt(newText.length);

            char temp = newText[firstSymbol];

            newText[firstSymbol] = newText[secondSymbol];
            newText[secondSymbol] = temp;

        }
        return new String (newText);
    }
}
