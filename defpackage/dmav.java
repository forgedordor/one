package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmav extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmaw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmav(dmaw dmawVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmawVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmav) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r4.c.e.invoke(r3) == r0) goto L13;
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
            if (r1 == r2) goto L17
            goto L27
        Ld:
            dmaw r4 = r3.b
            r3.a = r2
            java.lang.Object r4 = r4.a(r3)
            if (r4 == r0) goto L2a
        L17:
            dmaw r4 = r3.b
            r1 = 2
            r3.a = r1
            dmay r4 = r4.c
            fdap r4 = r4.e
            java.lang.Object r4 = r4.invoke(r3)
            if (r4 != r0) goto L27
            goto L2a
        L27:
            fctx r4 = defpackage.fctx.a
            return r4
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmav.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmav(this.b, fcxyVar);
    }
}
