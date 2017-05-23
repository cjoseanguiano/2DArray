package com.devix.company;

public class Main {
//Java program that uses 2D array

    public static void main(String[] args) {

        int[][] values = new int[4][4];

        values[0][0] = 1;
        values[1][1] = 2;
        values[3][2] = 3;

        for (int i = 0; i < values.length; i++) {
            int[] sub = values[i];
            for (int j = 0; j < sub.length; j++) {
                System.out.print(sub[j] + " ");
            }
            System.out.println();
        }
    }
}
