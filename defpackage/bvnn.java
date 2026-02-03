package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvnn extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ bvmw c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvnn(bvmw bvmwVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bvmwVar;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvnn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (r7.k(r3, (java.lang.String) r1, true, r6) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 == r3) goto L11
            defpackage.fctl.b(r7)
            goto L71
        L11:
            java.lang.Object r1 = r6.a
            defpackage.fctl.b(r7)
            goto L51
        L17:
            defpackage.fctl.b(r7)
            goto L31
        L1b:
            defpackage.fctl.b(r7)
            bvmw r7 = r6.c
            bvpo r1 = defpackage.bvpp.a
            bvnm r5 = new bvnm
            r5.<init>(r7, r2)
            r6.b = r4
            efwo r7 = r7.a
            java.lang.Object r7 = r1.a(r7, r3, r5, r6)
            if (r7 == r0) goto L76
        L31:
            egbe r7 = (defpackage.egbe) r7
            egbs r1 = r7.b()
            java.lang.String r1 = r1.g
            r1.getClass()
            bvmw r5 = r6.c
            egbs r7 = r7.b()
            java.lang.String r7 = r7.k
            r7.getClass()
            r6.a = r1
            r6.b = r3
            java.lang.Object r7 = r5.w(r7, r1, r6)
            if (r7 == r0) goto L76
        L51:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5f
            r7 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L5f:
            bvmw r7 = r6.c
            int r3 = r6.d
            r6.a = r2
            r2 = 3
            r6.b = r2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r7 = r7.k(r3, r1, r4, r6)
            if (r7 != r0) goto L71
            goto L76
        L71:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvnn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvnn(this.c, this.d, fcxyVar);
    }
}
