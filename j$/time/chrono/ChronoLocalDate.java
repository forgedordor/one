package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;

/* loaded from: classes9.dex */
public interface ChronoLocalDate extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDate> {
    ChronoLocalDateTime B(LocalTime localTime);

    ChronoLocalDate F(TemporalAmount temporalAmount);

    @Override // j$.time.temporal.Temporal
    ChronoLocalDate a(long j, TemporalField temporalField);

    @Override // j$.time.temporal.Temporal
    ChronoLocalDate b(long j, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.TemporalAccessor
    boolean c(TemporalField temporalField);

    int compareTo(ChronoLocalDate chronoLocalDate);

    @Override // j$.time.temporal.Temporal
    long d(Temporal temporal, TemporalUnit temporalUnit);

    boolean equals(Object obj);

    Chronology getChronology();

    k getEra();

    int hashCode();

    boolean isLeapYear();

    int lengthOfYear();

    /* renamed from: r */
    ChronoLocalDate x(long j, TemporalUnit temporalUnit);

    long toEpochDay();

    String toString();

    ChronoLocalDate w(TemporalAdjuster temporalAdjuster);
}
