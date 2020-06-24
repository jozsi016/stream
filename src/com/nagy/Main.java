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
        gNumbers.add("str");
        someBingNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);
        someBingNumbers.stream().sorted().sorted() ;

        System.out.println("Some thing to push!");

    }
}
