package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class eff implements izx, jae {
    private final hox a = new hpl(new eef(0), hsi.a);

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
        this.a.b(e((ehc) jafVar.q(ehm.a)));
    }

    public abstract ehc e(ehc ehcVar);

    @Override // defpackage.jae
    public final jag m() {
        return ehm.a;
    }

    @Override // defpackage.jae
    public final /* synthetic */ Object n() {
        return (ehc) this.a.a();
    }
}
