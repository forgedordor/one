package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfve implements cfvh {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/machine/PermanentFailureState");
    private final cfuz b;
    private final cfvj c;
    private final cftg d;
    private final String e = "PermanentFailure";

    public cfve(cfuz cfuzVar, cfvj cfvjVar, cftg cftgVar) {
        this.b = cfuzVar;
        this.c = cfvjVar;
        this.d = cftgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cfvh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cfvd
            if (r0 == 0) goto L13
            r0 = r6
            cfvd r0 = (defpackage.cfvd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfvd r0 = new cfvd
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r6)
            fctk r6 = (defpackage.fctk) r6
            java.lang.Object r6 = r6.a
            goto L45
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.fctl.b(r6)
            cfvj r6 = r5.c
            r6.a()
            cftg r6 = r5.d
            r0.c = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 == r1) goto La9
        L45:
            java.lang.Throwable r0 = defpackage.fctk.c(r6)
            if (r0 == 0) goto L71
            ekrg r1 = defpackage.cfve.a
            ekrw r1 = r1.j()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r3 = "BugleBindChannelProxy"
            r1.X(r2, r3)
            ekrd r1 = (defpackage.ekrd) r1
            ekrw r0 = r1.g(r0)
            r1 = 31
            java.lang.String r2 = "PermanentFailureState.kt"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/machine/PermanentFailureState"
            java.lang.String r4 = "onEntry"
            ekrw r0 = r0.h(r3, r4, r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "Failed to notify the main process about the connection failure."
            r0.q(r1)
        L71:
            boolean r0 = defpackage.fctk.d(r6)
            if (r0 == 0) goto La6
            cfsr r6 = (defpackage.cfsr) r6
            ezns r0 = r6.c
            if (r0 != 0) goto L7f
            ezns r0 = defpackage.ezns.a
        L7f:
            evqs r0 = r0.b
            r0.getClass()
            boolean r0 = defpackage.evwm.b(r0)
            if (r0 == 0) goto La6
            cfvj r0 = r5.c
            ezns r6 = r6.c
            if (r6 != 0) goto L92
            ezns r6 = defpackage.ezns.a
        L92:
            r6.getClass()
            java.util.concurrent.atomic.AtomicReference r0 = r0.c
            cfvi r1 = new cfvi
            r1.<init>()
            j$.util.concurrent.atomic.DesugarAtomicReference.getAndUpdate(r0, r1)
            cfuz r6 = r5.b
            cfuy r0 = defpackage.cfuy.l
            r6.a(r0)
        La6:
            fctx r6 = defpackage.fctx.a
            return r6
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfve.a(fcxy):java.lang.Object");
    }

    @Override // defpackage.cfvh
    public final String b() {
        return this.e;
    }

    @Override // defpackage.cfvh
    public final Object c() {
        return fctx.a;
    }
}
