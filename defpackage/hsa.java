package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hsa extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    final /* synthetic */ fdae g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsa(fdae fdaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.g = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hsa) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fc, code lost:
    
        if (r3 != 8) goto L108;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:34:0x00d3, B:45:0x00fe], limit reached: 110 */
    /* JADX WARN: Path cross not found for [B:56:0x0121, B:77:0x016a], limit reached: 110 */
    /* JADX WARN: Path cross not found for [B:77:0x016a, B:56:0x0121], limit reached: 110 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011f A[EDGE_INSN: B:106:0x011f->B:55:0x011f BREAK  A[LOOP:0: B:27:0x00ac->B:79:0x0171], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9 A[Catch: all -> 0x0045, PHI: r2 r5 r6 r7 r8 r9 r10 r11
      0x00a9: PHI (r2v8 java.lang.Object) = (r2v12 java.lang.Object), (r2v15 java.lang.Object) binds: [B:24:0x00a7, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r5v1 int) = (r5v14 int), (r5v0 int) binds: [B:24:0x00a7, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r6v5 java.lang.Object) = (r6v18 java.lang.Object), (r6v21 java.lang.Object) binds: [B:24:0x00a7, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r7v1 fdoa) = (r7v9 fdoa), (r7v10 fdoa) binds: [B:24:0x00a7, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r8v1 fdap) = (r8v9 fdap), (r8v10 fdap) binds: [B:24:0x00a7, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r9v1 cva) = (r9v9 cva), (r9v10 cva) binds: [B:24:0x00a7, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r10v2 fdpm) = (r10v3 fdpm), (r10v8 fdpm) binds: [B:24:0x00a7, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r11v2 java.lang.Object) = (r11v7 java.lang.Object), (r11v8 java.lang.Object) binds: [B:24:0x00a7, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x0045, blocks: (B:11:0x0041, B:23:0x0095, B:25:0x00a9, B:64:0x014b, B:75:0x0166, B:76:0x0169, B:8:0x002c, B:16:0x006c, B:20:0x007d, B:87:0x0183, B:88:0x0186, B:17:0x0072, B:19:0x007a, B:84:0x017e, B:85:0x0181, B:18:0x0076), top: B:96:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121 A[Catch: all -> 0x0178, TRY_LEAVE, TryCatch #4 {all -> 0x0178, blocks: (B:40:0x00ee, B:53:0x0112, B:56:0x0121, B:60:0x0138, B:62:0x0141, B:43:0x00f7, B:46:0x0100), top: B:97:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0171 A[LOOP:0: B:27:0x00ac->B:79:0x0171, LOOP_END] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsa.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        hsa hsaVar = new hsa(this.g, fcxyVar);
        hsaVar.h = obj;
        return hsaVar;
    }
}
