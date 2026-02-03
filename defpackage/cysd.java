package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cysd implements egps<Void, Void> {
    final /* synthetic */ cysg a;

    public cysd(cysg cysgVar) {
        this.a = cysgVar;
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ekrw ekrwVarH = cysg.a.h();
        ekrwVarH.X(eksq.a, "BugleGDitto");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer$4", "onSuccess", 516, "GaiaPairingSettingsFragmentPeer.java")).q("Successfully disabled Gaia device pairing if Qr pairing exists");
        this.a.b();
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        ekrw ekrwVarJ = cysg.a.j();
        ekrwVarJ.X(eksq.a, "BugleGDitto");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer$4", "onFailure", (char) 522, "GaiaPairingSettingsFragmentPeer.java")).q("Failed to check if Qr pairing exists and disable Gaia device pairing");
        this.a.b();
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
