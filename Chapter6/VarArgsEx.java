package Chapter6;

import java.util.Arrays;

public class VarArgsEx {

    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        concatenate(strArr);

    }

    static void concatenate(String... args) {

        System.out.println(Arrays.toString(args));

        for (String str : args) {
            System.out.println(str);
        }

    }

}
