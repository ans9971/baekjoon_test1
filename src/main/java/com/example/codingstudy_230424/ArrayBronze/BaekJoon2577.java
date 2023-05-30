package com.example.codingstudy_230424.ArrayBronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int powNum = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
        int[] arr = new int[10];

        while(powNum!=0) {
            arr[powNum%10]++;
            powNum/=10;
        }

        for(int result : arr) {
            System.out.println(result);
        }
    }
}
