package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // task 1

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList = myList.stream()
                .filter(x -> x.charAt(0) == 'c')
                .sorted()
                .collect(Collectors.toList());
        //myList.forEach(x -> x.toUpperCase());
        System.out.println(myList);

        // task 2


        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
        }
        System.out.println(
                Arrays.stream(arr)
                        .filter(x -> x % 2 == 0)
                        .average()
                        .getAsDouble());


        // task 3

        String str = "sjdhgfsjkavchjwagehf";
        StringBuilder sb = new StringBuilder();
        Arrays.stream(str.split("")).forEach((x) -> {
            if (x.matches("[h-t]")) {
                sb.append(x.toUpperCase());
            } else {
                sb.append(x);
            }
        });
        System.out.println(sb);

    }
}
