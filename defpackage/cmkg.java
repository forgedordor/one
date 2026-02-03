package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.SubscriptionManager;
import com.google.android.apps.messaging.shared.simstatetracker.AsyncTelephonySimStateReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmkg implements cmjz {
    public static final eksp a = eksp.c("BugleSimStateTracker");
    public final Context b;
    public final Executor c;
    public final fdjx d;
    public final fcsu e;
    public final auwp f;
    public final AtomicBoolean g;
    public SubscriptionManager.OnSubscriptionsChangedListener h;
    private final eosc i;
    private final fcsu j;
    private final egpm k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private boolean q;
    private final AtomicBoolean r;

    public cmkg(Context context, Executor executor, eosc eoscVar, fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar, egpm egpmVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        context.getClass();
        executor.getClass();
        eoscVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcsuVar.getClass();
        egpmVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.b = context;
        this.c = executor;
        this.i = eoscVar;
        this.d = fdjxVar2;
        this.j = fcsuVar;
        this.k = egpmVar;
        this.e = fcsuVar2;
        this.l = fcsuVar3;
        this.m = fcsuVar4;
        this.n = fcsuVar5;
        this.o = fcsuVar6;
        this.p = fcsuVar7;
        this.f = new auwp(new eooy() { // from class: cmkb
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                cmkg cmkgVar = this.a;
                return auvw.b(new cmkf(cmkgVar), cmkgVar.d);
            }
        }, eoscVar);
        this.q = true;
        this.g = new AtomicBoolean(false);
        this.r = new AtomicBoolean(false);
    }

    @Override // defpackage.cmjz
    public final void a() {
        a.n().q("Starting SimStateMonitor.");
        this.k.post(new Runnable() { // from class: cmka
            @Override // java.lang.Runnable
            public final void run() throws dhkf {
                cmkg cmkgVar = this.a;
                if (cmkgVar.g.getAndSet(true)) {
                    return;
                }
                cmkgVar.h = new cmke(cmkgVar);
                if (Build.VERSION.SDK_INT >= 30) {
                    dhks dhksVarB = dhks.b(cmkgVar.b);
                    SubscriptionManager.OnSubscriptionsChangedListener onSubscriptionsChangedListener = cmkgVar.h;
                    try {
                        dhksVarB.a.addOnSubscriptionsChangedListener(cmkgVar.c, onSubscriptionsChangedListener);
                    } catch (SecurityException e) {
                        throw new dhkf("READ_PHONE_STATE permission is missing.", e);
                    }
                } else {
                    dhks.b(cmkgVar.b).f(cmkgVar.h);
                }
                cmkg.a.n().q("Registered onSubscriptionsChangedListener.");
            }
        });
        if (!((aqsm) this.o.b()).a()) {
            if (((aqsp) this.p.b()).a()) {
                ((cmlo) this.n.b()).a(1);
            }
        } else {
            if (this.r.getAndSet(true)) {
                return;
            }
            fcsu fcsuVar = this.n;
            ((cmlo) fcsuVar.b()).a(2);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SIM_STATE_CHANGED");
            intentFilter.addAction("android.telephony.action.CARRIER_CONFIG_CHANGED");
            intentFilter.addAction("android.telephony.action.DEFAULT_SUBSCRIPTION_CHANGED");
            intentFilter.addAction("android.telephony.action.DEFAULT_SMS_SUBSCRIPTION_CHANGED");
            Context context = this.b;
            kxj.g(context, new AsyncTelephonySimStateReceiver(), intentFilter);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cmkc
            if (r0 == 0) goto L13
            r0 = r5
            cmkc r0 = (defpackage.cmkc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmkc r0 = new cmkc
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L57
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            boolean r5 = r4.q
            if (r5 == 0) goto L5c
            r5 = 0
            r4.q = r5
            eksp r5 = defpackage.cmkg.a
            ekrw r5 = r5.n()
            java.lang.String r2 = "Update PhoneSimsState on first SIM event."
            r5.q(r2)
            fcsu r5 = r4.j
            java.lang.Object r5 = r5.b()
            cmjl r5 = (defpackage.cmjl) r5
            eoaz r2 = defpackage.eoaz.UPDATE_TRIGGER_APP_START
            r0.c = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L57
            return r1
        L57:
            cmme r5 = (defpackage.cmme) r5
            fctx r5 = defpackage.fctx.a
            return r5
        L5c:
            eksp r5 = defpackage.cmkg.a
            ekrw r5 = r5.n()
            java.lang.String r0 = "Subscriptions changed. Scheduling PhoneSimsStateUpdate."
            r5.q(r0)
            fcsu r5 = r4.m
            java.lang.Object r5 = r5.b()
            cmkh r5 = (defpackage.cmkh) r5
            eoaz r0 = defpackage.eoaz.UPDATE_TRIGGER_SUBSCRIPTIONS_CHANGED
            r5.b(r0)
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmkg.b(fcxy):java.lang.Object");
    }
}
