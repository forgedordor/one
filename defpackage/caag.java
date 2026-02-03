package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caag implements caap {
    private static final cqce a = cqce.g("BugleCms", "CmsInitialSyncErrorHandler");
    private final bzmy b;
    private final cpmi c;
    private final aukz d;

    public caag(bzmy bzmyVar, cpmi cpmiVar, aukz aukzVar) {
        this.b = bzmyVar;
        this.c = cpmiVar;
        this.d = aukzVar;
    }

    @Override // defpackage.caap
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, cayy cayyVar, caas caasVar, Exception exc, fcxy fcxyVar) {
        return b((bzzy) obj, obj2, cayyVar, exc, fcxyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        if (defpackage.fdxs.c(r13, r1) == r2) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.bzzy r13, java.lang.Object r14, defpackage.cayy r15, java.lang.Exception r16, defpackage.fcxy r17) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.caaf
            if (r1 == 0) goto L15
            r1 = r0
            caaf r1 = (defpackage.caaf) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            caaf r1 = new caaf
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.b
            fcyl r2 = defpackage.fcyl.a
            int r3 = r1.d
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2d
            defpackage.fctl.b(r0)
            goto Lbe
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            java.lang.Object r13 = r1.a
            defpackage.fctl.b(r0)
            goto La8
        L3c:
            defpackage.fctl.b(r0)
            cqce r0 = defpackage.caag.a
            java.lang.String r3 = "CMS sync encountered a permanent failure and will halt"
            r0.n(r3)
            boolean r0 = r14 instanceof defpackage.cang
            if (r0 == 0) goto L98
            aukz r6 = r12.d
            cang r14 = (defpackage.cang) r14
            int r14 = r14.e
            cank r14 = defpackage.cank.b(r14)
            if (r14 != 0) goto L58
            cank r14 = defpackage.cank.NONE
        L58:
            r14.getClass()
            int r14 = r14.ordinal()
            if (r14 == 0) goto L7b
            r0 = 5
            if (r14 == r5) goto L79
            if (r14 == r4) goto L78
            r3 = 4
            r7 = 3
            if (r14 == r7) goto L76
            if (r14 == r3) goto L7c
            if (r14 != r0) goto L70
            r7 = r4
            goto L7c
        L70:
            fctg r13 = new fctg
            r13.<init>()
            throw r13
        L76:
            r7 = r3
            goto L7c
        L78:
            r0 = 6
        L79:
            r7 = r0
            goto L7c
        L7b:
            r7 = r5
        L7c:
            cazc r14 = r15.a()
            caxm r14 = (defpackage.caxm) r14
            int r14 = r14.c
            if (r16 != 0) goto L8f
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r3 = "Error info lost."
            r0.<init>(r3)
            r9 = r0
            goto L91
        L8f:
            r9 = r16
        L91:
            int r8 = r14 + (-1)
            r10 = 3
            r11 = 0
            r6.w(r7, r8, r9, r10, r11)
        L98:
            bzmy r14 = r12.b
            eiju r14 = r14.b(r5)
            r1.a = r13
            r1.d = r5
            java.lang.Object r14 = defpackage.fdxs.c(r14, r1)
            if (r14 == r2) goto Lc1
        La8:
            cpmi r14 = r12.c
            efwo r13 = r13.gd()
            eiju r13 = r14.c(r13, r5)
            r14 = 0
            r1.a = r14
            r1.d = r4
            java.lang.Object r13 = defpackage.fdxs.c(r13, r1)
            if (r13 != r2) goto Lbe
            goto Lc1
        Lbe:
            fctx r13 = defpackage.fctx.a
            return r13
        Lc1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caag.b(bzzy, java.lang.Object, cayy, java.lang.Exception, fcxy):java.lang.Object");
    }
}
