package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avjz implements avjo {
    public static final /* synthetic */ int e = 0;
    private static final eksp f = eksp.c("BugleContacts");
    public final cmfo a;
    public final avdm b;
    public final fcsu c;
    public final avlc d;
    private final fcyh g;
    private final fcyh h;
    private final cogw i;
    private final avdr j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final byeq t;

    public avjz(fcyh fcyhVar, fcyh fcyhVar2, cogw cogwVar, byeq byeqVar, cmfo cmfoVar, avdr avdrVar, avdm avdmVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, avlc avlcVar, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10) {
        fcyhVar.getClass();
        fcyhVar2.getClass();
        cogwVar.getClass();
        byeqVar.getClass();
        cmfoVar.getClass();
        avdrVar.getClass();
        avdmVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        avlcVar.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        this.g = fcyhVar;
        this.h = fcyhVar2;
        this.i = cogwVar;
        this.t = byeqVar;
        this.a = cmfoVar;
        this.j = avdrVar;
        this.b = avdmVar;
        this.k = fcsuVar;
        this.l = fcsuVar2;
        this.c = fcsuVar3;
        this.m = fcsuVar4;
        this.n = fcsuVar5;
        this.o = fcsuVar6;
        this.p = fcsuVar7;
        this.d = avlcVar;
        this.q = fcsuVar8;
        this.r = fcsuVar9;
        this.s = fcsuVar10;
    }

    @Override // defpackage.avjo
    public final Object a(int i, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.g), new avjy(null, this, i), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0108, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r7, final defpackage.evvp r8, defpackage.dzub r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avjz.b(int, evvp, dzub, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.avjv
            if (r0 == 0) goto L13
            r0 = r8
            avjv r0 = (defpackage.avjv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avjv r0 = new avjv
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            eieu r7 = r0.d
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L63
        L29:
            r8 = move-exception
            goto L6f
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.fctl.b(r8)
            java.lang.String r8 = "DeletedContactsSync#sync"
            eieu r8 = defpackage.eiiy.h(r8)
            eksp r2 = defpackage.avjz.f     // Catch: java.lang.Throwable -> L6b
            ekrw r2 = r2.e()     // Catch: java.lang.Throwable -> L6b
            eksl r2 = (defpackage.eksl) r2     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = "Syncing deleted contacts"
            r2.q(r4)     // Catch: java.lang.Throwable -> L6b
            fcsu r2 = r6.c     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L6b
            r2.getClass()     // Catch: java.lang.Throwable -> L6b
            ains r2 = (defpackage.ains) r2     // Catch: java.lang.Throwable -> L6b
            r4 = 2
            defpackage.avbu.b(r2, r4)     // Catch: java.lang.Throwable -> L6b
            r0.d = r8     // Catch: java.lang.Throwable -> L6b
            r0.c = r3     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r7 = r6.d(r7, r0)     // Catch: java.lang.Throwable -> L6b
            if (r7 == r1) goto L6a
            r7 = r8
        L63:
            r8 = 0
            defpackage.fczl.a(r7, r8)
            fctx r7 = defpackage.fctx.a
            return r7
        L6a:
            return r1
        L6b:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L6f:
            fcsu r0 = r6.c     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L7f
            r0.getClass()     // Catch: java.lang.Throwable -> L7f
            ains r0 = (defpackage.ains) r0     // Catch: java.lang.Throwable -> L7f
            r1 = 4
            defpackage.avbu.b(r0, r1)     // Catch: java.lang.Throwable -> L7f
            throw r8     // Catch: java.lang.Throwable -> L7f
        L7f:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L81
        L81:
            r0 = move-exception
            defpackage.fczl.a(r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avjz.c(int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x010f, code lost:
    
        if (b(r1, r4, r14, r2) == r3) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02ab, code lost:
    
        if (defpackage.fdin.a(r4, r5, r2) != r3) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0129 A[PHI: r1 r4 r10 r14 r15
      0x0129: PHI (r1v20 java.lang.Object) = (r1v18 java.lang.Object), (r1v1 java.lang.Object) binds: [B:35:0x0127, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0129: PHI (r4v11 evvp) = (r4v8 evvp), (r4v17 evvp) binds: [B:35:0x0127, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0129: PHI (r10v9 int) = (r10v5 int), (r10v10 int) binds: [B:35:0x0127, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0129: PHI (r14v5 dzub) = (r14v3 dzub), (r14v7 dzub) binds: [B:35:0x0127, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0129: PHI (r15v7 int) = (r15v5 int), (r15v8 int) binds: [B:35:0x0127, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0141 A[LOOP:1: B:37:0x013b->B:39:0x0141, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024c A[LOOP:0: B:73:0x0246->B:75:0x024c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r27, defpackage.fcxy r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avjz.d(int, fcxy):java.lang.Object");
    }
}
