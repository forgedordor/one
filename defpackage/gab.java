package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gab extends fcyz implements fdat {
    int a;
    final /* synthetic */ gsp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gab(gsp gspVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = gspVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gab) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r4.g(r3) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r4.f(r3) == r0) goto L12;
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
            goto L24
        Lb:
            gsp r4 = r3.b
            boolean r1 = r4.b
            if (r1 != 0) goto L1a
            r3.a = r2
            java.lang.Object r4 = r4.f(r3)
            if (r4 != r0) goto L24
            goto L23
        L1a:
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.g(r3)
            if (r4 != r0) goto L24
        L23:
            return r0
        L24:
            fctx r4 = defpackage.fctx.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gab.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gab(this.b, fcxyVar);
    }
}
