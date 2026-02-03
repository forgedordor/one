package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class thz extends fcyz implements fdat {
    int a;
    final /* synthetic */ tib b;
    final /* synthetic */ String c;
    final /* synthetic */ fdat d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thz(tib tibVar, String str, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = tibVar;
        this.c = str;
        this.d = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((thz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r1.a(r6, r5) == r0) goto L13;
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
            r2 = 1
            defpackage.fctl.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L25
            goto L36
        Ld:
            tib r6 = r5.b
            java.lang.String r1 = r5.c
            r5.a = r2
            fcyh r2 = r6.a
            fcyh r2 = defpackage.eicg.a(r2)
            tia r3 = new tia
            r4 = 0
            r3.<init>(r4, r6, r1)
            java.lang.Object r6 = defpackage.fdin.a(r2, r3, r5)
            if (r6 == r0) goto L39
        L25:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
            fdat r1 = r5.d
            r2 = 2
            r5.a = r2
            java.lang.Object r6 = r1.a(r6, r5)
            if (r6 != r0) goto L36
            goto L39
        L36:
            fctx r6 = defpackage.fctx.a
            return r6
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.thz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new thz(this.b, this.c, this.d, fcxyVar);
    }
}
