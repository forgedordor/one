package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aadx extends fcyz implements fdat {
    int a;
    final /* synthetic */ aady b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aadx(aady aadyVar, float f, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aadyVar;
        this.c = f;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aadx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r4 == r0) goto L13;
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
            if (r1 == r2) goto L17
            goto L2c
        Ld:
            r3.a = r2
            r1 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r4 = defpackage.fdkj.c(r1, r3)
            if (r4 == r0) goto L36
        L17:
            aady r4 = r3.b
            float r1 = r3.c
            aadw r2 = new aadw
            r2.<init>()
            r1 = 2
            r3.a = r1
            cmfo r4 = r4.a
            java.lang.Object r4 = r4.d(r2, r3)
            if (r4 != r0) goto L2c
            goto L36
        L2c:
            cvua r4 = (defpackage.cvua) r4
            aady r4 = r3.b
            r0 = 0
            r4.c = r0
            fctx r4 = defpackage.fctx.a
            return r4
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aadx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aadx(this.b, this.c, fcxyVar);
    }
}
