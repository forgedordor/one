package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwk extends icr implements jcd {
    public fdau a;

    public iwk(fdau fdauVar) {
        this.a = fdauVar;
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        return (ixn) this.a.a(ixpVar, ixkVar, new kil(j));
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
        return "LayoutModifierImpl(measureBlock=" + this.a + ')';
    }
}
