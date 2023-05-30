package com.example.codingstudy_230424.ArrayBronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder(s);
        int cs = s.length();

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            String c = st.nextToken();
            switch(c) {
                case "L":
                    if(cs>0)
                        cs--;
                    break;
                case "D":
                    if(cs!=sb.length())
                        cs++;
                    break;
                case "B":
                    if(cs>0) {
                        sb.delete(cs-1, cs);
                        cs--;
                    }
                    break;
                case "P":
                    sb.insert(cs, st.nextToken());
                    cs++;
                    break;
            }
        }
        System.out.println(sb.toString());

    }
}
