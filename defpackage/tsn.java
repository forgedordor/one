package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsn implements afju {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/cloudstore/fi/signinpromo/FiSignInPromoOnDelayedAccountChanged");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final fcsu e;

    public tsn(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
    }

    @Override // defpackage.afju
    public final void a(efwo efwoVar) {
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleCms");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/cloudstore/fi/signinpromo/FiSignInPromoOnDelayedAccountChanged", "execute", 34, "FiSignInPromoOnDelayedAccountChanged.kt")).q("FiSignInPromoOnDelayedAccountChanged gets triggered");
        if (!((Boolean) ((cczi) cpyl.r.get()).e()).booleanValue()) {
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "BugleCms");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/cloudstore/fi/signinpromo/FiSignInPromoOnDelayedAccountChanged", "execute", 36, "FiSignInPromoOnDelayedAccountChanged.kt")).q("Skip FiSignInPromoOnDelayedAccountChanged as the flag is off");
        } else if (((Optional) ((eyig) this.b).a).isEmpty()) {
            ekrw ekrwVarH3 = ekrgVar.h();
            ekrwVarH3.X(ekrzVar, "BugleCms");
            ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/cloudstore/fi/signinpromo/FiSignInPromoOnDelayedAccountChanged", "execute", 39, "FiSignInPromoOnDelayedAccountChanged.kt")).q("Skip FiSignInPromoOnDelayedAccountChanged as the module is missing");
        } else {
            Object objB = this.e.b();
            objB.getClass();
            auvw.k((fdjx) objB, null, null, new tsm(this, efwoVar, null), 3);
        }
    }
}
