package grammer.javaFor;

public class Example01 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }

}
