package j$.time;

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
public final class Instant implements Temporal, TemporalAdjuster, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Instant J(long j, int i) {
        if ((i | j) == 0) {
            return EPOCH;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public static Instant K(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.a(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.A(ChronoField.INSTANT_SECONDS), temporalAccessor.get(ChronoField.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            throw new DateTimeException(c.d("Unable to obtain Instant from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()), e);
        }
    }

    public static Instant now() {
        a.b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = 1000;
        return J(j$.desugar.sun.nio.fs.g.L(j, j2), ((int) j$.desugar.sun.nio.fs.g.T(j, j2)) * 1000000);
    }

    public static Instant ofEpochSecond(long j) {
        return J(j, 0);
    }

    public static Instant parse(CharSequence charSequence) {
        return (Instant) DateTimeFormatter.g.a(charSequence, new j$.desugar.sun.nio.fs.n(1));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 2, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long A(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        int i2 = d.a[((ChronoField) temporalField).ordinal()];
        int i3 = this.b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            i = i3 / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
            }
            i = i3 / 1000000;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object I(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.k.c) {
            return ChronoUnit.NANOS;
        }
        if (nVar == j$.time.temporal.k.b || nVar == j$.time.temporal.k.a || nVar == j$.time.temporal.k.e || nVar == j$.time.temporal.k.d || nVar == j$.time.temporal.k.f || nVar == j$.time.temporal.k.g) {
            return null;
        }
        return nVar.e(this);
    }

    public final Instant L(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(j$.desugar.sun.nio.fs.g.U(j$.desugar.sun.nio.fs.g.U(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    public final long M(Instant instant) {
        long jW = j$.desugar.sun.nio.fs.g.W(instant.a, this.a);
        long j = instant.b - this.b;
        return (jW <= 0 || j >= 0) ? (jW >= 0 || j <= 0) ? jW : jW + 1 : jW - 1;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (Instant) temporalField.A(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.I(j);
        int i = d.a[chronoField.ordinal()];
        int i2 = this.b;
        long j2 = this.a;
        if (i != 1) {
            if (i == 2) {
                int i3 = ((int) j) * 1000;
                if (i3 != i2) {
                    return J(j2, i3);
                }
            } else if (i == 3) {
                int i4 = ((int) j) * 1000000;
                if (i4 != i2) {
                    return J(j2, i4);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
                }
                if (j != j2) {
                    return J(j, i2);
                }
            }
        } else if (j != i2) {
            return J(j2, (int) j);
        }
        return this;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.J(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        return ZonedDateTime.o(getEpochSecond(), getNano(), zoneId);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.NANO_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.MILLI_OF_SECOND : temporalField != null && temporalField.f(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantK = K(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, instantK);
        }
        int i = d.b[((ChronoUnit) temporalUnit).ordinal()];
        int i2 = this.b;
        long j = this.a;
        switch (i) {
            case 1:
                return j$.desugar.sun.nio.fs.g.U(j$.desugar.sun.nio.fs.g.V(j$.desugar.sun.nio.fs.g.W(instantK.a, j), 1000000000L), instantK.b - i2);
            case 2:
                return j$.desugar.sun.nio.fs.g.U(j$.desugar.sun.nio.fs.g.V(j$.desugar.sun.nio.fs.g.W(instantK.a, j), 1000000000L), instantK.b - i2) / 1000;
            case 3:
                return j$.desugar.sun.nio.fs.g.W(instantK.toEpochMilli(), toEpochMilli());
            case 4:
                return M(instantK);
            case 5:
                return M(instantK) / 60;
            case 6:
                return M(instantK) / 3600;
            case 7:
                return M(instantK) / 43200;
            case 8:
                return M(instantK) / 86400;
            default:
                throw new j$.time.temporal.l("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: f */
    public final Temporal w(LocalDate localDate) {
        localDate.getClass();
        return (Instant) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return j$.time.temporal.k.d(this, temporalField).a(temporalField.x(this), temporalField);
        }
        int i = d.a[((ChronoField) temporalField).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / 1000;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            chronoField.d.a(this.a, chronoField);
        }
        throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public boolean isBefore(Instant instant) {
        return compareTo(instant) < 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.m j(TemporalField temporalField) {
        return j$.time.temporal.k.d(this, temporalField);
    }

    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.j(this);
    }

    public Instant minusMillis(long j) {
        return j == Long.MIN_VALUE ? plusMillis(Long.MAX_VALUE).plusMillis(1L) : plusMillis(-j);
    }

    public Instant minusSeconds(long j) {
        return j == Long.MIN_VALUE ? plusSeconds(Long.MAX_VALUE).plusSeconds(1L) : plusSeconds(-j);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal o(Temporal temporal) {
        return temporal.a(this.a, ChronoField.INSTANT_SECONDS).a(this.b, ChronoField.NANO_OF_SECOND);
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.f(this);
    }

    public Instant plusMillis(long j) {
        return L(j / 1000, (j % 1000) * 1000000);
    }

    public Instant plusNanos(long j) {
        return L(0L, j);
    }

    public Instant plusSeconds(long j) {
        return L(j, 0L);
    }

    public long toEpochMilli() {
        int i = this.b;
        long j = this.a;
        return (j >= 0 || i <= 0) ? j$.desugar.sun.nio.fs.g.U(j$.desugar.sun.nio.fs.g.V(j, 1000), i / 1000000) : j$.desugar.sun.nio.fs.g.U(j$.desugar.sun.nio.fs.g.V(j + 1, 1000), (i / 1000000) - 1000);
    }

    public String toString() {
        return DateTimeFormatter.g.format(this);
    }

    public Instant truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() > 86400) {
            throw new j$.time.temporal.l("Unit is too large to be used for truncation");
        }
        long nanos = duration.toNanos();
        if (86400000000000L % nanos != 0) {
            throw new j$.time.temporal.l("Unit must divide into a standard day without remainder");
        }
        long j = ((this.a % 86400) * 1000000000) + this.b;
        return plusNanos((j$.desugar.sun.nio.fs.g.L(j, nanos) * nanos) - j);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return J(j$.desugar.sun.nio.fs.g.U(j, j$.desugar.sun.nio.fs.g.L(j2, 1000000000L)), (int) j$.desugar.sun.nio.fs.g.T(j2, 1000000000L));
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.a, instant.a);
        return iCompare != 0 ? iCompare : this.b - instant.b;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: minus, reason: merged with bridge method [inline-methods] */
    public Instant x(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j, temporalUnit);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: plus, reason: merged with bridge method [inline-methods] */
    public Instant b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.f(this, j);
        }
        switch (d.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusNanos(j);
            case 2:
                return L(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return plusMillis(j);
            case 4:
                return plusSeconds(j);
            case 5:
                return plusSeconds(j$.desugar.sun.nio.fs.g.V(j, 60));
            case 6:
                return plusSeconds(j$.desugar.sun.nio.fs.g.V(j, 3600));
            case 7:
                return plusSeconds(j$.desugar.sun.nio.fs.g.V(j, 43200));
            case 8:
                return plusSeconds(j$.desugar.sun.nio.fs.g.V(j, 86400));
            default:
                throw new j$.time.temporal.l("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }
}
