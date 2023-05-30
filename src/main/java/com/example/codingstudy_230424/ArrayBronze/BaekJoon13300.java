package com.example.codingstudy_230424.ArrayBronze;

import java.util.Scanner;

public class BaekJoon13300 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt(); // 총 학생수
        int K= sc.nextInt(); // 방 최대인원
        int[][] student; // 학생 입력

        student = new int[7][2];

        for(int i=0;i<N;i++) {
            int sex = sc.nextInt();
            if(sex==0) {
                student[sc.nextInt()][0]++;
            }
            else if(sex==1) {
                student[sc.nextInt()][1]++;
            }
        }

        int count = 0; // 방 개수

        for(int i=1;i<7;i++) {
            if(student[i][0]==0) {
                continue;
            }
            else if(student[i][0]<=K) {
                count++;
            }
            else if(student[i][0]%K==0) {
                count += student[i][0] / K;
            }
            else if(student[i][0]%K!=0) {
                count+=student[i][0] / K;
                count++;
            }
        }

        for(int i=1;i<7;i++) {
            if(student[i][1]==0) {
                continue;
            }
            else if(student[i][1]<=K) {
                count++;
            }
            else if(student[i][1]%K==0) {
                count += student[i][1] / K;
            }
            else if(student[i][1]%K!=0) {
                count+=student[i][1] / K;
                count++;
            }
        }
        System.out.println(count);
    }
}
