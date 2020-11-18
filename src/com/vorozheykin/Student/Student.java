package com.vorozheykin.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student<T>{
    private String name;
    private List<T> marks = new ArrayList<>();
    private MarkCheckable<T> rule;
//    private final ArrayList<Integer> badMarks = new ArrayList<>(Arrays.asList(2, 3, 4));
//    private boolean isExcellent = false;

    @SafeVarargs
    public Student(String name,MarkCheckable<T> rule,  T...marks){
        this.name = name;
        this.rule = rule;
        addMarks(marks);
    }

    public Student(String name, MarkCheckable<T> rule) {
        this(name, rule, (T) null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getMarks() {
        return new ArrayList<>(marks);
    }

    public Student<T> addMarks(List<T> marks) {
        for (T mark : marks) {
            if (!rule.check(mark)) {
                throw new IllegalArgumentException("Incorrect mark");
            } else {
                this.marks.add(mark);
            }
        }
//        checkOnExcellent();
        return this;
    }
    @SafeVarargs
    public final Student<T> addMarks(T...marks){
        addMarks(Arrays.asList(marks));
//        checkOnExcellent();
        return this;
    }

//    public String  getAvgMark(){
//        double res = 0;
//        if(marks.isEmpty()) return "average mark is " + res;
//        else {
//            for(double mark: marks){
//                res += mark;
//            }
//            res /= marks.size();
//        }
//        return name + "'s average mark is " + res;
//    }
//
//    public void checkOnExcellent(){
//        if(!marks.isEmpty()){
//            for(int mark: marks){
//                if(badMarks.contains(mark)){
//                    isExcellent = false;
//                    return;
//                }
//            }
//            isExcellent = true;
//        } else isExcellent = false;
//    }

    @Override
//    public String toString() {
//        return name + (isExcellent ? " excellent " : " not excellent ") + marks;
//    }
    public String toString() {
        return "Student: " + name + marks;
    }
}