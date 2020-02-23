package com.company;

import java.time.Duration;

public class FiveC {

    Duration lifeSpan = Duration.ofMinutes((long) (80 * (365.24 * 24 * 60)));
    Duration sleep = Duration.ofMinutes((long) ((8 * 60) * (80 * 365.24)));
    Duration mobileUse = Duration.ofMinutes((long) ((3 * 60) * (80 * 365.24)));
    Duration workOrSchool = Duration.ofMinutes((long) ((9 * 60) * (65 * 365.24)));
    Duration toiletTimeBeforePension = Duration.ofMinutes((long) ((65 * (365.24 * 24 * 60)) * 0.02));
    Duration hygieneBeforePension = Duration.ofMinutes((long) (30 * (65 * 365.24)));
    Duration choresBeforePension = Duration.ofMinutes((long) (60 * (65 * 365.24)));
    Duration eatingBeforePension = Duration.ofMinutes((long) (30 * (65 * 365.24)));
    Duration beforePension = toiletTimeBeforePension
            .plus(workOrSchool)
            .plus(hygieneBeforePension)
            .plus(choresBeforePension)
            .plus(eatingBeforePension);
    Duration toiletTimeAfterPension = Duration.ofMinutes((long) ((15 * (365.24 * 24 * 60)) * 0.04));
    Duration hygieneAfterPension = Duration.ofMinutes((long) (60 * (15 * 365.24)));
    Duration choresAfterPension = Duration.ofMinutes((long) (120 * (15 * 365.24)));
    Duration eatingAfterPension = Duration.ofMinutes((long) (60 * (15 * 365.24)));
    Duration afterPension = toiletTimeAfterPension
            .plus(hygieneAfterPension)
            .plus(choresAfterPension)
            .plus(eatingAfterPension);
    Duration freeTimeLeft = lifeSpan.minus(sleep).minus(beforePension).minus(afterPension).minus(mobileUse);

    public FiveC() {
        float percentage = (((float) freeTimeLeft.toMinutes() / lifeSpan.toMinutes()) * 100);
        System.out.printf("Procent ledigt under livstid: ca %.0f%% (%,d timmar)", percentage, freeTimeLeft.toHours());
    }
}
