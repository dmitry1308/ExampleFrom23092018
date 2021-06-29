package ru.schepin.examples.sberBank.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime utc = now.atZone(ZoneId.of("UTC"));
        System.out.println("now " + now);
        System.out.println("utc " + utc);

        LocalDateTime plus = now.plus(1, ChronoUnit.WEEKS);
        System.out.println("plus " + plus);
        System.out.println(now.withHour(0));

    }
}
