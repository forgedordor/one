package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nnh implements noq {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;

    public nnh(long j, long j2, int i, int i2) {
        long jE;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1L;
            jE = -9223372036854775807L;
        } else {
            this.d = j - j2;
            jE = e(j, j2, i);
        }
        this.f = jE;
    }

    private static long e(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    @Override // defpackage.noq
    public final noo b(long j) {
        long j2 = this.d;
        if (j2 == -1) {
            nor norVar = new nor(0L, this.b);
            return new noo(norVar, norVar);
        }
        long j3 = this.c;
        long jMin = (((this.e * j) / 8000000) / j3) * j3;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j3);
        }
        long jMax = this.b + Math.max(jMin, 0L);
        long jD = d(jMax);
        nor norVar2 = new nor(jD, jMax);
        if (j2 != -1 && jD < j) {
            long j4 = jMax + j3;
            if (j4 < this.a) {
                return new noo(norVar2, new nor(d(j4), j4));
            }
        }
        return new noo(norVar2, norVar2);
    }

    public final long d(long j) {
        return e(j, this.b, this.e);
    }

    @Override // defpackage.noq
    public final long w() {
        return this.f;
    }

    @Override // defpackage.noq
    public final boolean y() {
        return this.d != -1;
    }
}
