package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        matrix = fillMatrix(matrix, 0,9);
        System.out.println("Matrix:");
        printArr(matrix);
        System.out.println("Anti diagonal:");
        printArr(getAntiDiagonal(matrix));
        System.out.println("Even numbers from anti diagonal:");
        printEvenNumbers(getAntiDiagonal(matrix));

        System.out.println("------------------------");

        printArr(fillArray(0,10,2));
        printArr(fillArray(1,10,3));
        printArr(fillArray(2,20,4));
    }

    private static int[][] fillMatrix(int[][] matrix, int min, int max){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * (max - min + 1)) + min;
            }
        }
        return matrix;
    }

    private static int[] getAntiDiagonal(int[][] matrix){
        int[] arr = new int[matrix.length];

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if(i == j) {
                    arr[j] = matrix[i][matrix[i].length - j - 1];
                }
            }
        }

        return arr;
    }

    private static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.print("\n");
    }
    private static void printArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    private static void printEvenNumbers(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                System.out.print(arr[i] + "\t");
            }
        }
        System.out.println();
    }

    private static int[] fillArray(int begin, int end, int step){
        int[] arr = new int[(end-begin)/step+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = begin + i * step;
        }
        return arr;
    }
}


