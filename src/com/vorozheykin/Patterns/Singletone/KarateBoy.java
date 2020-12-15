package com.vorozheykin.Patterns.Singletone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KarateBoy{
    private String name;
    private List<Combo> combos = new ArrayList<>();

    public KarateBoy(String name) {
        this.name = name;
    }

    public KarateBoy(String name, Combo...combos){
        this.name = name;
        addCombos(combos);
    }

    private String getName() {
        return name;
    }

    public KarateBoy setName(String name) {
        this.name = name;
        return this;
    }

    public List<Combo> getCombos() {
        return combos;
    }

    public KarateBoy addCombos(Combo...combos) {
        this.combos.addAll(Arrays.asList(combos));
        return this;
    }

   public void kick(){
       System.out.println("kick");
   }

   public void hit(){
       System.out.println("hit");
   }

   public void jumpKick(){
       System.out.println("jumpKick");
   }

    @Override
    public String toString(){
        return name;
    }
}
