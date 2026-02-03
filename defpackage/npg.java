package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class npg implements noq {
    final /* synthetic */ npi a;
    private final long b;

    public npg(npi npiVar, long j) {
        this.a = npiVar;
        this.b = j;
    }

    @Override // defpackage.noq
    public final noo b(long j) {
        npi npiVar = this.a;
        noo nooVarC = npiVar.a[0].c(j);
        int i = 1;
        while (true) {
            npl[] nplVarArr = npiVar.a;
            if (i >= nplVarArr.length) {
                return nooVarC;
            }
            noo nooVarC2 = nplVarArr[i].c(j);
            if (nooVarC2.a.c < nooVarC.a.c) {
                nooVarC = nooVarC2;
            }
            i++;
        }
    }

    @Override // defpackage.noq
    public final long w() {
        return this.b;
    }

    @Override // defpackage.noq
    public final boolean y() {
        return true;
    }
}
