package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgtj extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgum b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgtj(fcxy fcxyVar, cgum cgumVar) {
        super(2, fcxyVar);
        this.b = cgumVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgtj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
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
            if (r1 == r2) goto L21
            goto L3a
        Ld:
            java.lang.Object r4 = r3.c
            fdjx r4 = (defpackage.fdjx) r4
            cgum r4 = r3.b
            lkb r4 = r4.d
            fdpl r4 = r4.b()
            r3.a = r2
            java.lang.Object r4 = defpackage.fdtc.a(r4, r3)
            if (r4 == r0) goto L46
        L21:
            cgtd r4 = (defpackage.cgtd) r4
            int r4 = r4.b
            r4 = r4 & r2
            if (r4 == 0) goto L44
            cgum r4 = r3.b
            lkb r4 = r4.d
            fdpl r4 = r4.b()
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.fdtc.a(r4, r3)
            if (r4 != r0) goto L3a
            goto L46
        L3a:
            cgtd r4 = (defpackage.cgtd) r4
            int r4 = r4.d
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r4)
            return r0
        L44:
            r4 = 0
            return r4
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgtj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cgtj cgtjVar = new cgtj(fcxyVar, this.b);
        cgtjVar.c = obj;
        return cgtjVar;
    }
}
