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
public final class n implements Temporal, TemporalAdjuster, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.n(ChronoField.YEAR, 4, 10, D.EXCEEDS_PAD);
        dateTimeFormatterBuilder.r(Locale.getDefault(), C.SMART, null);
    }

    public n(int i) {
        this.a = i;
    }

    public static n J(int i) {
        ChronoField.YEAR.I(i);
        return new n(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 11, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long A(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        int i = m.a[((ChronoField) temporalField).ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return i2;
        }
        if (i == 3) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object I(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.k.b ? j$.time.chrono.q.d : nVar == j$.time.temporal.k.c ? ChronoUnit.YEARS : j$.time.temporal.k.c(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final n b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (n) temporalUnit.f(this, j);
        }
        int i = m.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return L(j);
        }
        if (i == 2) {
            return L(j$.desugar.sun.nio.fs.g.V(j, 10));
        }
        if (i == 3) {
            return L(j$.desugar.sun.nio.fs.g.V(j, 100));
        }
        if (i == 4) {
            return L(j$.desugar.sun.nio.fs.g.V(j, 1000));
        }
        if (i != 5) {
            throw new j$.time.temporal.l("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
        ChronoField chronoField = ChronoField.ERA;
        return a(j$.desugar.sun.nio.fs.g.U(A(chronoField), j), chronoField);
    }

    public final n L(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return J(chronoField.d.a(this.a + j, chronoField));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final n a(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (n) temporalField.A(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.I(j);
        int i = m.a[chronoField.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                j = 1 - j;
            }
            return J((int) j);
        }
        if (i == 2) {
            return J((int) j);
        }
        if (i == 3) {
            return A(ChronoField.ERA) == j ? this : J(1 - i2);
        }
        throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.f(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((n) obj).a;
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        n nVarJ;
        if (temporal instanceof n) {
            nVarJ = (n) temporal;
        } else {
            Objects.a(temporal, "temporal");
            try {
                if (!j$.time.chrono.q.d.equals(Chronology.CC.a(temporal))) {
                    temporal = LocalDate.L(temporal);
                }
                nVarJ = J(temporal.get(ChronoField.YEAR));
            } catch (DateTimeException e) {
                throw new DateTimeException(c.d("Unable to obtain Year from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, nVarJ);
        }
        long j = nVarJ.a - this.a;
        int i = m.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            return j / 10;
        }
        if (i == 3) {
            return j / 100;
        }
        if (i == 4) {
            return j / 1000;
        }
        if (i != 5) {
            throw new j$.time.temporal.l("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
        ChronoField chronoField = ChronoField.ERA;
        return nVarJ.A(chronoField) - A(chronoField);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            if (this.a == ((n) obj).a) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: f */
    public final Temporal w(LocalDate localDate) {
        localDate.getClass();
        return (n) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return j(temporalField).a(A(temporalField), temporalField);
    }

    public final int hashCode() {
        return this.a;
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
        return temporal.a(this.a, ChronoField.YEAR);
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }
}
