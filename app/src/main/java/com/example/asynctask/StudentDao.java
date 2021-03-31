package com.example.asynctask;

import java.util.ArrayList;

public class StudentDao {

    private ArrayList<Student> students = new ArrayList<>();

    public StudentDao(){

        Student jerry = new Student("jerry","bob","CSCI");
        Student barry = new Student("barry", "bob", "MATH");
        Student larry = new Student("larry", "bob", "PHYS");
        Student harry = new Student("harry", "bob", "ASTR");
        Student tim = new Student("tim", "bob", "HIST");
        students.add(jerry);
        students.add(barry);
        students.add(larry);
        students.add(harry);
        students.add(tim);

    }

    public ArrayList<Student> getAllStudents(){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return students;

    }

}
