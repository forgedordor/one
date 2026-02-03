package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cljy implements clhb {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/incoming/IncomingSatelliteApiImpl");
    private final aypy b;
    private final clkd c;
    private final clox d;

    public cljy(aypy aypyVar, clkd clkdVar, clox cloxVar) {
        aypyVar.getClass();
        cloxVar.getClass();
        this.b = aypyVar;
        this.c = clkdVar;
        this.d = cloxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.clhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.clng r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.cljv
            if (r0 == 0) goto L13
            r0 = r11
            cljv r0 = (defpackage.cljv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cljv r0 = new cljv
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            eieu r10 = r0.d
            defpackage.fctl.b(r11)     // Catch: java.lang.Throwable -> L2a
            goto L8e
        L2a:
            r11 = move-exception
            goto Lcd
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            defpackage.fctl.b(r11)
            ekrg r11 = defpackage.cljy.a
            ekrw r11 = r11.h()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r5 = "BugleSatellite"
            r11.X(r2, r5)
            ekrd r11 = (defpackage.ekrd) r11
            ekrz r2 = defpackage.cqnc.ac
            clmj r5 = r10.e
            if (r5 != 0) goto L4f
            clmj r5 = defpackage.clmj.a
        L4f:
            java.lang.String r5 = r5.c
            baro r6 = new baro
            r6.<init>(r5)
            r11.X(r2, r6)
            r2 = 61
            java.lang.String r5 = "IncomingSatelliteApiImpl.kt"
            java.lang.String r6 = "com/google/android/apps/messaging/shared/satelliteapi/incoming/IncomingSatelliteApiImpl"
            java.lang.String r7 = "onReceiveSatelliteMessage"
            ekrw r11 = r11.h(r6, r7, r2, r5)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r2 = "Calling IncomingSatelliteMessageProcessor"
            r11.q(r2)
            java.lang.String r11 = "IncomingSatelliteMessageProcessor#processIncomingMessage"
            eieu r11 = defpackage.eiiy.h(r11)
            clkd r2 = r9.c     // Catch: java.lang.Throwable -> Lc9
            r0.d = r11     // Catch: java.lang.Throwable -> Lc9
            r0.c = r4     // Catch: java.lang.Throwable -> Lc9
            fcyh r5 = r2.a     // Catch: java.lang.Throwable -> Lc9
            fcyh r5 = defpackage.eicg.a(r5)     // Catch: java.lang.Throwable -> Lc9
            clkb r6 = new clkb     // Catch: java.lang.Throwable -> Lc9
            r6.<init>(r3, r2, r10)     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r10 = defpackage.fdin.a(r5, r6, r0)     // Catch: java.lang.Throwable -> Lc9
            if (r10 == r1) goto L8b
            fctx r10 = defpackage.fctx.a     // Catch: java.lang.Throwable -> Lc9
        L8b:
            if (r10 == r1) goto Lc8
            r10 = r11
        L8e:
            defpackage.fczl.a(r10, r3)
            clni r10 = defpackage.clni.a
            evsf r10 = r10.createBuilder()
            clnh r10 = (defpackage.clnh) r10
            r10.getClass()
            cloq r11 = defpackage.cloq.a
            evsf r11 = r11.createBuilder()
            cloo r11 = (defpackage.cloo) r11
            r11.getClass()
            clop r0 = defpackage.clop.SUCCESS
            defpackage.clor.b(r0, r11)
            cloq r11 = defpackage.clor.a(r11)
            r10.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r0 = r10.instance
            clni r0 = (defpackage.clni) r0
            r0.c = r11
            int r11 = r0.b
            r11 = r11 | r4
            r0.b = r11
            evsn r10 = r10.build()
            r10.getClass()
            clni r10 = (defpackage.clni) r10
            return r10
        Lc8:
            return r1
        Lc9:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        Lcd:
            throw r11     // Catch: java.lang.Throwable -> Lce
        Lce:
            r0 = move-exception
            defpackage.fczl.a(r10, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cljy.a(clng, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18, types: [clnk] */
    /* JADX WARN: Type inference failed for: r0v2, types: [cljw, fcxy] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [clnk] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v10, types: [clox] */
    @Override // defpackage.clhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.clnk r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cljy.b(clnk, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.clhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.clnq r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cljy.c(clnq, fcxy):java.lang.Object");
    }
}
