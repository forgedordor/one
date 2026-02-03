package defpackage;

import android.app.Notification;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axkm implements egbu {
    public static final cqce a = cqce.g("BugleCms", "LinkedAccountCleanupInterceptor");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final eosc e;
    public final eosc f;
    private final fcsu g;
    private final fcsu h;

    public axkm(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, eosc eoscVar, eosc eoscVar2) {
        this.b = fcsuVar;
        this.g = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.h = fcsuVar5;
        this.e = eoscVar;
        this.f = eoscVar2;
    }

    public final eiju a(egbv egbvVar) {
        a.p("Disable CMS feature as the account is removed the device.");
        return (cpyl.a() ? ((cpmi) this.g.b()).c(((egdc) egbvVar).a, 3) : ((cpmi) this.g.b()).d(((egdc) egbvVar).a, 5, 3)).h(new ejvr() { // from class: axki
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((cgbn) this.a.d.b()).m();
                return null;
            }
        }, this.f);
    }

    @Override // defpackage.egbu
    public final ListenableFuture b(final egbv egbvVar) {
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Clean up account");
        egdc egdcVar = (egdc) egbvVar;
        cqbdVarC.A("accountId", egdcVar.a);
        cqbdVarC.M("displayId", egdcVar.b.g);
        cqbdVarC.r();
        eiju eijuVarI = ((aurx) this.c.b()).k().i(new eooz() { // from class: axkh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final axkm axkmVar = this.a;
                aumq aumqVar = (aumq) obj;
                if (cpyl.a()) {
                    aurw aurwVar = ((aurx) axkmVar.c.b()).m;
                    if (!aurw.g(aumqVar)) {
                        axkm.a.p("The CMS feature is off, ignore the account removed event.");
                        return eijx.e(null);
                    }
                }
                if (!cpyl.a() && !aumqVar.e) {
                    axkm.a.p("enable_cms_bnr_settings flag off. The MultiDevice feature is off, ignore the account removed event.");
                    return eijx.e(null);
                }
                final egbv egbvVar2 = egbvVar;
                eiju eijuVarA = ((axky) axkmVar.b.b()).a();
                eooz eoozVar = new eooz() { // from class: axkj
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        egbv egbvVar3 = egbvVar2;
                        if (!((efwo) obj2).equals(((egdc) egbvVar3).a)) {
                            axkm.a.p("The account removed is not the CMS linked account. Ignore the account removed event.");
                            return eijx.e(null);
                        }
                        axkm axkmVar2 = axkmVar;
                        axkm.a.p("The account removed is the CMS linked account.");
                        return axkmVar2.a(egbvVar3);
                    }
                };
                eosc eoscVar = axkmVar.e;
                return eijuVarA.i(eoozVar, eoscVar).f(egdj.class, new eooz() { // from class: axkk
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        axkm.a.p("Linked account is invalid.");
                        return axkmVar.a(egbvVar2);
                    }
                }, eoscVar).e(axlg.class, new ejvr() { // from class: axkl
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        axkm.a.r("No linked account.");
                        return null;
                    }
                }, axkmVar.f);
            }
        }, this.e);
        Notification notificationB = ((cgbn) this.d.b()).b();
        if (notificationB == null) {
            return eijuVarI;
        }
        ((egoc) this.h.b()).i(eijuVarI, notificationB);
        return eijx.e(null);
    }
}
