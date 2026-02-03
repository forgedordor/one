package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hii<T> extends icr implements jcd {
    public hgn a;
    public fdat b;
    public dwm c;
    private boolean d;

    public hii(hgn hgnVar, fdat fdatVar, dwm dwmVar) {
        this.a = hgnVar;
        this.b = fdatVar;
        this.c = dwmVar;
    }

    @Override // defpackage.jcd
    public final ixn b(final ixp ixpVar, ixk ixkVar, long j) {
        final iyl iylVarE = ixkVar.e(j);
        if (!ixpVar.ev() || !this.d) {
            fcti fctiVar = (fcti) this.b.a(new kjg((iylVarE.b & 4294967295L) | (iylVarE.a << 32)), new kil(j));
            final hgn hgnVar = this.a;
            hjj hjjVar = (hjj) fctiVar.a;
            final Object obj = fctiVar.b;
            if (!fdbq.f(hgnVar.p(), hjjVar)) {
                hgnVar.f.b(hjjVar);
                hje hjeVar = hgnVar.c;
                fdae fdaeVar = new fdae() { // from class: hga
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        hgn hgnVar2 = hgnVar;
                        hjj hjjVarP = hgnVar2.p();
                        Object obj2 = obj;
                        float fB = hjjVarP.b(obj2);
                        if (!Float.isNaN(fB)) {
                            hgnVar2.h.a(fB, 0.0f);
                            hgnVar2.m(null);
                        }
                        hgnVar2.l(obj2);
                        return fctx.a;
                    }
                };
                if (hjeVar.b.c()) {
                    try {
                        fdaeVar.invoke();
                    } finally {
                        hjeVar.b.d();
                    }
                } else {
                    hgnVar.m(obj);
                }
            }
        }
        boolean z = true;
        if (!ixpVar.ev() && !this.d) {
            z = false;
        }
        this.d = z;
        return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: hig
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                hii hiiVar = this;
                iyk iykVar = (iyk) obj2;
                final float fB = ixpVar.ev() ? hiiVar.a.p().b(hiiVar.a.j()) : hiiVar.a.d();
                final iyl iylVar = iylVarE;
                dwm dwmVar = hiiVar.c;
                final float f = dwmVar == dwm.b ? fB : 0.0f;
                if (dwmVar != dwm.a) {
                    fB = 0.0f;
                }
                iykVar.x(new fdap() { // from class: hih
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        ((iyk) obj3).s(iylVar, fdcu.b(f), fdcu.b(fB), 0.0f);
                        return fctx.a;
                    }
                });
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

    @Override // defpackage.icr
    public final void s() {
        this.d = false;
    }
}
