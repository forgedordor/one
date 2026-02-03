package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajeh implements ajed {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/analytics/screen/ScreenFirstVisitLoggingListener");
    private final fcsu b;
    private final fcsu c;

    public ajeh(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ajed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, j$.time.Instant r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ajeg
            if (r0 == 0) goto L13
            r0 = r7
            ajeg r0 = (defpackage.ajeg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajeg r0 = new ajeg
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r5 = r0.d
            defpackage.fctl.b(r7)
            goto L51
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r7)
            fcsu r7 = r4.c
            java.lang.Object r7 = r7.b()
            ajei r7 = (defpackage.ajei) r7
            r7.a(r5, r6)
            fcsu r6 = r4.b
            java.lang.Object r6 = r6.b()
            aixr r6 = (defpackage.aixr) r6
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 == r1) goto L77
        L51:
            ekrg r6 = defpackage.ajeh.a
            java.util.logging.Level r7 = java.util.logging.Level.INFO
            ekrd r6 = r6.a(r7)
            r7 = 33
            java.lang.String r0 = "ScreenFirstVisitLoggingListener.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/analytics/screen/ScreenFirstVisitLoggingListener"
            java.lang.String r2 = "onFirstVisit"
            ekrw r6 = r6.h(r1, r2, r7, r0)
            ekrd r6 = (defpackage.ekrd) r6
            if (r5 == 0) goto L75
            java.lang.String r5 = defpackage.aiuk.a(r5)
            java.lang.String r7 = "All logging tasks for first visit completed at screen: %s"
            r6.t(r7, r5)
            fctx r5 = defpackage.fctx.a
            return r5
        L75:
            r5 = 0
            throw r5
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajeh.a(int, j$.time.Instant, fcxy):java.lang.Object");
    }
}
