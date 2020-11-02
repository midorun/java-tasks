package com.vorozheykin.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private ArrayList<Integer> marks = new ArrayList<>();
    private final ArrayList<Integer> badMarks = new ArrayList<>(Arrays.asList(2, 3, 4));
    private boolean isExcellent = false;

    public Student(String name,  int...marks){
        this.name = name;
        addMarks(marks);

    }

    public Student(String name) {
        this(name, (Integer) null);
    } /* or this.name = name;??? */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getMarks() {
        return new ArrayList<>(marks);
    } /* List or ArrayList??? */

    public Student addMarks(ArrayList<Integer> marks) {
        for(int mark: marks){
            if(mark < 2 || mark > 5) throw new IllegalArgumentException("Mark can't be < 2 or > 5");
            else this.marks.addAll(marks);
        }
        checkOnExcellent();
        return this;
    }

    public Student addMarks(int ...marks){
        for(int mark: marks){
            if(mark < 2 || mark > 5) throw new IllegalArgumentException("Mark can't be < 2 or > 5");
            else this.marks.add(mark);
        }
        checkOnExcellent();
        return this;
    }

    public String  getAvgMark(){
        double res = 0;
        if(marks.isEmpty()) return "average mark is " + res;
        else {
            for(double mark: marks){
                res += mark;
            }
            res /= marks.size();
        }
        return name + "'s average mark is " + res;
    }

    public void checkOnExcellent(){
        if(!marks.isEmpty()){
            for(int mark: marks){
                if(badMarks.contains(mark)){
                    isExcellent = false;
                    return;
                }
            }
            isExcellent = true;
        } else isExcellent = false;


    }

    @Override
    public String toString() {
        return name + (isExcellent ? " excellent " : " not excellent ") + marks;
    }
}
