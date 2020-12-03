package com.vorozheykin.Main;


import com.vorozheykin.Karate.*;

public class Main {

    public static void main(String[] args){
        HandPunchable handPunch = () -> System.out.println("hand punch");
        Kickable kick = () -> System.out.println("kick");
        JumpKickable jumpKick = () -> System.out.println("jump kick");

        KarateBoy karateBoy = new KarateBoy("danil");

        Combo one = new Combo("InfinityPunch" ,handPunch, handPunch, handPunch);
        Combo two = new Combo("AllInOne" ,handPunch, kick, jumpKick);

        karateBoy.makeCombo(one).makeCombo(two);



    }

}