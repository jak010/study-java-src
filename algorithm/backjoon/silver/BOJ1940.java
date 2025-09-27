package algorithm.backjoon.silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1940
/*
 * BufferedReader, InputStreamReader
 * tag: Two Pointer
 * */

public class BOJ1940 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberOfParts = Integer.parseInt(br.readLine());
        int targetNumber = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] partNumbers = new int[numberOfParts]; // 제공된 재료의 수만큼 초기화
        int count = 0;

        for (int i=0; i<numberOfParts; i ++) {
            partNumbers[count++] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(partNumbers); // Integer 배열로 초기화

        int i = 0;
        int j = partNumbers.length - 1;
        int answer = 0;
        while (i < j) {
            if (partNumbers[i] + partNumbers[j] < targetNumber) {
                i++;
            } else if (partNumbers[i] + partNumbers[j] > targetNumber) {
                j--;
            } else {
                answer++;
                i++;
                j--;
            }
        }
        System.out.println(answer);
    }
}
