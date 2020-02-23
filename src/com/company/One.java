package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class One {

    LocalDate myBirthdate = LocalDate.parse("1984-07-26");
    LocalDate currentDate = LocalDate.now();

    public One() {
        long daysBetween = ChronoUnit.DAYS.between(myBirthdate, currentDate);
        System.out.printf("Jag är %,d dagar gammal!", daysBetween);
    }


}
