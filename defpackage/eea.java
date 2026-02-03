package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eea extends jnk implements iwj, izx {
    private final ehc a;
    private final fdat b;
    private final hox c;

    public eea(ehc ehcVar, fdat fdatVar) {
        this.a = ehcVar;
        this.b = fdatVar;
        this.c = new hpl(ehcVar, hsi.a);
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

    @Override // defpackage.izx
    public final void d(jaf jafVar) {
        this.c.b(new eeb(this.a, (ehc) jafVar.q(ehm.a)));
    }

    @Override // defpackage.iwj
    public final /* synthetic */ int e(ivu ivuVar, ivt ivtVar, int i) {
        return iwi.a(this, ivuVar, ivtVar, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eea)) {
            return false;
        }
        eea eeaVar = (eea) obj;
        return fdbq.f(this.a, eeaVar.a) && this.b == eeaVar.b;
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
        ehc ehcVar = this.a;
        return (((eby) ehcVar).a * 31) + this.b.hashCode();
    }

    @Override // defpackage.iwj
    public final ixn i(ixp ixpVar, ixk ixkVar, long j) {
        int iIntValue = ((Number) this.b.a((ehc) this.c.a(), ixpVar)).intValue();
        if (iIntValue == 0) {
            return ixpVar.ej(0, 0, fcvp.a, new fdap() { // from class: edy
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    return fctx.a;
                }
            });
        }
        final iyl iylVarE = ixkVar.e(kil.m(j, 0, 0, iIntValue, iIntValue, 3));
        return ixpVar.ej(iylVarE.a, iIntValue, fcvp.a, new fdap() { // from class: edz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk.A((iyk) obj, iylVarE, 0, 0);
                return fctx.a;
            }
        });
    }
}
