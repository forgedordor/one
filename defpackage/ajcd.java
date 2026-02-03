package defpackage;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajcd {
    private static final ZoneId a;
    private static final ZonedDateTime b;
    private final cogw c;

    static {
        ZoneId zoneIdOf = ZoneId.of("America/Los_Angeles");
        a = zoneIdOf;
        ZonedDateTime zonedDateTimeAtStartOfDay = LocalDate.EPOCH.atStartOfDay(zoneIdOf);
        zonedDateTimeAtStartOfDay.getClass();
        b = zonedDateTimeAtStartOfDay;
    }

    public ajcd(cogw cogwVar) {
        cogwVar.getClass();
        this.c = cogwVar;
    }

    public static final int b(Instant instant) {
        return (int) ChronoUnit.DAYS.between(b, instant.atZone(a));
    }

    public final int a() {
        Instant instantF = this.c.f();
        instantF.getClass();
        return b(instantF);
    }
}
