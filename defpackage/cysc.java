package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cysc implements egps<Integer, Integer> {
    final /* synthetic */ cysg a;

    public cysc(cysg cysgVar) {
        this.a = cysgVar;
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ekrw ekrwVarH = cysg.a.h();
        ekrwVarH.X(eksq.a, "BugleGDitto");
        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer$3", "onSuccess", 496, "GaiaPairingSettingsFragmentPeer.java");
        ekrdVar.D("Successfully deleted %d out of %d Gaia pairing records from the Desktop table", (Integer) obj2, (Integer) obj);
        ((ains) this.a.l.b()).c("Bugle.Gaia.Unpair.Desktops.Success");
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        ekrw ekrwVarJ = cysg.a.j();
        ekrwVarJ.X(eksq.a, "BugleGDitto");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer$3", "onFailure", 504, "GaiaPairingSettingsFragmentPeer.java")).t("Failed to delete %d Gaia pairing records from the Desktop table", (Integer) obj);
        ((ains) this.a.l.b()).c("Bugle.Gaia.Unpair.Desktops.Failure");
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
