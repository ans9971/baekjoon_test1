package com.example.codingstudy_230424.BaekJoonMunjayul;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj2675 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {

            String[] str = br.readLine().split(" ");

            int R = Integer.parseInt(str[0]);
            String S = str[1];

            for(int j = 0; j < S.length(); j++) {
                for(int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
        }
    }


}