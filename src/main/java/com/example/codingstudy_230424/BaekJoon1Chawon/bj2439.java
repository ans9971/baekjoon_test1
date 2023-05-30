package com.example.codingstudy_230424.BaekJoon1Chawon;

import java.util.Scanner;

public class bj2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.println(" ".repeat(x-i)+"*".repeat(i));
        }
    }
}
