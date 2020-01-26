package com.lab;

public class Student {
    String name = "Unknown";
    Student(){
    }
    Student(String name){
        this.name = name;
    }
    void print(){
        System.out.println("Name = " + name);
    }
}
