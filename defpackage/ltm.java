package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltm {
    public static final long a(ltb ltbVar, float f) {
        long jA = csy.a(ltbVar.a(), ltbVar.b());
        int i = 1;
        float f2 = 0.0f;
        float f3 = f;
        while (true) {
            float f4 = i / 3.0f;
            long jI = ltbVar.i(f4);
            float fB = ltt.b(ltt.g(jI, jA));
            if (fB >= f3) {
                return csy.a(f4 - ((1.0f - (f3 / fB)) / 3.0f), f);
            }
            f3 -= fB;
            f2 += fB;
            if (i == 3) {
                return csy.a(1.0f, f2);
            }
            i++;
            jA = jI;
        }
    }

    public static final float b(ltb ltbVar) {
        ltbVar.getClass();
        return Float.intBitsToFloat((int) (a(ltbVar, Float.POSITIVE_INFINITY) & 4294967295L));
    }
}
