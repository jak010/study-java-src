package refactoringBook.technique;


/**
 * Replace Temp With Query
 * - 어떤 수식의 결과값을 저장하기 위해서 임시변수를 사용하고 있다면 수식을 뽑아내서 메소드로 만들고
 * 임시변수를 참조하는 곳을 찾아 모두 메소드 호출로 바꾼다.
 * 새로 만든 메소드는 다른 메소드에서도 사용할 수 있다.
 * <p>
 * Motive (p153)
 * - 임시변수는 일시적이고 적용이 국소적 범위로 제한된다는 단점이 있다. 임시변수는 자신이 속한 메서드의 안에서만 인식되므로
 * 그 임시변수에 접근하려다보면 코드는 길어지게 마련이다.
 * - 임시변수를 메서드 호출로 수정하면 클래스 안 모든 메서드가 그 정보에 접근할 수 있다. 이렇게하면 클래스의 코드가 훨씬 깔끔하다.
 * <p>
 *
 * <p> Caution
 * Replace Temp With Query은 대부분의 경우 메소드 추출을 적용하기 전에 반드시 적용해야한다.
 * 지역변수가 많을수록 메서드 추출이 힘들어지므로 최대한 많은 변수를 메서드 호출로 고쳐야한다.
 * </p>
 *
 * <p> How
 * Replace Temp With Query를 적용해야하는 가장 간단한 상황은 임시변수에 값이 한번만 대입되고 대입문을 이루는 수식이 없을 때다.
 * 다른 경우들은 더 어렵지만 리팩토링이 가능하다.
 * <p>
 * - 값이 한 번만 대입되는 임시변수를 찾자.
 * - 그 임시변수를 final로 선언하자.
 * - 컴파일을 실시하자.
 * - 대입문 우변을 뺴내어 메서드로 만들자.
 * - 컴파일과 테스트를 실시하자.
 * - 임시변수를 대상으로 임시 변수 내용 직접 삽입 기법을 실시하자.
 * </p>
 * <p>
 * Note
 * - Cmd + Option + M : Extract Method
 * - Cmd + Option + N : Inline Variable
 */
class BeforeEx1 {

    /**
     * @see refactoring.guru/ko/replace-temp-with-query
     */
    public double calculateTotal(int quantity, double itemPrice) {

        double basePrice = quantity * itemPrice;

        if (basePrice > 1000) {
            return basePrice * 0.95;
        } else {
            return basePrice * 0.98;
        }
    }

    /**
     * Refactoring Book - p155
     */
    public double getPrice(int quantity, int itemPrice) {
        int basePrice = quantity * itemPrice;
        double discountFactor;
        if (basePrice > 1000) {
            discountFactor = 0.95;
        } else {
            discountFactor = 0.98;
        }
        return basePrice * discountFactor;

    }

}


public class ReplaceTempWithQuery {

    public double getPrice(int quantity, int itemPrice) {
        return basePrice(quantity, itemPrice) * discountFactor(quantity, itemPrice);
    }

    private static double discountFactor(int quantity, int itemPrice) {
        final double discountFactor;
        if (basePrice(quantity, itemPrice) > 1000) {
            discountFactor = 0.95;
        } else {
            discountFactor = 0.98;
        }
        return discountFactor;
    }

    private static int basePrice(int quantity, int itemPrice) {
        return quantity * itemPrice;
    }

    public static void main(String[] args) {
    }


}
