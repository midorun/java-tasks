package com.vorozheykin.Karate;

public interface Skill {
    default void skillSound(){
        System.out.println("using skill");
    };
}
