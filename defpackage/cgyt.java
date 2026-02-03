package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgyt extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgzi b;
    final /* synthetic */ cgyi c;
    final /* synthetic */ chbd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgyt(cgzi cgziVar, cgyi cgyiVar, chbd chbdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cgziVar;
        this.c = cgyiVar;
        this.d = chbdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgyt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r8.m(r1, r2.a, r7) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        if (r8.i(r7) != r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
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
            r2 = 6
            r3 = 2
            r4 = 3
            switch(r1) {
                case 0: goto L26;
                case 1: goto L22;
                case 2: goto L1d;
                case 3: goto L19;
                case 4: goto L15;
                case 5: goto L10;
                case 6: goto Lb;
                case 7: goto L10;
                default: goto La;
            }
        La:
            goto L1d
        Lb:
            defpackage.fctl.b(r8)
            goto Lb2
        L10:
            defpackage.fctl.b(r8)
            goto Lbe
        L15:
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L86
            goto L77
        L19:
            defpackage.fctl.b(r8)
            goto L68
        L1d:
            defpackage.fctl.b(r8)
            goto Lcb
        L22:
            defpackage.fctl.b(r8)
            goto L3c
        L26:
            defpackage.fctl.b(r8)
            cgzi r8 = r7.b
            cgyi r1 = r7.c
            chbd r5 = r7.d
            r6 = 1
            r7.a = r6
            java.lang.Object r6 = r1.b
            cgxv r1 = r1.a
            java.lang.Object r8 = r8.o(r6, r1, r5, r7)
            if (r8 == r0) goto Lca
        L3c:
            chah r8 = (defpackage.chah) r8
            chah r1 = defpackage.chah.b
            if (r8 == r1) goto L54
            cgzi r8 = r7.b
            chbd r1 = r7.d
            cgyi r2 = r7.c
            r7.a = r3
            cgxv r2 = r2.a
            java.lang.Object r8 = r8.m(r1, r2, r7)
            if (r8 != r0) goto Lcb
            goto Lca
        L54:
            cgzi r8 = r7.b
            chbd r1 = r7.d
            cgyi r5 = r7.c
            cgxy r1 = r1.b
            r7.a = r4
            cgxv r6 = r5.a
            java.lang.Object r5 = r5.b
            java.lang.Object r8 = r8.j(r1, r6, r5, r7)
            if (r8 == r0) goto Lca
        L68:
            cgyg r8 = (defpackage.cgyg) r8
            chbd r1 = r7.d     // Catch: java.lang.Throwable -> L86
            cgxy r1 = r1.b     // Catch: java.lang.Throwable -> L86
            r8.getClass()     // Catch: java.lang.Throwable -> L86
            r1 = 4
            r7.a = r1     // Catch: java.lang.Throwable -> L86
            if (r8 != r0) goto L77
            goto Lca
        L77:
            cgzi r1 = r7.b     // Catch: java.lang.Throwable -> L86
            chbd r5 = r7.d     // Catch: java.lang.Throwable -> L86
            cgyg r8 = (defpackage.cgyg) r8     // Catch: java.lang.Throwable -> L86
            int r6 = r5.g     // Catch: java.lang.Throwable -> L86
            cgxy r5 = r5.b     // Catch: java.lang.Throwable -> L86
            cgyg r8 = r1.g(r8, r6, r5)     // Catch: java.lang.Throwable -> L86
            goto L8c
        L86:
            cgyg r8 = new cgyg
            r1 = 0
            r8.<init>(r4, r1, r2)
        L8c:
            int r8 = r8.c
            if (r8 != r3) goto La2
            cgzi r8 = r7.b
            chbd r1 = r7.d
            cgyi r2 = r7.c
            r3 = 5
            r7.a = r3
            cgxv r2 = r2.a
            java.lang.Object r8 = r8.n(r1, r2, r7)
            if (r8 == r0) goto Lca
            goto Lbe
        La2:
            cgzi r8 = r7.b
            chbd r1 = r7.d
            cgzx r1 = r1.a
            r7.a = r2
            chbf r8 = r8.f
            java.lang.Object r8 = r8.f(r1, r7)
            if (r8 == r0) goto Lca
        Lb2:
            cgzi r8 = r7.b
            r1 = 7
            r7.a = r1
            java.lang.Object r8 = defpackage.cgzi.s(r8, r7)
            if (r8 != r0) goto Lbe
            goto Lca
        Lbe:
            cgzi r8 = r7.b
            r1 = 8
            r7.a = r1
            java.lang.Object r8 = r8.i(r7)
            if (r8 != r0) goto Lcb
        Lca:
            return r0
        Lcb:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgyt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cgyt(this.b, this.c, this.d, fcxyVar);
    }
}
