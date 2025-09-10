package notepad.date_n_times;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 시작 날짜와 목표 날짜를 입력해서 남은 기간과 디데이를 구하라.
 * 남은 기간 x월 x일 x 형식으로 출력
 * 디에이 : x일 남은 형식으로 출력
 */
public class TestBetween {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);
        // 코드 작성

        Period period = Period.between(startDate, endDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println(period.getYears() + "년" + period.getMonths() + "월" + period.getDays() + "일");
        System.out.println(daysBetween);
    }

}
