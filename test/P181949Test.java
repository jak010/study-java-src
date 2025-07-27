import algorithm.programmers.P181949;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P181949Test {

    private final P181949 sol = new P181949();

    @Test
    @DisplayName("대소문자 변경하기 테스트")
    public void testExample01() {
        String inputString = "aBcD";

        String result = sol.solution01(inputString);

        assertEquals("AbCd", result);
    }

}