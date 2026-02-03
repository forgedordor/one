package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwxt extends fcyz implements fdat {
    int a;
    final /* synthetic */ cwxu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwxt(cwxu cwxuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cwxuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwxt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        if (r15 != r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0122  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwxt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cwxt(this.b, fcxyVar);
    }
}
