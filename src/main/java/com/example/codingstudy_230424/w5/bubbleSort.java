package com.example.codingstudy_230424.w5;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
//        int[] arr = {7, 2, 3, 9, 28, 1};
//        for (int i = 0; i <arr.length-1; i++) {
//            for (int j = 0; j < arr.length-1; j++) {
//                if(arr[i]>arr[i+1]){
//                    int temp=arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1]=temp;
//                }
//            }
//        }
        int[] arr = {7, 2, 3, 9, 28, 1};

        for (int j = 1; j <= arr.length; j++) {
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
