package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agru extends fcyz implements fdat {
    int a;
    final /* synthetic */ agrv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agru(agrv agrvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = agrvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agru) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r9 == r0) goto L30;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agru.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agru(this.b, fcxyVar);
    }
}
