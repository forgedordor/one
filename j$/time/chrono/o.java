package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class o extends AbstractC0021c {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient m a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public o(m mVar, int i, int i2, int i3) {
        mVar.O(i, i2, i3);
        this.a = mVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C((byte) 6, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long A(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        int i = n.a[((ChronoField) temporalField).ordinal()];
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.b;
        switch (i) {
            case 1:
                return i3;
            case 2:
                return O();
            case 3:
                return ((i3 - 1) / 7) + 1;
            case 4:
                return ((int) j$.desugar.sun.nio.fs.g.T(toEpochDay() + 3, 7)) + 1;
            case 5:
                return ((i3 - 1) % 7) + 1;
            case 6:
                return ((O() - 1) % 7) + 1;
            case 7:
                return toEpochDay();
            case 8:
                return ((O() - 1) / 7) + 1;
            case 9:
                return i2;
            case 10:
                return ((i4 * 12) + i2) - 1;
            case 11:
                return i4;
            case 12:
                return i4;
            case 13:
                return i4 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime B(LocalTime localTime) {
        return new C0023e(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate F(TemporalAmount temporalAmount) {
        return (o) super.F(temporalAmount);
    }

    @Override // j$.time.chrono.AbstractC0021c
    public final ChronoLocalDate N(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return R(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    public final int O() {
        return this.a.R(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.AbstractC0021c
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final o L(long j) {
        return new o(this.a, toEpochDay() + j);
    }

    @Override // j$.time.chrono.AbstractC0021c
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final o M(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        long jL = j$.desugar.sun.nio.fs.g.L(j2, 12L);
        m mVar = this.a;
        if (jL >= mVar.N(0) && jL <= mVar.N(mVar.e.length - 1) - 1) {
            return R((int) jL, ((int) j$.desugar.sun.nio.fs.g.T(j2, 12L)) + 1, this.d);
        }
        throw new DateTimeException("Invalid Hijrah year: " + jL);
    }

    public final o R(int i, int i2, int i3) {
        m mVar = this.a;
        int iP = mVar.P(i, i2);
        if (i3 > iP) {
            i3 = iP;
        }
        return new o(mVar, i, i2, i3);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.temporal.Temporal
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final o a(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (o) super.a(j, temporalField);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        m mVar = this.a;
        mVar.q(chronoField).b(j, chronoField);
        int i = (int) j;
        int i2 = n.a[chronoField.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return R(i5, i4, i);
            case 2:
                return L(Math.min(i, lengthOfYear()) - O());
            case 3:
                return L((j - A(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return L(j - (((int) j$.desugar.sun.nio.fs.g.T(toEpochDay() + 3, 7)) + 1));
            case 5:
                return L(j - A(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return L(j - A(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new o(mVar, j);
            case 8:
                return L((j - A(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return R(i5, i, i3);
            case 10:
                return M(j - (((i5 * 12) + i4) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return R(i, i4, i3);
            case 12:
                return R(i, i4, i3);
            case 13:
                return R(1 - i5, i4, i3);
            default:
                throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        return (o) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.b == oVar.b && this.c == oVar.c && this.d == oVar.d && this.a.equals(oVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.temporal.Temporal
    /* renamed from: f */
    public final Temporal w(LocalDate localDate) {
        return (o) super.w(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology getChronology() {
        return this.a;
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final k getEra() {
        return p.AH;
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        this.a.getClass();
        int i = this.b;
        return (((i << 11) + (this.c << 6)) + this.d) ^ ((i & (-2048)) ^ 2100100019);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final boolean isLeapYear() {
        return this.a.isLeapYear(this.b);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.m j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.j(this);
        }
        if (!j$.desugar.sun.nio.fs.g.l(this, temporalField)) {
            throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = n.a[chronoField.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.a.q(chronoField) : j$.time.temporal.m.f(1L, 5L) : j$.time.temporal.m.f(1L, lengthOfYear()) : j$.time.temporal.m.f(1L, r2.P(this.b, this.c));
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final int lengthOfYear() {
        return this.a.R(this.b, 12);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    /* renamed from: r */
    public final ChronoLocalDate x(long j, TemporalUnit temporalUnit) {
        return (o) super.x(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.O(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate w(TemporalAdjuster temporalAdjuster) {
        return (o) super.w(temporalAdjuster);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.temporal.Temporal
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return (o) super.x(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (o) super.b(j, temporalUnit);
    }

    public o(m mVar, long j) {
        int i = (int) j;
        mVar.L();
        if (i >= mVar.f && i < mVar.g) {
            int iBinarySearch = Arrays.binarySearch(mVar.e, i);
            iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
            int[] iArr = {mVar.N(iBinarySearch), ((mVar.h + iBinarySearch) % 12) + 1, (i - mVar.e[iBinarySearch]) + 1};
            this.a = mVar;
            this.b = iArr[0];
            this.c = iArr[1];
            this.d = iArr[2];
            return;
        }
        throw new DateTimeException("Hijrah date out of range");
    }
}
