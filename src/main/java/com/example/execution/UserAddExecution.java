package com.example.execution;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

class Student{
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class UserAddExecution {
    public List<Student> addUser(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Arrays.asList(new Student(1,"a"),new Student(2,"b"));
    }
}
