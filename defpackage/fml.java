package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fml extends fcyz implements fdat {
    int a;
    final /* synthetic */ fmx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fml(fmx fmxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fmxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fml) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x02a6, code lost:
    
        if (r2 == r1) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012c  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fml.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fml(this.b, fcxyVar);
    }
}
