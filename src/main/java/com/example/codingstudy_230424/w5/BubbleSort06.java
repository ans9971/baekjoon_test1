package com.example.codingstudy_230424.w5;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort06 {

    private Comparator<Integer> comparator;

    public BubbleSort06(Comparator<Integer> comparator) {
        this.comparator = comparator;
    }

    public int[] sortARound(int[] arr, int until) {
        for (int i = 0; i < until; i++) {

            if(comparator.compare(arr[i], arr[i+1]) > 0) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr){
        for (int i = 1; i <= arr.length - 1 ; i++) {
            arr = sortARound(arr, arr.length - i);
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort06 bs = new BubbleSort06(((o1, o2) -> o2 - o1));
        int[] arr = {7, 2, 3, 9, 28, 11};
        arr = bs.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

