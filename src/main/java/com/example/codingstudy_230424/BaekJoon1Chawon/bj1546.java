package com.example.codingstudy_230424.BaekJoon1Chawon;

import java.util.Scanner;

public class bj1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int[] arr = new int[a];

        int max = arr[0];
        double sum = 0.0;
        for (int i = 0; i < a; i++) {
            int x = sc.nextInt();
            arr[i] = x;

        }

        for (int i = 0; i < a-1; i++) {
            if (arr[i + 1] > max) {
                max = arr[i + 1];

            }

        }
        for (double k :arr) {
            sum += (double)k/max*100;
        }

        System.out.print((double) sum/arr.length);
    }
}
