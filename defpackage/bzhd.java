package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzhd extends fcyz implements fdat {
    int a;
    final /* synthetic */ Throwable b;
    final /* synthetic */ bzhe c;
    final /* synthetic */ bzbz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzhd(Throwable th, bzhe bzheVar, bzbz bzbzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = th;
        this.c = bzheVar;
        this.d = bzbzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzhd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (defpackage.fdxs.c(r8, r7) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (defpackage.fdxs.c(r8, r7) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        return r0;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 1
            defpackage.fctl.b(r8)
            if (r1 == 0) goto Lc
            goto L83
        Lc:
            java.lang.Throwable r8 = r7.b
            boolean r1 = r8 instanceof defpackage.cpza
            java.lang.String r3 = "Error in CmsUpdaterOutcomeHandler"
            if (r1 != 0) goto L50
            eksp r1 = defpackage.bzhe.a
            boolean r1 = r8 instanceof defpackage.fbtf
            if (r1 != 0) goto L83
            boolean r1 = r8 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L22
            r1 = r8
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            goto L23
        L22:
            r1 = 0
        L23:
            if (r1 != 0) goto L2a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r8)
        L2a:
            bzhe r8 = r7.c
            bzbz r4 = r7.d
            bzdi r5 = new bzdi
            java.lang.String r6 = r8.e
            r5.<init>(r6, r4, r1)
            apqc r1 = r8.d
            boolean r1 = r1.a()
            if (r1 != 0) goto L4c
            cden r8 = r8.c
            eiju r8 = r8.b(r5)
            r7.a = r2
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)
            if (r8 != r0) goto L83
            goto L7f
        L4c:
            defpackage.cpri.c(r3, r5)
            goto L83
        L50:
            r1 = r8
            cpza r1 = (defpackage.cpza) r1
            bzbz r4 = r7.d
            int r1 = r1.a()
            int r1 = r1 + (-1)
            r5 = 2
            if (r1 == r2) goto L61
            if (r1 == r5) goto L67
            goto L83
        L61:
            bzch r1 = r4.b
            int r1 = r1.c
            if (r1 != 0) goto L83
        L67:
            bzhe r1 = r7.c
            apqc r2 = r1.d
            boolean r2 = r2.a()
            if (r2 != 0) goto L80
            cden r1 = r1.c
            eiju r8 = r1.b(r8)
            r7.a = r5
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)
            if (r8 != r0) goto L83
        L7f:
            return r0
        L80:
            defpackage.cpri.c(r3, r8)
        L83:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzhd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzhd(this.b, this.c, this.d, fcxyVar);
    }
}
