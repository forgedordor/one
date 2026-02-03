package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nsr implements nso {
    private final long a;
    private final int b;
    private final long c;
    private final int d;
    private final long e;
    private final long f;
    private final long[] g;

    public nsr(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    private final long d(int i) {
        return (this.c * i) / 100;
    }

    @Override // defpackage.noq
    public final noo b(long j) {
        if (!y()) {
            nor norVar = new nor(0L, this.a + this.b);
            return new noo(norVar, norVar);
        }
        long j2 = this.c;
        long jS = mgb.s(j, 0L, j2);
        double d = (jS * 100.0d) / j2;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.g;
                mee.g(jArr);
                double d3 = jArr[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        long j3 = this.e;
        nor norVar2 = new nor(jS, this.a + mgb.s(Math.round((d2 / 256.0d) * j3), this.b, j3 - 1));
        return new noo(norVar2, norVar2);
    }

    @Override // defpackage.nso
    public final int e() {
        return this.d;
    }

    @Override // defpackage.nso
    public final long f() {
        return this.f;
    }

    @Override // defpackage.nso
    public final long g(long j) {
        if (!y()) {
            return 0L;
        }
        long j2 = j - this.a;
        if (j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        mee.g(jArr);
        double d = (j2 * 256.0d) / this.e;
        int iAl = mgb.al(jArr, (long) d, true);
        long jD = d(iAl);
        long j3 = jArr[iAl];
        int i = iAl + 1;
        long jD2 = d(i);
        return jD + Math.round((j3 == (iAl == 99 ? 256L : jArr[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (jD2 - jD));
    }

    @Override // defpackage.noq
    public final long w() {
        return this.c;
    }

    @Override // defpackage.noq
    public final boolean y() {
        return this.g != null;
    }
}
