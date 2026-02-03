package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctcx extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctdg b;
    final /* synthetic */ egbv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctcx(ctdg ctdgVar, egbv egbvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctdgVar;
        this.c = egbvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctcx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r3.m(r5) == r0) goto L17;
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
            if (r1 == r2) goto L19
            goto L3a
        Ld:
            ctdg r6 = r5.b
            r5.a = r2
            cmfo r6 = r6.a
            java.lang.Object r6 = r6.c(r5)
            if (r6 == r0) goto L3d
        L19:
            egbv r1 = r5.c
            ctdg r3 = r5.b
            ctcl r6 = (defpackage.ctcl) r6
            int r4 = r6.b
            r2 = r2 & r4
            if (r2 == 0) goto L3a
            int r6 = r6.c
            egdc r1 = (defpackage.egdc) r1
            efwo r1 = r1.a
            int r1 = r1.a()
            if (r6 != r1) goto L3a
            r6 = 2
            r5.a = r6
            java.lang.Object r6 = r3.m(r5)
            if (r6 != r0) goto L3a
            goto L3d
        L3a:
            fctx r6 = defpackage.fctx.a
            return r6
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctcx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctcx(this.b, this.c, fcxyVar);
    }
}
