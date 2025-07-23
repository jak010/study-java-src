package algorithm.programmers;

import java.util.Arrays;


/**
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120809?language=java
 */
public class P120809 {

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }

    public int[] solution2(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i*2).toArray();
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        P120809 instance = new P120809();
        int[] answer = instance.solution2(arr);
        System.out.println(Arrays.toString(answer));


    }
}
