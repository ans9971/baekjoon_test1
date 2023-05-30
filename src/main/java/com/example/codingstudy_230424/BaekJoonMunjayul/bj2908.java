package com.example.codingstudy_230424.BaekJoonMunjayul;
import java.util.Scanner;

public class bj2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String reverseA = "";
        String reverseB = "";

        for(int i=a.length()-1; i>=0; i--) {
            reverseA += a.charAt(i);
        }

        for(int i=b.length()-1; i>=0; i--) {
            reverseB += b.charAt(i);
        }

        if(Integer.parseInt(reverseA) > Integer.parseInt(reverseB)) {
            System.out.println(reverseA);
        } else {
            System.out.println(reverseB);
        }
    }
}