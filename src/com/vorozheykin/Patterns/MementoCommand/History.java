package com.vorozheykin.Patterns.MementoCommand;
import java.util.ArrayList;
import java.util.List;
//Caretaker
public class History{
    public List<Memento> history = new ArrayList<>();

    public void push(Memento memento){
        history.add(memento);
    }

    public Memento pop(){
        Memento m = history.get(history.size()-1);
        this.history.remove(history.size()-1);
        return m;
    }
}
