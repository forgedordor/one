package j$.time.temporal;

import j$.time.DateTimeException;
import j$.util.Objects;

/* loaded from: classes9.dex */
public abstract class k {
    public static final j$.desugar.sun.nio.fs.n a = new j$.desugar.sun.nio.fs.n(6);
    public static final j$.desugar.sun.nio.fs.n b = new j$.desugar.sun.nio.fs.n(7);
    public static final j$.desugar.sun.nio.fs.n c = new j$.desugar.sun.nio.fs.n(8);
    public static final j$.desugar.sun.nio.fs.n d = new j$.desugar.sun.nio.fs.n(9);
    public static final j$.desugar.sun.nio.fs.n e = new j$.desugar.sun.nio.fs.n(10);
    public static final j$.desugar.sun.nio.fs.n f = new j$.desugar.sun.nio.fs.n(11);
    public static final j$.desugar.sun.nio.fs.n g = new j$.desugar.sun.nio.fs.n(12);

    public static int a(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        m mVarJ = temporalAccessor.j(temporalField);
        if (!mVarJ.d()) {
            throw new l("Invalid field " + String.valueOf(temporalField) + " for get() method, use getLong() instead");
        }
        long jA = temporalAccessor.A(temporalField);
        if (mVarJ.e(jA)) {
            return (int) jA;
        }
        throw new DateTimeException("Invalid value for " + String.valueOf(temporalField) + " (valid values " + String.valueOf(mVarJ) + "): " + jA);
    }

    public static Temporal b(Temporal temporal, long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            temporal = temporal.b(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return temporal.b(j2, temporalUnit);
    }

    public static Object c(TemporalAccessor temporalAccessor, j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == a || nVar == b || nVar == c) {
            return null;
        }
        return nVar.e(temporalAccessor);
    }

    public static m d(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            Objects.a(temporalField, "field");
            return temporalField.j(temporalAccessor);
        }
        if (temporalAccessor.c(temporalField)) {
            return ((ChronoField) temporalField).d;
        }
        throw new l("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    public static /* synthetic */ int e(int i) {
        int i2 = i % 7;
        if (i2 == 0) {
            return 0;
        }
        return (((i ^ 7) >> 31) | 1) > 0 ? i2 : i2 + 7;
    }
}
