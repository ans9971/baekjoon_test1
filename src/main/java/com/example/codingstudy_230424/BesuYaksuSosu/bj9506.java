package com.example.codingstudy_230424.BesuYaksuSosu;

import java.util.Scanner;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

interface bj9506 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()), sum = 0;
        while(n != -1) {
            sb.setLength(0);
            sb.append(n + " = 1");
            sum = 1;
            for(int i=2; i<n; i++) {
                if(n%i==0) {
                    sb.append(" + " + i);
                    sum += i;
                }
            }
            if(sum == n) {
                System.out.println(sb);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
            n = Integer.parseInt(br.readLine());
        }
    }
}
//public class bj9506 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while(true) {
//            StringBuilder sb = new StringBuilder();
//            int n = sc.nextInt();
//            if(n == -1) break;
//
//            int sum = 0;
//            for(int i=1; i<n; i++)
//                if(n % i == 0) {
//                    sb.append(i + " + ");
//                    sum += i;
//                }
//            System.out.println(n == sum ? n + " = " + sb.toString().substring(0, sb.length()-3) : n + " is NOT perfect.");
//        }
//    }
//}