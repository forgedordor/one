package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nsp implements nso {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;
    private final int e;

    public nsp(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // defpackage.noq
    public final noo b(long j) {
        long[] jArr = this.a;
        int iAl = mgb.al(jArr, j, true);
        long j2 = jArr[iAl];
        long[] jArr2 = this.b;
        nor norVar = new nor(j2, jArr2[iAl]);
        if (norVar.b >= j || iAl == jArr.length - 1) {
            return new noo(norVar, norVar);
        }
        int i = iAl + 1;
        return new noo(norVar, new nor(jArr[i], jArr2[i]));
    }

    @Override // defpackage.nso
    public final int e() {
        return this.e;
    }

    @Override // defpackage.nso
    public final long f() {
        return this.d;
    }

    @Override // defpackage.nso
    public final long g(long j) {
        return this.a[mgb.al(this.b, j, true)];
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
