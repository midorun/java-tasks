package com.vorozheykin.Main;


import com.vorozheykin.Patterns.MementoCommand.Student;

public class Main {

    public static void main(String[] args){

        Student student = new Student("Mark",  5,4,3);
        student.save();

        student.setName("John");
        student.changeMark(2,5);
        student.changeMark(2,5);
        student.changeMark(2,5);
        System.out.println(student);

        student.undo();
        student.undo();

        System.out.println(student);

    }

}