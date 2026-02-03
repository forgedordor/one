package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hhh extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ fduf c;
    final /* synthetic */ hcj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhh(fduf fdufVar, hcj hcjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdufVar;
        this.d = hcjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hhh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (defpackage.fdpy.b(r1, r4, r5) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (defpackage.fdpy.b(r3, r4, r5) == r0) goto L27;
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
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.fctl.b(r6)
            goto L4e
        L11:
            java.lang.Object r0 = r5.a
            defpackage.fctl.b(r6)
            goto L6d
        L17:
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L1b
            goto L36
        L1b:
            r6 = move-exception
            goto L51
        L1d:
            defpackage.fctl.b(r6)
            fduf r6 = r5.c     // Catch: java.lang.Throwable -> L1b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L1b
            r6.h(r1)     // Catch: java.lang.Throwable -> L1b
            hcj r6 = r5.d     // Catch: java.lang.Throwable -> L1b
            dod r1 = defpackage.dod.c     // Catch: java.lang.Throwable -> L1b
            r5.b = r4     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r6 = r6.a(r1, r5)     // Catch: java.lang.Throwable -> L1b
            if (r6 != r0) goto L36
            goto L6b
        L36:
            hcj r6 = r5.d
            boolean r1 = r6.c()
            if (r1 == 0) goto L4e
            fduf r1 = r5.c
            hhg r4 = new hhg
            r4.<init>(r6, r2)
            r5.b = r3
            java.lang.Object r6 = defpackage.fdpy.b(r1, r4, r5)
            if (r6 != r0) goto L4e
            goto L6b
        L4e:
            fctx r6 = defpackage.fctx.a
            return r6
        L51:
            hcj r1 = r5.d
            boolean r3 = r1.c()
            if (r3 == 0) goto L6c
            fduf r3 = r5.c
            hhg r4 = new hhg
            r4.<init>(r1, r2)
            r5.a = r6
            r1 = 3
            r5.b = r1
            java.lang.Object r1 = defpackage.fdpy.b(r3, r4, r5)
            if (r1 != r0) goto L6c
        L6b:
            return r0
        L6c:
            r0 = r6
        L6d:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new hhh(this.c, this.d, fcxyVar);
    }
}
