package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdwn extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    int d;
    int e;
    final /* synthetic */ fdpl[] f;
    final /* synthetic */ fdae g;
    final /* synthetic */ fdau h;
    final /* synthetic */ fdpm i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdwn(fdpl[] fdplVarArr, fdae fdaeVar, fdau fdauVar, fdpm fdpmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.f = fdplVarArr;
        this.g = fdaeVar;
        this.h = fdauVar;
        this.i = fdpmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdwn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0062, code lost:
    
        if (r6 != 0) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:13:0x0062, B:26:0x00a7], limit reached: 39 */
    /* JADX WARN: Path cross not found for [B:25:0x00a5, B:23:0x0096], limit reached: 39 */
    /* JADX WARN: Path cross not found for [B:28:0x00b1, B:31:0x00c8], limit reached: 39 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[LOOP:0: B:18:0x0081->B:38:?, LOOP_START, PHI: r6 r15
      0x0081: PHI (r6v5 int) = (r6v4 int), (r6v6 int) binds: [B:17:0x007f, B:38:?] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r15v7 fcvv) = (r15v6 fcvv), (r15v14 fcvv) binds: [B:17:0x007f, B:38:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r7v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [fdoa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [fdoa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c5 -> B:13:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e1 -> B:13:0x0062). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdwn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fdwn fdwnVar = new fdwn(this.f, this.g, this.h, this.i, fcxyVar);
        fdwnVar.j = obj;
        return fdwnVar;
    }
}
