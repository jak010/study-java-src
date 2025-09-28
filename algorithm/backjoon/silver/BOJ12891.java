package algorithm.backjoon.silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/12891
 * - Level : Silver5
 */
public class BOJ12891 {
    static int checkArr[];
    static int myArr[]; // 현재 부분 문자열의 상태
    static int checkSecret; // 4개 중에 몇 개가 비밀번호 요건에 만족하는가


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader((System.in)));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(st.nextToken()); // DNA 문자열의 길이
        int P = Integer.parseInt(st.nextToken()); // 비밀번호로 사용할 부분문자열의 길이

        int Result = 0;
        char A[] = new char[S];
        checkArr = new int[4];
        myArr = new int[4];

        A = bf.readLine().toCharArray();
        st = new StringTokenizer(bf.readLine());

        // 각 DNA 문자(A, C, G, T)가 최소한으로 포함해야 하는 개수를 설정하고, 0개여도 되는 문자의 수를 센다.
        // - Ex -> 2, 0, 1,1
        //   - 0이라는 부분은 없어도 상관없는 문자열을 뜻함
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checkSecret++; // 이 변수가 4가 되면 정답 count를 증가시킨다.
            }
        }

        for (int i = 0; i < P; i++) {
            Add(A[i]);
        }

        if (checkSecret == 4) {
            Result++;
        }

        // 슬라이딩 윈도우 처리부분
        for (int i = P; i < S; i++) {
            int j = i - P;
            Add(A[i]);
            Remove(A[j]);
            if (checkSecret == 4) {
                Result++;
            }
        }

        System.out.println(Result);
        bf.close();

    }

    /**
     * 새로 들어온 문자열을 처리함
     */
    private static void Add(char c) {
        int index = -1;
        switch (c) {
            case 'A':
                index = 0;
                myArr[index]++;
                if (myArr[index] == checkArr[index]) checkSecret++;
                break;
            case 'C':
                index = 1;
                myArr[index]++;
                if (myArr[index] == checkArr[index]) checkSecret++;
                break;
            case 'G':
                index = 2;
                myArr[index]++;
                if (myArr[index] == checkArr[index]) checkSecret++;
                break;
            case 'T':
                index = 3;
                myArr[index]++;
                if (myArr[index] == checkArr[index]) checkSecret++;
                break;
        }
    }

    /**
     * 새로 들어온 문자열을 처리함
     */
    private static void Remove(char c) {
        int index = -1;
        switch (c) {
            case 'A':
                index = 0;
                if (myArr[index] == checkArr[index])
                    checkSecret--;
                myArr[index]--;
                break;
            case 'C':
                index = 1;
                if (myArr[index] == checkArr[index])
                    checkSecret--;
                myArr[index]--;
                break;
            case 'G':
                index = 2;
                if (myArr[index] == checkArr[index])
                    checkSecret--;
                myArr[index]--;
                break;
            case 'T':
                index = 3;
                if (myArr[index] == checkArr[index])
                    checkSecret--;
                myArr[index]--;
                break;
        }
    }


}
