package defpackage;

import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acro implements egzv<List<String>> {
    final /* synthetic */ acrt a;

    public acro(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
        ekrw ekrwVarI = acrt.a.i();
        ekrwVarI.X(eksq.a, "HomeFragmentFlogger");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$5", "onError", (char) 1454, "HomeFragmentPeer.java")).q("HomeFragmentPeer: getBugleDbBlockedDestinations SubscriptionMixin failed");
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        if (list != null) {
            acrt acrtVar = this.a;
            HashSet hashSet = acrtVar.aX;
            hashSet.clear();
            hashSet.addAll(list);
            acrtVar.x();
        }
    }

    @Override // defpackage.egzv
    public final void hn() {
    }
}
