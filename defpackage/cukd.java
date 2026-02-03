package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cukd implements crmf {
    final /* synthetic */ cukf a;

    public cukd(cukf cukfVar) {
        this.a = cukfVar;
    }

    @Override // defpackage.crmf
    public final void a() {
        cukf.o.r("RECEIVE_WAP_PUSH permission denied");
        ((cmwd) this.a.A.b()).b();
    }

    @Override // defpackage.crmf
    public final void b() {
        cukf.o.m("RECEIVE_WAP_PUSH permission granted");
    }

    @Override // defpackage.crmf
    public final /* synthetic */ boolean c() {
        return true;
    }
}
