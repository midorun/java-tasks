package com.vorozheykin.Patterns.MementoCommand;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Originator
public class Student implements Serializable {
    private String name;
    private List<Integer> marks = new ArrayList<>();
    private History history;

    public Student(String name, Integer...marks){
        this.name = name;
        addMarks(marks);
        history = new History();
    }

    public Student(String name) {
        this(name, (Integer) null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        save();
        this.name = name;
    }

    public List<Integer> getMarks() {
        return new ArrayList<>(marks);
    }

    public Student addMarks(List<Integer> marks) {
        this.marks.addAll(marks);
        return this;
    }

    public Student addMarks(Integer...marks) {
        addMarks(Arrays.asList(marks));
        return this;
    }

    public Student changeMark(Integer index, Integer mark){
        save();
        this.marks.set(index, mark);
        return this;
    }

    @Override
    public String toString() {
        return "Student: " + name + marks;
    }

    public void save(){
        history.push(new Memento(name, marks));
    }

    public void undo(){
        Memento m = history.pop();
        this.name = m.getName();
        this.marks = m.getMarks();
    }
}