package j$.time;

import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public final class Period implements TemporalAmount, Serializable {
    public static final Period d = new Period(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    public final int a;
    public final int b;
    public final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.desugar.sun.nio.fs.g.N(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public Period(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static Period a(int i, int i2, int i3) {
        return ((i | i2) | i3) == 0 ? d : new Period(i, i2, i3);
    }

    public static void b(TemporalAccessor temporalAccessor) {
        Chronology chronology = (Chronology) temporalAccessor.I(j$.time.temporal.k.b);
        if (chronology == null || j$.time.chrono.q.d.equals(chronology)) {
            return;
        }
        throw new DateTimeException("Chronology mismatch, expected: ISO, actual: " + chronology.getId());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 14, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Period) {
            Period period = (Period) obj;
            if (this.a == period.a && this.b == period.b && this.c == period.c) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal f(Temporal temporal) {
        b(temporal);
        int i = this.a;
        int i2 = this.b;
        if (i2 != 0) {
            long j = (i * 12) + i2;
            if (j != 0) {
                temporal = temporal.b(j, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            temporal = temporal.b(i, ChronoUnit.YEARS);
        }
        int i3 = this.c;
        return i3 != 0 ? temporal.b(i3, ChronoUnit.DAYS) : temporal;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal j(Instant instant) {
        b(instant);
        int i = this.a;
        int i2 = this.b;
        if (i2 != 0) {
            long j = (i * 12) + i2;
            if (j != 0) {
                instant = instant.x(j, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            instant = instant.x(i, ChronoUnit.YEARS);
        }
        int i3 = this.c;
        return i3 != 0 ? instant.x(i3, ChronoUnit.DAYS) : instant;
    }

    public String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
