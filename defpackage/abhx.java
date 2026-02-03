package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhx implements efzm {
    public static final eksp a = eksp.c("BugleDittoSatellite");
    public final eosc b;
    public final abfv c;
    public final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final egej g;

    public abhx(fcsu fcsuVar, fcsu fcsuVar2, egej egejVar, eosc eoscVar, abfv abfvVar, fcsu fcsuVar3) {
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = egejVar;
        this.b = eoscVar;
        this.c = abfvVar;
        this.d = fcsuVar3;
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        final efwo efwoVarA = efzkVar.a();
        final String strB = efzkVar.b();
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/dittosatellite/gaia/SatelliteAccountCallbacks", "onAccountChanged", 70, "SatelliteAccountCallbacks.java")).D("Account has changed. accountId: %s, type: %s", efwoVarA, strB);
        eiju eijuVarG = eiju.g(this.g.b(efwoVarA));
        ejvr ejvrVar = new ejvr() { // from class: abhs
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Optional.ofNullable((String) obj);
            }
        };
        eosc eoscVar = this.b;
        eiju eijuVarH = eijuVarG.h(ejvrVar, eoscVar);
        final abfv abfvVar = this.c;
        abfvVar.getClass();
        eijuVarH.i(new eooz() { // from class: abht
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return abfvVar.h((Optional) obj);
            }
        }, eoscVar).i(new eooz() { // from class: abhu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return eijx.e(false);
                }
                efwo efwoVar = efwoVarA;
                fcsu fcsuVar = this.a.d;
                ((abic) fcsuVar.b()).b();
                return (efwoVar == null || strB.equals("pseudonymous")) ? eijx.e(false) : ((abic) fcsuVar.b()).a(efwoVar);
            }
        }, eoscVar).i(new eooz() { // from class: abhv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                abhx abhxVar = this.a;
                if (zBooleanValue) {
                    return abhxVar.c.i(abft.PAIRING);
                }
                if (strB.equals("pseudonymous")) {
                    abhxVar.c.i(abft.REMOVE_PAIRING).k(auvh.b(), abhxVar.b);
                }
                return eijx.e(null);
            }
        }, eoscVar).h(new ejvr() { // from class: abhw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((eksl) ((eksl) abhx.a.h()).h("com/google/android/apps/messaging/dittosatellite/gaia/SatelliteAccountCallbacks", "onAccountChanged", 106, "SatelliteAccountCallbacks.java")).t("Finished saving account, accountId: %s", efwoVarA);
                return null;
            }
        }, eoscVar).k(auvh.b(), eoscVar);
    }

    @Override // defpackage.efzm
    public final void b() {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/dittosatellite/gaia/SatelliteAccountCallbacks", "onAccountLoading", 57, "SatelliteAccountCallbacks.java")).q("onAccountLoading");
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        ((eksl) ((eksl) ((eksl) a.j()).g(efygVar)).h("com/google/android/apps/messaging/dittosatellite/gaia/SatelliteAccountCallbacks", "onNoAccountAvailable", 'y', "SatelliteAccountCallbacks.java")).q("onNoAccountAvailable: Could not load the selected Ditto Satellite GAIA account");
        if (((Boolean) this.f.b()).booleanValue()) {
            this.c.i(abft.REMOVE_PAIRING).k(auvh.b(), this.b);
            ((abxv) this.e.b()).a(efygVar);
        }
    }

    @Override // defpackage.efzm
    public final void d() {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/dittosatellite/gaia/SatelliteAccountCallbacks", "onActivityAccountReady", 116, "SatelliteAccountCallbacks.java")).q("onActivityAccountReady");
    }
}
