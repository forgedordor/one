package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wiy extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    int d;
    final /* synthetic */ vvp e;
    final /* synthetic */ wjc f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wiy(vvp vvpVar, wjc wjcVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = vvpVar;
        this.f = wjcVar;
        this.g = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wiy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
    
        if (r12 != r0) goto L22;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wiy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wiy(this.e, this.f, this.g, fcxyVar);
    }
}
