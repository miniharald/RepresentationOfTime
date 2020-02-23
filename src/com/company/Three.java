package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Three {
    LocalDate startDate = LocalDate.parse("1900-01-01");
    LocalDate endDate = LocalDate.now();
    int counter = 0;

    public Three() {
        for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
    if (date.getDayOfWeek().equals(DayOfWeek.FRIDAY) && date.getDayOfMonth() == 13) {
        counter++;
    }
        }
        System.out.println("Antal fredagen den 13:e sedan 1900: " + counter);
    }
}
