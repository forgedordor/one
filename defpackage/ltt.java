package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltt {
    public static final float a(long j, long j2) {
        return (c(j) * c(j2)) + (d(j) * d(j2));
    }

    public static final float b(long j) {
        return (float) Math.sqrt((c(j) * c(j)) + (d(j) * d(j)));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float d(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long e(long j, float f) {
        return csy.a(c(j) / f, d(j) / f);
    }

    public static final long f(long j) {
        float fB = b(j);
        if (fB > 0.0f) {
            return e(j, fB);
        }
        throw new IllegalArgumentException("Can't get the direction of a 0-length vector");
    }

    public static final long g(long j, long j2) {
        return csy.a(c(j) - c(j2), d(j) - d(j2));
    }

    public static final long h(long j, long j2) {
        return csy.a(c(j) + c(j2), d(j) + d(j2));
    }

    public static final long i(long j, float f) {
        return csy.a(c(j) * f, d(j) * f);
    }
}
