package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjm {
    public static final long a(double d) {
        return d(4294967296L, (float) d);
    }

    public static final long b(float f) {
        return d(4294967296L, f);
    }

    public static final long c(int i) {
        return d(4294967296L, i);
    }

    public static final long d(long j, float f) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long j2 = kjl.a;
        return j | (jFloatToRawIntBits & 4294967295L);
    }

    public static final void e(long j) {
        if (kjl.b(j) == 0) {
            kiz.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void f() {
        d(8589934592L, 0.25f);
    }
}
