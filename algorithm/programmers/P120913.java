package algorithm.programmers;

import java.util.Arrays;

public class P120913 {

    public String[] solution(String my_str, int n) {
        int array_count = (my_str.length() +n - 1) / n;
        String[] answer = new String[array_count];
        int count = 0;

        for (int i = 0; i < my_str.length(); i++) {
            if (i % n == 0) {
                if (i + n < my_str.length()) {
                    answer[count] = my_str.substring(i, i + n);
                    count++;
                }
                if (i + n >= my_str.length()) {
                    answer[count] = my_str.substring(i, my_str.length());
                }

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P120913 solution = new P120913();

        String my_str = "abc1Addfggg4556b";
        int n = 6;

        System.out.printf(
                Arrays.toString(solution.solution(my_str, n))
        );
    }

}
