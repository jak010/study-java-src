package algorithm.backjoon;


import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1110 <br>
 *
 * @Description 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
 */
public class BOJ1157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Cnt = new int[26]; // 26개의 알파벳 중 각각의 알파벳이 몇 개나 있는지 카운트하기 위해 선언

        char[] text = sc.nextLine().toCharArray();
        for (int i = 0; i < text.length; i++) {
            char now = text[i];
            int index = -1;

            // 소문자인 경우
            if ('a' <= now && now <= 'z') {
                index = now - 'a';
            } else {
                index = now - 'A';
            }
            Cnt[index]++;
        }

        int Max = -1;
        int MaxCount = 0;
        int MaxIndex = -1;
        for (int i = 0; i < 26; i++) {
            if (Max < Cnt[i]) { // 알파벳의 각 개수 중 최대값이 갱신됨
                Max = Cnt[i];
                MaxCount = 1;
                MaxIndex = i; // 어떤 알파벳이 제일 컸는지 저장
            } else if (Max == Cnt[i]) { // 알파벳의 최대값이 갱신되지 않음
                MaxCount++;
            }
        }

        if (MaxCount == 1) { // 알파벳의 개수 중 유일하게 큰 값이 있었다는 뜻
            System.out.println((char) (MaxIndex + 'A'));
        } else {
            System.out.println("?");
        }


    }

}
