package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dtv extends fcyy implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    boolean g;
    float h;
    int i;
    final /* synthetic */ fdae j;
    final /* synthetic */ fdch k;
    final /* synthetic */ dwm l;
    final /* synthetic */ fdau m;
    final /* synthetic */ fdat n;
    final /* synthetic */ fdae o;
    final /* synthetic */ fdap p;
    private /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtv(fdae fdaeVar, fdch fdchVar, dwm dwmVar, fdau fdauVar, fdat fdatVar, fdae fdaeVar2, fdap fdapVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.j = fdaeVar;
        this.k = fdchVar;
        this.l = dwmVar;
        this.m = fdauVar;
        this.n = fdatVar;
        this.o = fdaeVar2;
        this.p = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtv) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0433, code lost:
    
        if (defpackage.duh.m(r6, r7) != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x04af, code lost:
    
        if (r2 != 0.0f) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0155, code lost:
    
        if (r11 == r1) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02b1, code lost:
    
        if (r5 != r1) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:121:0x0383, B:145:0x03f8], limit reached: 210 */
    /* JADX WARN: Path cross not found for [B:145:0x03f8, B:118:0x037b], limit reached: 210 */
    /* JADX WARN: Path cross not found for [B:166:0x0469, B:177:0x048e], limit reached: 210 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x034a A[PHI: r2 r3 r4 r5 r6 r7 r10 r11 r16 r18
      0x034a: PHI (r2v26 float) = (r2v25 float), (r2v27 float) binds: [B:6:0x0053, B:106:0x0346] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r3v28 ise) = (r3v27 ise), (r3v30 ise) binds: [B:6:0x0053, B:106:0x0346] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r4v19 ire) = (r4v18 ire), (r4v20 ire) binds: [B:6:0x0053, B:106:0x0346] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r5v7 ire) = (r5v6 ire), (r5v8 ire) binds: [B:6:0x0053, B:106:0x0346] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r6v13 java.lang.Object) = (r6v12 java.lang.Object), (r6v28 java.lang.Object) binds: [B:6:0x0053, B:106:0x0346] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r7v20 java.lang.Object) = (r7v19 java.lang.Object), (r7v21 java.lang.Object) binds: [B:6:0x0053, B:106:0x0346] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r10v9 fdch) = (r10v8 fdch), (r10v10 fdch) binds: [B:6:0x0053, B:106:0x0346] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r11v25 java.lang.Object) = (r11v24 java.lang.Object), (r11v52 java.lang.Object) binds: [B:6:0x0053, B:106:0x0346] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r16v15 long) = (r16v14 long), (r16v16 long) binds: [B:6:0x0053, B:106:0x0346] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r18v10 long) = (r18v9 long), (r18v11 long) binds: [B:6:0x0053, B:106:0x0346] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x045b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0373 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a7 A[PHI: r2 r3 r4 r9 r11 r12 r13 r14 r15 r16
      0x01a7: PHI (r2v14 fdch) = (r2v13 fdch), (r2v15 fdch) binds: [B:9:0x00cd, B:26:0x01a5] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r3v10 ire) = (r3v9 ire), (r3v13 ire) binds: [B:9:0x00cd, B:26:0x01a5] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r4v7 ire) = (r4v6 ire), (r4v8 ire) binds: [B:9:0x00cd, B:26:0x01a5] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r9v1 int) = (r9v0 int), (r9v8 int) binds: [B:9:0x00cd, B:26:0x01a5] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r11v8 ise) = (r11v7 ise), (r11v15 ise) binds: [B:9:0x00cd, B:26:0x01a5] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r12v4 java.lang.Object) = (r12v3 java.lang.Object), (r12v5 java.lang.Object) binds: [B:9:0x00cd, B:26:0x01a5] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r13v3 java.lang.Object) = (r13v2 java.lang.Object), (r13v8 java.lang.Object) binds: [B:9:0x00cd, B:26:0x01a5] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r14v3 float) = (r14v2 float), (r14v4 float) binds: [B:9:0x00cd, B:26:0x01a5] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r15v2 fdch) = (r15v1 ??), (r15v15 ??) binds: [B:9:0x00cd, B:26:0x01a5] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r16v6 long) = (r16v5 long), (r16v7 long) binds: [B:9:0x00cd, B:26:0x01a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0280  */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v5, types: [fdch] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x0315 -> B:145:0x03f8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0377 -> B:145:0x03f8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x037f -> B:145:0x03f8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x03a3 -> B:145:0x03f8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x03a6 -> B:105:0x032e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x03ca -> B:75:0x027e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x03ce -> B:105:0x032e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:142:0x03ee -> B:143:0x03f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x0403 -> B:75:0x027e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:205:0x0510 -> B:154:0x0438). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x016b -> B:67:0x0263). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x01e2 -> B:66:0x0262). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x022f -> B:67:0x0263). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0258 -> B:64:0x025a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x02d9 -> B:81:0x0299). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dtv dtvVar = new dtv(this.j, this.k, this.l, this.m, this.n, this.o, this.p, fcxyVar);
        dtvVar.q = obj;
        return dtvVar;
    }
}
