package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbcg extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbdg b;
    final /* synthetic */ cbci c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbcg(cbdg cbdgVar, cbci cbciVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cbdgVar;
        this.c = cbciVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbcg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r5 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r5 != r0) goto L21;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L10
            defpackage.fctl.b(r5)
            if (r1 == r3) goto L28
            if (r1 == r2) goto L6a
            goto L4c
        L10:
            defpackage.fctl.b(r5)
            cbci r5 = r4.c
            cbdg r1 = r4.b
            java.lang.String r1 = r1.r()
            r1.getClass()
            r4.a = r3
            cbbl r5 = r5.c
            java.lang.Object r5 = r5.d(r1, r4)
            if (r5 == r0) goto L70
        L28:
            cbbk r5 = (defpackage.cbbk) r5
            int r5 = r5.ordinal()
            if (r5 == 0) goto L55
            if (r5 != r3) goto L4f
            cbci r5 = r4.c
            fcsu r5 = r5.b
            java.lang.Object r5 = r5.b()
            cbhl r5 = (defpackage.cbhl) r5
            cbdg r1 = r4.b
            eiju r5 = r5.a(r1)
            r1 = 3
            r4.a = r1
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)
            if (r5 != r0) goto L4c
            goto L70
        L4c:
            qay r5 = (defpackage.qay) r5
            goto L6c
        L4f:
            fctg r5 = new fctg
            r5.<init>()
            throw r5
        L55:
            cbci r5 = r4.c
            cbdg r1 = r4.b
            cbdd r5 = r5.a
            eiju r5 = r5.a(r1)
            r5.getClass()
            r4.a = r2
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)
            if (r5 == r0) goto L70
        L6a:
            qay r5 = (defpackage.qay) r5
        L6c:
            r5.getClass()
            return r5
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbcg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cbcg(this.b, this.c, fcxyVar);
    }
}
