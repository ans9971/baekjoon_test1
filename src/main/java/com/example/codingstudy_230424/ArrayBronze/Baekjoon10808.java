package com.example.codingstudy_230424.ArrayBronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arrCount = new int[26]; //a_z 배열생성

        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            arrCount[(int) input.charAt(i)-97] +=1;//각 알파벳 자리에 카운트 각각 추가

        }
        for (int i = 0; i < arrCount.length; i++) {
            sb.append(arrCount[i]);//sb에 공백넣으면서 a_z 개수 입력
            sb.append(" ");

        }
        System.out.println(sb);


    }
}
