package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aixu implements aixr {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/analytics/rcs/RcsCujDataLoggerImpl");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final AtomicBoolean g;

    public aixu(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (r7 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.aixr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.aixt
            if (r0 == 0) goto L13
            r0 = r8
            aixt r0 = (defpackage.aixt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aixt r0 = new aixt
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r8)
            goto L8c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.fctl.b(r8)
            goto L70
        L39:
            int r7 = r0.d
            defpackage.fctl.b(r8)
            goto L54
        L3f:
            defpackage.fctl.b(r8)
            fcsu r8 = r6.e
            java.lang.Object r8 = r8.b()
            aixx r8 = (defpackage.aixx) r8
            r0.d = r7
            r0.c = r5
            java.lang.Object r8 = r8.a(r0)
            if (r8 == r1) goto Laa
        L54:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5d
            goto La7
        L5d:
            java.util.concurrent.atomic.AtomicBoolean r8 = r6.g
            boolean r8 = r8.getAndSet(r5)
            if (r8 != 0) goto La7
            r8 = 0
            r0.d = r8
            r0.c = r4
            java.lang.Object r7 = r6.b(r7, r0)
            if (r7 == r1) goto Laa
        L70:
            fcsu r7 = r6.e
            java.lang.Object r7 = r7.b()
            aixx r7 = (defpackage.aixx) r7
            r0.c = r3
            lkb r7 = r7.a
            aixw r8 = new aixw
            r2 = 0
            r8.<init>(r2)
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 == r1) goto L8a
            fctx r7 = defpackage.fctx.a
        L8a:
            if (r7 == r1) goto Laa
        L8c:
            ekrg r7 = defpackage.aixu.a
            java.util.logging.Level r8 = java.util.logging.Level.INFO
            ekrd r7 = r7.a(r8)
            r8 = 49
            java.lang.String r0 = "RcsCujDataLoggerImpl.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/analytics/rcs/RcsCujDataLoggerImpl"
            java.lang.String r2 = "logRcsAvailabilityForAllSimsIfNotLoggedBefore"
            ekrw r7 = r7.h(r1, r2, r8, r0)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = "RCS availability logged for all sims."
            r7.q(r8)
        La7:
            fctx r7 = defpackage.fctx.a
            return r7
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixu.a(int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixu.b(int, fcxy):java.lang.Object");
    }
}
