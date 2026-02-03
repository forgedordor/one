package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anzm extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ anzp c;
    final /* synthetic */ anzn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anzm(anzp anzpVar, anzn anznVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = anzpVar;
        this.d = anznVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anzm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
    
        if (r15 == r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0126, code lost:
    
        if (r15 != r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0173, code lost:
    
        if (r15 == r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01aa, code lost:
    
        if (r15 != r0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[PHI: r15
      0x0086: PHI (r15v27 java.lang.Object) = (r15v26 java.lang.Object), (r15v0 java.lang.Object) binds: [B:22:0x0084, B:15:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0112 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x0019, B:9:0x0020, B:41:0x0104, B:43:0x0112, B:45:0x0120, B:47:0x0124, B:39:0x00e8), top: B:69:0x000f }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anzm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anzm(this.c, this.d, fcxyVar);
    }
}
