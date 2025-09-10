package notepad.date_n_times;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 2024년 1월 1일부터 2주 간격으로 5번 반복하여 날짜를 출력하는 코드를 작성
 */
public class TestLoopPlus {

    public static void main(String[] args) {


        LocalDate startDate = LocalDate.of(
                2024, 1, 1
        );

        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = startDate.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println(nextDate);
        }
        System.out.println("===============");

        // ChronoUnit을 사용하지 않는 표현식
        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = startDate.plusWeeks(2 * i);
            System.out.println(nextDate);
        }

    }
}
