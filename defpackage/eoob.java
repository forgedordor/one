package defpackage;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoob {
    public static final Duration a(long j) {
        Duration durationOfDays = Duration.ofDays(j);
        durationOfDays.getClass();
        return durationOfDays;
    }

    public static final Duration b(int i) {
        Duration durationOfHours = Duration.ofHours(i);
        durationOfHours.getClass();
        return durationOfHours;
    }

    public static final Duration c(long j) {
        Duration durationOf = Duration.of(j, ChronoUnit.MICROS);
        durationOf.getClass();
        return durationOf;
    }

    public static final Duration d(int i) {
        Duration durationOfMillis = Duration.ofMillis(i);
        durationOfMillis.getClass();
        return durationOfMillis;
    }

    public static final Duration e(int i) {
        return f(i);
    }

    public static final Duration f(long j) {
        Duration durationOfMinutes = Duration.ofMinutes(j);
        durationOfMinutes.getClass();
        return durationOfMinutes;
    }

    public static final Duration g(int i) {
        return h(i);
    }

    public static final Duration h(long j) {
        Duration durationOfSeconds = Duration.ofSeconds(j);
        durationOfSeconds.getClass();
        return durationOfSeconds;
    }
}
