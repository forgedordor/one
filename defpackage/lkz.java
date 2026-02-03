package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lkz extends fcyz implements fdat {
    int a;
    final /* synthetic */ llo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkz(llo lloVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = lloVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lkz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (r1.a(r2, r3) == r0) goto L15;
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
            if (r1 == r2) goto L21
            goto L3e
        Ld:
            llo r4 = r3.b
            r3.a = r2
            lkl r4 = r4.d
            fdjc r4 = r4.c
            fdme r4 = (defpackage.fdme) r4
            java.lang.Object r4 = r4.hJ(r3)
            if (r4 == r0) goto L1f
            fctx r4 = defpackage.fctx.a
        L1f:
            if (r4 == r0) goto L41
        L21:
            llo r4 = r3.b
            lmg r1 = r4.c()
            fdpl r1 = r1.c()
            fdpl r1 = defpackage.fdqc.a(r1)
            lky r2 = new lky
            r2.<init>(r4)
            r4 = 2
            r3.a = r4
            java.lang.Object r4 = r1.a(r2, r3)
            if (r4 != r0) goto L3e
            goto L41
        L3e:
            fctx r4 = defpackage.fctx.a
            return r4
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lkz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new lkz(this.b, fcxyVar);
    }
}
