package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfqq implements eyik {
    private final dfqr a;
    private final int b;

    public dfqq(dfqr dfqrVar, int i) {
        this.a = dfqrVar;
        this.b = i;
    }

    @Override // defpackage.fcsu
    public final Object b() {
        int i = this.b;
        if (i == 0) {
            return eyjt.a(this.a.i, eyim.a);
        }
        if (i == 1) {
            dfqr dfqrVar = this.a;
            dhip dhipVar = dfsq.a;
            return dfqrVar.a;
        }
        if (i == 2) {
            dfqr dfqrVar2 = this.a;
            return new dfuv(dfqrVar2.b, (dgwa) ((eyig) dfqrVar2.p).a, new efnm(dfqrVar2.c), new ebcm(dfqrVar2.d));
        }
        if (i == 3) {
            dfqr dfqrVar3 = this.a;
            return new dfrh(dfqrVar3.I, dfqrVar3.p, dfqrVar3.w, dfqrVar3.J, dfqrVar3.K);
        }
        if (i == 4) {
            return new efqs();
        }
        if (i == 5) {
            return new efra();
        }
        dfqr dfqrVar4 = this.a;
        return new dfvi(dfqrVar4.e, dfqrVar4.ae, dfqrVar4.b);
    }
}
