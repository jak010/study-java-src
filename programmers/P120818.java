package programmers;

public class P120818 {

    public int solution(int price) {
        int answer = 0;

        if (price > 100000) {
            answer = (int) (price * 0.05);
        } else if (price >= 300000) {
            answer = (int) (price * 0.10);
        } else {

        }


        return answer;
    }

    public static void main(String[] args) {
        P120818 solution = new P120818();

        int price = 150000;

        solution.solution(price);
    }
}
