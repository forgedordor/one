package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ovj extends fcyz implements fdat {
    int a;
    final /* synthetic */ osg b;
    final /* synthetic */ ovn c;
    final /* synthetic */ oux d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovj(osg osgVar, ovn ovnVar, oux ouxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = osgVar;
        this.c = ovnVar;
        this.d = ouxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ovj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r1.g(r1, r2, r3, true, r6, r0.c, r10) == r8) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        if (r0.a(r2, r10) == r8) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014f, code lost:
    
        if (r0.a(r1, r10) == r8) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013e  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ovj(this.b, this.c, this.d, fcxyVar);
    }
}
