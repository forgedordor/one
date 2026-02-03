package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdnv extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cdoa d;
    final /* synthetic */ cdmq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdnv(cdoa cdoaVar, cdmq cdmqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = cdoaVar;
        this.e = cdmqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdnv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x03d0, code lost:
    
        if (r3 != r0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        if (r12.o(r11, r22) != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019d, code lost:
    
        if (r3 == r0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0245, code lost:
    
        if (r12.o(r11, r22) == r0) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00cb: MOVE (r2 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:204), block:B:40:0x00cb */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0336 A[Catch: Exception -> 0x03d3, TRY_LEAVE, TryCatch #2 {Exception -> 0x03d3, blocks: (B:104:0x0311, B:106:0x0336, B:76:0x0223, B:72:0x01eb, B:74:0x01f9, B:83:0x024b, B:84:0x0264, B:86:0x026a, B:88:0x0284, B:98:0x02bd, B:100:0x02f4, B:91:0x028f, B:92:0x0293, B:94:0x0299, B:102:0x0300, B:70:0x01cf, B:53:0x0112, B:55:0x011a, B:57:0x0151, B:68:0x01b0), top: B:134:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x034f A[Catch: Exception -> 0x00e5, TRY_ENTER, TryCatch #1 {Exception -> 0x00e5, blocks: (B:127:0x03d6, B:128:0x03d9, B:10:0x002c, B:110:0x033d, B:113:0x034f, B:115:0x038a, B:117:0x038e, B:118:0x0391, B:120:0x03ca, B:122:0x03ce, B:7:0x0020, B:79:0x0237, B:16:0x0042, B:37:0x00ba, B:29:0x0072, B:42:0x00d0, B:45:0x00da, B:66:0x019f, B:48:0x00e1, B:60:0x0156, B:62:0x0197, B:64:0x019b), top: B:133:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0391 A[Catch: Exception -> 0x00e5, TryCatch #1 {Exception -> 0x00e5, blocks: (B:127:0x03d6, B:128:0x03d9, B:10:0x002c, B:110:0x033d, B:113:0x034f, B:115:0x038a, B:117:0x038e, B:118:0x0391, B:120:0x03ca, B:122:0x03ce, B:7:0x0020, B:79:0x0237, B:16:0x0042, B:37:0x00ba, B:29:0x0072, B:42:0x00d0, B:45:0x00da, B:66:0x019f, B:48:0x00e1, B:60:0x0156, B:62:0x0197, B:64:0x019b), top: B:133:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[PHI: r2 r11
      0x0068: PHI (r2v40 cdnl) = (r2v37 cdnl), (r2v43 cdnl) binds: [B:35:0x00b6, B:24:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0068: PHI (r11v20 java.lang.Object) = (r11v18 java.lang.Object), (r11v23 java.lang.Object) binds: [B:35:0x00b6, B:24:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0197 A[Catch: Exception -> 0x00e5, TryCatch #1 {Exception -> 0x00e5, blocks: (B:127:0x03d6, B:128:0x03d9, B:10:0x002c, B:110:0x033d, B:113:0x034f, B:115:0x038a, B:117:0x038e, B:118:0x0391, B:120:0x03ca, B:122:0x03ce, B:7:0x0020, B:79:0x0237, B:16:0x0042, B:37:0x00ba, B:29:0x0072, B:42:0x00d0, B:45:0x00da, B:66:0x019f, B:48:0x00e1, B:60:0x0156, B:62:0x0197, B:64:0x019b), top: B:133:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019b A[Catch: Exception -> 0x00e5, TryCatch #1 {Exception -> 0x00e5, blocks: (B:127:0x03d6, B:128:0x03d9, B:10:0x002c, B:110:0x033d, B:113:0x034f, B:115:0x038a, B:117:0x038e, B:118:0x0391, B:120:0x03ca, B:122:0x03ce, B:7:0x0020, B:79:0x0237, B:16:0x0042, B:37:0x00ba, B:29:0x0072, B:42:0x00d0, B:45:0x00da, B:66:0x019f, B:48:0x00e1, B:60:0x0156, B:62:0x0197, B:64:0x019b), top: B:133:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01eb A[Catch: Exception -> 0x03d3, PHI: r2 r11 r14
      0x01eb: PHI (r2v45 cdnj) = (r2v29 cdnj), (r2v68 cdnj) binds: [B:71:0x01e9, B:20:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r11v24 java.lang.Object) = (r11v16 java.lang.Object), (r11v33 java.lang.Object) binds: [B:71:0x01e9, B:20:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r14v8 dzub) = (r14v4 dzub), (r14v9 dzub) binds: [B:71:0x01e9, B:20:0x0053] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x03d3, blocks: (B:104:0x0311, B:106:0x0336, B:76:0x0223, B:72:0x01eb, B:74:0x01f9, B:83:0x024b, B:84:0x0264, B:86:0x026a, B:88:0x0284, B:98:0x02bd, B:100:0x02f4, B:91:0x028f, B:92:0x0293, B:94:0x0299, B:102:0x0300, B:70:0x01cf, B:53:0x0112, B:55:0x011a, B:57:0x0151, B:68:0x01b0), top: B:134:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f9 A[Catch: Exception -> 0x03d3, TryCatch #2 {Exception -> 0x03d3, blocks: (B:104:0x0311, B:106:0x0336, B:76:0x0223, B:72:0x01eb, B:74:0x01f9, B:83:0x024b, B:84:0x0264, B:86:0x026a, B:88:0x0284, B:98:0x02bd, B:100:0x02f4, B:91:0x028f, B:92:0x0293, B:94:0x0299, B:102:0x0300, B:70:0x01cf, B:53:0x0112, B:55:0x011a, B:57:0x0151, B:68:0x01b0), top: B:134:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0249  */
    /* JADX WARN: Type inference failed for: r11v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v72, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v85, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdnv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdnv(this.d, this.e, fcxyVar);
    }
}
