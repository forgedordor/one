package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnhg implements eqhs {
    private static final ejvj b = new cnaf().fH();
    private static final ejvj c = new cnbb().fH();
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/tachygram/chat/TachygramTransportMessageHandlerChapiAdapter");
    public final awjh a;
    private final asrc e;
    private final fcsu f;
    private final fcsu g;
    private final cnck h;
    private final cnas i;
    private final cnlh j;
    private final awxo k;
    private final awnf l;
    private final awjd m;
    private final arph n;
    private final fdjx o;
    private final aqnx p;

    public cnhg(asrc asrcVar, fcsu fcsuVar, fcsu fcsuVar2, cnck cnckVar, cnas cnasVar, cnlh cnlhVar, awxo awxoVar, awjh awjhVar, awnf awnfVar, awjd awjdVar, arph arphVar, fdjx fdjxVar, fcyh fcyhVar, ains ainsVar, aqnx aqnxVar) {
        asrcVar.getClass();
        fcsuVar.getClass();
        cnckVar.getClass();
        cnasVar.getClass();
        cnlhVar.getClass();
        awxoVar.getClass();
        awjhVar.getClass();
        awnfVar.getClass();
        awjdVar.getClass();
        arphVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        ainsVar.getClass();
        this.e = asrcVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = cnckVar;
        this.i = cnasVar;
        this.j = cnlhVar;
        this.k = awxoVar;
        this.a = awjhVar;
        this.l = awnfVar;
        this.m = awjdVar;
        this.n = arphVar;
        this.o = fdjxVar;
        this.p = aqnxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.eqhs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r9, defpackage.eqeq r10, j$.time.Instant r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.cnhe
            if (r0 == 0) goto L13
            r0 = r12
            cnhe r0 = (defpackage.cnhe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnhe r0 = new cnhe
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "handleMessages"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/tachygram/chat/TachygramTransportMessageHandlerChapiAdapter"
            java.lang.String r5 = "BugleTachygram"
            r6 = 1
            java.lang.String r7 = "TachygramTransportMessageHandlerChapiAdapter.kt"
            if (r2 == 0) goto L3d
            if (r2 != r6) goto L35
            eqeq r10 = r0.d
            defpackage.fctl.b(r12)     // Catch: java.lang.Throwable -> L31 defpackage.cnfx -> L33
            goto L51
        L31:
            r9 = move-exception
            goto L54
        L33:
            r9 = move-exception
            goto L7c
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            defpackage.fctl.b(r12)
            boolean r12 = r9.isEmpty()
            if (r12 != 0) goto La4
            r0.d = r10     // Catch: java.lang.Throwable -> L31 defpackage.cnfx -> L33
            r0.c = r6     // Catch: java.lang.Throwable -> L31 defpackage.cnfx -> L33
            java.lang.Object r9 = r8.e(r9, r10, r11, r0)     // Catch: java.lang.Throwable -> L31 defpackage.cnfx -> L33
            if (r9 != r1) goto L51
            return r1
        L51:
            fctx r9 = defpackage.fctx.a
            return r9
        L54:
            ekrg r11 = defpackage.cnhg.d
            ekrw r11 = r11.i()
            ekrz r12 = defpackage.eksq.a
            r11.X(r12, r5)
            ekrd r11 = (defpackage.ekrd) r11
            ekrw r11 = r11.g(r9)
            ekrd r11 = (defpackage.ekrd) r11
            ekrz r12 = defpackage.cqnc.e
            java.lang.String r10 = r10.a
            r11.X(r12, r10)
            r10 = 114(0x72, float:1.6E-43)
            ekrw r10 = r11.h(r4, r3, r10, r7)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r11 = "Failed to process incoming Tachygram message"
            r10.q(r11)
            throw r9
        L7c:
            ekrg r11 = defpackage.cnhg.d
            ekrw r11 = r11.j()
            ekrz r12 = defpackage.eksq.a
            r11.X(r12, r5)
            ekrd r11 = (defpackage.ekrd) r11
            ekrw r11 = r11.g(r9)
            ekrd r11 = (defpackage.ekrd) r11
            ekrz r12 = defpackage.cqnc.e
            java.lang.String r10 = r10.a
            r11.X(r12, r10)
            r10 = 105(0x69, float:1.47E-43)
            ekrw r10 = r11.h(r4, r3, r10, r7)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r11 = "Transient failure to process incoming Tachygram message"
            r10.q(r11)
            throw r9
        La4:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Incoming messages list should not be empty."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnhg.a(java.util.List, eqeq, j$.time.Instant, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027c A[LOOP:1: B:69:0x0276->B:71:0x027c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c9 A[LOOP:2: B:73:0x02c3->B:75:0x02c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v0, types: [cnhg] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r18, defpackage.eqeq r19, j$.time.Instant r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnhg.b(java.util.List, eqeq, j$.time.Instant, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.awjl r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cnhb
            if (r0 == 0) goto L13
            r0 = r8
            cnhb r0 = (defpackage.cnhb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnhb r0 = new cnhb
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r8)
            return r8
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.fctl.b(r8)
            goto L5f
        L39:
            defpackage.fctl.b(r8)
            return r8
        L3d:
            defpackage.fctl.b(r8)
            aqnx r8 = r6.p
            boolean r8 = r8.a()
            if (r8 == 0) goto L54
            awjh r8 = r6.a
            r0.c = r5
            java.lang.Object r7 = r8.i(r7, r0)
            if (r7 != r1) goto L53
            goto L6f
        L53:
            return r7
        L54:
            awjh r8 = r6.a
            r0.c = r4
            java.lang.Object r8 = r8.e(r7, r0)
            if (r8 != r1) goto L5f
            goto L6f
        L5f:
            awjd r7 = r6.m
            awjb r8 = (defpackage.awjb) r8
            awjf r7 = r7.a(r8)
            r0.c = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L70
        L6f:
            return r1
        L70:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnhg.c(awjl, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        if (r15 == r1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ezol r12, final defpackage.aubq r13, defpackage.aubq r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnhg.d(ezol, aubq, aubq, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.List r8, defpackage.eqeq r9, j$.time.Instant r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnhg.e(java.util.List, eqeq, j$.time.Instant, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.eqeq r7, defpackage.aubq r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cnha
            if (r0 == 0) goto L13
            r0 = r9
            cnha r0 = (defpackage.cnha) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnha r0 = new cnha
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            if (r2 == 0) goto L45
            r7 = 1
            if (r2 == r7) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.fctl.b(r9)
            awmp r9 = (defpackage.awmp) r9
            audu r7 = r9.a()
            aubq r7 = r7.d
            if (r7 != 0) goto L41
            aubq r7 = defpackage.aubq.a
        L41:
            r7.getClass()
            return r7
        L45:
            defpackage.fctl.b(r9)
            boolean r9 = defpackage.cngx.a(r7)
            if (r9 == 0) goto L83
            ezol r9 = r7.f
            if (r9 == 0) goto L7b
            ezol r7 = r7.c
            ejvj r2 = defpackage.cnhg.c
            java.lang.Object r7 = r2.fM(r7)
            r7.getClass()
            fcsu r2 = r6.f
            aubq r7 = (defpackage.aubq) r7
            java.lang.Object r2 = r2.b()
            cfep r2 = (defpackage.cfep) r2
            java.lang.String r4 = r7.d
            r4.getClass()
            r5 = 26
            r2.a(r4, r5)
            r0.c = r3
            java.lang.Object r7 = r6.d(r9, r8, r7, r0)
            if (r7 != r1) goto L7a
            return r1
        L7a:
            return r7
        L7b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Required value was null."
            r7.<init>(r8)
            throw r7
        L83:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnhg.f(eqeq, aubq, fcxy):java.lang.Object");
    }
}
