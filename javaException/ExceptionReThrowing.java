package javaException;

public class ExceptionReThrowing {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main method에서 예외처리가 되었습니다.");
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("");
            throw e;
        }
    }

}
