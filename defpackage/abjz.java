package defpackage;

import android.content.Context;
import android.os.UserManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjz {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/dittosatellite/impl/DittoWebViewConfiguration");
    private final fcsu b;
    private final fcsu c;

    public abjz(Context context, fcsu fcsuVar, fcsu fcsuVar2) {
        context.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    public final boolean a() {
        if (((Boolean) abmt.d.e()).booleanValue()) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "DittoSatellite");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/dittosatellite/impl/DittoWebViewConfiguration", "isDittoWebViewEnabled", 27, "DittoWebViewConfiguration.kt")).q("Ditto Satellite Force disabled");
            return false;
        }
        boolean z = true;
        if (!((Boolean) abmt.c.e()).booleanValue() && ((crnp) this.c.b()).e() && !((Boolean) abss.a.a()).booleanValue()) {
            z = false;
        }
        if (z) {
            try {
                if (((UserManager) this.b.b()).isDemoUser()) {
                    ekrw ekrwVarH2 = a.h();
                    ekrwVarH2.X(eksq.a, "DittoSatellite");
                    ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/dittosatellite/impl/DittoWebViewConfiguration", "isDittoWebViewEnabled", 39, "DittoWebViewConfiguration.kt")).q("Demo user detected, disabling Ditto Satellite");
                    return false;
                }
            } catch (RuntimeException e) {
                ekrw ekrwVarI = a.i();
                ekrwVarI.X(eksq.a, "DittoSatellite");
                ((ekrd) ((ekrd) ekrwVarI).g(e).h("com/google/android/apps/messaging/dittosatellite/impl/DittoWebViewConfiguration", "isDittoWebViewEnabled", 43, "DittoWebViewConfiguration.kt")).q("Error checking for demo user");
                return false;
            }
        }
        return z;
    }

    public final boolean b() {
        if (!((crnp) this.c.b()).e() || ((Boolean) abmt.e.e()).booleanValue()) {
            return true;
        }
        if (!((Boolean) abss.b.a()).booleanValue()) {
            return false;
        }
        ((Boolean) abss.a.a()).booleanValue();
        return true;
    }
}
