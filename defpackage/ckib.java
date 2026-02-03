package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckib implements egsc {
    public static final Duration a;
    public static final cqce b;
    public final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final eosd f;
    private final eosc g;
    private final fcsu h;
    private final eosc i;

    static {
        Duration durationOfDays = Duration.ofDays(7L);
        a = durationOfDays;
        cdag.f(cdag.b, "revoke_consent_worker_initial_delay_minutes", durationOfDays.toMinutes());
        b = cqce.g("BugleRcsProvisioning", "RevokeGoogleToSConsentWorker");
    }

    public ckib(fcsu fcsuVar, fcsu fcsuVar2, eosd eosdVar, eosc eoscVar, fcsu fcsuVar3, fcsu fcsuVar4, eosc eoscVar2) {
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = eosdVar;
        this.g = eoscVar;
        this.c = fcsuVar3;
        this.h = fcsuVar4;
        this.i = eoscVar2;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(WorkerParameters workerParameters) {
        eiju eijuVarE;
        boolean zH = workerParameters.b.h("is_disabled_by_user");
        final boolean z = false;
        if (dfpi.M()) {
            if (zH) {
                eijuVarE = eijx.g(new Callable() { // from class: ckhz
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z2 = false;
                        if (dfpi.M() && ((cjzq) this.a.c.b()).a().equals(ckbz.TOGGLE_STATE_USER_DISABLED)) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                }, this.i);
                z = true;
            } else {
                eijuVarE = eijx.e(Boolean.valueOf(((dgjp) this.e.b()).a() == cjqp.GOOGLE_TOS_DECLINED));
            }
            return eijuVarE.i(new eooz() { // from class: ckia
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return this.a.d(z, ((Boolean) obj).booleanValue());
                }
            }, this.i);
        }
        if (zH) {
            if (!dfpi.M() || ((chvg) this.h.b()).d()) {
                z = false;
                z = true;
            } else {
                z = true;
            }
        } else if (((dgjp) this.e.b()).a() != cjqp.GOOGLE_TOS_DECLINED) {
            z = false;
        }
        return d(z, z);
    }

    public final eiju d(boolean z, boolean z2) {
        if (z2) {
            return eiju.g(((dgjo) this.d.b()).c(ewri.REVOKE_CONSENT_FROM_SETTINGS, z)).h(new ejvr() { // from class: ckhx
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ckib.b.m("revokeConsent successfully");
                    return new qao();
                }
            }, this.g).e(Exception.class, new ejvr() { // from class: ckhy
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ckib.b.s("revokeConsent failed", (Exception) obj);
                    return new qan();
                }
            }, this.f);
        }
        b.m(a.r(z, "Skip RevokeGoogleConsentWorker, isDisabledByUser ="));
        return eijx.e(new qao());
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}
