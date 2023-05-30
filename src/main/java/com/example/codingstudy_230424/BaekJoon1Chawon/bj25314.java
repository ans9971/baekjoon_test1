package com.example.codingstudy_230424.BaekJoon1Chawon;

import java.util.Scanner;

public class bj25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int sumAB=0;
            int a = sc.nextInt();
            int b= sc.nextInt();
            sumAB=a+b;
            System.out.printf("Case #%d: %d + %d = %d\n",i+1,a,b,sumAB);


        }
    }
}
