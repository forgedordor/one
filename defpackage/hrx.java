package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hrx extends fcyz implements fdat {
    int a;
    final /* synthetic */ fcyh b;
    final /* synthetic */ fdpl c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrx(fcyh fcyhVar, fdpl fdplVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fcyhVar;
        this.c = fdplVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hrx) c((hps) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (defpackage.fdin.a(r1, r3, r5) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r1.a(r3, r5) == r0) goto L12;
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
            java.lang.Object r6 = r5.d
            hps r6 = (defpackage.hps) r6
            fcyh r1 = r5.b
            fcyi r3 = defpackage.fcyi.a
            boolean r3 = defpackage.fdbq.f(r1, r3)
            if (r3 == 0) goto L29
            fdpl r1 = r5.c
            hru r3 = new hru
            r3.<init>(r6)
            r5.a = r2
            java.lang.Object r6 = r1.a(r3, r5)
            if (r6 != r0) goto L3b
            goto L3a
        L29:
            fdpl r2 = r5.c
            hrw r3 = new hrw
            r4 = 0
            r3.<init>(r2, r6, r4)
            r6 = 2
            r5.a = r6
            java.lang.Object r6 = defpackage.fdin.a(r1, r3, r5)
            if (r6 != r0) goto L3b
        L3a:
            return r0
        L3b:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hrx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        hrx hrxVar = new hrx(this.b, this.c, fcxyVar);
        hrxVar.d = obj;
        return hrxVar;
    }
}
