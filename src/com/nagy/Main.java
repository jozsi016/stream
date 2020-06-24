package com.nagy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static final String SG = "something";

    public static void main(String[] args) {
        List<String> someBingNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "071");

        List<String> gNumbers = new ArrayList<>();
//        someBingNumbers.forEach(number -> {
//            if (number.toUpperCase().startsWith("G")) {
//                gNumbers.add(number);
//          //      System.out.println(number);
//            }
//        });
//
//        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        gNumbers.forEach((String s) -> System.out.println(s));
        gNumbers.add("str");
        someBingNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);
        someBingNumbers.stream().sorted().sorted() ;


    }
}
