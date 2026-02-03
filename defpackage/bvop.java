package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvop extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvoq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvop(bvoq bvoqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvoqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvop) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0100, code lost:
    
        if (defpackage.fdxs.c(r15, r14) == r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvop.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvop(this.b, fcxyVar);
    }
}
