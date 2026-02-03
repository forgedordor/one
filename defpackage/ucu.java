package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ucu extends fcyz implements fdat {
    int a;
    final /* synthetic */ ucx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucu(ucx ucxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ucxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ucu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r4.g(r3) == r0) goto L13;
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
            goto L23
        Ld:
            ucx r4 = r3.b
            r3.a = r2
            java.lang.Object r4 = r4.f(r3)
            if (r4 == r0) goto L26
        L17:
            ucx r4 = r3.b
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.g(r3)
            if (r4 != r0) goto L23
            goto L26
        L23:
            fctx r4 = defpackage.fctx.a
            return r4
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ucu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ucu(this.b, fcxyVar);
    }
}
