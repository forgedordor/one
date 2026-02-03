package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dut extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ duu d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dut(duu duuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = duuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dut) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:
    
        if (r13.q(r12) != r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[PHI: r1
      0x0050: PHI (r1v18 fdjx) = (r1v2 fdjx), (r1v3 fdjx), (r1v8 fdjx), (r1v13 fdjx), (r1v25 fdjx), (r1v27 fdjx) binds: [B:18:0x0048, B:47:0x00f2, B:44:0x00e1, B:49:0x00f5, B:11:0x0022, B:9:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3 A[Catch: CancellationException -> 0x00e4, PHI: r1 r8
      0x00b3: PHI (r1v5 java.lang.Object) = (r1v10 java.lang.Object), (r1v23 java.lang.Object) binds: [B:34:0x00b1, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r8v1 fdjx) = (r8v2 fdjx), (r8v15 fdjx) binds: [B:34:0x00b1, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {CancellationException -> 0x00e4, blocks: (B:33:0x009d, B:35:0x00b3, B:37:0x00bb, B:40:0x00cf, B:42:0x00d3, B:14:0x002c), top: B:53:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb A[Catch: CancellationException -> 0x00e4, TryCatch #0 {CancellationException -> 0x00e4, blocks: (B:33:0x009d, B:35:0x00b3, B:37:0x00bb, B:40:0x00cf, B:42:0x00d3, B:14:0x002c), top: B:53:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf A[Catch: CancellationException -> 0x00e4, TryCatch #0 {CancellationException -> 0x00e4, blocks: (B:33:0x009d, B:35:0x00b3, B:37:0x00bb, B:40:0x00cf, B:42:0x00d3, B:14:0x002c), top: B:53:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00e1 -> B:19:0x0050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f2 -> B:19:0x0050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00f5 -> B:19:0x0050). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dut.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dut dutVar = new dut(this.d, fcxyVar);
        dutVar.e = obj;
        return dutVar;
    }
}
