package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(findUnique(new double[]{1,1,1,1,2,1,1,1}));
        System.out.println(findUnique(new double[]{3,1,1,1,1,1,1,1}));
        System.out.println(findUnique(new double[]{4,1,1}));

        System.out.println(Arrays.toString(new int[]{5,3,2,8,1,4}));
        System.out.println(Arrays.toString(sortArray(new int[]{5,3,2,8,1,4})));
        System.out.println(Arrays.toString(sortArray(null)));
    }

    public static double findUnique(double[] arr){
        if(arr[0] != arr[1] && arr[0] != arr[2])
            return arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0])
                return arr[i];
        }

        return 0;
    }

    public static int[] sortArray(int[] arr){
        if(arr == null)
            return arr;
        if(arr.length == 0)
            return arr;

        int[] sortedOdd = Arrays.stream(arr).filter(x -> x % 2 != 0).sorted().toArray();

        int j = 0;
        for (int i = 0; i < arr.length && j < sortedOdd.length; i++) {
            if(arr[i] % 2 != 0){
                    arr[i] = sortedOdd[j];
                    j++;
                }
        }

        return arr;
    }
}
