package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lub {
    private static final long b = csy.a(0.0f, 0.0f);
    public static final float a = 3.1415927f;

    public static final float a(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public static final float b(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    public static final long c(float f, float f2) {
        float fA = a(f, f2);
        if (fA > 0.0f) {
            return csy.a(f / fA, f2 / fA);
        }
        throw new IllegalArgumentException("Required distance greater than zero");
    }

    public static final long d(long j) {
        return csy.a(-ltt.d(j), ltt.c(j));
    }

    public static final float e(float f) {
        return ((f % 1.0f) + 1.0f) % 1.0f;
    }

    public static /* synthetic */ long f(float f, float f2) {
        double d = f2;
        return ltt.h(ltt.i(csy.a((float) Math.cos(d), (float) Math.sin(d)), f), b);
    }
}
