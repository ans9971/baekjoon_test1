package com.example.codingstudy_230424.BaekJoon1Chawon;
import java.io.*;
import java.util.*;
public class bj10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int M = Integer.parseInt(st.nextToken());

        for (int n = 0; n < M; n++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for(int t = i-1; t < j; t++)
                arr[t] = k;
        }

        for(int num : arr)
            str.append(num + " ");

        System.out.print(str);
        br.close();
    }
}