package com.example.codingstudy_230424;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String code;
    private int testId;
    private String name;

    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}