package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctgp extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctgq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctgp(ctgq ctgqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctgqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctgp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        if (r13 != r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        r13 = (defpackage.csmb) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        if (r13.b == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        if (r13.a == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
    
        return java.lang.Boolean.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
    
        if (r13 == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
    
        if (((defpackage.abzu) r13) != defpackage.abzu.YES) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
    
        return java.lang.Boolean.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r1 != 4) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r12.a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            if (r1 == 0) goto L24
            if (r1 == r5) goto L20
            if (r1 == r4) goto L1c
            defpackage.fctl.b(r13)
            if (r1 == r3) goto L79
            if (r1 == r2) goto L9c
            goto Lcb
        L1c:
            defpackage.fctl.b(r13)
            goto L5e
        L20:
            defpackage.fctl.b(r13)
            goto L41
        L24:
            defpackage.fctl.b(r13)
            boolean r13 = defpackage.crtr.e()
            if (r13 != 0) goto L2e
            return r7
        L2e:
            ctgq r13 = r12.b
            ecjh r13 = r13.b
            com.google.common.util.concurrent.ListenableFuture r13 = r13.a()
            r13.getClass()
            r12.a = r5
            java.lang.Object r13 = defpackage.fdxs.c(r13, r12)
            if (r13 == r0) goto Ld8
        L41:
            ctgv r13 = (defpackage.ctgv) r13
            long r8 = r13.b
            r10 = 0
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 <= 0) goto L4c
            return r7
        L4c:
            ctgq r13 = r12.b
            fcsu r13 = r13.c
            java.lang.Object r13 = r13.b()
            csmf r13 = (defpackage.csmf) r13
            r12.a = r4
            java.lang.Object r13 = r13.d(r12)
            if (r13 == r0) goto Ld8
        L5e:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L67
            return r7
        L67:
            ctgq r13 = r12.b
            fcsu r13 = r13.d
            java.lang.Object r13 = r13.b()
            cslj r13 = (defpackage.cslj) r13
            r12.a = r3
            java.lang.Object r13 = r13.c(r12)
            if (r13 == r0) goto Ld8
        L79:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L82
            return r7
        L82:
            boolean r13 = defpackage.crtr.c()
            if (r13 == 0) goto Lad
            ctgq r13 = r12.b
            fcsu r1 = r13.c
            java.lang.Object r1 = r1.b()
            csmf r1 = (defpackage.csmf) r1
            r12.a = r2
            efwo r13 = r13.e
            java.lang.Object r13 = r1.c(r13, r12)
            if (r13 == r0) goto Ld8
        L9c:
            csmb r13 = (defpackage.csmb) r13
            boolean r0 = r13.b
            if (r0 == 0) goto La7
            boolean r13 = r13.a
            if (r13 == 0) goto La7
            goto La8
        La7:
            r5 = r6
        La8:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)
            return r13
        Lad:
            ctgq r13 = r12.b
            fcsu r1 = r13.f
            java.lang.Object r1 = r1.b()
            abzv r1 = (defpackage.abzv) r1
            etfr r2 = defpackage.etfy.a
            java.lang.String r2 = r2.a
            efwo r13 = r13.e
            eiju r13 = r1.a(r13, r2)
            r1 = 5
            r12.a = r1
            java.lang.Object r13 = defpackage.fdxs.c(r13, r12)
            if (r13 != r0) goto Lcb
            goto Ld8
        Lcb:
            abzu r13 = (defpackage.abzu) r13
            abzu r0 = defpackage.abzu.YES
            if (r13 != r0) goto Ld2
            goto Ld3
        Ld2:
            r5 = r6
        Ld3:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)
            return r13
        Ld8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctgp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctgp(this.b, fcxyVar);
    }
}
