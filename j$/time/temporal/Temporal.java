package j$.time.temporal;

import j$.time.LocalDate;

/* loaded from: classes9.dex */
public interface Temporal extends TemporalAccessor {
    Temporal a(long j, TemporalField temporalField);

    Temporal b(long j, TemporalUnit temporalUnit);

    long d(Temporal temporal, TemporalUnit temporalUnit);

    /* renamed from: f */
    Temporal w(LocalDate localDate);

    Temporal x(long j, ChronoUnit chronoUnit);
}
