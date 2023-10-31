package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] Q = new int[9][9];
        initArray(Q);
        printArray(Q);
        System.out.println("Сума мінімальних елементів по парних стовпцях = " + searchSumOfMinValues(Q));
    }

    public static int searchSumOfMinValues(int[][] Q) {
        int sum = 0;
        for (int j = 0; j < Q.length; j++) {
            if (j % 2 == 0) {
                int min = Q[0][j];
                for (int i = 1; i < Q.length; i++) {
                    if (Q[i][j] < min) {
                        min = Q[i][j];
                    }
                }
                sum += min;
            }
        }
        return sum;
    }

    public static void printArray(int[][] Q) {
        for (int i = 0; i < Q.length; i++) {
            for (int j = 0; j < Q.length; j++) {
                System.out.print(Q[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void initArray(int[][] Q) {
        Random rand = new Random();
        for (int i = 0; i < Q.length; i++) {
            for (int j = 0; j < Q[i].length; j++) {
                Q[i][j] = rand.nextInt(62) + 7;
            }
        }
    }
}