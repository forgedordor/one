package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfvb implements cfvh {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/machine/MessagePendingState");
    private final cftg b;

    public cfvb(cftg cftgVar) {
        this.b = cftgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cfvh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cfva
            if (r0 == 0) goto L13
            r0 = r5
            cfva r0 = (defpackage.cfva) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfva r0 = new cfva
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r5)
            fctk r5 = (defpackage.fctk) r5
            java.lang.Object r5 = r5.a
            goto L40
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.fctl.b(r5)
            cftg r5 = r4.b
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 == r1) goto L6f
        L40:
            java.lang.Throwable r5 = defpackage.fctk.c(r5)
            if (r5 == 0) goto L6c
            ekrg r0 = defpackage.cfvb.a
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleBindChannelProxy"
            r0.X(r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r5 = r0.g(r5)
            r0 = 21
            java.lang.String r1 = "MessagePendingState.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/machine/MessagePendingState"
            java.lang.String r3 = "onEntry"
            ekrw r5 = r5.h(r2, r3, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r0 = "Failed to notify the main process about the connection failure."
            r5.q(r0)
        L6c:
            fctx r5 = defpackage.fctx.a
            return r5
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfvb.a(fcxy):java.lang.Object");
    }

    @Override // defpackage.cfvh
    public final String b() {
        return "MessagePending";
    }

    @Override // defpackage.cfvh
    public final /* synthetic */ Object c() {
        return fctx.a;
    }
}
