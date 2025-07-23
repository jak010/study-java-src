package algorithm.programmers;

import java.util.Arrays;

public class P120813 {

    public int[] solution(int n) {

        // 홀수의 개수를 구하는 방법
        int count_odds = 0;
        if (n % 2 != 0) { // n이 짝수일 떄
            count_odds = (n / 2) + 1;
        } else { // n이 홀수일 때
            count_odds = (n / 2);
        }


        int[] answer = new int[count_odds];
        int count2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer[count2] = i;
                count2++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P120813 solution = new P120813();
        System.out.print(Arrays.toString(solution.solution(10)));
    }

}
