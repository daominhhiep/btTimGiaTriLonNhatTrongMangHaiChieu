package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size arr1:");
        int row = scanner.nextInt();
        System.out.println("Enter size arr1:");
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Array is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 9);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Max: ");
        System.out.println(findMaxValue(arr));
    }

    public static int findMaxValue(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}