package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvbu extends fcyz implements fdat {
    int a;
    final /* synthetic */ dvca b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvbu(dvca dvcaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dvcaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvbu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        if (r1.c(r9) != r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[PHI: r1
      0x0085: PHI (r1v9 fdkf) = (r1v8 fdkf), (r1v15 fdkf) binds: [B:18:0x0083, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.a
            r2 = 2
            r3 = 1
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L2d
            if (r1 == r3) goto L25
            if (r1 == r2) goto L1d
            if (r1 == r4) goto L15
            defpackage.fctl.b(r10)
            goto L91
        L15:
            java.lang.Object r1 = r9.c
            fdkf r1 = (defpackage.fdkf) r1
            defpackage.fctl.b(r10)
            goto L85
        L1d:
            java.lang.Object r1 = r9.c
            fdkf r1 = (defpackage.fdkf) r1
            defpackage.fctl.b(r10)
            goto L70
        L25:
            java.lang.Object r1 = r9.c
            fdkf r1 = (defpackage.fdkf) r1
            defpackage.fctl.b(r10)
            goto L61
        L2d:
            defpackage.fctl.b(r10)
            java.lang.Object r10 = r9.c
            fdjx r10 = (defpackage.fdjx) r10
            dvca r1 = r9.b
            afp r6 = r1.b
            com.google.common.util.concurrent.ListenableFuture r6 = r6.b()
            dvbs r7 = new dvbs
            r7.<init>(r6, r5)
            fdkf r10 = defpackage.fdil.c(r10, r5, r7, r4)
            dvbt r7 = new dvbt
            r7.<init>(r6)
            r10.hK(r7)
            r9.c = r10
            r9.a = r3
            dvck r3 = new dvck
            dvcp r1 = r1.c
            r3.<init>(r1, r5)
            java.lang.Object r1 = defpackage.fdjy.a(r3, r9)
            if (r1 == r0) goto L94
            r8 = r1
            r1 = r10
            r10 = r8
        L61:
            fdkf r10 = (defpackage.fdkf) r10
            r9.c = r10
            r9.a = r2
            java.lang.Object r1 = r1.c(r9)
            if (r1 == r0) goto L94
            r8 = r1
            r1 = r10
            r10 = r8
        L70:
            dvca r2 = r9.b
            afx r10 = (defpackage.afx) r10
            java.util.Set r10 = r10.a()
            r10.getClass()
            r9.c = r1
            r9.a = r4
            java.lang.Object r10 = r2.g(r10, r9)
            if (r10 == r0) goto L94
        L85:
            r9.c = r5
            r10 = 4
            r9.a = r10
            java.lang.Object r10 = r1.c(r9)
            if (r10 != r0) goto L91
            goto L94
        L91:
            fctx r10 = defpackage.fctx.a
            return r10
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvbu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dvbu dvbuVar = new dvbu(this.b, fcxyVar);
        dvbuVar.c = obj;
        return dvbuVar;
    }
}
