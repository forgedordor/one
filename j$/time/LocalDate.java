package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class LocalDate implements Temporal, TemporalAdjuster, ChronoLocalDate, Serializable {
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;
    public static final LocalDate d = of(-999999999, 1, 1);
    public static final LocalDate e = of(999999999, 12, 31);
    public static final LocalDate EPOCH = of(1970, 1, 1);

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static LocalDate K(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (j$.time.chrono.q.d.isLeapYear(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date '" + Month.M(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate L(TemporalAccessor temporalAccessor) {
        Objects.a(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.I(j$.time.temporal.k.f);
        if (localDate != null) {
            return localDate;
        }
        throw new DateTimeException(c.d("Unable to obtain LocalDate from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()));
    }

    public static LocalDate S(a aVar) {
        Objects.a(aVar, "clock");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId zoneId = aVar.a;
        Objects.a(instantOfEpochMilli, "instant");
        Objects.a(zoneId, "zone");
        return U(j$.desugar.sun.nio.fs.g.L(instantOfEpochMilli.getEpochSecond() + zoneId.getRules().d(instantOfEpochMilli).getTotalSeconds(), 86400));
    }

    public static LocalDate T(int i, Month month, int i2) {
        ChronoField.YEAR.I(i);
        Objects.a(month, "month");
        ChronoField.DAY_OF_MONTH.I(i2);
        return K(i, month.getValue(), i2);
    }

    public static LocalDate U(long j) {
        long j2;
        ChronoField.EPOCH_DAY.I(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + (i2 / 10);
        ChronoField chronoField = ChronoField.YEAR;
        return new LocalDate(chronoField.d.a(j7, chronoField), i3, i4);
    }

    public static LocalDate V(int i, int i2) {
        long j = i;
        ChronoField.YEAR.I(j);
        ChronoField.DAY_OF_YEAR.I(i2);
        boolean zIsLeapYear = j$.time.chrono.q.d.isLeapYear(j);
        if (i2 == 366 && !zIsLeapYear) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        Month monthM = Month.M(((i2 - 1) / 31) + 1);
        if (i2 > (monthM.K(zIsLeapYear) + monthM.J(zIsLeapYear)) - 1) {
            monthM = Month.a[((((int) 1) + 12) + monthM.ordinal()) % 12];
        }
        return new LocalDate(i, monthM.getValue(), (i2 - monthM.J(zIsLeapYear)) + 1);
    }

    public static LocalDate Z(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, j$.time.chrono.q.d.isLeapYear((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate now() {
        return S(j$.desugar.sun.nio.fs.g.Z());
    }

    public static LocalDate of(int i, int i2, int i3) {
        ChronoField.YEAR.I(i);
        ChronoField.MONTH_OF_YEAR.I(i2);
        ChronoField.DAY_OF_MONTH.I(i3);
        return K(i, i2, i3);
    }

    public static LocalDate parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.a(charSequence, new j$.desugar.sun.nio.fs.n(2));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 3, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long A(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.EPOCH_DAY ? toEpochDay() : temporalField == ChronoField.PROLEPTIC_MONTH ? O() : M((ChronoField) temporalField) : temporalField.x(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate F(TemporalAmount temporalAmount) {
        if (c.e(temporalAmount)) {
            Period period = (Period) temporalAmount;
            return plusMonths((period.a * 12) + period.b).plusDays(period.c);
        }
        Objects.a(temporalAmount, "amountToAdd");
        return (LocalDate) ((Period) temporalAmount).f(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object I(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.k.f ? this : j$.desugar.sun.nio.fs.g.n(this, nVar);
    }

    public final int J(LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - localDate.b;
        return i2 == 0 ? this.c - localDate.c : i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int M(ChronoField chronoField) {
        int i;
        int i2 = e.a[chronoField.ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return N();
            case 3:
                i = (s - 1) / 7;
                return i + 1;
            case 4:
                if (i3 < 1) {
                    return 1 - i3;
                }
                return i3;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                i = (s - 1) % 7;
                return i + 1;
            case 7:
                return ((N() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.l("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((N() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.l("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(chronoField)));
        }
    }

    public final int N() {
        return (getMonth().J(isLeapYear()) + this.c) - 1;
    }

    public final long O() {
        return ((this.a * 12) + this.b) - 1;
    }

    public final boolean P(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? J((LocalDate) chronoLocalDate) < 0 : toEpochDay() < chronoLocalDate.toEpochDay();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate x(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j, temporalUnit);
    }

    public final long R(LocalDate localDate) {
        return (((localDate.O() * 32) + localDate.getDayOfMonth()) - ((O() * 32) + getDayOfMonth())) / 32;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final LocalDate b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.f(this, j);
        }
        switch (e.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return X(j);
            case 3:
                return plusMonths(j);
            case 4:
                return Y(j);
            case 5:
                return Y(j$.desugar.sun.nio.fs.g.V(j, 10));
            case 6:
                return Y(j$.desugar.sun.nio.fs.g.V(j, 100));
            case 7:
                return Y(j$.desugar.sun.nio.fs.g.V(j, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return a(j$.desugar.sun.nio.fs.g.U(A(chronoField), j), chronoField);
            default:
                throw new j$.time.temporal.l("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final LocalDate X(long j) {
        return plusDays(j$.desugar.sun.nio.fs.g.V(j, 7));
    }

    public final LocalDate Y(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return Z(chronoField.d.a(this.a + j, chronoField), this.b, this.c);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final LocalDate a(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalDate) temporalField.A(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.I(j);
        int i = e.a[chronoField.ordinal()];
        short s = this.c;
        short s2 = this.b;
        int i2 = this.a;
        switch (i) {
            case 1:
                int i3 = (int) j;
                if (s != i3) {
                    return of(i2, s2, i3);
                }
                return this;
            case 2:
                int i4 = (int) j;
                if (N() != i4) {
                    return V(i2, i4);
                }
                return this;
            case 3:
                return X(j - A(ChronoField.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return c0((int) j);
            case 5:
                return plusDays(j - getDayOfWeek().getValue());
            case 6:
                return plusDays(j - A(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j - A(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return U(j);
            case 9:
                return X(j - A(ChronoField.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i5 = (int) j;
                if (s2 != i5) {
                    ChronoField.MONTH_OF_YEAR.I(i5);
                    return Z(i2, i5, s);
                }
                return this;
            case 11:
                return plusMonths(j - O());
            case 12:
                return c0((int) j);
            case 13:
                if (A(ChronoField.ERA) != j) {
                    return c0(1 - i2);
                }
                return this;
            default:
                throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.L(this, LocalTime.MIDNIGHT);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: atTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime B(LocalTime localTime) {
        return LocalDateTime.L(this, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: b0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate w(TemporalAdjuster temporalAdjuster) {
        return temporalAdjuster instanceof LocalDate ? (LocalDate) temporalAdjuster : (LocalDate) temporalAdjuster.o(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return j$.desugar.sun.nio.fs.g.l(this, temporalField);
    }

    public final LocalDate c0(int i) {
        if (this.a == i) {
            return this;
        }
        ChronoField.YEAR.I(i);
        return Z(i, this.b, this.c);
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateL = L(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateL);
        }
        switch (e.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return localDateL.toEpochDay() - toEpochDay();
            case 2:
                return (localDateL.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return R(localDateL);
            case 4:
                return R(localDateL) / 12;
            case 5:
                return R(localDateL) / 120;
            case 6:
                return R(localDateL) / 1200;
            case 7:
                return R(localDateL) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return localDateL.A(chronoField) - A(chronoField);
            default:
                throw new j$.time.temporal.l("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && J((LocalDate) obj) == 0;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? M((ChronoField) temporalField) : j$.time.temporal.k.a(this, temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology getChronology() {
        return j$.time.chrono.q.d;
    }

    public int getDayOfMonth() {
        return this.c;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.of(((int) j$.desugar.sun.nio.fs.g.T(toEpochDay() + 3, 7)) + 1);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.k getEra() {
        return getYear() >= 1 ? j$.time.chrono.r.CE : j$.time.chrono.r.BCE;
    }

    public Month getMonth() {
        return Month.M(this.b);
    }

    public int getMonthValue() {
        return this.b;
    }

    public int getYear() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean isLeapYear() {
        return j$.time.chrono.q.d.isLeapYear(this.a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.m j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.j(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (!chronoField.isDateBased()) {
            throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        int i = e.a[chronoField.ordinal()];
        if (i == 1) {
            return j$.time.temporal.m.f(1L, lengthOfMonth());
        }
        if (i == 2) {
            return j$.time.temporal.m.f(1L, lengthOfYear());
        }
        if (i != 3) {
            return i != 4 ? ((ChronoField) temporalField).d : getYear() <= 0 ? j$.time.temporal.m.f(1L, 1000000000L) : j$.time.temporal.m.f(1L, 999999999L);
        }
        return j$.time.temporal.m.f(1L, (getMonth() != Month.FEBRUARY || isLeapYear()) ? 5L : 4L);
    }

    public int lengthOfMonth() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : isLeapYear() ? 29 : 28;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal o(Temporal temporal) {
        return j$.desugar.sun.nio.fs.g.a(this, temporal);
    }

    public LocalDate plusDays(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new LocalDate(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long jLengthOfMonth = lengthOfMonth();
                if (j2 <= jLengthOfMonth) {
                    return new LocalDate(i, s, (int) j2);
                }
                if (s < 12) {
                    return new LocalDate(i, s + 1, (int) (j2 - jLengthOfMonth));
                }
                int i2 = i + 1;
                ChronoField.YEAR.I(i2);
                return new LocalDate(i2, 1, (int) (j2 - jLengthOfMonth));
            }
        }
        return U(j$.desugar.sun.nio.fs.g.U(toEpochDay(), j));
    }

    public LocalDate plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        ChronoField chronoField = ChronoField.YEAR;
        long j3 = 12;
        return Z(chronoField.d.a(j$.desugar.sun.nio.fs.g.L(j2, j3), chronoField), ((int) j$.desugar.sun.nio.fs.g.T(j2, j3)) + 1, this.c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !isLeapYear() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        int i = this.a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        short s = this.b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.c;
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    public static LocalDate now(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        return S(zoneId == ZoneOffset.UTC ? a.b : new a(zoneId));
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        LocalDateTime localDateTimeB = B(LocalTime.MIDNIGHT);
        if (!(zoneId instanceof ZoneOffset)) {
            Object objE = zoneId.getRules().e(localDateTimeB);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            if (bVar != null && bVar.f()) {
                localDateTimeB = bVar.b.O(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds());
            }
        }
        return ZonedDateTime.K(localDateTimeB, zoneId, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? J((LocalDate) chronoLocalDate) : j$.desugar.sun.nio.fs.g.c(this, chronoLocalDate);
    }
}
