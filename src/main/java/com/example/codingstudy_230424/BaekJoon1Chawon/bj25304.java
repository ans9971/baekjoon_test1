package com.example.codingstudy_230424.BaekJoon1Chawon;

import java.util.Scanner;

public class bj25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int count= sc.nextInt();
        int sumAB=0;
        for (int i = 0; i < count; i++) {
            int a = sc.nextInt();
            int b= sc.nextInt();
            sumAB+=a*b;


        }
        if (sum == sumAB) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
