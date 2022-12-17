package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {

    public static void main(String[] args) {

        //Przykład LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println("Local Time now = " + localTime);
        localTime = localTime.withHour(20).withMinute(10).withSecond(17).withNano(0);
        System.out.println("My private set time = " + localTime);

        //Przykład LocaleDate
        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date now = " + localDate);
        System.out.println("Day of year = " + localDate.getDayOfYear());
        System.out.println("Day of weak = " + localDate.getDayOfWeek());
        System.out.println("Plus 20 days = " + localDate.plusDays(20));

        //Przykład LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local Date Time = " + localDateTime);
        System.out.println("Plus 3 weeks = " + localDateTime.plusWeeks(3));


        String myFormattedDate = localDateTime.format(DateTimeFormatter.ISO_WEEK_DATE);
        System.out.println("ISO WEEK DATE format = " + myFormattedDate);
    }
}
