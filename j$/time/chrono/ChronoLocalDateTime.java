package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;

/* loaded from: classes9.dex */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDateTime<?>> {
    /* renamed from: E */
    int compareTo(ChronoLocalDateTime chronoLocalDateTime);

    Chronology getChronology();

    long toEpochSecond(ZoneOffset zoneOffset);

    ChronoLocalDate toLocalDate();

    LocalTime toLocalTime();

    InterfaceC0026h y(ZoneId zoneId);
}
