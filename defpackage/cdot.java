package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdot extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdpb b;
    final /* synthetic */ Integer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdot(cdpb cdpbVar, Integer num, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cdpbVar;
        this.c = num;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdot) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0111, code lost:
    
        if (defpackage.fdin.a((defpackage.fcyh) r1, r2, r8) == r0) goto L24;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdot.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdot(this.b, this.c, fcxyVar);
    }
}
