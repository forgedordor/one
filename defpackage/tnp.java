package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tnp implements tnq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/cloudstore/cmsrpc/deviceonboarding/CreatePairingDelegate");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final cecr e;
    private final fcsu f;
    private final fcsu g;
    private final fdjx h;
    private final fcyh i;
    private final fcsu j;

    public tnp(fcsu fcsuVar, cecr cecrVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fdjx fdjxVar, fcyh fcyhVar, fcsu fcsuVar6, fcsu fcsuVar7, aoou aoouVar) {
        fcsuVar.getClass();
        cecrVar.getClass();
        fcsuVar2.getClass();
        fcsuVar4.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        aoouVar.getClass();
        this.b = fcsuVar;
        this.e = cecrVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.c = fcsuVar4;
        this.d = fcsuVar5;
        this.h = fdjxVar;
        this.i = fcyhVar;
        this.j = fcsuVar7;
    }

    private static final ewyb l(epmr epmrVar) {
        int iOrdinal = epmrVar.ordinal();
        return iOrdinal != 0 ? iOrdinal != 2 ? ewyb.UNKNOWN_EVENT_TYPE : ewyb.CREATE_GAIA_PAIRING_CLIENT_FINISHED : ewyb.CREATE_GAIA_PAIRING_CLIENT_INIT;
    }

    @Override // defpackage.tnq
    public final eiju a(String str, long j, evqs evqsVar, epms epmsVar) {
        return auvw.c(this.h, fcyi.a, fdjz.a, new tnl(this, epmsVar, str, j, evqsVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.exuy r8, java.lang.String r9, java.lang.String r10, defpackage.epmr r11, int r12, int r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r14 instanceof defpackage.tnb
            if (r0 == 0) goto L13
            r0 = r14
            tnb r0 = (defpackage.tnb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            tnb r0 = new tnb
            r0.<init>(r7, r14)
        L18:
            java.lang.Object r14 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r13 = r0.b
            int r12 = r0.a
            byte[] r8 = r0.i
            epmr r11 = r0.h
            java.lang.String r10 = r0.g
            java.lang.String r9 = r0.f
            defpackage.fctl.b(r14)
            goto L64
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            defpackage.fctl.b(r14)
            fcsu r14 = r7.b
            java.lang.Object r2 = r14.b()
            ceco r2 = (defpackage.ceco) r2
            byte[] r8 = r2.k(r8)
            java.lang.Object r14 = r14.b()
            ceco r14 = (defpackage.ceco) r14
            r0.f = r9
            r0.g = r10
            r0.h = r11
            r0.i = r8
            r0.a = r12
            r0.b = r13
            r0.e = r3
            java.lang.Object r14 = r14.f(r0)
            if (r14 == r1) goto Lce
        L64:
            r1 = r9
            r2 = r10
            r3 = r14
            epnh r3 = (defpackage.epnh) r3
            if (r3 == 0) goto L80
            ewyb r4 = l(r11)
            fcsu r8 = r7.b
            java.lang.Object r8 = r8.b()
            r0 = r8
            ceco r0 = (defpackage.ceco) r0
            r5 = 3
            r6 = 32
            j$.util.Optional r8 = defpackage.ceco.r(r0, r1, r2, r3, r4, r5, r6)
            return r8
        L80:
            ewyb r3 = l(r11)
            fcsu r9 = r7.b
            java.lang.Object r9 = r9.b()
            r0 = r9
            ceco r0 = (defpackage.ceco) r0
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r12)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r13)
            r6 = 3
            r0.q(r1, r2, r3, r4, r5, r6)
            epni r9 = defpackage.epni.a
            evsf r9 = r9.createBuilder()
            epng r9 = (defpackage.epng) r9
            r9.getClass()
            exuy r10 = defpackage.exuy.a
            evsn r8 = defpackage.evsn.parseFrom(r10, r8)
            exuy r8 = (defpackage.exuy) r8
            r8.getClass()
            defpackage.epnj.h(r8, r9)
            defpackage.epnj.i(r9)
            defpackage.epnj.f(r1, r9)
            exmt r8 = defpackage.exmt.OK
            defpackage.epnj.g(r8, r9)
            defpackage.epnj.c(r12, r9)
            defpackage.epnj.b(r13, r9)
            epni r8 = defpackage.epnj.a(r9)
            j$.util.Optional r8 = j$.util.Optional.of(r8)
            return r8
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnp.b(exuy, java.lang.String, java.lang.String, epmr, int, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.tnd
            if (r0 == 0) goto L13
            r0 = r6
            tnd r0 = (defpackage.tnd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tnd r0 = new tnd
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fcyh r6 = r5.i
            fcyh r6 = defpackage.eicg.a(r6)
            tnc r2 = new tnc
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnp.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(byte[] r6, byte[] r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.tnf
            if (r0 == 0) goto L13
            r0 = r8
            tnf r0 = (defpackage.tnf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tnf r0 = new tnf
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r8)
            fcyh r8 = r5.i
            fcyh r8 = defpackage.eicg.a(r8)
            tne r2 = new tne
            r4 = 0
            r2.<init>(r4, r5, r6, r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnp.d(byte[], byte[], fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0233, code lost:
    
        if (r1 == r9) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0286, code lost:
    
        if (r1 != r9) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a6 A[Catch: all -> 0x007a, PHI: r0 r1 r2 r3 r4 r7
      0x01a6: PHI (r0v20 epnf) = (r0v17 epnf), (r0v22 epnf) binds: [B:58:0x01a4, B:22:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r1v25 java.lang.Object) = (r1v23 java.lang.Object), (r1v1 java.lang.Object) binds: [B:58:0x01a4, B:22:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r2v27 ??) = (r2v44 ??), (r2v45 ??) binds: [B:58:0x01a4, B:22:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r3v12 epmr) = (r3v10 epmr), (r3v13 epmr) binds: [B:58:0x01a4, B:22:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r4v19 java.lang.String) = (r4v17 java.lang.String), (r4v22 java.lang.String) binds: [B:58:0x01a4, B:22:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r7v5 tng) = (r7v4 tng), (r7v6 tng) binds: [B:58:0x01a4, B:22:0x0077] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:21:0x0074, B:59:0x01a6, B:57:0x0180), top: B:95:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020d A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:67:0x01eb, B:69:0x020d, B:71:0x0213), top: B:95:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0213 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:67:0x01eb, B:69:0x020d, B:71:0x0213), top: B:95:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0291  */
    /* JADX WARN: Type inference failed for: r14v0, types: [tnp] */
    /* JADX WARN: Type inference failed for: r2v20, types: [feav] */
    /* JADX WARN: Type inference failed for: r2v27, types: [feav] */
    /* JADX WARN: Type inference failed for: r2v3, types: [feav, int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [feav] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v5, types: [feav] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r15, long r16, defpackage.epmr r18, defpackage.epnf r19, defpackage.ewyb r20, defpackage.evqs r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnp.e(java.lang.String, long, epmr, epnf, ewyb, evqs, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r23, long r24, defpackage.evqs r26, defpackage.epmr r27, defpackage.epnf r28, defpackage.fcxy r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnp.f(java.lang.String, long, evqs, epmr, epnf, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.evqs r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.tnj
            if (r0 == 0) goto L13
            r0 = r10
            tnj r0 = (defpackage.tnj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            tnj r0 = new tnj
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            java.lang.String r3 = "getLocationInfo"
            java.lang.String r4 = "com/google/android/apps/messaging/cloudstore/cmsrpc/deviceonboarding/CreatePairingDelegate"
            java.lang.String r5 = "BugleAlphaverse"
            r6 = 1
            java.lang.String r7 = "CreatePairingDelegate.kt"
            if (r2 == 0) goto L39
            if (r2 != r6) goto L31
            java.lang.Object r9 = r0.a
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> Lc1
            goto L53
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.fctl.b(r10)
            fcsu r10 = r8.g     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r10 = r10.b()     // Catch: java.lang.Throwable -> Lc1
            ceel r10 = (defpackage.ceel) r10     // Catch: java.lang.Throwable -> Lc1
            eiju r10 = r10.a()     // Catch: java.lang.Throwable -> Lc1
            r0.a = r9     // Catch: java.lang.Throwable -> Lc1
            r0.d = r6     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r10 = defpackage.fdxs.c(r10, r0)     // Catch: java.lang.Throwable -> Lc1
            if (r10 != r1) goto L53
            return r1
        L53:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> Lc1
            r10.getClass()
            java.util.Iterator r10 = r10.iterator()
        L5c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r10.next()
            r1 = r0
            ezlt r1 = (defpackage.ezlt) r1
            ezpl r1 = r1.b
            if (r1 != 0) goto L6f
            ezpl r1 = defpackage.ezpl.a
        L6f:
            java.lang.String r1 = r1.b
            r2 = r9
            evqs r2 = (defpackage.evqs) r2
            java.lang.String r2 = r2.E()
            boolean r1 = defpackage.fdbq.f(r1, r2)
            if (r1 == 0) goto L5c
            goto L80
        L7f:
            r0 = 0
        L80:
            ezlt r0 = (defpackage.ezlt) r0
            if (r0 != 0) goto L9f
            ekrg r9 = defpackage.tnp.a
            ekrw r9 = r9.h()
            ekrz r10 = defpackage.eksq.a
            r9.X(r10, r5)
            r10 = 393(0x189, float:5.51E-43)
            ekrw r9 = r9.h(r4, r3, r10, r7)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r10 = "pairingClientInfo is null, skip updating location info"
            r9.q(r10)
            fctx r9 = defpackage.fctx.a
            return r9
        L9f:
            fcsu r9 = r8.f
            java.lang.Object r9 = r9.b()
            bvqv r9 = (defpackage.bvqv) r9
            java.lang.String r10 = r0.f
            r10.getClass()
            java.lang.String r1 = r0.d
            r1.getClass()
            java.lang.String r2 = r0.e
            r2.getClass()
            java.lang.String r0 = r0.c
            r0.getClass()
            r9.i(r10, r1, r2, r0)
            fctx r9 = defpackage.fctx.a
            return r9
        Lc1:
            r9 = move-exception
            ekrg r10 = defpackage.tnp.a
            ekrw r10 = r10.j()
            ekrz r0 = defpackage.eksq.a
            r10.X(r0, r5)
            ekrd r10 = (defpackage.ekrd) r10
            ekrw r9 = r10.g(r9)
            r10 = 387(0x183, float:5.42E-43)
            ekrw r9 = r9.h(r4, r3, r10, r7)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r10 = "Failed to retrieve device name and geo location info"
            r9.q(r10)
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnp.g(evqs, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133 A[Catch: cpoa -> 0x0218, cpny -> 0x021d, TryCatch #24 {cpny -> 0x021d, cpoa -> 0x0218, blocks: (B:78:0x01f0, B:57:0x012d, B:59:0x0133, B:62:0x016f, B:71:0x01b8, B:73:0x01c7, B:75:0x01cd, B:79:0x0210, B:80:0x0217, B:56:0x0125), top: B:126:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b8 A[Catch: cpoa -> 0x0218, cpny -> 0x021d, TRY_ENTER, TryCatch #24 {cpny -> 0x021d, cpoa -> 0x0218, blocks: (B:78:0x01f0, B:57:0x012d, B:59:0x0133, B:62:0x016f, B:71:0x01b8, B:73:0x01c7, B:75:0x01cd, B:79:0x0210, B:80:0x0217, B:56:0x0125), top: B:126:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v0, types: [tnp] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0198 -> B:145:0x01a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.epnf r22, java.lang.String r23, defpackage.ewyb r24, defpackage.fcxy r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnp.h(epnf, java.lang.String, ewyb, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
    
        if (r0.i(r15, r1) == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.epnf r15, defpackage.epmr r16, java.lang.String r17, defpackage.exuy r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            r14 = this;
            r0 = r19
            boolean r1 = r0 instanceof defpackage.tnm
            if (r1 == 0) goto L15
            r1 = r0
            tnm r1 = (defpackage.tnm) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            tnm r1 = new tnm
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r1.c
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L42
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2d
            defpackage.fctl.b(r0)
            goto Ld1
        L2d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L35:
            byte[] r15 = r1.g
            java.lang.String r3 = r1.f
            epmr r5 = r1.e
            epnf r6 = r1.d
            defpackage.fctl.b(r0)
            r9 = r3
            goto L98
        L42:
            defpackage.fctl.b(r0)
            fcsu r0 = r14.b
            java.lang.Object r3 = r0.b()
            ceco r3 = (defpackage.ceco) r3
            epnh r9 = r3.b(r15)
            if (r9 == 0) goto L6d
            ewyb r10 = l(r16)
            java.lang.Object r0 = r0.b()
            r6 = r0
            ceco r6 = (defpackage.ceco) r6
            java.lang.String r7 = r15.c
            r7.getClass()
            r11 = 3
            r12 = 32
            r8 = r17
            j$.util.Optional r15 = defpackage.ceco.r(r6, r7, r8, r9, r10, r11, r12)
            return r15
        L6d:
            java.lang.Object r3 = r0.b()
            ceco r3 = (defpackage.ceco) r3
            r6 = r18
            byte[] r3 = r3.l(r6)
            java.lang.Object r0 = r0.b()
            ceco r0 = (defpackage.ceco) r0
            r1.d = r15
            r6 = r16
            r1.e = r6
            r8 = r17
            r1.f = r8
            r1.g = r3
            r1.c = r5
            java.lang.Object r0 = r0.f(r1)
            if (r0 != r2) goto L94
            goto Ld0
        L94:
            r5 = r6
            r9 = r8
            r6 = r15
            r15 = r3
        L98:
            r10 = r0
            epnh r10 = (defpackage.epnh) r10
            if (r10 == 0) goto Lb7
            ewyb r11 = l(r5)
            fcsu r15 = r14.b
            java.lang.Object r15 = r15.b()
            r7 = r15
            ceco r7 = (defpackage.ceco) r7
            java.lang.String r8 = r6.c
            r8.getClass()
            r12 = 3
            r13 = 32
            j$.util.Optional r15 = defpackage.ceco.r(r7, r8, r9, r10, r11, r12, r13)
            return r15
        Lb7:
            fcsu r0 = r14.b
            java.lang.Object r0 = r0.b()
            ceco r0 = (defpackage.ceco) r0
            r3 = 0
            r1.d = r3
            r1.e = r3
            r1.f = r3
            r1.g = r3
            r1.c = r4
            java.lang.Object r15 = r0.i(r15, r1)
            if (r15 != r2) goto Ld1
        Ld0:
            return r2
        Ld1:
            j$.util.Optional r15 = j$.util.Optional.empty()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnp.i(epnf, epmr, java.lang.String, exuy, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.epnf r19, defpackage.epmr r20, java.lang.String r21, defpackage.exuy r22, defpackage.evqs r23, defpackage.fcxy r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnp.j(epnf, epmr, java.lang.String, exuy, evqs, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (r15 != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e0, code lost:
    
        if (r15 != r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.epms r10, java.lang.String r11, long r12, defpackage.evqs r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnp.k(epms, java.lang.String, long, evqs, fcxy):java.lang.Object");
    }
}
