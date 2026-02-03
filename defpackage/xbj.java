package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbj {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/handler/TransportSendValidator");
    private final fduj b;
    private final wmp c;

    public xbj(fduj fdujVar, wmp wmpVar) {
        fdujVar.getClass();
        this.b = fdujVar;
        this.c = wmpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.xbi
            if (r0 == 0) goto L13
            r0 = r6
            xbi r0 = (defpackage.xbi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xbi r0 = new xbi
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fduj r6 = r5.b
            r0.c = r3
            java.lang.Object r6 = defpackage.fdtc.a(r6, r0)
            if (r6 == r1) goto L7a
        L3c:
            wac r6 = (defpackage.wac) r6
            boolean r0 = r6 instanceof defpackage.vzw
            if (r0 == 0) goto L6d
            ekrg r0 = defpackage.xbj.a
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleComposeRow2"
            r0.X(r1, r2)
            r1 = 38
            java.lang.String r2 = "TransportSendValidator.kt"
            java.lang.String r3 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/handler/TransportSendValidator"
            java.lang.String r4 = "validateSendingEnabledTransport"
            ekrw r0 = r0.h(r3, r4, r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            vzw r6 = (defpackage.vzw) r6
            ajli r6 = r6.a
            java.lang.String r1 = "Sending not accepted: compose disabled %s"
            r0.t(r1, r6)
            wmp r6 = r5.c
            r6.j()
            r6 = 0
            return r6
        L6d:
            boolean r0 = r6 instanceof defpackage.vwv
            if (r0 == 0) goto L72
            return r6
        L72:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r6.<init>(r0)
            throw r6
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbj.a(fcxy):java.lang.Object");
    }
}
