package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class fgj {
    public static final long a = b(Float.NaN, Float.NaN);

    public static long a(kio kioVar) {
        return b(kioVar.ed(), kioVar.ee());
    }

    public static long b(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static String c(long j) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
