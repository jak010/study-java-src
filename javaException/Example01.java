package javaException;

public class Example01 {


    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시킴");
            throw e;

            // 한 줄로 작성하기
            // throw new Exception("고의로 발생시킴");

        } catch (Exception e) {
            System.out.println("에러 메시지:" + e.getMessage());
            e.printStackTrace();
        }

        System.out.printf("?");

        // throw new Exception("");
        // throw new RuntimeException("");

    }
}
