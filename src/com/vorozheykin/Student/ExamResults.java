package com.vorozheykin.Student;

public class ExamResults {
    String subject;
    String teacher;
    int grade;

    public ExamResults(String subject, String teacher, int grade) {
        this.subject = subject;
        this.teacher = teacher;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return subject + ", " + teacher + ", " + grade + "\n";
    }
}
