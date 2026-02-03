package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oxo extends fcyz implements fdat {
    int a;
    final /* synthetic */ fcyh b;
    final /* synthetic */ oxm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxo(fcyh fcyhVar, oxm oxmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fcyhVar;
        this.c = oxmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oxo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (defpackage.fdin.a(r5, r2, r4) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r5.e(r4) == r0) goto L12;
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
            if (r1 == 0) goto Lb
            goto L32
        Lb:
            fcyh r5 = r4.b
            fcyi r1 = defpackage.fcyi.a
            boolean r1 = defpackage.fdbq.f(r5, r1)
            if (r1 == 0) goto L20
            oxm r5 = r4.c
            r4.a = r2
            java.lang.Object r5 = r5.e(r4)
            if (r5 != r0) goto L32
            goto L31
        L20:
            oxm r1 = r4.c
            oxn r2 = new oxn
            r3 = 0
            r2.<init>(r1, r3)
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = defpackage.fdin.a(r5, r2, r4)
            if (r5 != r0) goto L32
        L31:
            return r0
        L32:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new oxo(this.b, this.c, fcxyVar);
    }
}
