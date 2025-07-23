package grammer.Chapter02;

public class CastingEx3 {

    public static void main(String[] args) {


        float f = 9.1234567f;
        double d = 9.123456;
        double d2 = (double) f;

        // 연산속도의 향상이나 메모리를 절약하려면 float
        // 더 큰 값의 범위라던가 더 높은 정밀도를 필요로 한다면 double

        System.out.printf("f =%20.18f\n", f); // float 형은 정밀도가 7자리이다.
        System.out.printf("d =%20.18f\n", d); // double 형은 정밀도가 15자리이다.
        System.out.printf("d2 =%20.18f\n", d2);


    }

}
