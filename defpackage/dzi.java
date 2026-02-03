package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dzi extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdlr b;
    final /* synthetic */ fdat c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzi(fdlr fdlrVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdlrVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dzi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r4.a(r1, r3) == r0) goto L14;
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
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r4)
            goto L38
        Ld:
            java.lang.Object r1 = r3.d
            fdjx r1 = (defpackage.fdjx) r1
            defpackage.fctl.b(r4)
            goto L29
        L15:
            defpackage.fctl.b(r4)
            java.lang.Object r4 = r3.d
            r1 = r4
            fdjx r1 = (defpackage.fdjx) r1
            fdlr r4 = r3.b
            r3.d = r1
            r3.a = r2
            java.lang.Object r4 = r4.o(r3)
            if (r4 == r0) goto L3b
        L29:
            fdat r4 = r3.c
            r2 = 0
            r3.d = r2
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = r4.a(r1, r3)
            if (r4 != r0) goto L38
            goto L3b
        L38:
            fctx r4 = defpackage.fctx.a
            return r4
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dzi dziVar = new dzi(this.b, this.c, fcxyVar);
        dziVar.d = obj;
        return dziVar;
    }
}
