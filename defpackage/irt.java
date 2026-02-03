package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class irt {
    public static final long a(ise iseVar) {
        return j(iseVar, false);
    }

    public static final long b(ise iseVar) {
        return j(iseVar, true);
    }

    public static final boolean c(ise iseVar) {
        return (iseVar.c() || iseVar.h || !iseVar.d) ? false : true;
    }

    public static final boolean d(ise iseVar) {
        return !iseVar.h && iseVar.d;
    }

    public static final boolean e(ise iseVar) {
        return (iseVar.c() || !iseVar.h || iseVar.d) ? false : true;
    }

    public static final boolean f(ise iseVar) {
        return iseVar.h && !iseVar.d;
    }

    public static final boolean g(ise iseVar, long j, long j2) {
        boolean zB = ita.b(iseVar.i, 1);
        long j3 = iseVar.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float f = zB ? 1.0f : 0.0f;
        float f2 = fIntBitsToFloat3 * f;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > ((float) ((int) (j >> 32))) + f2) | (fIntBitsToFloat < (-f2)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((float) ((int) (j & 4294967295L))) + fIntBitsToFloat4);
    }

    public static final boolean h(ise iseVar) {
        return !ihs.h(j(iseVar, false), 0L);
    }

    public static final boolean i(ise iseVar) {
        return !ihs.h(j(iseVar, true), 0L);
    }

    private static final long j(ise iseVar, boolean z) {
        long jD = ihs.d(iseVar.c, iseVar.g);
        if (z || !iseVar.c()) {
            return jD;
        }
        return 0L;
    }
}
