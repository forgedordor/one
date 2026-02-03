package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dory extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ dosd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dory(dosd dosdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = dosdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dory) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r4.bc(r7, r6) == r0) goto L21;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            if (r1 == r2) goto Le
            defpackage.fctl.b(r7)
            goto L6c
        Le:
            java.lang.Object r1 = r6.b
            java.lang.Object r2 = r6.a
            defpackage.fctl.b(r7)
            goto L40
        L16:
            defpackage.fctl.b(r7)
            dosd r7 = r6.d
            adgp r1 = r7.bk()
            doqd r4 = new doqd
            boolean r5 = r7.bj()
            r4.<init>(r5)
            addy r7 = r7.ao
            if (r7 != 0) goto L32
            java.lang.String r7 = "accountSignIn"
            defpackage.fdbq.c(r7)
            r7 = r3
        L32:
            r6.a = r1
            r6.b = r4
            r6.c = r2
            java.lang.Object r7 = r7.a(r6)
            if (r7 == r0) goto L6f
            r2 = r1
            r1 = r4
        L40:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            dosd r4 = r6.d
            java.lang.String r5 = r4.al
            if (r5 != 0) goto L52
            java.lang.String r5 = "mimeType"
            defpackage.fdbq.c(r5)
            r5 = r3
        L52:
            adgp r2 = (defpackage.adgp) r2
            doqh r1 = (defpackage.doqh) r1
            r2.b(r1, r7, r5)
            dorx r7 = new dorx
            r7.<init>(r4, r3)
            r6.a = r3
            r6.b = r3
            r1 = 2
            r6.c = r1
            java.lang.Object r7 = r4.bc(r7, r6)
            if (r7 != r0) goto L6c
            goto L6f
        L6c:
            fctx r7 = defpackage.fctx.a
            return r7
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dory.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dory(this.d, fcxyVar);
    }
}
