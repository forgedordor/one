package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efw extends icr implements jcd {
    public fdap a;
    public boolean b;

    public efw(fdap fdapVar, boolean z) {
        this.a = fdapVar;
        this.b = z;
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        final iyl iylVarE = ixkVar.e(j);
        return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: efv
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                efw efwVar = this.a;
                iyk iykVar = (iyk) obj;
                long j2 = ((kjb) efwVar.a.invoke(iykVar)).a;
                iyl iylVar = iylVarE;
                if (efwVar.b) {
                    iyk.B(iykVar, iylVar, kjb.a(j2), kjb.b(j2));
                } else {
                    iyk.D(iykVar, iylVar, kjb.a(j2), kjb.b(j2), null, 12);
                }
                return fctx.a;
            }
        });
    }

    @Override // defpackage.icr
    public final boolean dN() {
        return false;
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
