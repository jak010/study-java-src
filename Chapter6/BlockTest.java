package Chapter6;

public class BlockTest {

    static {
        System.out.println("static {}"); // class init block
    }

    {
        System.out.println("{} "); // instance init block
    }

    public BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("new BlockTest");
        BlockTest bt = new BlockTest();

        System.out.println("new BlockTest");
        BlockTest bt2 = new BlockTest();

    }
}
