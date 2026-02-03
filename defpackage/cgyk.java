package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgyk extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgzi b;
    final /* synthetic */ chbd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgyk(cgzi cgziVar, chbd chbdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cgziVar;
        this.c = chbdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgyk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r4.l(r3) == r0) goto L13;
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
            if (r1 == r2) goto L1d
            goto L29
        Ld:
            cgzi r4 = r3.b
            chbd r1 = r3.c
            r3.a = r2
            chbf r4 = r4.f
            cgzx r1 = r1.a
            java.lang.Object r4 = r4.f(r1, r3)
            if (r4 == r0) goto L2c
        L1d:
            cgzi r4 = r3.b
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.l(r3)
            if (r4 != r0) goto L29
            goto L2c
        L29:
            fctx r4 = defpackage.fctx.a
            return r4
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgyk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cgyk(this.b, this.c, fcxyVar);
    }
}
