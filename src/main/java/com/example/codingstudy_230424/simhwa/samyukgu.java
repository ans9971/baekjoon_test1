package com.example.codingstudy_230424.simhwa;

public class samyukgu {
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            String[] a=String.valueOf(i).split("");
//            int count=0;
//            for (int j = 0; j < a.length; j++) {
//
//                if(a[i].equals("3") || a[i].equals("6") || a[i].equals("9")){
//                    count++;
//                }
//
//            }
//            System.out.println(i+"*".repeat(count));
//        }

        for (int i = 0; i < 100; i++) {
            System.out.printf("%02d",i);
            System.out.println("*".repeat(syg(i)));
        }
    }

    public static int syg(int k) {

        int count=0;

        while(k>0){
            int b=k%10;
            k=k/10;
            if(b%3==0 && b!=0){
                count++;
            }
        }
        return count;
    }
}
