package grammer.Chapter05;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {

        int[] score = new int[5];
        int k = 1;

        for (int i = 1; i < 5; i++) {
            score[i] = i * 10;
        }

        for (int sc : score) {
            System.out.println(sc);
        }

        int tmp = score[k + 2] + score[4];

        System.out.println(Arrays.toString(score));


    }
}
