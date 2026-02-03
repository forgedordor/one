package defpackage;

import com.google.android.apps.messaging.R;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daut implements dauj {
    public static final egyj a = new egyb("WELCOME_FLOW_V1_DATA");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/welcome/v1/WelcomeFlowV1EntryPointImpl");
    public final fdjx c;
    public final efwo d;
    public final ea e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;

    public daut(fdjx fdjxVar, efwo efwoVar, ea eaVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
        fdjxVar.getClass();
        efwoVar.getClass();
        fcsuVar.getClass();
        fcsuVar3.getClass();
        fcsuVar9.getClass();
        this.c = fdjxVar;
        this.d = efwoVar;
        this.e = eaVar;
        this.f = fcsuVar;
        this.l = fcsuVar2;
        this.m = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.n = fcsuVar6;
        this.i = fcsuVar7;
        this.j = fcsuVar8;
        this.k = fcsuVar9;
    }

    @Override // defpackage.dauj
    public final void a(Callable callable) {
        ((ehbb) this.l.b()).g(R.id.welcome_flow_v1_launch_local_subscription, new daup(this), new daus(callable, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dauq
            if (r0 == 0) goto L13
            r0 = r6
            dauq r0 = (defpackage.dauq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dauq r0 = new dauq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L57
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fcsu r6 = r5.n
            java.lang.Object r6 = r6.b()
            egyt r6 = (defpackage.egyt) r6
            fcsu r2 = r5.m
            java.lang.Object r2 = r2.b()
            egbf r2 = (defpackage.egbf) r2
            egyi r2 = r2.b()
            egzr r4 = defpackage.egzr.FEW_SECONDS
            com.google.common.util.concurrent.ListenableFuture r6 = r6.a(r2, r4)
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto L8f
        L57:
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L6c
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6c
        L6a:
            r3 = r1
            goto L8a
        L6c:
            java.util.Iterator r6 = r6.iterator()
        L70:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r6.next()
            egbe r0 = (defpackage.egbe) r0
            egbs r0 = r0.b()
            java.lang.String r0 = r0.k
            java.lang.String r2 = "google"
            boolean r0 = defpackage.fdbq.f(r0, r2)
            if (r0 == 0) goto L70
        L8a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.daut.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.daur
            if (r0 == 0) goto L13
            r0 = r5
            daur r0 = (defpackage.daur) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            daur r0 = new daur
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fcsu r5 = r4.m
            java.lang.Object r5 = r5.b()
            egbf r5 = (defpackage.egbf) r5
            efwo r2 = r4.d
            com.google.common.util.concurrent.ListenableFuture r5 = r5.c(r2)
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            egbe r5 = (defpackage.egbe) r5
            egbs r5 = r5.b()
            java.lang.String r5 = r5.k
            java.lang.String r0 = "pseudonymous"
            boolean r5 = defpackage.fdbq.f(r5, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.daut.c(fcxy):java.lang.Object");
    }
}
