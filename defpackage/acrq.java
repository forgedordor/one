package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acrq implements egzv<Boolean> {
    final /* synthetic */ acrt a;

    public acrq(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
        ekrw ekrwVarI = acrt.a.i();
        ekrwVarI.X(eksq.a, "HomeFragmentFlogger");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$7", "onError", 1498, "HomeFragmentPeer.java")).t("SyncStatusDataService failed: %s", th.getMessage());
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean z = bool != null && bool.booleanValue();
        acrt acrtVar = this.a;
        acrtVar.bb = z;
        ekrw ekrwVarE = acrt.a.e();
        ekrwVarE.X(eksq.a, "HomeFragmentFlogger");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/home/HomeFragmentPeer$7", "onNewData", 1491, "HomeFragmentPeer.java")).t("SyncStatus SubscriptionCallback: inFullSync: %s", bool);
        acxl acxlVar = acrtVar.s;
        boolean z2 = acrtVar.bb;
        if (acxlVar.a != z2) {
            acxlVar.a = z2;
            if (z2) {
                acxlVar.s(0);
            } else {
                acxlVar.y(0);
            }
        }
        acrtVar.i().N(z2);
    }

    @Override // defpackage.egzv
    public final /* synthetic */ void hn() {
    }
}
