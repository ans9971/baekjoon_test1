package com.example.codingstudy_230424.BaekJoonMunjayul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj5622 {
    public static void main(String[] args) throws IOException {
        // BufferedReader 선언 및 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int count = 0;	// 합계

        // 문자열만큼 반복
        for(int i = 0; i < s.length(); i++) {
            // 문자마다 값을 계산
            switch(s.charAt(i)) {
                case 'A': case 'B': case 'C':
                    count += 3;
                    break;
                case 'D': case 'E': case 'F':
                    count += 4;
                    break;
                case 'G': case 'H': case 'I':
                    count += 5;
                    break;
                case 'J': case 'K': case 'L':
                    count += 6;
                    break;
                case 'M': case 'N': case 'O':
                    count += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    count += 8;
                    break;
                case 'T': case 'U': case 'V':
                    count += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    count += 10;
                    break;
            }
        }

        // 결과 출력
        System.out.print(count);
    }
}