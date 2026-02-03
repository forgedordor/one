package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.rcsprovisioning.RcsProvisioningListenableWorker;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckhv implements ckhg {
    public static final dhip a = new dhip("provisioning");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningWorkManagerScheduler");
    public static final cczi c = cdag.e(cdag.b, "expeditedApiRetryLimit", 0);
    public final fcsu d;
    private final Context e;
    private final fcsu f;
    private final chzx g;
    private final cqbm h;
    private final eosc i;
    private final fcsu j;
    private final cogw k;
    private final fcsu l;
    private final dhkw m;
    private pzs n;
    private final cmlb o;
    private final eosc p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;

    public ckhv(Context context, fcsu fcsuVar, fcsu fcsuVar2, chzx chzxVar, cqbm cqbmVar, eosc eoscVar, fcsu fcsuVar3, cogw cogwVar, fcsu fcsuVar4, dhkw dhkwVar, cmlb cmlbVar, eosc eoscVar2, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        this.e = context;
        this.f = fcsuVar;
        this.d = fcsuVar2;
        this.g = chzxVar;
        this.h = cqbmVar;
        this.i = eoscVar;
        this.j = fcsuVar3;
        this.k = cogwVar;
        this.l = fcsuVar4;
        this.m = dhkwVar;
        this.o = cmlbVar;
        this.p = eoscVar2;
        this.q = fcsuVar5;
        this.r = fcsuVar6;
        this.s = fcsuVar7;
    }

    private final void o(final String str, final Duration duration, final boolean z, final pzz pzzVar, final enxe enxeVar) {
        auvh.h(eijx.f(new Runnable() { // from class: ckhp
            @Override // java.lang.Runnable
            public final void run() {
                this.a.n(str, duration, z, pzzVar, enxeVar);
            }
        }, this.i));
    }

    @Override // defpackage.ckhg
    public final eiju a(final enxe enxeVar) {
        dhja.k("RcsAvailabilityLogWorkerScheduler is cancelled", new Object[0]);
        auvh.h(eiju.g(((qbb) qbq.a(this.g.a).b("com.google.android.apps.messaging.shared.rcs.availability.metrics.RcsAvailabilityLogWorker")).c));
        return eiju.g(((qbb) qbq.a(this.e).a("provisioning")).c).h(new ejvr() { // from class: ckhu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dhip dhipVar = ckhv.a;
                dhja.k("Cancel All Provisioning work operation result is: %s, trigger is %s", (qay) obj, enxeVar.name());
                return null;
            }
        }, this.i);
    }

    @Override // defpackage.ckhg
    public final eiju b() {
        return eiju.g(((egsh) this.j.b()).a("revoke_google_tos_consent_user_disabled")).h(new ejvr() { // from class: ckht
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((ekrd) ((ekrd) ckhv.b.e()).h("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningWorkManagerScheduler", "cancelAllRevokeGoogleToSConsentTasks", 483, "RcsProvisioningWorkManagerScheduler.java")).q("cancelRevokeGoogleToSConsentTask, for RevokeGoogleToSConsentWorker.revoke_google_tos_consent_user_disabled tag");
                return null;
            }
        }, this.p);
    }

    @Override // defpackage.ckhg
    public final eiju c(final enxe enxeVar) {
        return a(enxeVar).h(new ejvr() { // from class: ckhr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ckhv ckhvVar = this.a;
                ckhvVar.n(((dhes) ckhvVar.d.b()).l(), Duration.ZERO, false, pzz.a, enxeVar);
                return null;
            }
        }, this.i);
    }

    @Override // defpackage.ckhg
    public final eiju d(final dggp dggpVar, final enxe enxeVar) {
        dhja.l(a, "Restart provisioning: %s", enxeVar);
        return a(enxeVar).h(new ejvr() { // from class: ckhs
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Duration duration = Duration.ZERO;
                this.a.n(dggpVar.a, duration, false, pzz.a, enxeVar);
                return null;
            }
        }, this.i);
    }

    @Override // defpackage.ckhg
    public final void e(String str, Duration duration, enxe enxeVar) {
        f(str, duration, false, enxeVar);
    }

    @Override // defpackage.ckhg
    public final void f(String str, Duration duration, boolean z, enxe enxeVar) {
        dhja.k("Scheduled config refresh with %s seconds delay, %s appendIfExists", Long.valueOf(duration.toSeconds()), Boolean.valueOf(z));
        o(str, duration, true, z ? pzz.c : pzz.b, enxeVar);
    }

    @Override // defpackage.ckhg
    public final void g(String str) {
        ((dgrs) this.f.b()).C(str);
        f(str, Duration.ZERO, false, enxe.DEBUG_UTILS);
    }

    @Override // defpackage.ckhg
    public final void h(String str, enxe enxeVar, boolean z) {
        if (dfog.C()) {
            dhja.l(a, "Schedule DisableRcsTask due to trigger = %s, forceDisableThenReprovision = %s", enxeVar.name(), Boolean.valueOf(z));
            egsh egshVar = (egsh) this.j.b();
            int i = ckgn.a;
            pzh pzhVar = new pzh();
            pzhVar.c(2);
            pzj pzjVarA = pzhVar.a();
            pzn pznVar = new pzn();
            pznVar.f("force_disable_then_reprovision", z);
            pznVar.e("sim_id", str);
            pzs pzsVarA = pznVar.a();
            egsj egsjVarN = egsn.n(ckgn.class);
            egsjVarN.d(pzjVarA);
            egrx egrxVar = (egrx) egsjVarN;
            egrxVar.c = new egsa(0L, TimeUnit.SECONDS);
            egsjVarN.g(new egsb("disable_rcs".concat(str), pzy.b));
            egrxVar.e = pzsVarA;
            eiju.g(egshVar.c(egsjVarN.h())).k(auvh.b(), this.i);
        }
    }

    @Override // defpackage.ckhg
    public final void i(String str, String str2, enxe enxeVar) {
        egsh egshVar = (egsh) this.j.b();
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        pzj pzjVarA = pzhVar.a();
        egsj egsjVarN = egsn.n(ckgt.class);
        egsjVarN.d(pzjVarA);
        pzn pznVar = new pzn();
        pznVar.e("sim_id", str);
        egrx egrxVar = (egrx) egsjVarN;
        egrxVar.e = pznVar.a();
        egrxVar.c = new egsa(0L, TimeUnit.SECONDS);
        egsjVarN.g(new egsb("notify_rcs_unavailable".concat(String.valueOf(str)), pzy.b));
        eiju.g(egshVar.c(egsjVarN.h())).k(auvh.b(), this.i);
        ((ekrd) ((ekrd) b.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningWorkManagerScheduler", "scheduleNotifyRcsUnavailableTask", 179, "RcsProvisioningWorkManagerScheduler.java")).D("Scheduling NotifyRcsUnavailable task due to %s, the trigger is %s", str2, enxeVar.name());
    }

    @Override // defpackage.ckhg
    public final void j(enxe enxeVar) {
        k(((dhes) this.d.b()).l(), enxeVar);
    }

    @Override // defpackage.ckhg
    public final void k(String str, enxe enxeVar) {
        if (enxeVar.equals(enxe.REPROVISIONING_CAMPAIGN) || enxeVar.equals(enxe.FI_ACTIVATION_COMPLETE)) {
            m(str, Duration.ZERO, 2, enxeVar);
        } else {
            m(str, Duration.ZERO, 1, enxeVar);
        }
    }

    @Override // defpackage.ckhg
    public final void l(boolean z, enxe enxeVar) {
        egsn egsnVarH;
        dhja.c("RevokeGoogleConsentTask scheduled, isDisabled = %s, trigger = %s", Boolean.valueOf(z), enxeVar.name());
        egsh egshVar = (egsh) this.j.b();
        Duration duration = ckib.a;
        pzn pznVar = new pzn();
        pznVar.f("is_disabled_by_user", z);
        pzs pzsVarA = pznVar.a();
        if (z && dfpi.M()) {
            egsj egsjVarN = egsn.n(ckib.class);
            pzh pzhVar = new pzh();
            pzhVar.c(2);
            egsjVarN.d(pzhVar.a());
            egrx egrxVar = (egrx) egsjVarN;
            egrxVar.c = new egsa(((Long) dfpi.t().a.an.a()).longValue(), TimeUnit.MINUTES);
            egsjVarN.g(new egsb("revoke_google_tos_consent_user_disabled", pzy.b));
            egrxVar.e = pzsVarA;
            egsnVarH = egsjVarN.h();
        } else {
            egsj egsjVarN2 = egsn.n(ckib.class);
            pzh pzhVar2 = new pzh();
            pzhVar2.c(2);
            egsjVarN2.d(pzhVar2.a());
            egrx egrxVar2 = (egrx) egsjVarN2;
            egrxVar2.c = new egsa(0L, TimeUnit.SECONDS);
            egsjVarN2.g(new egsb("revoke_google_tos_consent", pzy.b));
            egrxVar2.e = pzsVarA;
            egsnVarH = egsjVarN2.h();
        }
        eiju.g(egshVar.c(egsnVarH)).k(auvh.b(), this.i);
    }

    @Override // defpackage.ckhg
    public final void m(String str, Duration duration, int i, enxe enxeVar) {
        int i2 = i - 1;
        o(str, duration, false, i2 != 1 ? i2 != 2 ? pzz.b : pzz.c : pzz.a, enxeVar);
    }

    public final void n(String str, Duration duration, boolean z, pzz pzzVar, enxe enxeVar) {
        char c2;
        char c3;
        String strConcat;
        String strL = str;
        dggp dggpVar = new dggp(strL);
        String str2 = dggpVar.a;
        dggp dggpVar2 = new dggp(str2);
        cmlb cmlbVar = this.o;
        Integer num = (Integer) cmlbVar.j(dggpVar2).map(new Function() { // from class: ckhq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((cmmh) obj).d);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(-1);
        int iIntValue = num.intValue();
        dhki dhkiVarA = this.m.a(iIntValue);
        if (!Objects.equals(dhkiVarA, dhki.DUAL_REG)) {
            dhja.l(a, "Skipping DR provisioning scheduling, sipConnectionType:%s subId: %d", dhkiVarA.name(), num);
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            dggpVar = new dggp(((dhes) this.d.b()).l());
        }
        if (dfog.C()) {
            this.g.a();
        }
        if (!dfog.C()) {
            dhja.l(a, "Provisioning task in Bugle is disabled by P/H flag", new Object[0]);
            return;
        }
        if (!z && ((dgrs) this.f.b()).f(dggpVar.a).ab()) {
            if (enxeVar.equals(enxe.FI_ACTIVATION_COMPLETE) && craf.h) {
                ckje.b(this.e, 4, iIntValue);
            }
            dhja.l(a, "Skipping full provisioning scheduling since we already have valid and updated RCS configuration", new Object[0]);
            return;
        }
        if (new dgid(((chza) this.h.a()).v(dggpVar)).d()) {
            if (enxeVar.equals(enxe.FI_ACTIVATION_COMPLETE) && craf.h) {
                ckje.b(this.e, 3, iIntValue);
            }
            dhja.l(a, "Skipping provisioning scheduling since RCS is disabled", new Object[0]);
            return;
        }
        if (enxeVar.equals(enxe.FI_ACTIVATION_COMPLETE) && craf.h) {
            ckje.b(this.e, 2, iIntValue);
        }
        if (TextUtils.isEmpty(strL)) {
            strL = ((dhes) this.d.b()).l();
        }
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        pzj pzjVarA = pzhVar.a();
        qau qauVar = new qau(RcsProvisioningListenableWorker.class);
        if (((aruh) this.s.b()).a()) {
            String str3 = true == enxeVar.equals(enxe.DEBUG_UTILS) ? "debugprovisioning" : "provisioning";
            qauVar.g(pzjVarA);
            qauVar.i(duration);
            c2 = 4;
            c3 = 3;
            qauVar.f(pza.a, ((Integer) ckgl.b.e()).intValue(), TimeUnit.SECONDS);
            qauVar.d(str3);
        } else {
            c2 = 4;
            c3 = 3;
            qauVar.g(pzjVarA);
            qauVar.i(duration);
            qauVar.f(pza.a, ((Integer) ckgl.b.e()).intValue(), TimeUnit.SECONDS);
            qauVar.d("provisioning");
        }
        String string = UUID.randomUUID().toString();
        cmmb cmmbVarA = cmlbVar.a();
        if (!((apwv) this.q.b()).a() && !strL.equals(cmmbVarA.c)) {
            try {
                throw new IllegalArgumentException("Submitting provisioning task for non-default system SIM.");
            } catch (IllegalArgumentException e) {
                ((ekrd) ((ekrd) ((ekrd) b.j()).g(e)).h("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningWorkManagerScheduler", "submitProvisioningTask", (char) 541, "RcsProvisioningWorkManagerScheduler.java")).q("RcsProvisioningWorkManagerScheduler: Submitting provisioning task for non-default system SIM.");
            }
        }
        pzn pznVar = new pzn();
        pznVar.h("scheduled_time_sec", this.k.f().plus(duration).getEpochSecond());
        pznVar.f("is_config_refresh", z);
        pznVar.g("trigger_event", enxeVar.ab);
        pznVar.e("worker_id", string);
        pznVar.e("rcs_provisioning_id", strL);
        pznVar.f("use_sim_subscription_info", true);
        pzs pzsVarA = pznVar.a();
        this.n = pzsVarA;
        qauVar.j(pzsVarA);
        if (((ckhw) this.l.b()).a(strL) < ((Integer) c.e()).intValue()) {
            qauVar.c(qbf.a);
        }
        if (((aruh) this.s.b()).a() && enxeVar.equals(enxe.DEBUG_UTILS)) {
            strConcat = "debugprovisioning_" + strL + "_" + String.valueOf(UUID.randomUUID());
        } else {
            strConcat = "provisioning_".concat(String.valueOf(strL));
        }
        dhip dhipVar = a;
        Long lValueOf = Long.valueOf(duration.toSeconds());
        String strName = enxeVar.name();
        String strC = dhiz.SIM_ID.c(strL);
        Object[] objArr = new Object[5];
        objArr[0] = lValueOf;
        objArr[1] = pzzVar;
        objArr[2] = strName;
        objArr[c3] = string;
        objArr[c2] = strC;
        dhja.l(dhipVar, "Scheduled provisioning task with %s seconds delay, %s policy, trigger is %s, workerId is %s, simId is %s", objArr);
        qbq.a(this.e).j(strConcat, pzzVar, (qav) qauVar.b()).a();
    }
}
