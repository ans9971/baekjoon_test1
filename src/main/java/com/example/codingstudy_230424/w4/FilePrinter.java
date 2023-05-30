package com.example.codingstudy_230424.w4;

import com.example.codingstudy_230424.Printer2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//public class FilePrinter implements Printer2{
//    @Override
//    public void print(String message) throws IOExcep9tion {
//        BufferedWriter bw = new BufferedWriter(new FileWriter("./hello.txt"));
//        bw.append(message);
//        bw.flush();
//        bw.close();
//    }
//}
public class FilePrinter implements Printer2 {
    @Override
    public void print(String message) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./hello.txt"));
        bw.append(message);
        bw.flush();
        bw.close();
    }
}