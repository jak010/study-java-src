package algorithm.programmers;

public class P120826 {
    public String Solution(String my_string, String letter) {

        String answer = "";
        answer = my_string.replace(letter, "");

        return answer;
    }

    public static void main(String[] args) {
        P120826 solution = new P120826();
        solution.Solution("abcdef", "f");
    }
}
