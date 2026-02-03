package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class tpw implements egps<Void, Void> {
    final /* synthetic */ tpx a;

    public tpw(tpx tpxVar) {
        this.a = tpxVar;
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        tpx tpxVar = this.a;
        fcsu fcsuVar = tpxVar.k;
        fcsuVar.getClass();
        ekrw ekrwVarH = tpx.a.h();
        ekrwVarH.X(eksq.a, "BugleCms");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/cloudstore/fi/FiAccountFragmentPeer$1", "onSuccess", 371, "FiAccountFragmentPeer.java")).q("Disabling RCS global toggle");
        ((chtr) fcsuVar.b()).i(false);
        tpxVar.a();
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        ekrw ekrwVarJ = tpx.a.j();
        ekrwVarJ.X(eksq.a, "BugleCms");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/cloudstore/fi/FiAccountFragmentPeer$1", "onFailure", (char) 378, "FiAccountFragmentPeer.java")).q("Failed to disable RCS global toggle");
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
