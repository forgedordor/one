package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ega extends icr implements jcd {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e = true;

    public ega(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        int iEp = ixpVar.ep(this.a) + ixpVar.ep(this.c);
        int iEp2 = ixpVar.ep(this.b) + ixpVar.ep(this.d);
        final iyl iylVarE = ixkVar.e(kim.h(j, -iEp, -iEp2));
        int i = iylVarE.a + iEp;
        int i2 = iylVarE.b + iEp2;
        return ixpVar.ej(kim.c(j, i), kim.b(j, i2), fcvp.a, new fdap() { // from class: efz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk iykVar = (iyk) obj;
                iyl iylVar = iylVarE;
                ega egaVar = this.a;
                if (egaVar.e) {
                    iyk.A(iykVar, iylVar, kin.f(iykVar, egaVar.a), kin.f(iykVar, egaVar.b));
                } else {
                    iykVar.s(iylVar, kin.f(iykVar, egaVar.a), kin.f(iykVar, egaVar.b), 0.0f);
                }
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
