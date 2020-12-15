package com.vorozheykin.Patterns.Singletone;

public class Kick implements Skillable {

    private static volatile Kick kick;

    public static Kick getInstance(){
        Kick localKick = kick;
        if (localKick == null){
            synchronized (Kick.class){
                localKick = kick;
                if(localKick == null) {
                    kick = localKick = new Kick();
                }
            }
        }
        return kick;
    }

    private Kick(){}

    @Override
    public void skillSound(KarateBoy karateBoy){
        karateBoy.kick();
    }
}
