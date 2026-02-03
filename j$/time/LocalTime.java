package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class LocalTime implements Temporal, TemporalAdjuster, Comparable<LocalTime>, Serializable {
    public static final LocalTime MIDNIGHT;
    public static final LocalTime e;
    public static final LocalTime f;
    public static final LocalTime[] g = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = g;
            if (i >= localTimeArr.length) {
                LocalTime localTime = localTimeArr[0];
                MIDNIGHT = localTime;
                LocalTime localTime2 = localTimeArr[12];
                e = localTime;
                f = new LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i] = new LocalTime(i, 0, 0, 0);
            i++;
        }
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    public static LocalTime K(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? g[i] : new LocalTime(i, i2, i3, i4);
    }

    public static LocalTime L(TemporalAccessor temporalAccessor) {
        Objects.a(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.I(j$.time.temporal.k.g);
        if (localTime != null) {
            return localTime;
        }
        throw new DateTimeException(c.d("Unable to obtain LocalTime from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()));
    }

    public static LocalTime N(int i, int i2, int i3, int i4) {
        ChronoField.HOUR_OF_DAY.I(i);
        ChronoField.MINUTE_OF_HOUR.I(i2);
        ChronoField.SECOND_OF_MINUTE.I(i3);
        ChronoField.NANO_OF_SECOND.I(i4);
        return K(i, i2, i3, i4);
    }

    public static LocalTime O(long j) {
        ChronoField.NANO_OF_DAY.I(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return K(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    public static LocalTime U(ObjectInput objectInput) throws IOException {
        int i;
        int i2;
        int i3 = objectInput.readByte();
        byte b = 0;
        if (i3 >= 0) {
            byte b2 = objectInput.readByte();
            if (b2 < 0) {
                ?? r4 = ~b2;
                i = 0;
                b = r4;
                i2 = 0;
            } else {
                byte b3 = objectInput.readByte();
                if (b3 < 0) {
                    i2 = ~b3;
                    b = b2;
                } else {
                    i = objectInput.readInt();
                    b = b2;
                    i2 = b3;
                }
            }
            return N(i3, b, i2, i);
        }
        i3 = ~i3;
        i2 = 0;
        i = 0;
        return N(i3, b, i2, i);
    }

    public static LocalTime of(int i, int i2) {
        ChronoField.HOUR_OF_DAY.I(i);
        if (i2 == 0) {
            return g[i];
        }
        ChronoField.MINUTE_OF_HOUR.I(i2);
        return new LocalTime(i, i2, 0, 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 4, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long A(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.NANO_OF_DAY ? V() : temporalField == ChronoField.MICRO_OF_DAY ? V() / 1000 : M(temporalField) : temporalField.x(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object I(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.k.b || nVar == j$.time.temporal.k.a || nVar == j$.time.temporal.k.e || nVar == j$.time.temporal.k.d) {
            return null;
        }
        if (nVar == j$.time.temporal.k.g) {
            return this;
        }
        if (nVar == j$.time.temporal.k.f) {
            return null;
        }
        return nVar == j$.time.temporal.k.c ? ChronoUnit.NANOS : nVar.e(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.a, localTime.a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.b, localTime.b)) == 0 && (iCompare = Integer.compare(this.c, localTime.c)) == 0) ? Integer.compare(this.d, localTime.d) : iCompare;
    }

    public final int M(TemporalField temporalField) {
        int i = g.a[((ChronoField) temporalField).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new j$.time.temporal.l("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / 1000;
            case 4:
                throw new j$.time.temporal.l("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (V() / 1000000);
            case 7:
                return this.c;
            case 8:
                return W();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
            case 13:
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final LocalTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalTime) temporalUnit.f(this, j);
        }
        switch (g.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return S(j);
            case 2:
                return S((j % 86400000000L) * 1000);
            case 3:
                return S((j % 86400000) * 1000000);
            case 4:
                return T(j);
            case 5:
                return R(j);
            case 6:
                return Q(j);
            case 7:
                return Q((j % 2) * 12);
            default:
                throw new j$.time.temporal.l("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final LocalTime Q(long j) {
        if (j == 0) {
            return this;
        }
        return K(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final LocalTime R(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return K(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final LocalTime S(long j) {
        if (j != 0) {
            long jV = V();
            long j2 = (((j % 86400000000000L) + jV) + 86400000000000L) % 86400000000000L;
            if (jV != j2) {
                return K((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    public final LocalTime T(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return K(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final long V() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    public final int W() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final LocalTime a(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalTime) temporalField.A(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.I(j);
        int i = g.a[chronoField.ordinal()];
        int i2 = this.d;
        byte b = this.c;
        byte b2 = this.b;
        byte b3 = this.a;
        switch (i) {
            case 1:
                return Z((int) j);
            case 2:
                return O(j);
            case 3:
                return Z(((int) j) * 1000);
            case 4:
                return O(j * 1000);
            case 5:
                return Z(((int) j) * 1000000);
            case 6:
                return O(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b != i3) {
                    ChronoField.SECOND_OF_MINUTE.I(i3);
                    return K(b3, b2, i3, i2);
                }
                return this;
            case 8:
                return T(j - W());
            case 9:
                int i4 = (int) j;
                if (b2 != i4) {
                    ChronoField.MINUTE_OF_HOUR.I(i4);
                    return K(b3, i4, b, i2);
                }
                return this;
            case 10:
                return R(j - ((b3 * 60) + b2));
            case 11:
                return Q(j - (b3 % 12));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return Q(j - (b3 % 12));
            case 13:
                return Y((int) j);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                return Y((int) j);
            case 15:
                return Q((j - (b3 / 12)) * 12);
            default:
                throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
    }

    public final LocalTime Y(int i) {
        if (this.a == i) {
            return this;
        }
        ChronoField.HOUR_OF_DAY.I(i);
        return K(i, this.b, this.c, this.d);
    }

    public final LocalTime Z(int i) {
        if (this.d == i) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.I(i);
        return K(this.a, this.b, this.c, i);
    }

    public final void a0(DataOutput dataOutput) throws IOException {
        byte b = this.c;
        byte b2 = this.a;
        byte b3 = this.b;
        int i = this.d;
        if (i != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b);
            dataOutput.writeInt(i);
            return;
        }
        if (b != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(~b);
        } else if (b3 == 0) {
            dataOutput.writeByte(~b2);
        } else {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(~b3);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).J() : temporalField != null && temporalField.f(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        LocalTime localTimeL = L(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localTimeL);
        }
        long jV = localTimeL.V() - V();
        switch (g.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jV;
            case 2:
                return jV / 1000;
            case 3:
                return jV / 1000000;
            case 4:
                return jV / 1000000000;
            case 5:
                return jV / 60000000000L;
            case 6:
                return jV / 3600000000000L;
            case 7:
                return jV / 43200000000000L;
            default:
                throw new j$.time.temporal.l("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: f */
    public final Temporal w(LocalDate localDate) {
        localDate.getClass();
        return (LocalTime) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? M(temporalField) : j$.time.temporal.k.a(this, temporalField);
    }

    public final int hashCode() {
        long jV = V();
        return (int) (jV ^ (jV >>> 32));
    }

    public boolean isAfter(LocalTime localTime) {
        return compareTo(localTime) > 0;
    }

    public boolean isBefore(LocalTime localTime) {
        return compareTo(localTime) < 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.m j(TemporalField temporalField) {
        return j$.time.temporal.k.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal o(Temporal temporal) {
        return temporal.a(V(), ChronoField.NANO_OF_DAY);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        byte b2 = this.b;
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        byte b3 = this.c;
        int i = this.d;
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }
}
