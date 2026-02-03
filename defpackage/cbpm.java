package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbpm extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ cbpo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbpm(cbpo cbpoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cbpoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbpm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r11 != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        if (r11.k(r10) == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (r10.c.l(r10) != r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fc, code lost:
    
        if (r11.c(r1, r10) == r0) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c A[SYNTHETIC] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbpm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cbpm(this.c, fcxyVar);
    }
}
