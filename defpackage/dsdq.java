package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsdq extends fcyz implements fdat {
    int a;
    final /* synthetic */ dsdu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsdq(dsdu dsduVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dsduVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsdq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r6.b(r1.a(), r5) == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
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
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L17
            if (r1 == r4) goto L13
            defpackage.fctl.b(r6)
            if (r1 == r3) goto L3e
            if (r1 == r2) goto L50
            goto L66
        L13:
            defpackage.fctl.b(r6)
            goto L2c
        L17:
            defpackage.fctl.b(r6)
            dsdu r6 = r5.b
            r5.a = r4
            dxmn r1 = r6.b
            dxml r6 = r6.g
            int r6 = r6.a()
            java.lang.Object r6 = defpackage.dxmm.a(r1, r6, r5)
            if (r6 == r0) goto L69
        L2c:
            dsdu r6 = r5.b
            r5.a = r3
            dxmn r1 = r6.b
            dxml r6 = r6.h
            int r6 = r6.a()
            java.lang.Object r6 = defpackage.dxmm.a(r1, r6, r5)
            if (r6 == r0) goto L69
        L3e:
            dsdu r6 = r5.b
            r5.a = r2
            dxmn r1 = r6.b
            dxml r6 = r6.f
            int r6 = r6.a()
            java.lang.Object r6 = defpackage.dxmm.a(r1, r6, r5)
            if (r6 == r0) goto L69
        L50:
            dsdu r6 = r5.b
            dxml r1 = r6.i
            if (r1 == 0) goto L66
            dxmn r6 = r6.b
            r2 = 4
            r5.a = r2
            int r1 = r1.a()
            java.lang.Object r6 = defpackage.dxmm.a(r6, r1, r5)
            if (r6 != r0) goto L66
            goto L69
        L66:
            fctx r6 = defpackage.fctx.a
            return r6
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsdq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsdq(this.b, fcxyVar);
    }
}
