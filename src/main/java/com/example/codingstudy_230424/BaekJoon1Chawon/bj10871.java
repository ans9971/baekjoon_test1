package com.example.codingstudy_230424.BaekJoon1Chawon;

import java.util.Scanner;

public class bj10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (k < x) {
                sb.append(k);
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
