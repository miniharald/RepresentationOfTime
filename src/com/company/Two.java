package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Two {
    DateTimeFormatter swedishFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    DateTimeFormatter americanFormat = DateTimeFormatter.ofPattern("d/M/yyyy h:mm a", Locale.US);
    String nyTimeStr = "14/4/2020 8:00 AM";
    ZoneId nyId = ZoneId.of("America/New_York");
    ZoneId swedenId = ZoneId.of("Europe/Stockholm");

    public Two() {
        LocalDateTime localNyTime = LocalDateTime.parse(nyTimeStr, americanFormat);
        ZonedDateTime newYorkTime = localNyTime.atZone(nyId);
        ZonedDateTime swedishTime = newYorkTime.withZoneSameInstant(swedenId);
        String sweOut = swedishTime.format(swedishFormat);
        String usOut = newYorkTime.format(americanFormat);
        System.out.printf("Mötet på Skype startar %s i New York. Svensk tid blir det %s." ,usOut, sweOut);
    }
}
