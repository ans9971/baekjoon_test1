package com.example.codingstudy_230424.simhwa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj10988 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(br.readLine());

        bw.write(((sb.toString().equals(sb.reverse().toString())) ? 1 : 0) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

}