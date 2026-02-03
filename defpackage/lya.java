package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lya extends fcyz implements fdat {
    int a;
    final /* synthetic */ fcyh b;
    final /* synthetic */ fdpl c;
    final /* synthetic */ hps d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lya(fcyh fcyhVar, fdpl fdplVar, hps hpsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fcyhVar;
        this.c = fdplVar;
        this.d = hpsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lya) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (defpackage.fdin.a(r6, r3, r5) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r6.a(r3, r5) == r0) goto L12;
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
            goto L3b
        Lb:
            fcyh r6 = r5.b
            fcyi r1 = defpackage.fcyi.a
            boolean r1 = defpackage.fdbq.f(r6, r1)
            if (r1 == 0) goto L27
            fdpl r6 = r5.c
            hps r1 = r5.d
            lxx r3 = new lxx
            r3.<init>(r1)
            r5.a = r2
            java.lang.Object r6 = r6.a(r3, r5)
            if (r6 != r0) goto L3b
            goto L3a
        L27:
            fdpl r1 = r5.c
            hps r2 = r5.d
            lxz r3 = new lxz
            r4 = 0
            r3.<init>(r1, r2, r4)
            r1 = 2
            r5.a = r1
            java.lang.Object r6 = defpackage.fdin.a(r6, r3, r5)
            if (r6 != r0) goto L3b
        L3a:
            return r0
        L3b:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lya.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new lya(this.b, this.c, this.d, fcxyVar);
    }
}
