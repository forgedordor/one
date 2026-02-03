package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnkl extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnkm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnkl(cnkm cnkmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnkmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnkl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0105, code lost:
    
        if (defpackage.fdii.a(r11, r10) == r0) goto L25;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnkl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnkl(this.b, fcxyVar);
    }
}
