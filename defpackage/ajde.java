package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajde extends fcyz implements fdat {
    int a;
    final /* synthetic */ ajdy b;
    final /* synthetic */ int c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajde(fcxy fcxyVar, ajdy ajdyVar, int i) {
        super(2, fcxyVar);
        this.b = ajdyVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajde) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (defpackage.crrj.b(r1.a, r3, r4) == r0) goto L15;
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
            defpackage.fctl.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1b
            goto L38
        Ld:
            java.lang.Object r5 = r4.d
            fdjx r5 = (defpackage.fdjx) r5
            ajdy r5 = r4.b
            r4.a = r2
            java.lang.Object r5 = r5.a(r4)
            if (r5 == r0) goto L3b
        L1b:
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L38
            ajdy r1 = r4.b
            int r2 = r4.c
            int r5 = r5.intValue()
            ajdf r3 = new ajdf
            r3.<init>(r5, r2)
            r5 = 2
            r4.a = r5
            ecjh r5 = r1.a
            java.lang.Object r5 = defpackage.crrj.b(r5, r3, r4)
            if (r5 != r0) goto L38
            goto L3b
        L38:
            fctx r5 = defpackage.fctx.a
            return r5
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajde.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ajde ajdeVar = new ajde(fcxyVar, this.b, this.c);
        ajdeVar.d = obj;
        return ajdeVar;
    }
}
