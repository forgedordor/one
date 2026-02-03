package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbom extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cbon d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbom(cbon cbonVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = cbonVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbom) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r8 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        if (r8.b(r1, r2, r7) == r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f A[SYNTHETIC] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L14
            defpackage.fctl.b(r8)     // Catch: defpackage.cbpc -> L11
            goto La3
        L11:
            r8 = move-exception
            goto L96
        L14:
            java.lang.Object r1 = r7.b
            java.lang.Object r3 = r7.a
            defpackage.fctl.b(r8)
            goto L4f
        L1c:
            defpackage.fctl.b(r8)
            goto L3a
        L20:
            defpackage.fctl.b(r8)
            cqce r8 = defpackage.cbon.a
            java.lang.String r1 = "Ending Heavy Work"
            r8.p(r1)
            cbon r8 = r7.d
            cbor r8 = r8.c
            cmfo r8 = r8.a()
            r7.c = r3
            java.lang.Object r8 = r8.c(r7)
            if (r8 == r0) goto Lb0
        L3a:
            cbow r8 = (defpackage.cbow) r8
            evtg r8 = r8.d
            r8.getClass()
            cbon r1 = r7.d
            java.util.Set r3 = defpackage.fcva.av(r8)
            java.util.Set r8 = r1.b
            ekon r8 = (defpackage.ekon) r8
            ekqg r1 = r8.listIterator()
        L4f:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L7f
            java.lang.Object r8 = r1.next()
            cbpj r8 = (defpackage.cbpj) r8
            cqce r4 = defpackage.cbon.a
            cqbd r4 = r4.c()
            java.lang.String r5 = "Unpausing agent"
            r4.I(r5)
            java.lang.String r5 = r8.a()
            java.lang.String r6 = "agent"
            r4.A(r6, r5)
            r4.r()
            r7.a = r3
            r7.b = r1
            r7.c = r2
            java.lang.Object r8 = r8.c()
            if (r8 != r0) goto L4f
            goto Lb0
        L7f:
            cbon r8 = r7.d     // Catch: defpackage.cbpc -> L11
            cbph r8 = r8.d     // Catch: defpackage.cbpc -> L11
            cbov r1 = defpackage.cbov.STOPPING     // Catch: defpackage.cbpc -> L11
            cbov r2 = defpackage.cbov.NONE     // Catch: defpackage.cbpc -> L11
            r3 = 0
            r7.a = r3     // Catch: defpackage.cbpc -> L11
            r7.b = r3     // Catch: defpackage.cbpc -> L11
            r3 = 3
            r7.c = r3     // Catch: defpackage.cbpc -> L11
            java.lang.Object r8 = r8.b(r1, r2, r7)     // Catch: defpackage.cbpc -> L11
            if (r8 != r0) goto La3
            goto Lb0
        L96:
            cbov r0 = r8.a
            cbov r1 = defpackage.cbov.RESTARTING
            if (r0 != r1) goto Laf
            cqce r8 = defpackage.cbon.a
            java.lang.String r0 = "Not setting status to NONE; Heavy Work is restarting"
            r8.p(r0)
        La3:
            cqce r8 = defpackage.cbon.a
            java.lang.String r0 = "Ended Heavy Work"
            r8.p(r0)
            cbcw r8 = defpackage.cbcw.i()
            return r8
        Laf:
            throw r8
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbom.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cbom(this.d, fcxyVar);
    }
}
