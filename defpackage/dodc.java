package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dodc extends fcyz implements fdat {
    int a;
    final /* synthetic */ dode b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dodc(dode dodeVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dodeVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dodc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (defpackage.fdmu.a(r2, r4) == r0) goto L12;
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
            r2 = 1
            defpackage.fctl.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1b
            goto L2f
        Ld:
            dode r5 = r4.b
            fdlr r5 = r5.i
            if (r5 == 0) goto L1b
            r4.a = r2
            java.lang.Object r5 = r5.o(r4)
            if (r5 == r0) goto L2e
        L1b:
            dode r5 = r4.b
            java.lang.String r1 = r4.c
            dodb r2 = new dodb
            r3 = 0
            r2.<init>(r5, r1, r3)
            r5 = 2
            r4.a = r5
            java.lang.Object r5 = defpackage.fdmu.a(r2, r4)
            if (r5 != r0) goto L2f
        L2e:
            return r0
        L2f:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dodc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dodc(this.b, this.c, fcxyVar);
    }
}
