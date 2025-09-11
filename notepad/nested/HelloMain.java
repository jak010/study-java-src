package notepad.nested;

public class HelloMain {

    public static void main(String[] args) {


        Hello hello = new Hello() {

            @Override
            public String hello() {
                return "Hello World";

            }
        };

        String result = hello.hello();
        System.out.println(result);
    }

}
