package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auvm extends fcyz implements fdat {
    int a;
    final /* synthetic */ eiju b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auvm(eiju eijuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = eijuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auvm) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r1.fO(r4, r3) == r0) goto L14;
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
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r4)
            goto L36
        Ld:
            java.lang.Object r1 = r3.c
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r4)
            goto L29
        L15:
            defpackage.fctl.b(r4)
            java.lang.Object r4 = r3.c
            r1 = r4
            fdpm r1 = (defpackage.fdpm) r1
            eiju r4 = r3.b
            r3.c = r1
            r3.a = r2
            java.lang.Object r4 = defpackage.fdxs.c(r4, r3)
            if (r4 == r0) goto L39
        L29:
            r2 = 0
            r3.c = r2
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = r1.fO(r4, r3)
            if (r4 != r0) goto L36
            goto L39
        L36:
            fctx r4 = defpackage.fctx.a
            return r4
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auvm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        auvm auvmVar = new auvm(this.b, fcxyVar);
        auvmVar.c = obj;
        return auvmVar;
    }
}
