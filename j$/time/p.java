package j$.time;

import j$.time.chrono.Chronology;
import j$.time.format.C;
import j$.time.format.D;
import j$.time.format.DateTimeFormatterBuilder;
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
import java.util.Locale;

/* loaded from: classes9.dex */
public final class p implements Temporal, TemporalAdjuster, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.n(ChronoField.YEAR, 4, 10, D.EXCEEDS_PAD);
        dateTimeFormatterBuilder.d('-');
        dateTimeFormatterBuilder.m(ChronoField.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.r(Locale.getDefault(), C.SMART, null);
    }

    public p(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 12, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long A(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        int i = o.a[((ChronoField) temporalField).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return J();
        }
        int i2 = this.a;
        if (i == 3) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 4) {
            return i2;
        }
        if (i == 5) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object I(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.k.b ? j$.time.chrono.q.d : nVar == j$.time.temporal.k.c ? ChronoUnit.MONTHS : j$.time.temporal.k.c(this, nVar);
    }

    public final long J() {
        return ((this.a * 12) + this.b) - 1;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final p b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (p) temporalUnit.f(this, j);
        }
        switch (o.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return L(j);
            case 2:
                return M(j);
            case 3:
                return M(j$.desugar.sun.nio.fs.g.V(j, 10));
            case 4:
                return M(j$.desugar.sun.nio.fs.g.V(j, 100));
            case 5:
                return M(j$.desugar.sun.nio.fs.g.V(j, 1000));
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return a(j$.desugar.sun.nio.fs.g.U(A(chronoField), j), chronoField);
            default:
                throw new j$.time.temporal.l("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final p L(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        ChronoField chronoField = ChronoField.YEAR;
        long j3 = 12;
        return N(chronoField.d.a(j$.desugar.sun.nio.fs.g.L(j2, j3), chronoField), ((int) j$.desugar.sun.nio.fs.g.T(j2, j3)) + 1);
    }

    public final p M(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return N(chronoField.d.a(this.a + j, chronoField), this.b);
    }

    public final p N(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new p(i, i2);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final p a(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (p) temporalField.A(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.I(j);
        int i = o.a[chronoField.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            int i3 = (int) j;
            ChronoField.MONTH_OF_YEAR.I(i3);
            return N(i2, i3);
        }
        if (i == 2) {
            return L(j - J());
        }
        int i4 = this.b;
        if (i == 3) {
            if (i2 < 1) {
                j = 1 - j;
            }
            int i5 = (int) j;
            ChronoField.YEAR.I(i5);
            return N(i5, i4);
        }
        if (i == 4) {
            int i6 = (int) j;
            ChronoField.YEAR.I(i6);
            return N(i6, i4);
        }
        if (i != 5) {
            throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        if (A(ChronoField.ERA) == j) {
            return this;
        }
        int i7 = 1 - i2;
        ChronoField.YEAR.I(i7);
        return N(i7, i4);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.f(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        int i = this.a - pVar.a;
        return i == 0 ? this.b - pVar.b : i;
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        p pVar;
        if (temporal instanceof p) {
            pVar = (p) temporal;
        } else {
            Objects.a(temporal, "temporal");
            try {
                if (!j$.time.chrono.q.d.equals(Chronology.CC.a(temporal))) {
                    temporal = LocalDate.L(temporal);
                }
                ChronoField chronoField = ChronoField.YEAR;
                int i = temporal.get(chronoField);
                ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
                int i2 = temporal.get(chronoField2);
                chronoField.I(i);
                chronoField2.I(i2);
                pVar = new p(i, i2);
            } catch (DateTimeException e) {
                throw new DateTimeException(c.d("Unable to obtain YearMonth from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, pVar);
        }
        long J = pVar.J() - J();
        switch (o.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return J;
            case 2:
                return J / 12;
            case 3:
                return J / 120;
            case 4:
                return J / 1200;
            case 5:
                return J / 12000;
            case 6:
                ChronoField chronoField3 = ChronoField.ERA;
                return pVar.A(chronoField3) - A(chronoField3);
            default:
                throw new j$.time.temporal.l("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.a == pVar.a && this.b == pVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: f */
    public final Temporal w(LocalDate localDate) {
        localDate.getClass();
        return (p) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return j(temporalField).a(A(temporalField), temporalField);
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.m j(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return j$.time.temporal.m.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.k.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal o(Temporal temporal) {
        if (!Chronology.CC.a(temporal).equals(j$.time.chrono.q.d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.a(J(), ChronoField.PROLEPTIC_MONTH);
    }

    public final String toString() {
        int i = this.a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }
}
