package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hcw extends jnk implements iwj {
    private final boolean a;

    public hcw(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ics
    public final /* synthetic */ ics a(ics icsVar) {
        return icn.a(this, icsVar);
    }

    @Override // defpackage.ics
    public final /* synthetic */ Object b(Object obj, fdat fdatVar) {
        return icp.a(this, obj, fdatVar);
    }

    @Override // defpackage.ics
    public final /* synthetic */ boolean c(fdap fdapVar) {
        return icp.b(this, fdapVar);
    }

    @Override // defpackage.iwj
    public final /* synthetic */ int e(ivu ivuVar, ivt ivtVar, int i) {
        return iwi.a(this, ivuVar, ivtVar, i);
    }

    public final boolean equals(Object obj) {
        hcw hcwVar = obj instanceof hcw ? (hcw) obj : null;
        return hcwVar != null && this.a == hcwVar.a;
    }

    @Override // defpackage.iwj
    public final /* synthetic */ int f(ivu ivuVar, ivt ivtVar, int i) {
        return iwi.b(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.iwj
    public final /* synthetic */ int g(ivu ivuVar, ivt ivtVar, int i) {
        return iwi.c(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.iwj
    public final /* synthetic */ int h(ivu ivuVar, ivt ivtVar, int i) {
        return iwi.d(this, ivuVar, ivtVar, i);
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    @Override // defpackage.iwj
    public final ixn i(ixp ixpVar, ixk ixkVar, long j) {
        final iyl iylVarE = ixkVar.e(j);
        return !this.a ? ixpVar.ej(0, 0, fcvp.a, new fdap() { // from class: hcu
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return fctx.a;
            }
        }) : ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: hcv
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((iyk) obj).s(iylVarE, 0, 0, 0.0f);
                return fctx.a;
            }
        });
    }
}
