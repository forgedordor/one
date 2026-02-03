package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frc extends icr implements jbd, jcd {
    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        boolean z = false;
        if (this.C && ((Boolean) jbe.a(this, fqo.a)).booleanValue()) {
            z = true;
        }
        long j2 = fqo.b;
        final iyl iylVarE = ixkVar.e(j);
        final int iMax = z ? Math.max(iylVarE.a, ixpVar.ep(kiw.b(j2))) : iylVarE.a;
        final int iMax2 = z ? Math.max(iylVarE.b, ixpVar.ep(kiw.a(j2))) : iylVarE.b;
        return ixpVar.ej(iMax, iMax2, fcvp.a, new fdap() { // from class: frb
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                int i = iMax;
                ((iyk) obj).s(iylVarE, fdcu.b((i - r1.a) / 2.0f), fdcu.b((iMax2 - r1.b) / 2.0f), 0.0f);
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
