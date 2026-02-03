package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cndy extends fcyz implements fdat {
    int a;
    final /* synthetic */ ezol b;
    final /* synthetic */ cnef c;
    final /* synthetic */ eqdo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cndy(ezol ezolVar, cnef cnefVar, eqdo eqdoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ezolVar;
        this.c = cnefVar;
        this.d = eqdoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cndy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        if (r5.c.i((defpackage.audc) r6, "handleGroupFeaturesUpdate", r5) != r0) goto L15;
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
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L10
            defpackage.fctl.b(r6)
            if (r1 == r3) goto L35
            if (r1 == r2) goto L4d
            goto L5d
        L10:
            defpackage.fctl.b(r6)
            ezol r6 = r5.b
            java.lang.String r1 = r6.c
            r1.getClass()
            cnef r4 = r5.c
            fcsu r4 = r4.d
            java.lang.Object r4 = r4.b()
            cnck r4 = (defpackage.cnck) r4
            evqs r6 = r6.e
            eiju r6 = r4.c(r1, r6)
            r6.getClass()
            r5.a = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r5)
            if (r6 == r0) goto L60
        L35:
            cnef r6 = r5.c
            ezol r1 = r5.b
            java.lang.String r3 = r1.c
            r3.getClass()
            eqdo r4 = r5.d
            evqs r1 = r1.e
            r1.getClass()
            r5.a = r2
            java.lang.Object r6 = r6.b(r3, r4, r1, r5)
            if (r6 == r0) goto L60
        L4d:
            cnef r1 = r5.c
            audc r6 = (defpackage.audc) r6
            r2 = 3
            r5.a = r2
            java.lang.String r2 = "handleGroupFeaturesUpdate"
            java.lang.Object r6 = r1.i(r6, r2, r5)
            if (r6 != r0) goto L5d
            goto L60
        L5d:
            fctx r6 = defpackage.fctx.a
            return r6
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cndy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cndy(this.b, this.c, this.d, fcxyVar);
    }
}
