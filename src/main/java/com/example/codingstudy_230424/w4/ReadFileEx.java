package com.example.codingstudy_230424.w4;

import com.example.codingstudy_230424.Hospital;

import javax.net.ssl.HostnameVerifier;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class ReadFileEx {
//    LineReader lineReader;
    Charset charset;

    public ReadFileEx(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        // BufferedReader선언 --> File연결
        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));

        // BufferedReader에서 loop으로 한줄씩 불러오기
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }

    public Hospital parse(String str) {
//        System.out.println(str);
//        String[] splitted = str.split(",");
//        System.out.println(Arrays.toString(splitted));
//        Address address = new Address(splitted[10],splitted[5],splitted[7]);
//        Hospital hospital = new Hospital(splitted[1],splitted[11], address);
//        return hospital;
        String[] splitted = str.split(",");
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);

        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines) {
            hospitals.add(parse(line));

        }
        return hospitals;
    }
//    public static void main(String[] args) throws IOException {
//        ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
//        List<String> strlines = rfe.getLines("hospital_10_info.csv");
////        for (int i = 0; i < 9; i++) {
////            System.out.println(result.get(i));
////        }
//        List<Hospital> parseHospital = rfe.getHospitals(strlines);
//        System.out.println(parseHospital.get(0));
//    }
    public static void main(String[] args) throws IOException {
//        ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
//        List<String> strLines = rfe.getLines("hospital_info_0920_utf8.csv");
//        List<Hospital> parsedHospital = rfe.getHospitals(strLines);
//        for (int i = 0; i < parsedHospital.size(); i++) {
//            Hospital hospital = parsedHospital.get(i);
//            System.out.printf("%s %s %s \n", hospital.getName(), hospital.getWebsiteAddr(),hospital.getAddress().getFullAddr());
//        }
        ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
        List<String> strLines = rfe.getLines("hospital_info_0920_utf8.csv");
        List<Hospital> parsedHospital = rfe.getHospitals(strLines);
        for (int i = 0; i < parsedHospital.size(); i++) {
            Hospital hospital = parsedHospital.get(i);
            System.out.printf("%s %s %s\n", hospital.getName(), hospital.getWebsiteAddr(),
                    hospital.getAddress().getFullAddr());
        }

    }
}


//public class ReadFileEx {
//    // FileReader(x)
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("./hospital_info_0920.csv"));
//        System.out.println(br.readLine());
//    }
//}
//public class ReadFileEx {
//    public List<String> getLines(String fileName) {
//        List<String> lines = new LinkedList<>();
//
////        try(BufferedReader br = Files.newBufferedReader(Paths.get(fileName), StandardCharsets.UTF_8)){
////
////            String line;
////            while ((line = br.readLine()) != null) {
////                //System.out.println(line);
////                lines.add(line);
////            }
////        } catch (IOException e) {
////            throw new RuntimeException(e);
////        }
//        BufferedReader br = new BufferedReader(new FileReader(fileName, Charset.forName("EUC-KR")));
//        String line;
//        while ((line = br.readLine()) != null) {
//            lines.add(line);
//        }
//        return lines;
//    }
//    public static void main(String[] args) throws IOException {
////        try(BufferedReader br = Files.newBufferedReader(
////                Paths.get("C:\\Users\\mjh31\\Desktop\\study\\codingstudy_230424\\src\\main\\java\\com\\example\\codingstudy_230424\\hospital_info_0920_utf8.csv"), StandardCharsets.UTF_8)){
////
////            String line;
////            while ((line = br.readLine()) != null) {
////                System.out.println(line);
////            }
////        } catch (IOException e) {
////            throw new RuntimeException(e);
////        }
//        ReadFileEx rfe = new ReadFileEx();
//        List<String> result = rfe.getLines()
//    }
//}