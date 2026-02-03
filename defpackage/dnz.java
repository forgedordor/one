package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dnz extends fcyz implements fdat {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ dob d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnz(dob dobVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = dobVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnz) c((Float) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c0, code lost:
    
        if (r15.h.e(r0, r14) != r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af A[Catch: all -> 0x00c3, PHI: r12 r15
      0x00af: PHI (r12v9 dnz) = (r12v5 dnz), (r12v12 dnz) binds: [B:27:0x00ac, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r15v9 java.lang.Object) = (r15v4 java.lang.Object), (r15v0 java.lang.Object) binds: [B:27:0x00ac, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x00c3, blocks: (B:29:0x00af, B:26:0x00a8), top: B:45:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dnz dnzVar = new dnz(this.d, fcxyVar);
        dnzVar.c = obj;
        return dnzVar;
    }
}
