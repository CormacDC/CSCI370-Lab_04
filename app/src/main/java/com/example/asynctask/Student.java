package com.example.asynctask;

public class Student {

    private String firstName;
    private String lastName;
    private String major;

    public Student(){
        firstName = "N/A";
        lastName = "N/A";
        major = "N/A";
    }

    public Student(String first, String last, String maj){
        firstName = first;
        lastName = last;
        major = maj;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    public void setFirstName(String s){
        firstName = s;
    }

    public void setLastName(String s){
        lastName = s;
    }

    public void setMajor(String s){
        major = s;
    }

}
