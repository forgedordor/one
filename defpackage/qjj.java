package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qjj {
    public static final long a(boolean z, int i, pza pzaVar, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        long jK;
        pzaVar.getClass();
        if (j6 != Long.MAX_VALUE && z2) {
            return i2 == 0 ? j6 : fddu.j(j6, j2 + 900000);
        }
        if (z) {
            jK = fddu.k(pzaVar == pza.b ? j * i : (long) Math.scalb(j, i - 1), 18000000L);
        } else {
            if (!z2) {
                if (j2 == -1) {
                    return Long.MAX_VALUE;
                }
                return j2 + j3;
            }
            if (i2 == 0) {
                j2 += j3;
                i2 = 0;
            } else {
                j2 += j5;
            }
            if (j4 == j5 || i2 != 0) {
                return j2;
            }
            jK = j5 - j4;
        }
        return j2 + jK;
    }
}
