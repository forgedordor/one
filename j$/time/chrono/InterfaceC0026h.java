package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.Temporal;

/* renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC0026h extends Temporal, Comparable {
    InterfaceC0026h e(ZoneId zoneId);

    Chronology getChronology();

    ZoneOffset getOffset();

    ZoneId getZone();

    long toEpochSecond();

    ChronoLocalDate toLocalDate();

    ChronoLocalDateTime toLocalDateTime();

    LocalTime toLocalTime();

    InterfaceC0026h v(ZoneId zoneId);
}
