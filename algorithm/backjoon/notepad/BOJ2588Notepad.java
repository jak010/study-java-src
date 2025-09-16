package algorithm.backjoon.notepad;

import java.util.Scanner;


public class BOJ2588Notepad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt(); // 첫번쨰 입력수
        char[] second = sc.next().toCharArray(); // 두번쨰 입력수

        int result = 0;
        int offset = 1;
        for (int i = second.length - 1; i >= 0; i--) {
            int offsetNumber = Integer.parseInt(String.valueOf(second[i]));

            result += (first * offsetNumber) * offset;
            offset *= 10;
        }

        System.out.println(result);
    }

}
