package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efu extends icr implements jcd {
    public float a;
    public float b;
    public boolean c = true;

    public efu(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        final iyl iylVarE = ixkVar.e(j);
        return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: eft
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk iykVar = (iyk) obj;
                iyl iylVar = iylVarE;
                efu efuVar = this.a;
                if (efuVar.c) {
                    iyk.A(iykVar, iylVar, kin.f(iykVar, efuVar.a), kin.f(iykVar, efuVar.b));
                } else {
                    iykVar.s(iylVar, kin.f(iykVar, efuVar.a), kin.f(iykVar, efuVar.b), 0.0f);
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
