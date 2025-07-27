package algorithm.programmers;

import java.util.Scanner;

/**
 * Programmers : https://school.programmers.co.kr/learn/courses/30/lessons/181949
 */
public class P181949 {

    public String solution01(String inputString) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        String answer = "";

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }

        System.out.println(answer);
    }
}

