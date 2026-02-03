package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ydi extends fcyz implements fdat {
    int a;
    final /* synthetic */ yek b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydi(yek yekVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = yekVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ydi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (defpackage.fdxs.c(r5, r4) == r0) goto L13;
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
            if (r1 == r2) goto L21
            goto L36
        Ld:
            yek r5 = r4.b
            ydh r1 = new ydh
            r3 = 0
            r1.<init>(r3)
            r4.a = r2
            yir r5 = r5.j
            fdvc r5 = r5.b
            java.lang.Object r5 = defpackage.fdtc.b(r5, r1, r4)
            if (r5 == r0) goto L39
        L21:
            yek r5 = r4.b
            ajmh r5 = r5.G
            eiju r5 = r5.z()
            r5.getClass()
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)
            if (r5 != r0) goto L36
            goto L39
        L36:
            fctx r5 = defpackage.fctx.a
            return r5
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ydi(this.b, fcxyVar);
    }
}
