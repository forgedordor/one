package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnpl extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnpm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnpl(cnpm cnpmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnpmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnpl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2 A[PHI: r5
      0x00d2: PHI (r5v4 int) = (r5v1 int), (r5v2 int), (r5v3 int) binds: [B:33:0x00d0, B:42:0x00de, B:51:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7 A[PHI: r6
      0x00d7: PHI (r6v4 int) = (r6v1 int), (r6v2 int), (r6v3 int) binds: [B:36:0x00d5, B:45:0x00e2, B:54:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnpl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnpl(this.b, fcxyVar);
    }
}
