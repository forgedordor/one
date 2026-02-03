package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fns {
    public static final long a(jyi jyiVar, int i, boolean z, boolean z2) {
        int iMax;
        if (jyiVar.h(i) >= jyiVar.f()) {
            return 9205357640488583168L;
        }
        if (z) {
            if (z2) {
                z2 = true;
                if (z) {
                }
            }
        } else {
            iMax = (z && z2) ? i : Math.max(i - 1, 0);
        }
        float fA = jyiVar.a(i, jyiVar.t(iMax) == jyiVar.u(i));
        long j = jyiVar.c;
        return (Float.floatToRawIntBits(fddu.e(fA, 0.0f, (int) (j >> 32))) << 32) | (Float.floatToRawIntBits(fddu.e(jyiVar.b(r0), 0.0f, (int) (j & 4294967295L))) & 4294967295L);
    }
}
