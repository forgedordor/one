package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmix implements cmiw {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/sim/SimChangeManagerImpl");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;

    public cmix(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
        this.h = fcsuVar7;
    }

    private final String b() {
        try {
            return ((dhes) this.c.b()).m().substring(0, 3);
        } catch (StringIndexOutOfBoundsException e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/sim/SimChangeManagerImpl", "getMcc", ']', "SimChangeManagerImpl.java")).q("failed to obtain mcc");
            return "";
        }
    }

    private final String c() {
        try {
            return ((dhes) this.c.b()).m().substring(3);
        } catch (StringIndexOutOfBoundsException e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/sim/SimChangeManagerImpl", "getMnc", 'f', "SimChangeManagerImpl.java")).q("failed to obtain mnc");
            return "";
        }
    }

    @Override // defpackage.cmiw
    @Deprecated
    public final void a(Context context) {
        if (((Optional) this.b.b()).isPresent()) {
            String strL = ((dhes) this.c.b()).l();
            if (b().isEmpty() || c().isEmpty()) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/sim/SimChangeManagerImpl", "handleSimLoaded", 67, "SimChangeManagerImpl.java")).q("SimChangeReceiver: SimInfo is invalid");
            } else if (strL.isEmpty()) {
                ekrw ekrwVarJ2 = a.j();
                ekrwVarJ2.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/sim/SimChangeManagerImpl", "handleSimLoaded", 69, "SimChangeManagerImpl.java")).q("SimChangeReceiver: simId is invalid");
            } else {
                ((cebe) this.h.b()).a(ekgb.r(strL));
            }
        }
        ((ccyw) this.d.b()).b(context, crsd.PHENOTYPE_REGISTRATION_TRIGGER_SIM_CHANGE);
        ((chza) ((cqbm) this.e.b()).a()).o(chyx.NO_HINT);
        ((bvit) this.f.b()).j();
        ((ayge) this.g.b()).b().K();
    }
}
