package algorithm.backjoon;


import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1110
 */
public class BOJ1110 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ori = sc.nextInt();
        int next = ori;
        int count = 1;

        while (true) {
            int first, second = 0;  // 문제에서는 두 자리수 연산이기 때문에 10의 자리, 1의 자리로 다룰 수를 지정함

            // 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
            if (next < 10) {
                first = 0;
                second = next;
            } else {
                // 각 자리의 숫자를 가져오기 위한 연산
                // first = 10의 자리 = 10으로 나눈 몫
                // second = 1의 자리수 = 10으로 나눈 나머지
                first = next / 10;
                second = next % 10;
            }
            int sum = first + second;
            // (주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면)
            // next%10 * 10 : 10의 자리수
            // sum %10 : 1의 자리수
            next = (next % 10 * 10) + (sum % 10);

            if (ori == next) {
                break;
            } else {
                count++;
            }

        }
        System.out.println(count);
    }
}
