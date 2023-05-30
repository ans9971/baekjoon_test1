package com.example.codingstudy_230424.BaekJoon1Chawon;

import java.util.Arrays;
import java.util.Scanner;

public class bj2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            int x = sc.nextInt();
            arr[i]=x;
        }
        int max=0;
        int count=0;
        int minv=0;
        for (int x:arr) {
            count++;
            if(x>max){
                max=x;
                minv=count;
            }
        }
        Arrays.sort(arr);
        System.out.println(max);
        System.out.println(minv);
    }
}
