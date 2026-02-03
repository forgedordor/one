package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iiv extends icr implements jcd {
    public fdap a;

    public iiv(fdap fdapVar) {
        this.a = fdapVar;
    }

    public final void a() {
        jer jerVar = jbg.e(this, 2).w;
        if (jerVar != null) {
            jerVar.az(this.a, true);
        }
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        iyl iylVarE = ixkVar.e(j);
        return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new iiu(iylVarE, this));
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

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.a + ')';
    }
}
