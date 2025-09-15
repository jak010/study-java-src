package algorithm.backjoon;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2588
 */
public class BOJ2588 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        char[] second = sc.next().toCharArray();

        int sum = 0; // 합산수를 출력하기 위한 변수
        int offset = 1; // 곱셈의 결과에 대해 자리수 이동을 위한 변수

        for (int i = 2; i >= 0; i--) {
            int temp = Integer.parseInt(String.valueOf(second[i]));
            System.out.println(first * temp);
            sum += (temp * first) * offset; // 곱셈의 자리수를 고려한 표현식
            offset *= 10;

        }
        System.out.println(sum);
    }

}
