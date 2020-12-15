package com.vorozheykin.Patterns.MementoCommand;

import java.util.ArrayList;
import java.util.List;


public class Memento {
    private String name;
    private List<Integer> marks;

    public Memento(String name, List<Integer> marks){
        this.name = name;
        this.marks = new ArrayList<>(marks);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMarks() {
        return marks;
    }
}
