package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abjw implements egzv<abft> {
    final /* synthetic */ abto a;
    final /* synthetic */ abjq b;

    public abjw(abjq abjqVar, abto abtoVar) {
        this.a = abtoVar;
        this.b = abjqVar;
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
        cqca.k("Bugle", th, "Failed to initiate gaia pairing on messages web webview");
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        abft abftVar = (abft) obj;
        abjq abjqVar = this.b;
        fcsu fcsuVar = abjqVar.i;
        if (fcsuVar == null) {
            ((eksl) ((eksl) abjq.b.j()).h("com/google/android/apps/messaging/dittosatellite/impl/DittoWebFragmentPeer$7", "onNewData", 989, "DittoWebFragmentPeer.java")).q("satelliteCommonDataService is null.");
            return;
        }
        if (((Optional) fcsuVar.b()).isEmpty()) {
            ((eksl) ((eksl) abjq.b.j()).h("com/google/android/apps/messaging/dittosatellite/impl/DittoWebFragmentPeer$7", "onNewData", 994, "DittoWebFragmentPeer.java")).q("satelliteCommonDataService is empty.");
            return;
        }
        if (abftVar == abft.PAIRING) {
            ((eksl) ((eksl) abjq.b.h()).h("com/google/android/apps/messaging/dittosatellite/impl/DittoWebFragmentPeer$7", "onNewData", 999, "DittoWebFragmentPeer.java")).q("Load GAIA pairing page within Ditto WebView to authenticate account");
            this.a.d(abmt.a().appendPath("postSignIn").build().toString());
        }
        if (abftVar == abft.REMOVE_PAIRING) {
            ((eksl) ((eksl) abjq.b.h()).h("com/google/android/apps/messaging/dittosatellite/impl/DittoWebFragmentPeer$7", "onNewData", 1005, "DittoWebFragmentPeer.java")).q("Removing GAIA Pairing Session requires page reload");
            abjqVar.L.deleteAllData();
            this.a.d(abmt.d());
            ((abfv) ((Optional) fcsuVar.b()).get()).i(abft.NOT_PAIRED).k(auvh.b(), (Executor) abjqVar.p.b());
        }
    }

    @Override // defpackage.egzv
    public final /* synthetic */ void hn() {
    }
}
