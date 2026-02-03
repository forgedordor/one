package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuwq implements ehay {
    final /* synthetic */ cuwp a;

    public cuwq(cuwp cuwpVar) {
        this.a = cuwpVar;
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) {
        ((ekrd) ((ekrd) ((ekrd) cuwp.a.j()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$GetRcsDefaultOnLoadedCallback", "onLoadError", (char) 543, "RcsSettingsFragmentV2Peer.java")).q("Error loading RCS default on data");
    }

    @Override // defpackage.ehay
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cjxj cjxjVar = (cjxj) obj;
        if (!dfpi.z() && dfar.b()) {
            cuwp cuwpVar = this.a;
            if (cuwpVar.P.b()) {
                boolean z = true;
                if (cjxjVar != cjxj.LEGAL_FYI_SEEN && (!dfpi.J() || cjxjVar != cjxj.OOB_CONSENT)) {
                    z = false;
                }
                cuwpVar.j = z;
                ((ekrd) ((ekrd) cuwp.a.h()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$GetRcsDefaultOnLoadedCallback", "onLoaded", 533, "RcsSettingsFragmentV2Peer.java")).t("onRcsDefaultOnLoaded, hasRcsDefaultOnConsent: %s", Boolean.valueOf(cuwpVar.j));
                ((cjzq) cuwpVar.S.b()).l();
                cuwpVar.f();
                cuwpVar.h();
            }
        }
    }
}
