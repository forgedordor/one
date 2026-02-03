package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auti implements auso {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/cloudstore/folsom/CmsFolsomKeyManagerImpl");
    public final fcsu a;
    private final fdjx c;
    private final fcyh d;
    private final efwo e;
    private final egej f;
    private final cpmc g;
    private final cpmd h;
    private final aurx i;
    private final cpoc j;
    private final fcsu k;
    private final autx l;
    private final cpgl m;

    public auti(fdjx fdjxVar, fcyh fcyhVar, efwo efwoVar, egej egejVar, cpgn cpgnVar, cpmc cpmcVar, cpmd cpmdVar, aurx aurxVar, cpoc cpocVar, fcsu fcsuVar, fcsu fcsuVar2, autx autxVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        efwoVar.getClass();
        egejVar.getClass();
        cpgnVar.getClass();
        cpmcVar.getClass();
        cpmdVar.getClass();
        aurxVar.getClass();
        cpocVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        autxVar.getClass();
        this.c = fdjxVar;
        this.d = fcyhVar;
        this.e = efwoVar;
        this.f = egejVar;
        this.g = cpmcVar;
        this.h = cpmdVar;
        this.i = aurxVar;
        this.j = cpocVar;
        this.k = fcsuVar;
        this.a = fcsuVar2;
        this.l = autxVar;
        this.m = cpgnVar.a(cpgm.c);
    }

    private final void q(Status status) {
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleCmsFolsom");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/cloudstore/folsom/CmsFolsomKeyManagerImpl", "logSetConsentStatus", 478, "CmsFolsomKeyManagerImpl.kt")).t("SetConsentStatus: %s", status.toString());
        ((ains) this.k.b()).e("Bugle.Keychain.Cms.SetConsent.Count", status.g);
    }

    private static final void r(String str) {
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleCmsFolsom");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/cloudstore/folsom/CmsFolsomKeyManagerImpl", "logNotReadyForFolsomEncryption", 486, "CmsFolsomKeyManagerImpl.kt")).t("Not ready for Folsom encryption. Reason: %s", str);
    }

    private final void s(int i) {
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleCmsFolsom");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/cloudstore/folsom/CmsFolsomKeyManagerImpl", "logKeyRetrievalStatus", 466, "CmsFolsomKeyManagerImpl.kt")).D("KeyRetrievalStatus: %s. %s", i != 1 ? i != 2 ? i != 3 ? "FAILED" : "NEED_KNOWLEDGE_FACTOR" : "EMPTY_MATERIAL" : "SUCCESS", i == 1 ? "Key retrieval succeeded." : "Key retrieval failed.");
        ((ains) this.k.b()).e("Bugle.Keychain.Cms.KeyRetrieval.Count", i);
    }

    @Override // defpackage.auso
    public final eiju a() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new ausw(this, null));
    }

    @Override // defpackage.auso
    public final eiju b() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new autc(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
    
        throw new defpackage.cpzb("Missing Cms ID for Backup Key.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
    
        if (p(r11, r0) != r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.auso
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.auss
            if (r0 == 0) goto L13
            r0 = r11
            auss r0 = (defpackage.auss) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            auss r0 = new auss
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "com/google/android/apps/messaging/shared/cloudstore/folsom/CmsFolsomKeyManagerImpl"
            java.lang.String r4 = "BugleCmsFolsom"
            r5 = 2
            r6 = 1
            java.lang.String r7 = "decryptCmsBackupAndUpdateCmsBoxState"
            java.lang.String r8 = "CmsFolsomKeyManagerImpl.kt"
            if (r2 == 0) goto L41
            if (r2 == r6) goto L3b
            if (r2 != r5) goto L33
            defpackage.fctl.b(r11)
            goto Lbe
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3b:
            ekfx r2 = r0.d
            defpackage.fctl.b(r11)
            goto L7a
        L41:
            defpackage.fctl.b(r11)
            ekrg r11 = defpackage.auti.b
            ekrw r11 = r11.h()
            ekrz r2 = defpackage.eksq.a
            r11.X(r2, r4)
            r2 = 297(0x129, float:4.16E-43)
            ekrw r11 = r11.h(r3, r7, r2, r8)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r2 = "Running starlight."
            r11.q(r2)
            bnbw r11 = defpackage.bncb.a()
            r11.A(r7)
            ausp r2 = new ausp
            r2.<init>()
            r11.e(r2)
            bnbu r11 = r11.b()
            ekgb r11 = r11.z()
            ekqh r2 = r11.iterator()
            r2.getClass()
        L7a:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto Lb1
            java.lang.Object r11 = r2.next()
            bnar r11 = (defpackage.bnar) r11
            java.lang.String r9 = r11.p()
            if (r9 == 0) goto La9
            int r9 = r9.length()
            if (r9 == 0) goto La9
            cpoc r9 = r10.j
            eqnd r11 = r9.c(r11)
            r11.getClass()
            r9 = r2
            ekfx r9 = (defpackage.ekfx) r9
            r0.d = r9
            r0.c = r6
            java.lang.Object r11 = r10.n(r11, r0)
            if (r11 != r1) goto L7a
            goto Ld9
        La9:
            cpzb r11 = new cpzb
            java.lang.String r0 = "Missing Cms ID for Backup Key."
            r11.<init>(r0)
            throw r11
        Lb1:
            eqkj r11 = defpackage.eqkj.ENCRYPTION_STATE_NOT_ENCRYPTED
            r2 = 0
            r0.d = r2
            r0.c = r5
            java.lang.Object r11 = r10.p(r11, r0)
            if (r11 == r1) goto Ld9
        Lbe:
            ekrg r11 = defpackage.auti.b
            ekrw r11 = r11.h()
            ekrz r0 = defpackage.eksq.a
            r11.X(r0, r4)
            r0 = 314(0x13a, float:4.4E-43)
            ekrw r11 = r11.h(r3, r7, r0, r8)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r0 = "Updated Starlight objects and local state."
            r11.q(r0)
            fctx r11 = defpackage.fctx.a
            return r11
        Ld9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auti.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ca, code lost:
    
        if (p(r13, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6 A[PHI: r13
      0x00a6: PHI (r13v16 java.lang.Object) = (r13v15 java.lang.Object), (r13v1 java.lang.Object) binds: [B:25:0x00a4, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.auso
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.aust
            if (r0 == 0) goto L13
            r0 = r13
            aust r0 = (defpackage.aust) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aust r0 = new aust
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            java.lang.String r4 = "encryptCmsBackupAndUpdateCmsBoxState"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/cloudstore/folsom/CmsFolsomKeyManagerImpl"
            java.lang.String r6 = "BugleCmsFolsom"
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            java.lang.String r11 = "CmsFolsomKeyManagerImpl.kt"
            if (r2 == 0) goto L50
            if (r2 == r10) goto L4c
            if (r2 == r9) goto L46
            if (r2 == r8) goto L42
            if (r2 != r7) goto L3a
            defpackage.fctl.b(r13)
            goto Lcd
        L3a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L42:
            defpackage.fctl.b(r13)
            goto La6
        L46:
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r13)
            goto L8b
        L4c:
            defpackage.fctl.b(r13)
            goto L7e
        L50:
            defpackage.fctl.b(r13)
            ekrg r13 = defpackage.auti.b
            ekrw r13 = r13.h()
            ekrz r2 = defpackage.eksq.a
            r13.X(r2, r6)
            r2 = 280(0x118, float:3.92E-43)
            ekrw r13 = r13.h(r5, r4, r2, r11)
            ekrd r13 = (defpackage.ekrd) r13
            java.lang.String r2 = "Encrypting CMS backup with folsom key."
            r13.q(r2)
            r0.d = r10
            fcyh r13 = r12.d
            fcyh r13 = defpackage.eicg.a(r13)
            auta r2 = new auta
            r2.<init>(r3, r12)
            java.lang.Object r13 = defpackage.fdin.a(r13, r2, r0)
            if (r13 == r1) goto Ld0
        L7e:
            r2 = r13
            bnar r2 = (defpackage.bnar) r2
            r0.a = r2
            r0.d = r9
            java.lang.Object r13 = r12.i(r0)
            if (r13 == r1) goto Ld0
        L8b:
            cpoc r9 = r12.j
            java.util.List r13 = (java.util.List) r13
            ekgb r13 = defpackage.ekfv.a(r13)
            bnar r2 = (defpackage.bnar) r2
            eqnd r13 = r9.d(r2, r13)
            r13.getClass()
            r0.a = r3
            r0.d = r8
            java.lang.Object r13 = r12.n(r13, r0)
            if (r13 == r1) goto Ld0
        La6:
            eqnd r13 = (defpackage.eqnd) r13
            ekrg r2 = defpackage.auti.b
            ekrw r2 = r2.h()
            ekrz r3 = defpackage.eksq.a
            r2.X(r3, r6)
            r3 = 288(0x120, float:4.04E-43)
            ekrw r2 = r2.h(r5, r4, r3, r11)
            ekrd r2 = (defpackage.ekrd) r2
            evtg r13 = r13.h
            java.lang.String r3 = "Updated CMS backup key object to become encrypted. BackupKeyLabels: %s"
            r2.t(r3, r13)
            eqkj r13 = defpackage.eqkj.ENCRYPTION_STATE_ENCRYPTED
            r0.d = r7
            java.lang.Object r13 = r12.p(r13, r0)
            if (r13 != r1) goto Lcd
            goto Ld0
        Lcd:
            fctx r13 = defpackage.fctx.a
            return r13
        Ld0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auti.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        if (r11 != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.auso
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auti.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        if (defpackage.fdxs.c(r12, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.auso
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auti.f(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0158, code lost:
    
        if (r10 == r1) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.auso
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auti.g(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.eqkj r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ausr
            if (r0 == 0) goto L13
            r0 = r6
            ausr r0 = (defpackage.ausr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ausr r0 = new ausr
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            eqkj r5 = r0.d
            defpackage.fctl.b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            aurx r6 = r4.i
            eiju r6 = r6.k()
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto Lb1
        L44:
            autx r0 = r4.l
            aumq r6 = (defpackage.aumq) r6
            r6.getClass()
            eqli r0 = r0.a(r6)
            ejvr r1 = defpackage.txl.a
            int r6 = r6.l
            auml r6 = defpackage.auml.b(r6)
            if (r6 != 0) goto L5b
            auml r6 = defpackage.auml.UNSPECIFIED_STATUS
        L5b:
            java.lang.Object r6 = r1.apply(r6)
            eqjs r1 = defpackage.eqjs.a
            evsf r1 = r1.createBuilder()
            eqjr r1 = (defpackage.eqjr) r1
            r1.getClass()
            r5.getClass()
            r1.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r2 = r1.instance
            eqjs r2 = (defpackage.eqjs) r2
            int r5 = r5.a()
            r2.e = r5
            r0.getClass()
            r1.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r5 = r1.instance
            eqjs r5 = (defpackage.eqjs) r5
            int r0 = r0.a()
            r5.c = r0
            int r0 = r5.b
            r0 = r0 | r3
            r5.b = r0
            r6.getClass()
            r1.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r5 = r1.instance
            eqjs r5 = (defpackage.eqjs) r5
            eqna r6 = (defpackage.eqna) r6
            int r6 = r6.a()
            r5.d = r6
            int r6 = r5.b
            r6 = r6 | 2
            r5.b = r6
            evsn r5 = r1.build()
            r5.getClass()
            eqjs r5 = (defpackage.eqjs) r5
            return r5
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auti.h(eqkj, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r6 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.fcxy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ausv
            if (r0 == 0) goto L13
            r0 = r6
            ausv r0 = (defpackage.ausv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ausv r0 = new ausv
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            defpackage.fctl.b(r6)     // Catch: java.lang.Exception -> L2a
            goto L5e
        L2a:
            r6 = move-exception
            goto L71
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            defpackage.fctl.b(r6)
            goto L4b
        L38:
            defpackage.fctl.b(r6)
            egej r6 = r5.f
            efwo r2 = r5.e
            com.google.common.util.concurrent.ListenableFuture r6 = r6.b(r2)
            r0.c = r4
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto L7f
        L4b:
            java.lang.String r6 = (java.lang.String) r6
            cpgl r2 = r5.m     // Catch: java.lang.Exception -> L2a
            r6.getClass()     // Catch: java.lang.Exception -> L2a
            eiju r6 = r2.a(r6)     // Catch: java.lang.Exception -> L2a
            r0.c = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)     // Catch: java.lang.Exception -> L2a
            if (r6 == r1) goto L7f
        L5e:
            r6.getClass()     // Catch: java.lang.Exception -> L2a
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Exception -> L2a
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L6d
            r5.s(r3)
            return r6
        L6d:
            r5.s(r4)
            return r6
        L71:
            boolean r0 = r6 instanceof defpackage.dcfv
            if (r0 == 0) goto L7a
            r0 = 3
            r5.s(r0)
            goto L7e
        L7a:
            r0 = 4
            r5.s(r0)
        L7e:
            throw r6
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auti.i(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ausx
            if (r0 == 0) goto L13
            r0 = r6
            ausx r0 = (defpackage.ausx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ausx r0 = new ausx
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L49
        L36:
            defpackage.fctl.b(r6)
            egej r6 = r5.f
            efwo r2 = r5.e
            com.google.common.util.concurrent.ListenableFuture r6 = r6.b(r2)
            r0.c = r4
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto L61
        L49:
            cpgl r2 = r5.m
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            eiju r6 = r2.b(r6)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 != r1) goto L5d
            goto L61
        L5d:
            r6.getClass()
            return r6
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auti.j(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r7 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ausy
            if (r0 == 0) goto L13
            r0 = r7
            ausy r0 = (defpackage.ausy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ausy r0 = new ausy
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            defpackage.fctl.b(r7)
            goto L66
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            cphq r2 = r0.d
            defpackage.fctl.b(r7)
            goto L52
        L38:
            defpackage.fctl.b(r7)
            cpgl r2 = r6.m
            egej r7 = r6.f
            efwo r5 = r6.e
            com.google.common.util.concurrent.ListenableFuture r7 = r7.b(r5)
            r5 = r2
            cphq r5 = (defpackage.cphq) r5
            r0.d = r5
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto L8a
        L52:
            r7.getClass()
            java.lang.String r7 = (java.lang.String) r7
            eiju r7 = r2.c(r7)
            r2 = 0
            r0.d = r2
            r0.c = r4
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto L8a
        L66:
            r7.getClass()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L74:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L89
            java.lang.Object r1 = r7.next()
            r2 = r1
            com.google.android.gms.auth.folsom.SecurityDomainMember r2 = (com.google.android.gms.auth.folsom.SecurityDomainMember) r2
            int r2 = r2.a
            if (r2 != r4) goto L74
            r0.add(r1)
            goto L74
        L89:
            return r0
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auti.k(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ausz
            java.lang.String r1 = "CmsFolsomKeyManagerImpl.kt"
            if (r0 == 0) goto L15
            r0 = r6
            ausz r0 = (defpackage.ausz) r0
            int r2 = r0.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.c = r2
            goto L1a
        L15:
            ausz r0 = new ausz
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r0.c
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            defpackage.fctl.b(r6)
            goto L3c
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.fctl.b(r6)
            r0.c = r4
            java.lang.Object r6 = r5.k(r0)
            if (r6 == r2) goto Lc7
        L3c:
            java.util.List r6 = (java.util.List) r6
            ausm r0 = defpackage.ausm.a
            boolean r2 = r6.isEmpty()     // Catch: defpackage.evtj -> L92 java.lang.Throwable -> Lb7
            if (r2 == 0) goto L4a
            ausm r0 = defpackage.ausm.b     // Catch: defpackage.evtj -> L92 java.lang.Throwable -> Lb7
            goto Lb7
        L4a:
            boolean r2 = r6 instanceof java.util.Collection     // Catch: defpackage.evtj -> L92 java.lang.Throwable -> Lb7
            if (r2 == 0) goto L55
            boolean r2 = r6.isEmpty()     // Catch: defpackage.evtj -> L92 java.lang.Throwable -> Lb7
            if (r2 == 0) goto L55
            goto L6e
        L55:
            java.util.Iterator r2 = r6.iterator()     // Catch: defpackage.evtj -> L92 java.lang.Throwable -> Lb7
        L59:
            boolean r3 = r2.hasNext()     // Catch: defpackage.evtj -> L92 java.lang.Throwable -> Lb7
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r2.next()     // Catch: defpackage.evtj -> L92 java.lang.Throwable -> Lb7
            com.google.android.gms.auth.folsom.SecurityDomainMember r3 = (com.google.android.gms.auth.folsom.SecurityDomainMember) r3     // Catch: defpackage.evtj -> L92 java.lang.Throwable -> Lb7
            boolean r3 = defpackage.ausq.a(r3)     // Catch: defpackage.evtj -> L92 java.lang.Throwable -> Lb7
            if (r3 == 0) goto L59
            ausm r0 = defpackage.ausm.c     // Catch: defpackage.evtj -> L92 java.lang.Throwable -> Lb7
            goto Lb7
        L6e:
            boolean r2 = r6 instanceof java.util.Collection     // Catch: defpackage.evtj -> L92 java.lang.Throwable -> Lb7
            if (r2 == 0) goto L79
            boolean r2 = r6.isEmpty()     // Catch: defpackage.evtj -> L92 java.lang.Throwable -> Lb7
            if (r2 == 0) goto L79
            goto Lb7
        L79:
            java.util.Iterator r6 = r6.iterator()     // Catch: defpackage.evtj -> L92 java.lang.Throwable -> Lb7
        L7d:
            boolean r2 = r6.hasNext()     // Catch: defpackage.evtj -> L92 java.lang.Throwable -> Lb7
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r6.next()     // Catch: defpackage.evtj -> L92 java.lang.Throwable -> Lb7
            com.google.android.gms.auth.folsom.SecurityDomainMember r2 = (com.google.android.gms.auth.folsom.SecurityDomainMember) r2     // Catch: defpackage.evtj -> L92 java.lang.Throwable -> Lb7
            boolean r2 = defpackage.ausq.a(r2)     // Catch: defpackage.evtj -> L92 java.lang.Throwable -> Lb7
            if (r2 != 0) goto L7d
            ausm r0 = defpackage.ausm.d     // Catch: defpackage.evtj -> L92 java.lang.Throwable -> Lb7
            goto Lb7
        L92:
            r6 = move-exception
            ekrg r2 = defpackage.auti.b     // Catch: java.lang.Throwable -> Lb7
            ekrw r2 = r2.j()     // Catch: java.lang.Throwable -> Lb7
            ekrz r3 = defpackage.eksq.a     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = "BugleCmsFolsom"
            r2.X(r3, r4)     // Catch: java.lang.Throwable -> Lb7
            ekrd r2 = (defpackage.ekrd) r2     // Catch: java.lang.Throwable -> Lb7
            ekrw r6 = r2.g(r6)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r2 = "com/google/android/apps/messaging/shared/cloudstore/folsom/CmsFolsomKeyManagerImpl"
            java.lang.String r3 = "getLskfMembersStatus"
            r4 = 434(0x1b2, float:6.08E-43)
            ekrw r6 = r6.h(r2, r3, r4, r1)     // Catch: java.lang.Throwable -> Lb7
            ekrd r6 = (defpackage.ekrd) r6     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r1 = "Parsing security members failed."
            r6.q(r1)     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            fcsu r6 = r5.k
            java.lang.Object r6 = r6.b()
            ains r6 = (defpackage.ains) r6
            java.lang.String r1 = "Bugle.Keychain.Cms.LskfMembersStatus.Count"
            int r2 = r0.e
            r6.e(r1, r2)
            return r0
        Lc7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auti.l(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r7 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(boolean r6, defpackage.fcxy r7) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.autd
            if (r0 == 0) goto L13
            r0 = r7
            autd r0 = (defpackage.autd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            autd r0 = new autd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            defpackage.fctl.b(r7)     // Catch: java.lang.Exception -> L2a
            goto L62
        L2a:
            r6 = move-exception
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            boolean r6 = r0.a
            defpackage.fctl.b(r7)
            goto L4f
        L3a:
            defpackage.fctl.b(r7)
            egej r7 = r5.f
            efwo r2 = r5.e
            com.google.common.util.concurrent.ListenableFuture r7 = r7.b(r2)
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto L84
        L4f:
            java.lang.String r7 = (java.lang.String) r7
            cpgl r2 = r5.m     // Catch: java.lang.Exception -> L2a
            r7.getClass()     // Catch: java.lang.Exception -> L2a
            eiju r6 = r2.e(r7, r6)     // Catch: java.lang.Exception -> L2a
            r0.d = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)     // Catch: java.lang.Exception -> L2a
            if (r7 == r1) goto L84
        L62:
            fctx r7 = (defpackage.fctx) r7     // Catch: java.lang.Exception -> L2a
            com.google.android.gms.common.api.Status r6 = com.google.android.gms.common.api.Status.a
            r5.q(r6)
            fctx r6 = defpackage.fctx.a
            return r6
        L6c:
            boolean r7 = r6 instanceof defpackage.dcff
            if (r7 == 0) goto L76
            r7 = r6
            dcff r7 = (defpackage.dcff) r7
            com.google.android.gms.common.api.Status r7 = r7.a
            goto L7d
        L76:
            com.google.android.gms.common.api.Status r7 = new com.google.android.gms.common.api.Status
            r0 = 13
            r7.<init>(r0)
        L7d:
            r7.getClass()
            r5.q(r7)
            throw r6
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auti.m(boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.eqnd r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.autf
            if (r0 == 0) goto L13
            r0 = r9
            autf r0 = (defpackage.autf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            autf r0 = new autf
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r9)
            goto L95
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.fctl.b(r9)
            ekrg r9 = defpackage.auti.b
            ekrw r9 = r9.h()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r4 = "BugleCmsFolsom"
            r9.X(r2, r4)
            r2 = 356(0x164, float:4.99E-43)
            java.lang.String r4 = "CmsFolsomKeyManagerImpl.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/cloudstore/folsom/CmsFolsomKeyManagerImpl"
            java.lang.String r6 = "updateCmsBackupKeyObject"
            ekrw r9 = r9.h(r5, r6, r2, r4)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r2 = "Updating the CMS backup key object."
            r9.q(r2)
            cpmc r9 = r7.g
            evrw r2 = defpackage.evrw.a
            evsf r2 = r2.createBuilder()
            evrv r2 = (defpackage.evrv) r2
            r2.getClass()
            defpackage.evrx.b(r2)
            java.lang.String r4 = "labels"
            r2.a(r4)
            defpackage.evrx.b(r2)
            java.lang.String r4 = "payload"
            r2.a(r4)
            evrw r2 = defpackage.evrx.a(r2)
            eqmi r4 = defpackage.eqmi.a
            evsf r4 = r4.createBuilder()
            eqmh r4 = (defpackage.eqmh) r4
            r4.getClass()
            defpackage.eqmj.b(r4)
            defpackage.eqmj.c(r4)
            eqmi r4 = defpackage.eqmj.a(r4)
            eiju r8 = r9.ak(r8, r2, r4)
            r0.c = r3
            java.lang.Object r9 = defpackage.fdxs.c(r8, r0)
            if (r9 != r1) goto L95
            return r1
        L95:
            r9.getClass()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auti.n(eqnd, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e4, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.eqkj r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auti.o(eqkj, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.eqkj r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auti.p(eqkj, fcxy):java.lang.Object");
    }
}
