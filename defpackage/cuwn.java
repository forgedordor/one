package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cuwn implements egps<Integer, Void> {
    final /* synthetic */ cuwp a;

    public cuwn(cuwp cuwpVar) {
        this.a = cuwpVar;
    }

    @Override // defpackage.egps
    public final /* synthetic */ void c(Object obj, Object obj2) {
        ckbz ckbzVarB = ckbz.b(((Integer) obj).intValue());
        ckbzVarB.getClass();
        cuwp cuwpVar = this.a;
        fcsu fcsuVar = cuwpVar.t;
        fcsuVar.getClass();
        fcsu fcsuVar2 = cuwpVar.J;
        fcsuVar2.getClass();
        cuwpVar.h.getClass();
        cuwr cuwrVar = cuwpVar.Z;
        cuwrVar.getClass();
        ((cuol) cuwrVar).a.G(true);
        boolean zEquals = ckbzVarB.equals(ckbz.TOGGLE_STATE_ENABLED);
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.ims.provisioning.engine.bugle_enabled_rcs_from_preference", zEquals);
        ((chwq) fcsuVar.b()).F(bundle);
        ((chtr) fcsuVar2.b()).i(zEquals);
        if (dfpi.U()) {
            ((ekrd) ((ekrd) cuwp.a.h()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$2", "onSuccess", 443, "RcsSettingsFragmentV2Peer.java")).t("enableMoSmsNumberDiscovery %s", Boolean.valueOf(zEquals));
            cuwpVar.h.f(zEquals);
        }
        cuwpVar.h();
    }

    @Override // defpackage.egps
    public final /* synthetic */ void f(Object obj, Throwable th) {
        ((ekrd) ((ekrd) ((ekrd) cuwp.a.j()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$2", "onFailure", (char) 452, "RcsSettingsFragmentV2Peer.java")).q("Failed to set RCS Global Toggle");
        cuwr cuwrVar = this.a.Z;
        cuwrVar.getClass();
        ((cuol) cuwrVar).a.G(true);
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
