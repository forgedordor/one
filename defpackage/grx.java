package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class grx extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ ebj e;
    final /* synthetic */ hox f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grx(ddp ddpVar, float f, boolean z, ebj ebjVar, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = f;
        this.d = z;
        this.e = ebjVar;
        this.f = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((grx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r6.e(r1, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (defpackage.hik.a(r6, r3, r1, r2, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return r0;
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
            if (r1 == 0) goto Lb
            goto L43
        Lb:
            ddp r6 = r5.b
            java.lang.Object r1 = r6.c()
            kir r1 = (defpackage.kir) r1
            float r1 = r1.a
            float r3 = r5.c
            boolean r1 = defpackage.kir.b(r1, r3)
            if (r1 != 0) goto L4a
            boolean r1 = r5.d
            if (r1 != 0) goto L2f
            kir r1 = new kir
            r1.<init>(r3)
            r5.a = r2
            java.lang.Object r6 = r6.e(r1, r5)
            if (r6 != r0) goto L43
            goto L42
        L2f:
            hox r1 = r5.f
            java.lang.Object r1 = r1.a()
            ebj r1 = (defpackage.ebj) r1
            ebj r2 = r5.e
            r4 = 2
            r5.a = r4
            java.lang.Object r6 = defpackage.hik.a(r6, r3, r1, r2, r5)
            if (r6 != r0) goto L43
        L42:
            return r0
        L43:
            hox r6 = r5.f
            ebj r0 = r5.e
            r6.b(r0)
        L4a:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.grx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new grx(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
