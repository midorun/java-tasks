package com.vorozheykin.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class ReportCard {
    int ID;
    String name;
    ArrayList <ExamResults> examsResults = new ArrayList<>();

    public ReportCard(int ID, String name, ExamResults...examsResults) {
        this.ID = ID;
        this.name = name;
        this.examsResults.addAll(Arrays.asList(examsResults));
    }

    @Override
    public String toString(){
        String str = "";
        for (ExamResults e: examsResults) {
            str += e;
        }
        return name + ", " + ID +
                "\n\t" + str;

    }
}
