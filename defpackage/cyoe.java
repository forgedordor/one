package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyoe implements ehay {
    final /* synthetic */ cyod a;

    public cyoe(cyod cyodVar) {
        this.a = cyodVar;
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) {
        cqce cqceVar = cyod.a;
        ((ekrd) ((ekrd) cqceVar.j().g(th)).h("com/google/android/apps/messaging/ui/ditto/DittoWelcomeFragmentPeerDelegate$2", "onLoadError", 178, "DittoWelcomeFragmentPeerDelegate.java")).q("Error loading device pairing settings data, defaulting to not showing gaia pairing option");
        cyod cyodVar = this.a;
        cyor cyorVar = cyodVar.c;
        if (cyorVar == null) {
            ((ekrd) cqceVar.k().h("com/google/android/apps/messaging/ui/ditto/DittoWelcomeFragmentPeerDelegate$2", "onLoadError", 182, "DittoWelcomeFragmentPeerDelegate.java")).q("PairedDesktopsAdapter is null");
            return;
        }
        cyorVar.G(false);
        fcsu fcsuVar = cyodVar.e;
        if (fcsuVar == null) {
            ((ekrd) cqceVar.k().h("com/google/android/apps/messaging/ui/ditto/DittoWelcomeFragmentPeerDelegate$2", "onLoadError", 187, "DittoWelcomeFragmentPeerDelegate.java")).q("CounterEventLogger is null");
        } else {
            ((ains) fcsuVar.b()).e("Bugle.Gaia.Pairing.Can.Device.Register.Failure.Count", 1);
        }
    }

    @Override // defpackage.ehay
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        cyor cyorVar = this.a.c;
        if (cyorVar == null) {
            ((ekrd) cyod.a.k().h("com/google/android/apps/messaging/ui/ditto/DittoWelcomeFragmentPeerDelegate$2", "onLoaded", 170, "DittoWelcomeFragmentPeerDelegate.java")).q("PairedDesktopsAdapter is null");
        } else {
            cyorVar.G(bool.booleanValue());
        }
    }
}
