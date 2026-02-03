package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cprd {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/util/cloudstore/CmsDeltaSyncManager");
    public final cprj a;
    public final dqsn b;
    public final fdjx c;
    private final cpmc e;
    private final aurx f;
    private final ahwd g;
    private final apoy h;
    private final fcyh i;
    private final fcsu j;
    private final egbf k;

    public cprd(cprj cprjVar, cpmc cpmcVar, aurx aurxVar, ahwd ahwdVar, apoy apoyVar, dqsn dqsnVar, fdjx fdjxVar, fcyh fcyhVar, fcsu fcsuVar, egbf egbfVar) {
        cprjVar.getClass();
        cpmcVar.getClass();
        aurxVar.getClass();
        ahwdVar.getClass();
        dqsnVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcsuVar.getClass();
        egbfVar.getClass();
        this.a = cprjVar;
        this.e = cpmcVar;
        this.f = aurxVar;
        this.g = ahwdVar;
        this.h = apoyVar;
        this.b = dqsnVar;
        this.c = fdjxVar;
        this.i = fcyhVar;
        this.j = fcsuVar;
        this.k = egbfVar;
    }

    private static final void g(String str) {
        ekrw ekrwVarH = d.h();
        ekrwVarH.X(eksq.a, "BugleCms");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.S, "CmsDeltaSyncManager");
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsDeltaSyncManager", "logClearBugleDbFields", 309, "CmsDeltaSyncManager.kt")).t("Clearing BugleDb %s.", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cpqu
            if (r0 == 0) goto L13
            r0 = r8
            cpqu r0 = (defpackage.cpqu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cpqu r0 = new cpqu
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r7 = r0.d
            defpackage.fctl.b(r8)
            goto L5e
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.fctl.b(r8)
            cpmc r8 = r6.e
            evrw r2 = defpackage.evrw.a
            evsf r2 = r2.createBuilder()
            evrv r2 = (defpackage.evrv) r2
            r2.getClass()
            defpackage.evrx.b(r2)
            java.lang.String r4 = "box_devices"
            r2.a(r4)
            evrw r2 = defpackage.evrx.a(r2)
            eiju r8 = r8.k(r2)
            r8.getClass()
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 == r1) goto Lc0
        L5e:
            eqiz r8 = (defpackage.eqiz) r8
            ekrg r0 = defpackage.cprd.d
            ekrw r0 = r0.h()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleCms"
            r0.X(r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            ekrz r1 = defpackage.cqnc.S
            java.lang.String r2 = "CmsDeltaSyncManager"
            r0.X(r1, r2)
            r1 = 252(0xfc, float:3.53E-43)
            java.lang.String r2 = "CmsDeltaSyncManager.kt"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/util/cloudstore/CmsDeltaSyncManager"
            java.lang.String r5 = "backupDeviceIdNotMatchBoxDeviceIdForD2d"
            ekrw r0 = r0.h(r4, r5, r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            evtg r1 = r8.f
            java.lang.String r2 = "The box's current devices: %s, local priorToDeviceId: %s"
            r0.D(r2, r1, r7)
            evtg r8 = r8.f
            r8.getClass()
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L97
            goto Lbb
        L97:
            java.util.Iterator r8 = r8.iterator()
        L9b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lbb
            java.lang.Object r0 = r8.next()
            eqjb r0 = (defpackage.eqjb) r0
            int r1 = r0.c
            int r1 = defpackage.eqjd.a(r1)
            if (r1 == 0) goto L9b
            r2 = 3
            if (r1 != r2) goto L9b
            java.lang.String r0 = r0.b
            boolean r0 = defpackage.fdbq.f(r0, r7)
            if (r0 == 0) goto L9b
            r3 = 0
        Lbb:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        Lc0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cprd.a(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cpqw
            if (r0 == 0) goto L13
            r0 = r6
            cpqw r0 = (defpackage.cpqw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cpqw r0 = new cpqw
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L4e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            if (r5 == 0) goto L4e
            java.lang.String r5 = "CMS backup fields"
            g(r5)
            fcyh r5 = r4.i
            fcyh r5 = defpackage.eicg.a(r5)
            cpqv r6 = new cpqv
            r2 = 0
            r6.<init>(r2, r4)
            r0.c = r3
            java.lang.Object r5 = defpackage.fdin.a(r5, r6, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            java.lang.String r5 = "CmsSettings delta sync fields"
            g(r5)
            aurx r5 = r4.f
            r5.D()
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cprd.b(boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cc, code lost:
    
        if (b(true, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d6, code lost:
    
        if (b(false, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.efwo r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cprd.c(efwo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0132, code lost:
    
        if (r1 != r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c9, code lost:
    
        if (r1 != r3) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b5 A[PHI: r1 r4 r9
      0x01b5: PHI (r1v54 java.lang.Object) = (r1v49 java.lang.Object), (r1v58 java.lang.Object) binds: [B:80:0x01b3, B:13:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x01b5: PHI (r4v29 evvp) = (r4v25 evvp), (r4v31 evvp) binds: [B:80:0x01b3, B:13:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x01b5: PHI (r9v9 java.lang.Object) = (r9v8 java.lang.Object), (r9v12 java.lang.Object) binds: [B:80:0x01b3, B:13:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.efwo r17, defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cprd.d(efwo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.evvp r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cprb
            if (r0 == 0) goto L13
            r0 = r6
            cprb r0 = (defpackage.cprb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cprb r0 = new cprb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            j$.time.Instant r5 = r0.d
            defpackage.fctl.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            j$.time.Instant r5 = defpackage.evxd.d(r5)
            cpmc r6 = r4.e
            eiju r6 = r6.l()
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto L77
        L48:
            r6.getClass()
            evvp r6 = (defpackage.evvp) r6
            j$.time.Instant r6 = defpackage.evxd.d(r6)
            cczi r0 = defpackage.cpyl.L
            java.lang.Object r0 = r0.e()
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            j$.time.temporal.ChronoUnit r2 = j$.time.temporal.ChronoUnit.DAYS
            j$.time.Instant r5 = r5.b(r0, r2)
            boolean r5 = r6.isAfter(r5)
            if (r5 == 0) goto L71
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L71:
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cprd.e(evvp, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.evvp r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cprc
            if (r0 == 0) goto L13
            r0 = r9
            cprc r0 = (defpackage.cprc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cprc r0 = new cprc
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            evvp r8 = r0.d
            defpackage.fctl.b(r9)
            goto L44
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.fctl.b(r9)
            cpmc r9 = r7.e
            eiju r9 = r9.v()
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)
            if (r9 == r1) goto La3
        L44:
            j$.util.Optional r9 = (j$.util.Optional) r9
            cpqq r0 = new cpqq
            r0.<init>()
            cpqr r1 = new cpqr
            r1.<init>()
            j$.util.Optional r0 = r9.map(r1)
            java.lang.String r1 = "empty"
            java.lang.Object r0 = r0.orElse(r1)
            java.lang.String r0 = (java.lang.String) r0
            ekrg r1 = defpackage.cprd.d
            ekrw r1 = r1.h()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r4 = "BugleCms"
            r1.X(r2, r4)
            ekrd r1 = (defpackage.ekrd) r1
            ekrz r2 = defpackage.cqnc.S
            java.lang.String r4 = "CmsDeltaSyncManager"
            r1.X(r2, r4)
            r2 = 270(0x10e, float:3.78E-43)
            java.lang.String r4 = "CmsDeltaSyncManager.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/util/cloudstore/CmsDeltaSyncManager"
            java.lang.String r6 = "resetBoxAfterDeltaSyncTimestamp"
            ekrw r1 = r1.h(r5, r6, r2, r4)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r2 = defpackage.evxc.h(r8)
            java.lang.String r4 = "ResetBox timestamp: %s, Delta sync timestamp: %s"
            r1.D(r4, r0, r2)
            boolean r0 = r9.isPresent()
            r1 = 0
            if (r0 == 0) goto L9d
            java.lang.Object r9 = r9.get()
            evvp r9 = (defpackage.evvp) r9
            int r8 = defpackage.evxb.a(r9, r8)
            if (r8 <= 0) goto L9d
            goto L9e
        L9d:
            r3 = r1
        L9e:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cprd.f(evvp, fcxy):java.lang.Object");
    }
}
