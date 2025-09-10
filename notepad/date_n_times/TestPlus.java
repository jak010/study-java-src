package notepad.date_n_times;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestPlus {

    /**
     * 2024년 1월 1일 0시 0분 0초에 1년 2개월 3일 4시간 후의 시각을 찾아라
     */

    public static void main(String[] args) {

        LocalDateTime datetime = LocalDateTime.of(
                2024, 1, 1,
                0, 0, 0
        );
        LocalDateTime futureTime = datetime.plusYears(1)
                .plusMonths(2)
                .plusDays(3)
                .plusHours(4);

        System.out.println(futureTime);

    }

}
