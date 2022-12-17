package date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DurationAndPeriodExample {

    public static void main(String[] args) {

        LocalDate localDate_1 = LocalDate.now();

        System.out.println("Period dla 100 dni od dziś");
        Period period = Period.between(localDate_1, localDate_1.plusDays(100));
        System.out.println("Lata = " + period.getYears());
        System.out.println("Miesiące = " + period.getMonths());
        System.out.println("Dni = " + period.getDays());

        System.out.println("Period dla 500 dni od dziś");
        period = Period.between(localDate_1, localDate_1.plusDays(500));
        System.out.println("Lata = " + period.getYears());
        System.out.println("Miesiące = " + period.getMonths());
        System.out.println("Dni = " + period.getDays());


        System.out.println("DURATION!!!");
        LocalDateTime localDateTime_1 = LocalDateTime.now();

        Duration duration = Duration.between(localDateTime_1, localDateTime_1.plusDays(100));
        System.out.println("Duration days = " + duration.toDays());
        System.out.println("Duration minutes = " + duration.toMinutes());


        //PRZYJMUJE OBIEKTY ZARÓWNO TYPU LocalDate jak i LocalDateTime
        System.out.println("Chrono Unit days = " + ChronoUnit.DAYS.between(localDate_1, localDateTime_1.plusDays(100)));
    }
}
