package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.Serializable;

/* renamed from: j$.time.chrono.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0021c implements ChronoLocalDate, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static ChronoLocalDate J(Chronology chronology, Temporal temporal) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) temporal;
        if (chronology.equals(chronoLocalDate.getChronology())) {
            return chronoLocalDate;
        }
        throw new ClassCastException(j$.time.c.d("Chronology mismatch, expected: ", chronology.getId(), ", actual: ", chronoLocalDate.getChronology().getId()));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public ChronoLocalDateTime B(LocalTime localTime) {
        return new C0023e(this, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public ChronoLocalDate F(TemporalAmount temporalAmount) {
        return J(getChronology(), temporalAmount.f(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object I(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.n(this, nVar);
    }

    public final long K(ChronoLocalDate chronoLocalDate) {
        if (getChronology().q(ChronoField.MONTH_OF_YEAR).d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        long jA = A(chronoField) * 32;
        ChronoField chronoField2 = ChronoField.DAY_OF_MONTH;
        return (((chronoLocalDate.A(chronoField) * 32) + chronoLocalDate.get(chronoField2)) - (jA + j$.time.temporal.k.a(this, chronoField2))) / 32;
    }

    public abstract ChronoLocalDate L(long j);

    public abstract ChronoLocalDate M(long j);

    public abstract ChronoLocalDate N(long j);

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean c(TemporalField temporalField) {
        return j$.desugar.sun.nio.fs.g.l(this, temporalField);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoLocalDate chronoLocalDate) {
        return j$.desugar.sun.nio.fs.g.c(this, chronoLocalDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        ChronoLocalDate chronoLocalDateZ = getChronology().z(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.a(temporalUnit, "unit");
            return temporalUnit.between(this, chronoLocalDateZ);
        }
        switch (AbstractC0020b.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return chronoLocalDateZ.toEpochDay() - toEpochDay();
            case 2:
                return (chronoLocalDateZ.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return K(chronoLocalDateZ);
            case 4:
                return K(chronoLocalDateZ) / 12;
            case 5:
                return K(chronoLocalDateZ) / 120;
            case 6:
                return K(chronoLocalDateZ) / 1200;
            case 7:
                return K(chronoLocalDateZ) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return chronoLocalDateZ.A(chronoField) - A(chronoField);
            default:
                throw new j$.time.temporal.l("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && j$.desugar.sun.nio.fs.g.c(this, (ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.k.a(this, temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public k getEra() {
        return getChronology().eraOf(get(ChronoField.ERA));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return getChronology().hashCode() ^ ((int) (epochDay ^ (epochDay >>> 32)));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean isLeapYear() {
        return getChronology().isLeapYear(A(ChronoField.YEAR));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.m j(TemporalField temporalField) {
        return j$.time.temporal.k.d(this, temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final /* synthetic */ Temporal o(Temporal temporal) {
        return j$.desugar.sun.nio.fs.g.a(this, temporal);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: r */
    public ChronoLocalDate x(long j, TemporalUnit temporalUnit) {
        return J(getChronology(), j$.time.temporal.k.b(this, j, temporalUnit));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        return A(ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final String toString() {
        long jA = A(ChronoField.YEAR_OF_ERA);
        long jA2 = A(ChronoField.MONTH_OF_YEAR);
        long jA3 = A(ChronoField.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(getEra());
        sb.append(" ");
        sb.append(jA);
        sb.append(jA2 < 10 ? "-0" : "-");
        sb.append(jA2);
        sb.append(jA3 < 10 ? "-0" : "-");
        sb.append(jA3);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public ChronoLocalDate w(TemporalAdjuster temporalAdjuster) {
        return J(getChronology(), temporalAdjuster.o(this));
    }

    @Override // j$.time.temporal.Temporal
    public ChronoLocalDate a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        return J(getChronology(), temporalField.A(this, j));
    }

    @Override // j$.time.temporal.Temporal
    public ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        if (!z) {
            if (z) {
                throw new j$.time.temporal.l("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
            return J(getChronology(), temporalUnit.f(this, j));
        }
        switch (AbstractC0020b.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return L(j);
            case 2:
                return L(j$.desugar.sun.nio.fs.g.V(j, 7));
            case 3:
                return M(j);
            case 4:
                return N(j);
            case 5:
                return N(j$.desugar.sun.nio.fs.g.V(j, 10));
            case 6:
                return N(j$.desugar.sun.nio.fs.g.V(j, 100));
            case 7:
                return N(j$.desugar.sun.nio.fs.g.V(j, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return a(j$.desugar.sun.nio.fs.g.U(A(chronoField), j), (TemporalField) chronoField);
            default:
                throw new j$.time.temporal.l("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }
}
