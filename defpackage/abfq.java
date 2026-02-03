package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfq implements cdbu {
    public static final eksp a = eksp.c("BugleSatelliteBg");
    public final ains b;
    public final aboe c;
    public final abpk d;
    public final eosc e;
    public final abdy f;
    public final fcsu g;
    private final cdbq h;
    private final fcsu i;

    public abfq(ains ainsVar, cdbq cdbqVar, fcsu fcsuVar, aboe aboeVar, abpk abpkVar, eosc eoscVar, abdy abdyVar, fcsu fcsuVar2) {
        this.b = ainsVar;
        this.h = cdbqVar;
        this.i = fcsuVar;
        this.c = aboeVar;
        this.d = abpkVar;
        this.e = eoscVar;
        this.f = abdyVar;
        this.g = fcsuVar2;
    }

    private final eiju d(final abou abouVar) {
        if (!this.d.h(abouVar)) {
            return eijx.e(epoq.UNKNOWN);
        }
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteTachyonTickleHandler", "checkDittoHealthForHostType", 228, "SatelliteTachyonTickleHandler.java")).t("Querying %s Ditto for Health Status", abouVar);
        abod abodVarA = this.c.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        abodVarA.b = 500L;
        abodVarA.c = timeUnit;
        abodVarA.d = false;
        eppg eppgVar = (eppg) eppi.a.createBuilder();
        evrl evrlVar = evrl.a;
        eppgVar.copyOnWrite();
        eppi eppiVar = (eppi) eppgVar.instance;
        evrlVar.getClass();
        eppiVar.c = evrlVar;
        eppiVar.b = 209;
        eiju eijuVarB = abodVarA.b(abouVar, (eppi) eppgVar.build());
        ejvr ejvrVar = new ejvr() { // from class: abfh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eppl epplVar = (eppl) obj;
                eksp ekspVar = abfq.a;
                int i = (epplVar.b == 209 ? (epor) epplVar.c : epor.a).b;
                epoq epoqVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : epoq.INCOMING_CHANNEL_DISCONNECTED : epoq.INCOMING_CHANNEL_CONNECTED : epoq.NOT_AUTHENTICATED : epoq.UNKNOWN;
                return epoqVar == null ? epoq.UNRECOGNIZED : epoqVar;
            }
        };
        eosc eoscVar = this.e;
        return eijuVarB.h(ejvrVar, eoscVar).e(abpv.class, new ejvr() { // from class: abfi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((eksl) ((eksl) ((eksl) abfq.a.j()).g((abpv) obj)).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteTachyonTickleHandler", "checkDittoHealthForHostType", 246, "SatelliteTachyonTickleHandler.java")).t("Could not query %s ditto health; channel not open", abouVar);
                return epoq.UNKNOWN;
            }
        }, eoscVar).e(abob.class, new ejvr() { // from class: abfj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((eksl) ((eksl) ((eksl) abfq.a.j()).g((abob) obj)).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteTachyonTickleHandler", "checkDittoHealthForHostType", 254, "SatelliteTachyonTickleHandler.java")).t("Could not query %s ditto health; did not receive any response", abouVar);
                return epoq.INCOMING_CHANNEL_DISCONNECTED;
            }
        }, eoscVar);
    }

    @Override // defpackage.cdbu
    public final eiju a() {
        if (((abjz) this.i.b()).a()) {
            return this.h.a().i(new eooz() { // from class: abfe
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    String str = (String) obj;
                    if (str == null) {
                        return eijx.e(null);
                    }
                    abfq abfqVar = this.a;
                    if (!abfqVar.d.g()) {
                        return abfqVar.f.b().h(new ejvr() { // from class: abfo
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                eksp ekspVar = abfq.a;
                                return null;
                            }
                        }, abfqVar.e);
                    }
                    abod abodVarA = abfqVar.c.a();
                    abodVarA.d = false;
                    abou abouVar = abou.AGNOSTIC;
                    eppg eppgVar = (eppg) eppi.a.createBuilder();
                    epqa epqaVar = (epqa) epqb.a.createBuilder();
                    epqaVar.copyOnWrite();
                    ((epqb) epqaVar.instance).b = str;
                    eppgVar.copyOnWrite();
                    eppi eppiVar = (eppi) eppgVar.instance;
                    epqb epqbVar = (epqb) epqaVar.build();
                    epqbVar.getClass();
                    eppiVar.c = epqbVar;
                    eppiVar.b = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
                    return abodVarA.a(abouVar, (eppi) eppgVar.build()).h(new ejvr() { // from class: abfn
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eksp ekspVar = abfq.a;
                            return null;
                        }
                    }, abfqVar.e);
                }
            }, this.e);
        }
        ((eksl) a.n().h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteTachyonTickleHandler", "refreshToken", 174, "SatelliteTachyonTickleHandler.java")).q("Skipped token refreshing. Ditto satellite is not enabled.");
        return eijx.e(null);
    }

    @Override // defpackage.cdbu
    public final void b(long j) {
        this.b.e("Bugle.Fcm.Tickle.Downgrade.Counts", cdbs.a(5));
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteTachyonTickleHandler", "onFirebaseMessagePriorityDowngraded", 168, "SatelliteTachyonTickleHandler.java")).q("Satellite FCM message priority downgraded.");
    }

    @Override // defpackage.cdbu
    public final void c(ezol ezolVar, final String str, int i, int i2, int i3) {
        if (!((abjz) this.i.b()).a()) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteTachyonTickleHandler", "onTickleReceived", 83, "SatelliteTachyonTickleHandler.java")).q("Skipped tickle. Ditto satellite is not enabled.");
            return;
        }
        ((abdl) this.g.b()).b(str, i2, i);
        final eiju eijuVarD = d(abou.FOREGROUND);
        final eiju eijuVarD2 = d(abou.BACKGROUND);
        eijw eijwVarM = eijx.m(eijuVarD, eijuVarD2);
        Callable callable = new Callable() { // from class: abfk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eksp ekspVar = abfq.a;
                return ekgp.m(abou.FOREGROUND, (epoq) eork.q(eijuVarD), abou.BACKGROUND, (epoq) eork.q(eijuVarD2));
            }
        };
        eosc eoscVar = this.e;
        eijwVarM.a(callable, eoscVar).i(new eooz() { // from class: abfp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Map map = (Map) obj;
                epoq epoqVar = (epoq) map.get(abou.BACKGROUND);
                epoqVar.getClass();
                boolean z = true;
                if (!epoqVar.equals(epoq.INCOMING_CHANNEL_DISCONNECTED) && !epoqVar.equals(epoq.NOT_AUTHENTICATED)) {
                    z = false;
                }
                Boolean.valueOf(z).getClass();
                if (!z) {
                    return eijx.e(map);
                }
                abfq abfqVar = this.a;
                return abfqVar.f.c().h(new ejvr() { // from class: abfm
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        eksp ekspVar = abfq.a;
                        return map;
                    }
                }, abfqVar.e);
            }
        }, eoscVar).h(new ejvr() { // from class: abff
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Map map = (Map) obj;
                epoq epoqVar = (epoq) map.get(abou.FOREGROUND);
                epoqVar.getClass();
                epoq epoqVar2 = (epoq) map.get(abou.BACKGROUND);
                epoqVar2.getClass();
                if (epoqVar2.equals(epoq.NOT_AUTHENTICATED)) {
                    ((eksl) ((eksl) abfq.a.j()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteTachyonTickleHandler", "checkIfExistingDittoCanHandleRequest", 125, "SatelliteTachyonTickleHandler.java")).q("Background worker was open but not authenticated");
                }
                String str2 = str;
                abfq abfqVar = this.a;
                epoq epoqVar3 = epoq.INCOMING_CHANNEL_CONNECTED;
                if (epoqVar.equals(epoqVar3)) {
                    ((abdl) abfqVar.g.b()).l(str2);
                    return true;
                }
                if (epoqVar2.equals(epoqVar3)) {
                    ((abdl) abfqVar.g.b()).k(str2);
                    return true;
                }
                if (map.containsValue(epoq.INCOMING_CHANNEL_DISCONNECTED)) {
                    ((abdl) abfqVar.g.b()).c(str2);
                }
                return false;
            }
        }, eoscVar).h(new ejvr() { // from class: abfg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                String str2 = str;
                final abfq abfqVar = this.a;
                ((eksl) ((eksl) abfq.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteTachyonTickleHandler", "startNewBackgroundHandler", 143, "SatelliteTachyonTickleHandler.java")).q("Starting the background script in response to an FCM tickle.");
                ((abdl) abfqVar.g.b()).a(str2);
                eiju eijuVarD3 = abfqVar.f.d();
                ejvr ejvrVar = new ejvr() { // from class: abfl
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        if (((Boolean) obj2).booleanValue()) {
                            return null;
                        }
                        abfqVar.b.c("Bugle.Satellite.Tickle.CouldNotStartBackgroundHandler");
                        ((eksl) ((eksl) abfq.a.j()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteTachyonTickleHandler", "startNewBackgroundHandler", 152, "SatelliteTachyonTickleHandler.java")).q("Could not start the background handler in response to an FCM tickle. This may result in missing messages.");
                        return null;
                    }
                };
                eosc eoscVar2 = abfqVar.e;
                eijuVarD3.h(ejvrVar, eoscVar2).k(auvh.b(), eoscVar2);
                return null;
            }
        }, eoscVar).k(auvh.b(), eoscVar);
    }
}
