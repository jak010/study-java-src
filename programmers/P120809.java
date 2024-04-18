package programmers;

import java.util.Arrays;

public class P120809 {
//https://school.programmers.co.kr/learn/courses/30/lessons/120809?language=java

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        P120809 instance = new P120809();
        int[] answer = instance.solution(arr);
        System.out.println(Arrays.toString(answer));


    }
}
