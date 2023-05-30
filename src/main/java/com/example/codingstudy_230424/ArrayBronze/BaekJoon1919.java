package com.example.codingstudy_230424.ArrayBronze;

import java.util.Scanner;

public class BaekJoon1919 {
    public static int[] countAtoZ(String str) {
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int[] a_count = countAtoZ(a);//a , b 알파벳 개수 저장
        int[] b_count = countAtoZ(b);

        int diff = 0;
        for (int i = 0; i < 26; i++) {
            diff += Math.abs(a_count[i] - b_count[i]);
        }

        System.out.println(diff);
    }
}
