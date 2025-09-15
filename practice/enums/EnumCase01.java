package practice.enums;


/**
 * Enum을 잘못 사용하는 예제
 */

enum PredictedOutcome {
    COMPANY_WILL_GO_BUST,
    COMPANY_WILL_MAKE_A_PROFIT,
}

class UseCase {

    /**
     * 아래 메서드의 경우 Enum의 값이 2개인 동안에는 작동한다.
     * -  그러나 새로운 열거값을 추가한다면 상황은 잘못될 수 있다.
     * <p>
     * 주의할점
     * - PrㄷdictionOutcome의 enum이 수정된다고 해서 아래 메서드도 같이 수정할 것이라고 가정하는 것은 위험하다.
     */
    public Boolean isOutcomeSafe(PredictedOutcome prediction) {

        if (prediction == PredictedOutcome.COMPANY_WILL_GO_BUST) {
            return true;
        }
        return false;
    }

    /**
     * isOutcomeSafe() 를 개선한 버전으로 모든 열거값에 대한 switch 를 작성해서 해결한다.
     * 장점
     * - 단위테스트와 결합할 수 있다.
     * - 임의의 값에 대해 예외가 발생하면 테스트가 실패하고 PredicationOutcome 에 새 값을 추가한 개발자는 이 함수도 변경해야함을 알게된다.
     */
    public Boolean isOutcomeSafe2(PredictedOutcome prediction) {

        switch (prediction) {
            case COMPANY_WILL_GO_BUST:
                return false;
            case COMPANY_WILL_MAKE_A_PROFIT:
                return true;
        }
        throw new RuntimeException("UnHandled Predication");
    }

}


public class EnumCase01 {
}
