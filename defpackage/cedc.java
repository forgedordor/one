package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cedc {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/net/AccountLinker");
    public final fdjx a;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public cedc(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.a = fdjxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (b(r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.efwo r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cecu
            if (r0 == 0) goto L13
            r0 = r7
            cecu r0 = (defpackage.cecu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cecu r0 = new cecu
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            goto L4d
        L36:
            defpackage.fctl.b(r7)
            fcsu r7 = r5.e
            java.lang.Object r7 = r7.b()
            egbf r7 = (defpackage.egbf) r7
            com.google.common.util.concurrent.ListenableFuture r6 = r7.c(r6)
            r0.c = r4
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 == r1) goto L64
        L4d:
            egbe r7 = (defpackage.egbe) r7
            egbs r6 = r7.b()
            java.lang.String r6 = r6.g
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = r5.b(r6, r0)
            if (r6 != r1) goto L61
            goto L64
        L61:
            fctx r6 = defpackage.fctx.a
            return r6
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cedc.a(efwo, fcxy):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:31:0x00c0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[PHI: r2 r12
      0x006c: PHI (r2v3 java.lang.String) = 
      (r2v1 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v5 java.lang.String)
      (r2v5 java.lang.String)
     binds: [B:22:0x0064, B:31:0x00c0, B:29:0x00bd, B:37:0x006c, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x006c: PHI (r12v4 ??) = (r12v2 ??), (r12v3 ??), (r12v3 ??), (r12v9 ??), (r12v9 ??) binds: [B:22:0x0064, B:31:0x00c0, B:29:0x00bd, B:37:0x006c, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00bd -> B:23:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, defpackage.fcxy r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.cecv
            if (r0 == 0) goto L13
            r0 = r13
            cecv r0 = (defpackage.cecv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cecv r0 = new cecv
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            java.lang.String r3 = "link"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/net/AccountLinker"
            java.lang.String r5 = "BugleAlphaverse"
            r6 = 3
            r7 = 2
            r8 = 1
            java.lang.String r9 = "AccountLinker.kt"
            if (r2 == 0) goto L4f
            if (r2 == r8) goto L49
            if (r2 == r7) goto L41
            if (r2 != r6) goto L39
            java.lang.Object r12 = r0.a
            java.lang.String r2 = r0.e
            defpackage.fctl.b(r13)     // Catch: defpackage.cekv -> Lc0
            goto L6c
        L39:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L41:
            java.lang.Object r12 = r0.a
            java.lang.String r2 = r0.e
            defpackage.fctl.b(r13)
            goto Lad
        L49:
            java.lang.String r12 = r0.e
            defpackage.fctl.b(r13)
            goto L64
        L4f:
            defpackage.fctl.b(r13)
            fcsu r13 = r11.c
            java.lang.Object r13 = r13.b()
            dghj r13 = (defpackage.dghj) r13
            r0.e = r12
            r0.d = r8
            java.lang.Object r13 = r13.j(r0)
            if (r13 == r1) goto Ldc
        L64:
            java.util.Set r13 = (java.util.Set) r13
            java.util.Iterator r13 = r13.iterator()
            r2 = r12
            r12 = r13
        L6c:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto Ld9
            java.lang.Object r13 = r12.next()
            dggk r13 = (defpackage.dggk) r13
            ekrg r8 = defpackage.cedc.b
            ekrw r8 = r8.h()
            ekrz r10 = defpackage.eksq.a
            r8.X(r10, r5)
            r10 = 41
            ekrw r8 = r8.h(r4, r3, r10, r9)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r10 = "Linking one phone number."
            r8.q(r10)
            fcsu r8 = r11.d
            java.lang.Object r8 = r8.b()
            cejj r8 = (defpackage.cejj) r8
            java.lang.String r13 = r13.a
            eiju r13 = r8.b(r13)
            r13.getClass()
            r0.e = r2
            r0.a = r12
            r0.d = r7
            java.lang.Object r13 = defpackage.fdxs.c(r13, r0)
            if (r13 == r1) goto Ldc
        Lad:
            cejg r13 = (defpackage.cejg) r13
            eiju r13 = r13.r(r2)     // Catch: defpackage.cekv -> Lc0
            r0.e = r2     // Catch: defpackage.cekv -> Lc0
            r0.a = r12     // Catch: defpackage.cekv -> Lc0
            r0.d = r6     // Catch: defpackage.cekv -> Lc0
            java.lang.Object r13 = defpackage.fdxs.c(r13, r0)     // Catch: defpackage.cekv -> Lc0
            if (r13 != r1) goto L6c
            goto Ldc
        Lc0:
            ekrg r13 = defpackage.cedc.b
            ekrw r13 = r13.h()
            ekrz r8 = defpackage.eksq.a
            r13.X(r8, r5)
            r8 = 47
            ekrw r13 = r13.h(r4, r3, r8, r9)
            ekrd r13 = (defpackage.ekrd) r13
            java.lang.String r8 = "Cannot link the phone number because the registration is not ready."
            r13.q(r8)
            goto L6c
        Ld9:
            fctx r12 = defpackage.fctx.a
            return r12
        Ldc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cedc.b(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.efwo r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cecy
            if (r0 == 0) goto L13
            r0 = r7
            cecy r0 = (defpackage.cecy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cecy r0 = new cecy
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            goto L4d
        L36:
            defpackage.fctl.b(r7)
            fcsu r7 = r5.e
            java.lang.Object r7 = r7.b()
            egbf r7 = (defpackage.egbf) r7
            com.google.common.util.concurrent.ListenableFuture r6 = r7.c(r6)
            r0.c = r4
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 == r1) goto L62
        L4d:
            egbe r7 = (defpackage.egbe) r7
            egbs r6 = r7.b()
            java.lang.String r6 = r6.g
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = r5.d(r6, r0)
            if (r6 != r1) goto L61
            goto L62
        L61:
            return r6
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cedc.c(efwo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r15 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        if (defpackage.fdxs.c(r15, r0) == r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d8 -> B:31:0x00da). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cedc.d(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.efwo r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ceda
            if (r0 == 0) goto L13
            r0 = r7
            ceda r0 = (defpackage.ceda) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ceda r0 = new ceda
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            goto L4d
        L36:
            defpackage.fctl.b(r7)
            fcsu r7 = r5.e
            java.lang.Object r7 = r7.b()
            egbf r7 = (defpackage.egbf) r7
            com.google.common.util.concurrent.ListenableFuture r6 = r7.c(r6)
            r0.c = r4
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 == r1) goto L62
        L4d:
            egbe r7 = (defpackage.egbe) r7
            egbs r6 = r7.b()
            java.lang.String r6 = r6.g
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = r5.f(r6, r0)
            if (r6 != r1) goto L61
            goto L62
        L61:
            return r6
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cedc.e(efwo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:28|29|30|46|31|32|33) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:13|(3:50|14|15)|48|35|39|(1:41)|42|24|(3:26|(7:28|29|30|46|31|32|33)|44)(1:43)) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (r1 != r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0129, code lost:
    
        if (defpackage.fdxs.c(r0, r2) == r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012e, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0129 -> B:48:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x012f -> B:39:0x0148). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cedc.f(java.lang.String, fcxy):java.lang.Object");
    }
}
