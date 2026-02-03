package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvol extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ bvoq c;
    final /* synthetic */ efwo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvol(bvoq bvoqVar, efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bvoqVar;
        this.d = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvol) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0112, code lost:
    
        if (r14.g(false, r4, r13) == r0) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103 A[Catch: all -> 0x0029, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:12:0x0024, B:43:0x0103), top: B:52:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0148 A[RETURN] */
    /* JADX WARN: Type inference failed for: r14v24, types: [bvoq] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [egbe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvol.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvol(this.c, this.d, fcxyVar);
    }
}
