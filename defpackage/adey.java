package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adey extends fcyz implements fdat {
    int a;
    final /* synthetic */ adfc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adey(adfc adfcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = adfcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adey) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r4.b.b(r3) == r0) goto L16;
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
            if (r1 == r2) goto L19
            goto L2f
        Ld:
            adfc r4 = r3.b
            r3.a = r2
            adfd r4 = r4.b
            java.lang.Object r4 = r4.c(r3)
            if (r4 == r0) goto L38
        L19:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L35
            adfc r4 = r3.b
            r1 = 2
            r3.a = r1
            adfd r4 = r4.b
            java.lang.Object r4 = r4.b(r3)
            if (r4 != r0) goto L2f
            goto L38
        L2f:
            adfc r4 = r3.b
            r0 = 0
            r4.d(r0)
        L35:
            fctx r4 = defpackage.fctx.a
            return r4
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adey.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new adey(this.b, fcxyVar);
    }
}
