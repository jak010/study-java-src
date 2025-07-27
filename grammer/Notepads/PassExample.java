package grammer.Notepads;

public class PassExample {

    public static void main(String[] args) {
        PassExample pass = new PassExample();
        pass.callPassByValue();
    }

    public void callPassByValue() {
        int a = 10;
        String b = "b";

        System.out.println("before pass by Value");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        passByValue(a, b);
        System.out.println("after pass by Value");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    void passByValue(int a, String b) {
        a = 20;
        b = "z";

        System.out.println("in pass by Value");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }

}
