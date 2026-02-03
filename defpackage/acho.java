package defpackage;

import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acho implements achk {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl");
    public final fcsu b;
    public final fcsu c;
    private final eosc d;
    private final eosc e;
    private final bvkr f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;

    public acho(eosc eoscVar, eosc eoscVar2, bvkr bvkrVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.d = eoscVar;
        this.e = eoscVar2;
        this.f = bvkrVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
        this.b = fcsuVar4;
        this.c = fcsuVar5;
        this.j = fcsuVar6;
    }

    @Override // defpackage.achk
    public final eiju a() {
        return ((Boolean) cdip.a.e()).booleanValue() ? ((bvll) this.i.b()).j() : eijx.e(false);
    }

    @Override // defpackage.achk
    public final eiju b() {
        if (((Boolean) this.g.b()).booleanValue()) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleGDitto");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "shouldShowGaiaPairingPromo", 85, "GaiaPairingUtilsImpl.java")).q("NO_SHOW, gaia promo is force disabled");
            return eijx.e(achj.NO_SHOW);
        }
        if (!((aqpb) this.j.b()).a()) {
            return ((aurx) this.b.b()).r().h(new ejvr() { // from class: achm
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    acho achoVar = this.a;
                    aurw aurwVar = ((aurx) achoVar.b.b()).m;
                    if (aurw.f((auml) obj)) {
                        ekrw ekrwVarE2 = acho.a.e();
                        ekrwVarE2.X(eksq.a, "BugleGDitto");
                        ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "shouldShowGaiaPairingPromo", 128, "GaiaPairingUtilsImpl.java")).q("NO_SHOW, Fi sync is enabled");
                        return achj.NO_SHOW;
                    }
                    if (!((abjz) achoVar.c.b()).a()) {
                        return achoVar.d();
                    }
                    ekrw ekrwVarE3 = acho.a.e();
                    ekrwVarE3.X(eksq.a, "BugleGDitto");
                    ((ekrd) ((ekrd) ekrwVarE3).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "shouldShowGaiaPairingPromo", 132, "GaiaPairingUtilsImpl.java")).q("NO_SHOW on tablet device");
                    return achj.NO_SHOW;
                }
            }, this.e);
        }
        final eiju eijuVarR = ((aurx) this.b.b()).r();
        final eiju eijuVarB = ((bvll) this.i.b()).b();
        return eijx.k(eijuVarR, eijuVarB).a(new Callable() { // from class: achl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                auml aumlVar = (auml) eork.q(eijuVarR);
                if (!((Boolean) eork.q(eijuVarB)).booleanValue()) {
                    ekrw ekrwVarE2 = acho.a.e();
                    ekrwVarE2.X(eksq.a, "BugleGDitto");
                    ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "shouldShowGaiaPairingPromo", 103, "GaiaPairingUtilsImpl.java")).q("NO_SHOW, device cannot register for gaia pairing");
                    return achj.NO_SHOW;
                }
                acho achoVar = this.a;
                aurw aurwVar = ((aurx) achoVar.b.b()).m;
                if (aurw.f(aumlVar)) {
                    ekrw ekrwVarE3 = acho.a.e();
                    ekrwVarE3.X(eksq.a, "BugleGDitto");
                    ((ekrd) ((ekrd) ekrwVarE3).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "shouldShowGaiaPairingPromo", 110, "GaiaPairingUtilsImpl.java")).q("NO_SHOW, Fi sync is enabled");
                    return achj.NO_SHOW;
                }
                if (!((abjz) achoVar.c.b()).a()) {
                    return achoVar.d();
                }
                ekrw ekrwVarE4 = acho.a.e();
                ekrwVarE4.X(eksq.a, "BugleGDitto");
                ((ekrd) ((ekrd) ekrwVarE4).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "shouldShowGaiaPairingPromo", 114, "GaiaPairingUtilsImpl.java")).q("NO_SHOW on tablet device");
                return achj.NO_SHOW;
            }
        }, this.e);
    }

    @Override // defpackage.achk
    public final void c(efwo efwoVar, egpr egprVar, egps egpsVar) {
        ejwl.b(efwoVar != null, "accountId is not present for onGaiaPromoAllowButtonClicked()");
        egprVar.h(new egpq(eiju.g(((egbf) this.h.b()).c(efwoVar)).h(new ejvr() { // from class: achn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                if (((egbe) obj).b().k.equals("pseudonymous")) {
                    ekrw ekrwVarH = acho.a.h();
                    ekrwVarH.X(eksq.a, "BugleGDitto");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "isGaiaSignedIn", 165, "GaiaPairingUtilsImpl.java")).q("GAIA not signed in, route to ESI launching flow.");
                    return false;
                }
                ekrw ekrwVarH2 = acho.a.h();
                ekrwVarH2.X(eksq.a, "BugleGDitto");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "isGaiaSignedIn", 162, "GaiaPairingUtilsImpl.java")).q("GAIA signed in, launch device pairing page.");
                return true;
            }
        }, this.d)), new egpo(null), egpsVar);
    }

    public final achj d() {
        bvkr bvkrVar = this.f;
        if (bvkrVar.a() == 0) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleGDitto");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "getGaiaPromoStatus", 144, "GaiaPairingUtilsImpl.java")).q("Show gaia promo for new users");
            return achj.SHOW_FOR_NEW_USERS;
        }
        if (bvkrVar.p(Optional.empty())) {
            ekrw ekrwVarE2 = a.e();
            ekrwVarE2.X(eksq.a, "BugleGDitto");
            ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "getGaiaPromoStatus", 150, "GaiaPairingUtilsImpl.java")).q("Skip showing gaia promo");
            return achj.NO_SHOW;
        }
        ekrw ekrwVarE3 = a.e();
        ekrwVarE3.X(eksq.a, "BugleGDitto");
        ((ekrd) ((ekrd) ekrwVarE3).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "getGaiaPromoStatus", 147, "GaiaPairingUtilsImpl.java")).q("Show gaia promo for existing qr paired users.");
        return achj.SHOW_FOR_EXISTING_QR_PAIRED_USERS;
    }
}
