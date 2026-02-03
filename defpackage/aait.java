package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aait extends fcyz implements fdat {
    int a;
    final /* synthetic */ aaiu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aait(aaiu aaiuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aaiuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aait) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r1.fO(r5, r4) == r0) goto L14;
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
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r5)
            goto L3d
        Ld:
            java.lang.Object r1 = r4.c
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r5)
            goto L30
        L15:
            defpackage.fctl.b(r5)
            java.lang.Object r5 = r4.c
            r1 = r5
            fdpm r1 = (defpackage.fdpm) r1
            aaiu r5 = r4.b
            aaiq r3 = new aaiq
            r3.<init>()
            r4.c = r1
            r4.a = r2
            ecjh r5 = r5.b
            java.lang.Object r5 = defpackage.crrj.a(r5, r3, r4)
            if (r5 == r0) goto L40
        L30:
            r2 = 0
            r4.c = r2
            r2 = 2
            r4.a = r2
            java.lang.Object r5 = r1.fO(r5, r4)
            if (r5 != r0) goto L3d
            goto L40
        L3d:
            fctx r5 = defpackage.fctx.a
            return r5
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aait.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aait aaitVar = new aait(this.b, fcxyVar);
        aaitVar.c = obj;
        return aaitVar;
    }
}
