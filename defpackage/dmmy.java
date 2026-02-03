package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmmy extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmng b;
    final /* synthetic */ dmbu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmmy(dmng dmngVar, dmbu dmbuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmngVar;
        this.c = dmbuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmmy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r4.s(r1, r3) == r0) goto L13;
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
            if (r1 == r2) goto L1b
            goto L29
        Ld:
            dmng r4 = r3.b
            r3.a = r2
            dmmb r4 = r4.j
            j$.time.Duration r4 = r4.d
            java.lang.Object r4 = defpackage.eooa.a(r4, r3)
            if (r4 == r0) goto L2c
        L1b:
            dmng r4 = r3.b
            dmbu r1 = r3.c
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = r4.s(r1, r3)
            if (r4 != r0) goto L29
            goto L2c
        L29:
            fctx r4 = defpackage.fctx.a
            return r4
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmmy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmmy(this.b, this.c, fcxyVar);
    }
}
