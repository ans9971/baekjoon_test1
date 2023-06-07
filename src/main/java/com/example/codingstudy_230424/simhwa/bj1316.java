package com.example.codingstudy_230424.simhwa;
import java.util.*;
import java.io.*;

public class bj1316 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine()); //test 횟수 입력받기
        int count = 0; //그룹단어 개수
        int[] visited = new int[26]; //알파벳 개수만큼의 배열 생성

        for(int i = 0; i < test; i++) {
            String s = br.readLine();
            for(int k = 0; k < 26; k++) visited[k] = 0; //0으로 초기화
            int check = 0; //그룹 단어인지 체크용

            char pre = s.charAt(0); //이전의 문자 저장
            visited[pre -'a'] = 1; //방문했으면 1로 갱신

            for(int j = 1; j < s.length(); j++) {
                if(pre == s.charAt(j)) check++; //연속해서 반복되는 문자일 경우 check 1 증가

                else {
                    if(visited[s.charAt(j) - 'a'] == 1) break; //방문한 적이 있는 문자가 나타났으니 더이상 반복문을 진행할 필요없음

                    else { //방문한 적이 없을 때
                        check++;
                        visited[s.charAt(j) - 'a'] = 1; //방문했다고 표시
                        pre = s.charAt(j); //이전의 문자 갱신
                    }
                }
            }

            if(check == s.length()-1) count++; //그룹문자 수 1 증가, 첫 문자는 check 대상 아니므로 문자열 길이에서 1 빼서 비교
        }

        System.out.println(count); //count 출력
    }
}