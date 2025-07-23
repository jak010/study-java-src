package grammer.Chapter05;

import java.util.Arrays;

public class Notepad {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] result = new char[abc.length];

        System.arraycopy(abc, 0, result, 0, abc.length);

        System.out.println(Arrays.toString(result));
    }
}
