package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cipg extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ ciph e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cipg(ciph ciphVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = ciphVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cipg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
    
        if (r15 != r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cipg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cipg(this.e, fcxyVar);
    }
}
