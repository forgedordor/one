package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csmu extends fcyz implements fdat {
    int a;
    final /* synthetic */ csmx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csmu(csmx csmxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = csmxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csmu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r4 == r0) goto L17;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r3.a
            r2 = 1
            defpackage.fctl.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L23
            goto L42
        Ld:
            csmx r4 = r3.b
            fcsu r4 = r4.a
            java.lang.Object r4 = r4.b()
            lkb r4 = (defpackage.lkb) r4
            fdpl r4 = r4.b()
            r3.a = r2
            java.lang.Object r4 = defpackage.fdtc.a(r4, r3)
            if (r4 == r0) goto L4e
        L23:
            csmo r4 = (defpackage.csmo) r4
            int r4 = r4.b
            r4 = r4 & r2
            if (r4 == 0) goto L4c
            csmx r4 = r3.b
            fcsu r4 = r4.a
            java.lang.Object r4 = r4.b()
            lkb r4 = (defpackage.lkb) r4
            fdpl r4 = r4.b()
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.fdtc.a(r4, r3)
            if (r4 != r0) goto L42
            goto L4e
        L42:
            csmo r4 = (defpackage.csmo) r4
            int r4 = r4.c
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r4)
            return r0
        L4c:
            r4 = 0
            return r4
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csmu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csmu(this.b, fcxyVar);
    }
}
