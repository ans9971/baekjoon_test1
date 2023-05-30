package com.example.codingstudy_230424.ArrayBronze;

import java.util.Scanner;

public class BaekJoon10807 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];//입력받은 수만큼 배열 크기
        int count = 0; //개수새기

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();//배열에 입력
        }

        int find = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (find == arr[i])// 찾던 숫자와 같다면 count 추가
                count += 1;
        }
        System.out.println(count);
    }
}


