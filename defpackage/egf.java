package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egf extends icr implements jcd {
    public egc a;

    public egf(egc egcVar) {
        this.a = egcVar;
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        float fB = this.a.b(ixpVar.q());
        float fD = this.a.d();
        float fC = this.a.c(ixpVar.q());
        float fA = this.a.a();
        if (!((Float.compare(fB, 0.0f) >= 0) & (Float.compare(fD, 0.0f) >= 0) & (Float.compare(fC, 0.0f) >= 0) & (Float.compare(fA, 0.0f) >= 0))) {
            eic.a("Padding must be non-negative");
        }
        final int iEp = ixpVar.ep(fB);
        int iEp2 = ixpVar.ep(fC) + iEp;
        final int iEp3 = ixpVar.ep(fD);
        int iEp4 = ixpVar.ep(fA) + iEp3;
        final iyl iylVarE = ixkVar.e(kim.h(j, -iEp2, -iEp4));
        return ixpVar.ej(kim.c(j, iylVarE.a + iEp2), kim.b(j, iylVarE.b + iEp4), fcvp.a, new fdap() { // from class: ege
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((iyk) obj).s(iylVarE, iEp, iEp3, 0.0f);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int e(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.a(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int f(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.b(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int g(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.c(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int h(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.d(this, ivuVar, ivtVar, i);
    }
}
