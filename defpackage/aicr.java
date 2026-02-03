package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aicr extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ aics c;
    final /* synthetic */ dbco d;
    final /* synthetic */ fcsf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aicr(aics aicsVar, dbco dbcoVar, fcsf fcsfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = aicsVar;
        this.d = dbcoVar;
        this.e = fcsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aicr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x011e, code lost:
    
        if (defpackage.fdin.a(r10.d, r1, r9) != r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aicr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aicr(this.c, this.d, this.e, fcxyVar);
    }
}
