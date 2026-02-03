package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhqf extends fcyz implements fdat {
    int a;
    final /* synthetic */ dhqg b;
    final /* synthetic */ dhnv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhqf(dhqg dhqgVar, dhnv dhnvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dhqgVar;
        this.c = dhnvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dhqf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r5.a.a(r1, r4) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r5.a.e(r1, r4) == r0) goto L19;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto Le
            defpackage.fctl.b(r5)
            if (r1 == r3) goto L1d
            goto L44
        Le:
            defpackage.fctl.b(r5)
            dhqg r5 = r4.b
            dhnv r1 = r4.c
            r4.a = r3
            java.lang.Object r5 = r5.a(r1, r4)
            if (r5 == r0) goto L47
        L1d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L34
            dhqg r5 = r4.b
            dhnv r1 = r4.c
            r4.a = r2
            dhpv r5 = r5.a
            java.lang.Object r5 = r5.a(r1, r4)
            if (r5 != r0) goto L44
            goto L47
        L34:
            dhqg r5 = r4.b
            dhnv r1 = r4.c
            r2 = 3
            r4.a = r2
            dhpv r5 = r5.a
            java.lang.Object r5 = r5.e(r1, r4)
            if (r5 != r0) goto L44
            goto L47
        L44:
            fctx r5 = defpackage.fctx.a
            return r5
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhqf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dhqf(this.b, this.c, fcxyVar);
    }
}
