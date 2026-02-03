package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbch extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbdg b;
    final /* synthetic */ cbci c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbch(cbdg cbdgVar, cbci cbciVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cbdgVar;
        this.c = cbciVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbch) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r5 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r5 != r0) goto L25;
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
            if (r1 == r3) goto L2d
            if (r1 == r2) goto L6f
            goto L51
        L10:
            defpackage.fctl.b(r5)
            cbdg r5 = r4.b
            if (r5 != 0) goto L1a
            qay r5 = defpackage.qba.a
            return r5
        L1a:
            cbci r1 = r4.c
            java.lang.String r5 = r5.r()
            r5.getClass()
            r4.a = r3
            cbbl r1 = r1.c
            java.lang.Object r5 = r1.d(r5, r4)
            if (r5 == r0) goto L75
        L2d:
            cbbk r5 = (defpackage.cbbk) r5
            int r5 = r5.ordinal()
            if (r5 == 0) goto L5a
            if (r5 != r3) goto L54
            cbci r5 = r4.c
            fcsu r5 = r5.b
            java.lang.Object r5 = r5.b()
            cbhl r5 = (defpackage.cbhl) r5
            cbdg r1 = r4.b
            eiju r5 = r5.b(r1)
            r1 = 3
            r4.a = r1
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)
            if (r5 != r0) goto L51
            goto L75
        L51:
            qay r5 = (defpackage.qay) r5
            goto L71
        L54:
            fctg r5 = new fctg
            r5.<init>()
            throw r5
        L5a:
            cbci r5 = r4.c
            cbdg r1 = r4.b
            cbdd r5 = r5.a
            eiju r5 = r5.b(r1)
            r5.getClass()
            r4.a = r2
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)
            if (r5 == r0) goto L75
        L6f:
            qay r5 = (defpackage.qay) r5
        L71:
            r5.getClass()
            return r5
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbch.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cbch(this.b, this.c, fcxyVar);
    }
}
