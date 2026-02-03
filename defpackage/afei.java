package defpackage;

import com.google.android.apps.messaging.lighterconversation.LaunchLighterConversationActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afei implements efzm {
    public final LaunchLighterConversationActivity c;
    public final fcsu d;
    public final fcsu e;
    public final Optional f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public boolean j = false;
    public boolean k = false;
    public int l = 1;
    private final efxf o;
    private final fcsu p;
    private static final dzfh m = new dzfh("LaunchLighterConversationActivity_ESI");
    private static final dzfh n = new dzfh("LaunchLighterConversationActivity");
    public static final dzfh a = new dzfh("LaunchLighterConversationActivity_noAccount");
    public static final cqce b = cqce.g("Lighter", "LaunchLighterConversationActivity");

    public afei(LaunchLighterConversationActivity launchLighterConversationActivity, efxf efxfVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8) {
        this.c = launchLighterConversationActivity;
        this.o = efxfVar;
        this.d = fcsuVar;
        this.e = fcsuVar3;
        this.f = (Optional) fcsuVar4.b();
        this.g = fcsuVar5;
        this.p = fcsuVar6;
        this.h = fcsuVar7;
        this.i = fcsuVar8;
        if (cdpn.a()) {
            egap egapVarF = egaq.f(launchLighterConversationActivity);
            egapVarF.d(cdqr.class);
            egapVarF.d(acbm.class);
            efxfVar.g(egapVarF.a());
            efxfVar.e(this);
            efxfVar.e(new egkb(((cdqr) fcsuVar2.b()).a));
            if (((Boolean) fcsuVar7.b()).booleanValue()) {
                return;
            }
            dztc.a.d(n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    @Override // defpackage.efzm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.efzk r8) {
        /*
            r7 = this;
            com.google.android.apps.messaging.lighterconversation.LaunchLighterConversationActivity r0 = r7.c
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r2 = "use_default_account_selector"
            r3 = 0
            boolean r1 = r1.getBooleanExtra(r2, r3)
            fcsu r4 = r7.h
            java.lang.Object r4 = r4.b()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L27
            dztc r4 = defpackage.dztc.a
            if (r1 == 0) goto L22
            dzfh r1 = defpackage.afei.n
            goto L24
        L22:
            dzfh r1 = defpackage.afei.m
        L24:
            r4.d(r1)
        L27:
            android.content.Intent r1 = r0.getIntent()
            r1.removeExtra(r2)
            android.content.Intent r1 = r0.getIntent()
            if (r1 != 0) goto L3f
            cqce r8 = defpackage.afei.b
            java.lang.String r1 = "intent is null."
            r8.r(r1)
            r0.finish()
            return
        L3f:
            java.lang.String r2 = r1.getAction()
            if (r2 != 0) goto L50
            cqce r8 = defpackage.afei.b
            java.lang.String r1 = "intent action is null."
            r8.r(r1)
            r0.finish()
            return
        L50:
            int r4 = r2.hashCode()
            r5 = -1908079756(0xffffffff8e450374, float:-2.4283787E-30)
            r6 = 1
            if (r4 == r5) goto L6a
            r3 = 2634405(0x2832a5, float:3.691588E-39)
            if (r4 == r3) goto L60
            goto L73
        L60:
            java.lang.String r3 = "VIEW"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L73
            r3 = r6
            goto L74
        L6a:
            java.lang.String r4 = "com.google.business.ACTION_INITIATE_BUSINESS_CHAT"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L73
            goto L74
        L73:
            r3 = -1
        L74:
            if (r3 == 0) goto L7c
            if (r3 == r6) goto L7c
            r0.finish()
            return
        L7c:
            fcsu r3 = r7.p
            java.lang.Object r3 = r3.b()
            ajfo r3 = (defpackage.ajfo) r3
            dzfh r4 = defpackage.ajfo.A
            r3.d(r4)
            efwo r8 = r8.a()
            j$.util.Optional r3 = r7.f
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto La0
            cqce r8 = defpackage.afei.b
            java.lang.String r1 = "finish activity, no account is present"
            r8.r(r1)
            r0.finish()
            return
        La0:
            cqce r0 = defpackage.afei.b
            java.lang.String r4 = "Checking capability for account"
            r0.m(r4)
            java.lang.Object r0 = r3.get()
            cdpy r0 = (defpackage.cdpy) r0
            eiju r0 = r0.b(r8)
            afef r3 = new afef
            r3.<init>()
            fcsu r8 = r7.g
            java.lang.Object r8 = r8.b()
            java.util.concurrent.Executor r8 = (java.util.concurrent.Executor) r8
            eiju r8 = r0.i(r3, r8)
            defpackage.auvh.h(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afei.a(efzk):void");
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        if (!(efygVar instanceof efyn)) {
            throw new IllegalStateException("Failed to get valid account.", efygVar);
        }
        this.k = true;
    }

    public final void e(String str) {
        this.c.getIntent().putExtra("LAUNCH_CONTEXT", str);
        ecem.e(eiid.k(new Runnable() { // from class: afed
            @Override // java.lang.Runnable
            public final void run() {
                afei afeiVar = this.a;
                if (((lvn) afeiVar.c.P()).c == lvb.a) {
                    afei.b.r("activity was destroyed after posting on UI thread.");
                } else {
                    afeiVar.f();
                }
            }
        }));
    }

    public final void f() {
        b.m("Launching Lighter ExpressSignIn via switchAccountWithSelectors");
        this.o.d(ekgb.r(acbm.class));
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }
}
