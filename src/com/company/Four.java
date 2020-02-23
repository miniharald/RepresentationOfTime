package com.company;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Four {
    LocalDate myBirthdate = LocalDate.parse("1984-07-26");
    LocalDate secondSprint = LocalDate.parse("2018-01-01");
    LocalDate my80thBirthdate = LocalDate.parse("2064-07-26");
    int timeOnToiletFirstInSeconds = (int) (14.5 * 60);
    int timeOnToiletSecondInSeconds = 27 * 60;

    public Four() {
        long daysBetween = ChronoUnit.DAYS.between(myBirthdate, secondSprint);
        long totalTimeOnToilet = daysBetween * timeOnToiletFirstInSeconds;
        daysBetween = ChronoUnit.DAYS.between(secondSprint, my80thBirthdate);
        totalTimeOnToilet += daysBetween * timeOnToiletSecondInSeconds;
        long daysOnToilet = totalTimeOnToilet / 60 / 60 / 24;
        System.out.println("Jag har spenderat " + daysOnToilet + " dagar på toa när jag är 80 år!");
    }
}
