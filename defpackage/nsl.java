package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nsl implements nso {
    private final long[] a;
    private final long[] b;
    private final long c;

    public nsl(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? mgb.w(jArr2[jArr2.length - 1]) : j;
    }

    private static Pair d(long j, long[] jArr, long[] jArr2) {
        int iAl = mgb.al(jArr, j, true);
        long j2 = jArr[iAl];
        long j3 = jArr2[iAl];
        int i = iAl + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.noq
    public final noo b(long j) {
        Pair pairD = d(mgb.B(mgb.s(j, 0L, this.c)), this.b, this.a);
        nor norVar = new nor(mgb.w(((Long) pairD.first).longValue()), ((Long) pairD.second).longValue());
        return new noo(norVar, norVar);
    }

    @Override // defpackage.nso
    public final int e() {
        return -2147483647;
    }

    @Override // defpackage.nso
    public final long f() {
        return -1L;
    }

    @Override // defpackage.nso
    public final long g(long j) {
        return mgb.w(((Long) d(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.noq
    public final long w() {
        return this.c;
    }

    @Override // defpackage.noq
    public final boolean y() {
        return true;
    }
}
