package com.example.codingstudy_230424.bayeol2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj11005 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());

        String ans = "";
        int rest;
        while (n > 0) {
            rest = n % b;
            if (rest >= 10) {
                ans += (char)(rest - 10 + (int)'A');
            } else {
                ans += (char)(rest + (int)'0');
            }
            n /= b;
        }
        for (int i = ans.length() - 1; i >= 0; i--) {
            System.out.print(ans.charAt(i));
        }
    }
}