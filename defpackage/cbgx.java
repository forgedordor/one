package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbgx extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ cbdg c;
    final /* synthetic */ cbhl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbgx(cbdg cbdgVar, cbhl cbhlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cbdgVar;
        this.d = cbhlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbgx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r12 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r12.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bf, code lost:
    
        if (defpackage.feaq.d(r2, r11) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
    
        return defpackage.qba.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r1 != 2) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r11.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L11
            defpackage.fctl.b(r12)
            if (r1 == r2) goto L5b
            goto Lc2
        L11:
            java.lang.Object r1 = r11.a
            defpackage.fctl.b(r12)
            r7 = r1
            goto L3f
        L18:
            defpackage.fctl.b(r12)
            cbhl r12 = r11.d
            cbdg r1 = r11.c
            cbaz r4 = r12.a
            java.lang.String r5 = r1.r()
            cazg r4 = r4.c(r5)
            r4.getClass()
            caya r5 = r4.a()
            caxl r5 = (defpackage.caxl) r5
            caze r5 = r5.b
            r11.a = r4
            r11.b = r3
            java.lang.Object r12 = r12.h(r4, r1, r5, r11)
            if (r12 == r0) goto Lc5
            r7 = r4
        L3f:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r1 = 0
            if (r12 != 0) goto L5f
            cbhl r12 = r11.d
            cbdg r3 = r11.c
            eiju r12 = r12.b(r3)
            r11.a = r1
            r11.b = r2
            java.lang.Object r12 = defpackage.fdxs.c(r12, r11)
            if (r12 != r0) goto L5b
            goto Lc5
        L5b:
            r12.getClass()
            return r12
        L5f:
            cbhl r5 = r11.d
            cbdg r6 = r11.c
            fcyi r12 = defpackage.fcyi.a
            fdjz r2 = defpackage.fdjz.a
            fcyh r3 = defpackage.eicg.a(r12)
            cbgv r4 = new cbgv
            r4.<init>(r1, r5, r6)
            fdjx r9 = r5.d
            fdkf r10 = defpackage.fdin.b(r9, r3, r2, r4)
            fdjd r8 = new fdjd
            r8.<init>()
            fcyh r12 = defpackage.eicg.a(r12)
            cbgw r3 = new cbgw
            r4 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            fdkf r12 = defpackage.fdin.b(r9, r12, r2, r3)
            feaq r2 = new feaq
            fcyh r3 = r11.u()
            r2.<init>(r3)
            feam r12 = r12.f()
            cbgr r3 = new cbgr
            r3.<init>(r10, r1)
            r2.a(r12, r3)
            feam r12 = r8.T()
            cbgs r3 = new cbgs
            r3.<init>(r10, r1)
            r2.a(r12, r3)
            feam r12 = r10.f()
            cbgt r3 = new cbgt
            r3.<init>(r1)
            r2.a(r12, r3)
            r11.a = r1
            r12 = 3
            r11.b = r12
            java.lang.Object r12 = defpackage.feaq.d(r2, r11)
            if (r12 != r0) goto Lc2
            goto Lc5
        Lc2:
            qay r12 = defpackage.qba.a
            return r12
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbgx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cbgx(this.c, this.d, fcxyVar);
    }
}
