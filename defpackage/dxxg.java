package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxxg implements egbx, egbw, ehlj {
    public static final eksp a = eksp.c("GnpSdk");
    private final eosc b;
    private final dxvt c;

    public dxxg(dxvt dxvtVar, eosc eoscVar) {
        this.c = dxvtVar;
        this.b = eoscVar;
    }

    private final void c() {
        dxvt dxvtVar = this.c;
        eooq.g(fdxs.b(dxvtVar.a, fcyi.a, fdjz.a, new dxvs(dxvtVar, null)), eiid.d(new eooz() { // from class: dxxf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dxft dxftVar = (dxft) obj;
                eksp ekspVar = dxxg.a;
                if (dxftVar.g()) {
                    ((eksl) ((eksl) ((eksl) dxxg.a.j()).g(dxftVar.f())).h("com/google/android/libraries/notifications/platform/tiktok/registration/GnpRegistrationInterceptor", "handleGnpRegistration", '@', "GnpRegistrationInterceptor.java")).q("Failed scheduling GNP registration");
                }
                return eorv.a;
            }
        }), this.b);
    }

    @Override // defpackage.ehlj
    public final ListenableFuture a() {
        ((eksl) a.o().h("com/google/android/libraries/notifications/platform/tiktok/registration/GnpRegistrationInterceptor", "onStartupAfterPackageReplaced", 81, "GnpRegistrationInterceptor.java")).q("onStartupAfterPackageReplaced called.");
        c();
        return eorv.a;
    }

    @Override // defpackage.egbx
    public final ListenableFuture b(egbv egbvVar) {
        ((eksl) a.o().h("com/google/android/libraries/notifications/platform/tiktok/registration/GnpRegistrationInterceptor", "onAccountEnabled", 48, "GnpRegistrationInterceptor.java")).t("onAccountEnabled called for [%s]", ((egdc) egbvVar).b.g);
        c();
        return eorv.a;
    }

    @Override // defpackage.egbw
    public final ListenableFuture l(egbv egbvVar) {
        ((eksl) a.o().h("com/google/android/libraries/notifications/platform/tiktok/registration/GnpRegistrationInterceptor", "onAccountDisabled", 74, "GnpRegistrationInterceptor.java")).t("onAccountDisabled called for [%s]", ((egdc) egbvVar).b.g);
        c();
        return eorv.a;
    }
}
