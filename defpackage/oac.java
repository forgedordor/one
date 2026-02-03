package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oac implements noq {
    public final long a;
    private final nzz b;
    private final int c;
    private final long d;
    private final long e;

    public oac(nzz nzzVar, int i, long j, long j2) {
        this.b = nzzVar;
        this.c = i;
        this.d = j;
        long j3 = (j2 - j) / nzzVar.d;
        this.e = j3;
        this.a = d(j3);
    }

    private final long d(long j) {
        return mgb.y(j * this.c, 1000000L, this.b.c);
    }

    @Override // defpackage.noq
    public final noo b(long j) {
        long j2 = this.c;
        long j3 = this.e;
        nzz nzzVar = this.b;
        long j4 = j3 - 1;
        long jS = mgb.s((nzzVar.c * j) / (j2 * 1000000), 0L, j4);
        long j5 = nzzVar.d;
        long jD = d(jS);
        long j6 = this.d;
        nor norVar = new nor(jD, (jS * j5) + j6);
        if (jD >= j || jS == j4) {
            return new noo(norVar, norVar);
        }
        long j7 = jS + 1;
        return new noo(norVar, new nor(d(j7), j6 + (j5 * j7)));
    }

    @Override // defpackage.noq
    public final long w() {
        return this.a;
    }

    @Override // defpackage.noq
    public final boolean y() {
        return true;
    }
}
