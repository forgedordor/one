package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccty extends fcyz implements fdat {
    int a;
    final /* synthetic */ ccud b;
    final /* synthetic */ cfre c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccty(ccud ccudVar, cfre cfreVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ccudVar;
        this.c = cfreVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccty) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (defpackage.fdxs.c(r4, r3) == r0) goto L13;
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
            if (r1 == r2) goto L24
            goto L39
        Ld:
            ccud r4 = r3.b
            cfre r1 = r3.c
            cejj r4 = r4.b
            java.lang.String r1 = r1.b
            eiju r4 = r4.b(r1)
            r4.getClass()
            r3.a = r2
            java.lang.Object r4 = defpackage.fdxs.c(r4, r3)
            if (r4 == r0) goto L3c
        L24:
            cejg r4 = (defpackage.cejg) r4
            cedo r1 = defpackage.cedo.FORCE_REFRESH
            eiju r4 = r4.m(r1)
            r4.getClass()
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.fdxs.c(r4, r3)
            if (r4 != r0) goto L39
            goto L3c
        L39:
            fctx r4 = defpackage.fctx.a
            return r4
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccty.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccty(this.b, this.c, fcxyVar);
    }
}
