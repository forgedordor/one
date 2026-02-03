package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcy implements iwj {
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

    @Override // defpackage.iwj
    public final ixn i(ixp ixpVar, ixk ixkVar, long j) {
        float fEl = ixpVar.el(kil.a(j));
        int iEp = ixpVar.ep(Float.compare(fEl, hbj.f) >= 0 ? 256.0f : Float.compare(fEl, hbj.g) >= 0 ? hbj.h : hbj.i);
        final iyl iylVarE = ixkVar.e(kik.c(iEp, iEp));
        return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: gcx
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((iyk) obj).s(iylVarE, 0, 0, 0.0f);
                return fctx.a;
            }
        });
    }
}
