package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alcy extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ aldf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alcy(aldf aldfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = aldfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alcy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r12 == r0) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alcy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new alcy(this.d, fcxyVar);
    }
}
