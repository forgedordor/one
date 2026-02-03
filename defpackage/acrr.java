package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acrr implements egzv<Optional<cjsa>> {
    final /* synthetic */ acrt a;

    public acrr(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
        ekrw ekrwVarJ = acrt.a.j();
        ekrwVarJ.X(eksq.a, "HomeFragmentFlogger");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$8", "onError", (char) 1541, "HomeFragmentPeer.java")).q("SubscriptionCallback: Failed to load PhoneNumberInputUIEvents");
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            ekrw ekrwVarE = acrt.a.e();
            ekrwVarE.X(eksq.a, "HomeFragmentFlogger");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/home/HomeFragmentPeer$8", "onNewData", 1521, "HomeFragmentPeer.java")).q("SubscriptionCallback: Not triggering PhoneNumberInput popup");
        } else {
            if (((cjsa) optional.get()).ordinal() != 2) {
                return;
            }
            this.a.aw.e(6);
            ekrw ekrwVarE2 = acrt.a.e();
            ekrwVarE2.X(eksq.a, "HomeFragmentFlogger");
            ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/home/HomeFragmentPeer$8", "onNewData", 1528, "HomeFragmentPeer.java")).q("SubscriptionCallback: Showing PhoneNumber Input popup");
        }
    }

    @Override // defpackage.egzv
    public final /* synthetic */ void hn() {
    }
}
