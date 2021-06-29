package ru.schepin.examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Example2 {
    public static void main(String[] args) throws ParseException {
        LocalDate localDate = LocalDate.now();
        String s = localDate.toString();

        System.out.println(s);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(s);
        System.out.println(date);

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
        String format = simpleDateFormat1.format(new Date(2019-1900,8,11));
        System.out.println(format);

    }
}
