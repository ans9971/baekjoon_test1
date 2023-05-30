package com.example.codingstudy_230424.BaekJoon1Chawon;

import java.util.ArrayList;
import java.util.Scanner;

public class bj10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int temp,x,y;
        int[] arr = new int[N];
        for (int i = 1; i <= N; i++) {
            arr[i]=i;
        }
        for (int i = 0; i < M; i++) {
            x=sc.nextInt();
            y=sc.nextInt();
            temp = arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
        }
        for (int i = 0 ; i <N; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
//    import java.util.Scanner;
//
//    public class bj10813 {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int N = sc.nextInt();
//            int M = sc.nextInt();
//            int temp,x,y;
//            int[] arr = new int[N];
//            for (int i = 0; i < N; i++) {
//                arr[i]=i+1;
//            }
//            for (int i = 0; i < M; i++) {
//                x=sc.nextInt();
//                y=sc.nextInt();
//                temp = arr[x-1];
//                arr[x-1]=arr[y-1];
//                arr[y-1]=temp;
//            }
//            for (int i = 0 ; i <N; i++) {
//                System.out.print(arr[i]+ " ");
//            }
//        }
//    }

}
