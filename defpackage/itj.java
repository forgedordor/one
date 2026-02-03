package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class itj extends fcyz implements fdat {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ itl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itj(long j, itl itlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = j;
        this.c = itlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((itj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (defpackage.fdkj.c(8, r5) == r0) goto L16;
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
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1a
            goto L26
        Ld:
            long r3 = r5.b
            r5.a = r2
            r1 = -8
            long r3 = r3 + r1
            java.lang.Object r6 = defpackage.fdkj.c(r3, r5)
            if (r6 == r0) goto L3d
        L1a:
            r6 = 2
            r5.a = r6
            r1 = 8
            java.lang.Object r6 = defpackage.fdkj.c(r1, r5)
            if (r6 != r0) goto L26
            goto L3d
        L26:
            itl r6 = r5.c
            fdis r6 = r6.a
            if (r6 == 0) goto L3a
            long r0 = r5.b
            irv r2 = new irv
            r2.<init>(r0)
            java.lang.Object r0 = defpackage.fctl.a(r2)
            r6.w(r0)
        L3a:
            fctx r6 = defpackage.fctx.a
            return r6
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.itj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new itj(this.b, this.c, fcxyVar);
    }
}
