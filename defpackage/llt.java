package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class llt extends fcyz implements fdap {
    Object a;
    int b;
    final /* synthetic */ llu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llt(llu lluVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.c = lluVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r6 == r0) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Exception {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L12
            java.lang.Object r0 = r5.a
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L10
            goto L5a
        L10:
            r6 = move-exception
            goto L63
        L12:
            java.lang.Object r1 = r5.a
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L18
            goto L33
        L18:
            r6 = move-exception
            goto L37
        L1a:
            defpackage.fctl.b(r6)
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L3d
            llu r6 = r5.c     // Catch: java.io.FileNotFoundException -> L3d
            java.io.File r4 = r6.a     // Catch: java.io.FileNotFoundException -> L3d
            r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> L3d
            lmj r6 = r6.b     // Catch: java.lang.Throwable -> L18
            r5.a = r1     // Catch: java.lang.Throwable -> L18
            r5.b = r3     // Catch: java.lang.Throwable -> L18
            java.lang.Object r6 = r6.a(r1)     // Catch: java.lang.Throwable -> L18
            if (r6 != r0) goto L33
            goto L60
        L33:
            defpackage.fczl.a(r1, r2)     // Catch: java.io.FileNotFoundException -> L3d
            return r6
        L37:
            throw r6     // Catch: java.lang.Throwable -> L38
        L38:
            r3 = move-exception
            defpackage.fczl.a(r1, r6)     // Catch: java.io.FileNotFoundException -> L3d
            throw r3     // Catch: java.io.FileNotFoundException -> L3d
        L3d:
            llu r6 = r5.c
            java.io.File r1 = r6.a
            boolean r3 = r1.exists()
            if (r3 == 0) goto L7b
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L5e
            r3.<init>(r1)     // Catch: java.lang.Exception -> L5e
            lmj r6 = r6.b     // Catch: java.lang.Throwable -> L61
            r5.a = r3     // Catch: java.lang.Throwable -> L61
            r1 = 2
            r5.b = r1     // Catch: java.lang.Throwable -> L61
            java.lang.Object r6 = r6.a(r3)     // Catch: java.lang.Throwable -> L61
            if (r6 == r0) goto L60
            r0 = r3
        L5a:
            defpackage.fczl.a(r0, r2)     // Catch: java.lang.Exception -> L5e
            goto L81
        L5e:
            r6 = move-exception
            goto L69
        L60:
            return r0
        L61:
            r6 = move-exception
            r0 = r3
        L63:
            throw r6     // Catch: java.lang.Throwable -> L64
        L64:
            r1 = move-exception
            defpackage.fczl.a(r0, r6)     // Catch: java.lang.Exception -> L5e
            throw r1     // Catch: java.lang.Exception -> L5e
        L69:
            boolean r0 = r6 instanceof java.io.FileNotFoundException
            if (r0 == 0) goto L7a
            llu r0 = r5.c
            java.io.File r0 = r0.a
            java.lang.String r0 = r0.getParent()
            java.lang.Exception r6 = defpackage.llq.a(r0, r6)
            throw r6
        L7a:
            throw r6
        L7b:
            llu r6 = r5.c
            lmj r6 = r6.b
            evuh r6 = r6.a
        L81:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new llt(this.c, (fcxy) obj).b(fctx.a);
    }
}
