package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acrk implements egzv<List<bpyn>> {
    final /* synthetic */ acrt a;

    public acrk(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
        ekrw ekrwVarJ = acrt.a.j();
        ekrwVarJ.X(eksq.a, "HomeFragmentFlogger");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$3", "onError", (char) 1373, "HomeFragmentPeer.java")).q("Loading all message annotations failed");
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        if (list.isEmpty()) {
            ekrw ekrwVarH = acrt.a.h();
            ekrwVarH.X(eksq.a, "HomeFragmentFlogger");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/home/HomeFragmentPeer$3", "onNewData", 1364, "HomeFragmentPeer.java")).q("Data is empty");
        } else {
            ekrw ekrwVarH2 = acrt.a.h();
            ekrwVarH2.X(eksq.a, "HomeFragmentFlogger");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/home/HomeFragmentPeer$3", "onNewData", 1367, "HomeFragmentPeer.java")).q("Set annotations will be called trigger data reload.");
            this.a.j().o(list);
        }
    }

    @Override // defpackage.egzv
    public final void hn() {
    }
}
