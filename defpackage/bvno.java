package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvno extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ egbv c;
    final /* synthetic */ bvmw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvno(egbv egbvVar, bvmw bvmwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = egbvVar;
        this.d = bvmwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvno) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r6.k(8, (java.lang.String) r1, false, r5) == r0) goto L18;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r6)
            goto L53
        Ld:
            java.lang.Object r1 = r5.a
            defpackage.fctl.b(r6)
            goto L32
        L13:
            defpackage.fctl.b(r6)
            egbv r6 = r5.c
            egdc r6 = (defpackage.egdc) r6
            egbs r6 = r6.b
            java.lang.String r1 = r6.g
            r1.getClass()
            bvmw r3 = r5.d
            java.lang.String r6 = r6.k
            r6.getClass()
            r5.a = r1
            r5.b = r2
            java.lang.Object r6 = r3.w(r6, r1, r5)
            if (r6 == r0) goto L58
        L32:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r3 = 0
            if (r6 == 0) goto L40
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L40:
            bvmw r6 = r5.d
            r4 = 0
            r5.a = r4
            r4 = 2
            r5.b = r4
            r4 = 8
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r6 = r6.k(r4, r1, r3, r5)
            if (r6 != r0) goto L53
            goto L58
        L53:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvno.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvno(this.c, this.d, fcxyVar);
    }
}
