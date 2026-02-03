package j$.time;

import j$.time.chrono.Chronology;
import j$.time.format.C;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class MonthDay implements TemporalAccessor, TemporalAdjuster, Comparable<MonthDay>, Serializable {
    public static final DateTimeFormatter c;
    private static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.e("--");
        dateTimeFormatterBuilder.m(ChronoField.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.d('-');
        dateTimeFormatterBuilder.m(ChronoField.DAY_OF_MONTH, 2);
        c = dateTimeFormatterBuilder.r(Locale.getDefault(), C.SMART, null);
    }

    public MonthDay(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static MonthDay J(int i, int i2) {
        Month monthM = Month.M(i);
        Objects.a(monthM, "month");
        ChronoField.DAY_OF_MONTH.I(i2);
        if (i2 <= monthM.L()) {
            return new MonthDay(monthM.getValue(), i2);
        }
        throw new DateTimeException("Illegal value for DayOfMonth field, value " + i2 + " is not valid for month " + monthM.name());
    }

    public static MonthDay from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof MonthDay) {
            return (MonthDay) temporalAccessor;
        }
        try {
            if (!j$.time.chrono.q.d.equals(Chronology.CC.a(temporalAccessor))) {
                temporalAccessor = LocalDate.L(temporalAccessor);
            }
            return J(temporalAccessor.get(ChronoField.MONTH_OF_YEAR), temporalAccessor.get(ChronoField.DAY_OF_MONTH));
        } catch (DateTimeException e) {
            throw new DateTimeException(c.d("Unable to obtain MonthDay from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()), e);
        }
    }

    public static MonthDay parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = c;
        Objects.a(dateTimeFormatter, "formatter");
        return (MonthDay) dateTimeFormatter.a(charSequence, new j$.desugar.sun.nio.fs.n(3));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 13, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long A(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        int i2 = h.a[((ChronoField) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object I(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.k.b ? j$.time.chrono.q.d : j$.time.temporal.k.c(this, nVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.DAY_OF_MONTH : temporalField != null && temporalField.f(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(MonthDay monthDay) {
        MonthDay monthDay2 = monthDay;
        int i = this.a - monthDay2.a;
        return i == 0 ? this.b - monthDay2.b : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MonthDay) {
            MonthDay monthDay = (MonthDay) obj;
            if (this.a == monthDay.a && this.b == monthDay.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return j(temporalField).a(A(temporalField), temporalField);
    }

    public int getDayOfMonth() {
        return this.b;
    }

    public Month getMonth() {
        return Month.M(this.a);
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.m j(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.range();
        }
        if (temporalField != ChronoField.DAY_OF_MONTH) {
            return j$.time.temporal.k.d(this, temporalField);
        }
        int iOrdinal = getMonth().ordinal();
        return j$.time.temporal.m.g(1L, iOrdinal != 1 ? (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31 : 28, getMonth().L());
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal o(Temporal temporal) {
        if (!Chronology.CC.a(temporal).equals(j$.time.chrono.q.d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        Temporal temporalA = temporal.a(this.a, ChronoField.MONTH_OF_YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return temporalA.a(Math.min(temporalA.j(chronoField).d, this.b), chronoField);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i = this.a;
        sb.append(i < 10 ? "0" : "");
        sb.append(i);
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }
}
