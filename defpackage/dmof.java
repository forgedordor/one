package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmof extends fcyz implements fdat {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ dmoo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmof(int i, dmoo dmooVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = i;
        this.c = dmooVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmof) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r4.c.r(r1, r3) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r4.c.e(r1, r3) == r0) goto L12;
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
            if (r1 == 0) goto Lb
            goto L2e
        Lb:
            int r4 = r3.b
            if (r4 != r2) goto L1e
            dmoo r4 = r3.c
            dmbu r1 = defpackage.dmbu.b
            r3.a = r2
            dmlz r4 = r4.c
            java.lang.Object r4 = r4.e(r1, r3)
            if (r4 != r0) goto L2e
            goto L2d
        L1e:
            dmoo r4 = r3.c
            dmbu r1 = defpackage.dmbu.b
            r2 = 2
            r3.a = r2
            dmlz r4 = r4.c
            java.lang.Object r4 = r4.r(r1, r3)
            if (r4 != r0) goto L2e
        L2d:
            return r0
        L2e:
            fctx r4 = defpackage.fctx.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmof.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmof(this.b, this.c, fcxyVar);
    }
}
