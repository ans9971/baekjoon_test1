package com.example.codingstudy_230424;

public class ConsolePrinter implements Printer2{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}