package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.chrono.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0024f implements TemporalAmount, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final Chronology a;
    public final int b;
    public final int c;
    public final int d;

    static {
        j$.desugar.sun.nio.fs.g.N(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public C0024f(Chronology chronology, int i, int i2, int i3) {
        this.a = chronology;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final long a() {
        j$.time.temporal.m mVarQ = this.a.q(ChronoField.MONTH_OF_YEAR);
        long j = mVarQ.a;
        long j2 = mVarQ.d;
        if (j == mVarQ.b && mVarQ.c == j2 && mVarQ.d()) {
            return (j2 - mVarQ.a) + 1;
        }
        return -1L;
    }

    public final void b(TemporalAccessor temporalAccessor) {
        Chronology chronology = (Chronology) temporalAccessor.I(j$.time.temporal.k.b);
        if (chronology != null) {
            Chronology chronology2 = this.a;
            if (!chronology2.equals(chronology)) {
                throw new DateTimeException(j$.time.c.d("Chronology mismatch, expected: ", chronology2.getId(), ", actual: ", chronology.getId()));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0024f) {
            C0024f c0024f = (C0024f) obj;
            if (this.b == c0024f.b && this.c == c0024f.c && this.d == c0024f.d && this.a.equals(c0024f.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal f(Temporal temporal) {
        b(temporal);
        int i = this.b;
        int i2 = this.c;
        if (i2 != 0) {
            long jA = a();
            if (jA > 0) {
                temporal = temporal.b((i * jA) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    temporal = temporal.b(i, ChronoUnit.YEARS);
                }
                temporal = temporal.b(i2, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            temporal = temporal.b(i, ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? temporal.b(i3, ChronoUnit.DAYS) : temporal;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal j(Instant instant) {
        b(instant);
        int i = this.b;
        int i2 = this.c;
        if (i2 != 0) {
            long jA = a();
            if (jA > 0) {
                instant = instant.x((i * jA) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    instant = instant.x(i, ChronoUnit.YEARS);
                }
                instant = instant.x(i2, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            instant = instant.x(i, ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? instant.x(i3, ChronoUnit.DAYS) : instant;
    }

    public final String toString() {
        Chronology chronology = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 == 0 && i2 == 0 && i == 0) {
            return chronology.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(chronology.toString());
        sb.append(" P");
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('D');
        }
        return sb.toString();
    }

    public Object writeReplace() {
        return new C((byte) 9, this);
    }
}
