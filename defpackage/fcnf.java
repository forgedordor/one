package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcnf extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ fbnc d;
    final /* synthetic */ fbnd e;
    final /* synthetic */ fbrk f;
    final /* synthetic */ fbrg g;
    final /* synthetic */ fdpm h;
    final /* synthetic */ fcna i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcnf(fbnc fbncVar, fbnd fbndVar, fbrk fbrkVar, fbrg fbrgVar, fdpm fdpmVar, fcna fcnaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = fbncVar;
        this.e = fbndVar;
        this.f = fbrkVar;
        this.g = fbrgVar;
        this.h = fdpmVar;
        this.i = fcnaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fcnf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
    
        if (r7.fO(r13, r12) != r0) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5 A[Catch: Exception -> 0x002f, PHI: r1 r5 r6 r13
      0x00a5: PHI (r1v9 fdoc) = (r1v18 fdoc), (r1v19 fdoc) binds: [B:19:0x00a3, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r5v9 fdlr) = (r5v17 fdlr), (r5v18 fdlr) binds: [B:19:0x00a3, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r6v4 fbnh) = (r6v5 fbnh), (r6v8 fbnh) binds: [B:19:0x00a3, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r13v7 java.lang.Object) = (r13v15 java.lang.Object), (r13v0 java.lang.Object) binds: [B:19:0x00a3, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002f, blocks: (B:7:0x0015, B:24:0x00c1, B:18:0x0097, B:20:0x00a5, B:22:0x00ad, B:11:0x002b), top: B:38:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:7:0x0015, B:24:0x00c1, B:18:0x0097, B:20:0x00a5, B:22:0x00ad, B:11:0x002b), top: B:38:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00bf -> B:24:0x00c1). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcnf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fcnf fcnfVar = new fcnf(this.d, this.e, this.f, this.g, this.h, this.i, fcxyVar);
        fcnfVar.j = obj;
        return fcnfVar;
    }
}
