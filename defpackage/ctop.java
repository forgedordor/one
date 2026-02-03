package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctop extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctor b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctop(ctor ctorVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctorVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctop) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (r1.fO(r6, r5) == r0) goto L14;
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
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Le
            defpackage.fctl.b(r6)
            goto L43
        Le:
            java.lang.Object r1 = r5.c
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r6)
            goto L37
        L16:
            defpackage.fctl.b(r6)
            java.lang.Object r6 = r5.c
            r1 = r6
            fdpm r1 = (defpackage.fdpm) r1
            ctor r6 = r5.b
            r5.c = r1
            r5.a = r3
            ctom r6 = r6.a
            fcyh r3 = r6.a
            fcyh r3 = defpackage.eicg.a(r3)
            ctol r4 = new ctol
            r4.<init>(r2, r6)
            java.lang.Object r6 = defpackage.fdin.a(r3, r4, r5)
            if (r6 == r0) goto L46
        L37:
            r5.c = r2
            r2 = 2
            r5.a = r2
            java.lang.Object r6 = r1.fO(r6, r5)
            if (r6 != r0) goto L43
            goto L46
        L43:
            fctx r6 = defpackage.fctx.a
            return r6
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctop.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctop ctopVar = new ctop(this.b, fcxyVar);
        ctopVar.c = obj;
        return ctopVar;
    }
}
