package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmcr extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmdo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmcr(dmdo dmdoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmdoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmcr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (r6.e(r5) == r0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
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
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L3b
            goto L47
        Ld:
            dmdo r6 = r5.b
            fduf r1 = r6.g
            dmch r3 = defpackage.dmch.a
            r1.f(r3)
            dmcd r1 = r6.e
            j$.time.Duration r1 = r1.a
            if (r1 == 0) goto L47
            dpzv r1 = r6.h
            r1.b()
            dmcp r3 = new dmcp
            r4 = 0
            r3.<init>(r6, r4)
            fdrw r4 = new fdrw
            fdvc r1 = r1.d
            r4.<init>(r1, r3)
            dmcq r1 = new dmcq
            r1.<init>(r6)
            r5.a = r2
            java.lang.Object r6 = r4.a(r1, r5)
            if (r6 == r0) goto L46
        L3b:
            dmdo r6 = r5.b
            r1 = 2
            r5.a = r1
            java.lang.Object r6 = r6.e(r5)
            if (r6 != r0) goto L47
        L46:
            return r0
        L47:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmcr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmcr(this.b, fcxyVar);
    }
}
