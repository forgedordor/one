package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efi implements iwj, izx, jae {
    private final ehc a;
    private final hox b;
    private final hox c;

    public efi(ehc ehcVar) {
        this.a = ehcVar;
        hsi hsiVar = hsi.a;
        this.b = new hpl(ehcVar, hsiVar);
        this.c = new hpl(ehcVar, hsiVar);
    }

    private final ehc j() {
        return (ehc) this.b.a();
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
        ehc ehcVar = (ehc) jafVar.q(ehm.a);
        ehc ehcVar2 = this.a;
        this.b.b(new eeb(ehcVar2, ehcVar));
        this.c.b(new egw(ehcVar, ehcVar2));
    }

    @Override // defpackage.iwj
    public final /* synthetic */ int e(ivu ivuVar, ivt ivtVar, int i) {
        return iwi.a(this, ivuVar, ivtVar, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof efi) {
            return fdbq.f(((efi) obj).a, this.a);
        }
        return false;
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
        return this.a.hashCode();
    }

    @Override // defpackage.iwj
    public final ixn i(ixp ixpVar, ixk ixkVar, long j) {
        final int iB = j().b(ixpVar, ixpVar.q());
        final int iD = j().d(ixpVar);
        int iC = j().c(ixpVar, ixpVar.q()) + iB;
        int iA = j().a(ixpVar) + iD;
        final iyl iylVarE = ixkVar.e(kim.h(j, -iC, -iA));
        int i = iylVarE.a + iC;
        int i2 = iylVarE.b + iA;
        return ixpVar.ej(kim.c(j, i), kim.b(j, i2), fcvp.a, new fdap() { // from class: efh
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((iyk) obj).s(iylVarE, iB, iD, 0.0f);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.jae
    public final jag m() {
        return ehm.a;
    }

    @Override // defpackage.jae
    public final /* synthetic */ Object n() {
        return (ehc) this.c.a();
    }
}
