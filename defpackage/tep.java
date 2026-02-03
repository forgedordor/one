package defpackage;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.MonthDay;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tep {
    public static final long a(cogw cogwVar) {
        return b(cogwVar).toEpochMilli();
    }

    public static final Instant b(cogw cogwVar) {
        Instant instant = cogwVar.f().atZone(ZoneId.systemDefault()).truncatedTo(ChronoUnit.DAYS).toInstant();
        instant.getClass();
        return instant;
    }

    public static final MonthDay c(cogw cogwVar) {
        Instant instantF = cogwVar.f();
        instantF.getClass();
        return d(instantF);
    }

    public static final MonthDay d(Instant instant) {
        MonthDay monthDayFrom = MonthDay.from(instant.atZone(ZoneId.systemDefault()));
        monthDayFrom.getClass();
        return monthDayFrom;
    }

    public static final ZonedDateTime e(Instant instant) {
        ZonedDateTime zonedDateTimeTruncatedTo = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).y(ZoneId.systemDefault()).truncatedTo(ChronoUnit.DAYS);
        zonedDateTimeTruncatedTo.getClass();
        return zonedDateTimeTruncatedTo;
    }
}
