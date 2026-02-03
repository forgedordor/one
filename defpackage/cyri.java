package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyri implements afju {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/gaia/GaiaPairingOnDelayedAccountChanged");
    private final fcsu b;

    public cyri(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.b = fcsuVar;
    }

    @Override // defpackage.afju
    public final void a(efwo efwoVar) {
        if (!abxb.a()) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/ui/gaia/GaiaPairingOnDelayedAccountChanged", "execute", 21, "GaiaPairingOnDelayedAccountChanged.kt")).q("Skip GaiaPairingOnDelayedAccountChanged as the Bugle flags are off");
            return;
        }
        if (!abxb.b()) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/ui/gaia/GaiaPairingOnDelayedAccountChanged", "execute", 24, "GaiaPairingOnDelayedAccountChanged.kt")).q("Skip GaiaPairingOnDelayedAccountChanged as the GaiaPairing flag is off");
            return;
        }
        fcsu fcsuVar = this.b;
        if (((Optional) fcsuVar.b()).isEmpty()) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/ui/gaia/GaiaPairingOnDelayedAccountChanged", "execute", 27, "GaiaPairingOnDelayedAccountChanged.kt")).q("Skip GaiaPairingOnDelayedAccountChanged as the module is missing");
        } else {
            auvh.h(((bvos) ((Optional) fcsuVar.b()).get()).d(efwoVar));
        }
    }
}
