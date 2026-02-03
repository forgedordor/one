package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csnv implements cscu {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/strangerdanger/StrangerDangerSpamProtection");
    public static final cczv b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcyh f;

    static {
        dzzf dzzfVar = cdag.b;
        ewtl ewtlVar = (ewtl) ewtm.a.createBuilder();
        ewtlVar.a(30);
        ewtlVar.a(30);
        ewtlVar.a(30);
        b = cdag.t(dzzfVar, "stranger_danger_recheck_delay_array_seconds", ewtlVar.build(), new dzze() { // from class: csnn
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (ewtm) evsn.parseFrom(ewtm.a, bArr);
            }
        });
    }

    public csnv(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcyh fcyhVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcyhVar.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcyhVar;
    }

    @Override // defpackage.cscu
    public final csdl a() {
        return csdl.f;
    }

    @Override // defpackage.cscu
    public final eieu b() {
        return eiiy.a("StrangerDangerSpamProtection.classify");
    }

    @Override // defpackage.cscu
    public final eieu c() {
        return eiiy.a("StrangerDangerSpamProtection.reclassify");
    }

    @Override // defpackage.cscu
    public final Object d(csch cschVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.f), new csnr(null, this, cschVar), fcxyVar);
    }

    @Override // defpackage.cscu
    public final Object e(csch cschVar, int i, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.f), new csnt(null, this, cschVar, i), fcxyVar);
    }

    @Override // defpackage.cscu
    public final /* synthetic */ boolean f() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.csch r14, defpackage.eoeo r15, java.lang.Integer r16, defpackage.fcxy r17) {
        /*
            r13 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.csnq
            if (r1 == 0) goto L15
            r1 = r0
            csnq r1 = (defpackage.csnq) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            csnq r1 = new csnq
            r1.<init>(r13, r0)
        L1a:
            r10 = r1
            java.lang.Object r0 = r10.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r10.c
            r12 = 1
            if (r2 == 0) goto L32
            if (r2 != r12) goto L2a
            defpackage.fctl.b(r0)
            goto L61
        L2a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L32:
            defpackage.fctl.b(r0)
            fcsu r0 = r13.d
            java.lang.Object r0 = r0.b()
            r2 = r0
            csek r2 = (defpackage.csek) r2
            csdl r4 = defpackage.csdl.f
            if (r16 == 0) goto L47
            int r0 = r16.intValue()
            goto L48
        L47:
            r0 = 0
        L48:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r0)
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r12)
            r10.c = r12
            r9 = 0
            r11 = 144(0x90, float:2.02E-43)
            r7 = 0
            r3 = r14
            r5 = r15
            java.lang.Object r0 = defpackage.csek.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 != r1) goto L61
            return r1
        L61:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r14 = r0.booleanValue()
            r14 = r14 ^ r12
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csnv.g(csch, eoeo, java.lang.Integer, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.csch r12, java.lang.String r13, int r14, defpackage.fcxy r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.csnu
            if (r0 == 0) goto L13
            r0 = r15
            csnu r0 = (defpackage.csnu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            csnu r0 = new csnu
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r14 = r0.a
            csch r12 = r0.e
            defpackage.fctl.b(r15)     // Catch: java.lang.Throwable -> L2c
            goto L5a
        L2c:
            r0 = move-exception
            r13 = r0
            goto L7c
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            defpackage.fctl.b(r15)
            fcsu r15 = r11.c     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r15 = r15.b()     // Catch: java.lang.Throwable -> L2c
            csrb r15 = (defpackage.csrb) r15     // Catch: java.lang.Throwable -> L2c
            r0.e = r12     // Catch: java.lang.Throwable -> L2c
            r0.a = r14     // Catch: java.lang.Throwable -> L2c
            r0.d = r3     // Catch: java.lang.Throwable -> L2c
            fcyh r2 = r15.e     // Catch: java.lang.Throwable -> L2c
            fcyh r2 = defpackage.eicg.a(r2)     // Catch: java.lang.Throwable -> L2c
            csqx r5 = new csqx     // Catch: java.lang.Throwable -> L2c
            r5.<init>(r4, r13, r15)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r15 = defpackage.fdin.a(r2, r5, r0)     // Catch: java.lang.Throwable -> L2c
            if (r15 != r1) goto L5a
            return r1
        L5a:
            ezti r15 = (defpackage.ezti) r15     // Catch: java.lang.Throwable -> L2c
            if (r15 != 0) goto L5f
            return r4
        L5f:
            java.lang.String r12 = r15.c
            r12.getClass()
            int r12 = r12.length()
            if (r12 <= 0) goto L6c
            java.lang.String r4 = r15.c
        L6c:
            csnp r12 = new csnp
            int r13 = r15.b
            int r13 = defpackage.felu.a(r13)
            if (r13 != 0) goto L77
            goto L78
        L77:
            r3 = r13
        L78:
            r12.<init>(r3, r4)
            return r12
        L7c:
            r7 = r13
            r10 = r14
            fcsu r13 = r11.e
            java.lang.Object r13 = r13.b()
            r5 = r13
            csed r5 = (defpackage.csed) r5
            cspj r12 = r12.r
            csdr r6 = r12.a
            csdl r8 = defpackage.csdl.f
            eoeo r9 = defpackage.eoeo.RECLASSIFICATION
            r5.b(r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csnv.h(csch, java.lang.String, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.csch r12, java.lang.String r13, int r14, defpackage.fcxy r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.csns
            if (r0 == 0) goto L13
            r0 = r15
            csns r0 = (defpackage.csns) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csns r0 = new csns
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            csch r12 = r0.d
            defpackage.fctl.b(r15)     // Catch: java.lang.Throwable -> L2a
            goto L5c
        L2a:
            r0 = move-exception
            r13 = r0
            goto L7e
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            defpackage.fctl.b(r15)
            fcsu r15 = r11.c     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r15 = r15.b()     // Catch: java.lang.Throwable -> L2a
            r8 = r15
            csrb r8 = (defpackage.csrb) r8     // Catch: java.lang.Throwable -> L2a
            cspj r10 = r12.r     // Catch: java.lang.Throwable -> L2a
            r0.d = r12     // Catch: java.lang.Throwable -> L2a
            r0.c = r4     // Catch: java.lang.Throwable -> L2a
            fcyh r15 = r8.e     // Catch: java.lang.Throwable -> L2a
            fcyh r15 = defpackage.eicg.a(r15)     // Catch: java.lang.Throwable -> L2a
            csqw r5 = new csqw     // Catch: java.lang.Throwable -> L2a
            r6 = 0
            r7 = r13
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r15 = defpackage.fdin.a(r15, r5, r0)     // Catch: java.lang.Throwable -> L2a
            if (r15 != r1) goto L5c
            return r1
        L5c:
            ezsq r15 = (defpackage.ezsq) r15     // Catch: java.lang.Throwable -> L2a
            if (r15 != 0) goto L61
            return r3
        L61:
            java.lang.String r12 = r15.c
            r12.getClass()
            int r12 = r12.length()
            if (r12 <= 0) goto L6e
            java.lang.String r3 = r15.c
        L6e:
            csnp r12 = new csnp
            int r13 = r15.b
            int r13 = defpackage.felu.a(r13)
            if (r13 != 0) goto L79
            goto L7a
        L79:
            r4 = r13
        L7a:
            r12.<init>(r4, r3)
            return r12
        L7e:
            fcsu r14 = r11.e
            java.lang.Object r14 = r14.b()
            csed r14 = (defpackage.csed) r14
            cspj r12 = r12.r
            csdr r12 = r12.a
            csdl r15 = defpackage.csdl.f
            eoeo r0 = defpackage.eoeo.MESSAGE_RECEIPT
            defpackage.csed.d(r14, r12, r13, r15, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csnv.i(csch, java.lang.String, int, fcxy):java.lang.Object");
    }
}
