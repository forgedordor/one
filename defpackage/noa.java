package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class noa implements noq {
    private final noc a;
    private final long b;

    public noa(noc nocVar, long j) {
        this.a = nocVar;
        this.b = j;
    }

    private final nor d(long j, long j2) {
        return new nor((j * 1000000) / this.a.e, this.b + j2);
    }

    @Override // defpackage.noq
    public final noo b(long j) {
        noc nocVar = this.a;
        nob nobVar = nocVar.k;
        mee.g(nobVar);
        long[] jArr = nobVar.a;
        long[] jArr2 = nobVar.b;
        int iAl = mgb.al(jArr, nocVar.b(j), false);
        nor norVarD = d(iAl == -1 ? 0L : jArr[iAl], iAl != -1 ? jArr2[iAl] : 0L);
        if (norVarD.b == j || iAl == jArr.length - 1) {
            return new noo(norVarD, norVarD);
        }
        int i = iAl + 1;
        return new noo(norVarD, d(jArr[i], jArr2[i]));
    }

    @Override // defpackage.noq
    public final long w() {
        return this.a.a();
    }

    @Override // defpackage.noq
    public final boolean y() {
        return true;
    }
}
