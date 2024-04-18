package programmers;

import java.util.Arrays;

public class P120819 {

    public int[] solution(int money) {
        int ICE_AMERICANE = 5500;

        int buyable = (money / ICE_AMERICANE);
        int reaminer = (money % ICE_AMERICANE);

        return new int[]{buyable, reaminer};
    }

    public static void main(String[] args) {
        P120819 solution = new P120819();
        System.out.print(Arrays.toString(solution.solution(5500)));
    }

}
