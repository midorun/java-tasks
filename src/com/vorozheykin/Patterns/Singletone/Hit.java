package com.vorozheykin.Patterns.Singletone;

public class Hit implements Skillable {

    private static Hit hit = new Hit();

    private Hit(){}

    public static Hit getInstance(){
        if(hit == null){
            hit = new Hit();
        }
        return hit;
    }

    @Override
    public void skillSound(KarateBoy karateBoy) {
        karateBoy.hit();
    }
}
