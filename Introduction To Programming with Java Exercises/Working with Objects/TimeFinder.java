package uni11;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class TimeFinder {

    public static void main(String[] args) {

        long currentMillis = System.currentTimeMillis();
        long currentSeconds = currentMillis/1000;
        long currentMinutes = currentSeconds/60;
        long currentHours = currentMinutes/60;
        long currentDays = currentHours/24;
        double currentYears = (double)currentDays/365.25;
        double currentMonths = currentYears*12;

        System.out.println(currentYears);
        System.out.println(currentMonths);
        System.out.println(currentDays);


        /*LocalDate now = LocalDate.now();
        LocalDate epoch = LocalDate.ofEpochDay(0);

        System.out.println("Days: " + ChronoUnit.DAYS.between(epoch, now));
        System.out.println("Weeks: " + ChronoUnit.WEEKS.between(epoch, now));
        System.out.println("Months: " + ChronoUnit.MONTHS.between(epoch, now));*/

    }

}
