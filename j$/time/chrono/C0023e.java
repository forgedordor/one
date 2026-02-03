package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.chrono.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0023e implements ChronoLocalDateTime, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient ChronoLocalDate a;
    public final transient LocalTime b;

    public C0023e(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.a(localTime, "time");
        this.a = chronoLocalDate;
        this.b = localTime;
    }

    public static C0023e J(Chronology chronology, Temporal temporal) {
        C0023e c0023e = (C0023e) temporal;
        if (chronology.equals(c0023e.a.getChronology())) {
            return c0023e;
        }
        throw new ClassCastException(j$.time.c.d("Chronology mismatch, required: ", chronology.getId(), ", actual: ", c0023e.a.getChronology().getId()));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C((byte) 2, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long A(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).J() ? this.b.A(temporalField) : this.a.A(temporalField) : temporalField.x(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: E */
    public final /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return j$.desugar.sun.nio.fs.g.d(this, chronoLocalDateTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object I(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.o(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final C0023e b(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        ChronoLocalDate chronoLocalDate = this.a;
        if (!z) {
            return J(chronoLocalDate.getChronology(), temporalUnit.f(this, j));
        }
        int i = AbstractC0022d.a[((ChronoUnit) temporalUnit).ordinal()];
        LocalTime localTime = this.b;
        switch (i) {
            case 1:
                return L(this.a, 0L, 0L, 0L, j);
            case 2:
                C0023e c0023eN = N(chronoLocalDate.b(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return c0023eN.L(c0023eN.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C0023e c0023eN2 = N(chronoLocalDate.b(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return c0023eN2.L(c0023eN2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return L(this.a, 0L, 0L, j, 0L);
            case 5:
                return L(this.a, 0L, j, 0L, 0L);
            case 6:
                return L(this.a, j, 0L, 0L, 0L);
            case 7:
                C0023e c0023eN3 = N(chronoLocalDate.b(j / 256, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return c0023eN3.L(c0023eN3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return N(chronoLocalDate.b(j, temporalUnit), localTime);
        }
    }

    public final C0023e L(ChronoLocalDate chronoLocalDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTimeO = this.b;
        if (j5 == 0) {
            return N(chronoLocalDate, localTimeO);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jV = localTimeO.V();
        long j10 = j9 + jV;
        long jL = j$.desugar.sun.nio.fs.g.L(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long jT = j$.desugar.sun.nio.fs.g.T(j10, 86400000000000L);
        if (jT != jV) {
            localTimeO = LocalTime.O(jT);
        }
        return N(chronoLocalDate.b(jL, (TemporalUnit) ChronoUnit.DAYS), localTimeO);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final C0023e a(long j, TemporalField temporalField) {
        boolean z = temporalField instanceof ChronoField;
        ChronoLocalDate chronoLocalDate = this.a;
        if (!z) {
            return J(chronoLocalDate.getChronology(), temporalField.A(this, j));
        }
        boolean zJ = ((ChronoField) temporalField).J();
        LocalTime localTime = this.b;
        return zJ ? N(chronoLocalDate, localTime.a(j, temporalField)) : N(chronoLocalDate.a(j, temporalField), localTime);
    }

    public final C0023e N(Temporal temporal, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == temporal && this.b == localTime) ? this : new C0023e(AbstractC0021c.J(chronoLocalDate.getChronology(), temporal), localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.f(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.J();
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        ChronoLocalDate chronoLocalDate = this.a;
        ChronoLocalDateTime chronoLocalDateTimeC = chronoLocalDate.getChronology().C(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.a(temporalUnit, "unit");
            return temporalUnit.between(this, chronoLocalDateTimeC);
        }
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        int iCompareTo = ((ChronoUnit) temporalUnit).compareTo(chronoUnit);
        LocalTime localTime = this.b;
        if (iCompareTo >= 0) {
            ChronoLocalDate localDate = chronoLocalDateTimeC.toLocalDate();
            if (chronoLocalDateTimeC.toLocalTime().isBefore(localTime)) {
                localDate = localDate.x(1L, chronoUnit);
            }
            return chronoLocalDate.d(localDate, temporalUnit);
        }
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        long jA = chronoLocalDateTimeC.A(chronoField) - chronoLocalDate.A(chronoField);
        switch (AbstractC0022d.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                jA = j$.desugar.sun.nio.fs.g.V(jA, 86400000000000L);
                break;
            case 2:
                jA = j$.desugar.sun.nio.fs.g.V(jA, 86400000000L);
                break;
            case 3:
                jA = j$.desugar.sun.nio.fs.g.V(jA, 86400000L);
                break;
            case 4:
                jA = j$.desugar.sun.nio.fs.g.V(jA, 86400);
                break;
            case 5:
                jA = j$.desugar.sun.nio.fs.g.V(jA, 1440);
                break;
            case 6:
                jA = j$.desugar.sun.nio.fs.g.V(jA, 24);
                break;
            case 7:
                jA = j$.desugar.sun.nio.fs.g.V(jA, 2);
                break;
        }
        return j$.desugar.sun.nio.fs.g.U(jA, localTime.d(chronoLocalDateTimeC.toLocalTime(), temporalUnit));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && j$.desugar.sun.nio.fs.g.d(this, (ChronoLocalDateTime) obj) == 0;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: f */
    public final Temporal w(LocalDate localDate) {
        if (j$.time.c.e(localDate)) {
            return N(localDate, this.b);
        }
        Chronology chronology = this.a.getChronology();
        localDate.getClass();
        return J(chronology, (C0023e) j$.desugar.sun.nio.fs.g.a(localDate, this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).J() ? this.b.get(temporalField) : this.a.get(temporalField) : j(temporalField).a(A(temporalField), temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final Chronology getChronology() {
        return this.a.getChronology();
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.m j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.j(this);
        }
        if (!((ChronoField) temporalField).J()) {
            return this.a.j(temporalField);
        }
        LocalTime localTime = this.b;
        localTime.getClass();
        return j$.time.temporal.k.d(localTime, temporalField);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal o(Temporal temporal) {
        return temporal.a(toLocalDate().toEpochDay(), ChronoField.EPOCH_DAY).a(toLocalTime().V(), ChronoField.NANO_OF_DAY);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return j$.desugar.sun.nio.fs.g.r(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate toLocalDate() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return J(this.a.getChronology(), j$.time.temporal.k.b(this, j, chronoUnit));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final InterfaceC0026h y(ZoneId zoneId) {
        return j.J(zoneId, null, this);
    }
}
