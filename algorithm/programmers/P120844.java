package algorithm.programmers;

import java.util.Arrays;

public class P120844 {

    public int[] solution(int[] numbers, String direction) {

        int k = 1;
        int[] answer = new int[numbers.length];

        if (direction.equals("right")) {
            for (int i = 0; i < numbers.length; i++) {
                int rotate_right_index = (i + k) % numbers.length;
                answer[rotate_right_index] = numbers[i];
            }
        }
        if (direction.equals("left")) {
            for (int i = 0; i < numbers.length; i++) {
                int rotate_left_index = (i - k + numbers.length) % numbers.length;
                answer[rotate_left_index] = numbers[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        P120844 solution = new P120844();
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        String direction = "left";

        System.out.printf(
                Arrays.toString(solution.solution(numbers, direction))
        );
    }

}
