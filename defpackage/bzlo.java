package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzlo extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ bzlp c;
    final /* synthetic */ cayy d;
    final /* synthetic */ bzzx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzlo(bzlp bzlpVar, cayy cayyVar, bzzx bzzxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bzlpVar;
        this.d = cayyVar;
        this.e = bzzxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzlo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r6 != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[Catch: Exception -> 0x0022, PHI: r6
      0x0070: PHI (r6v24 java.lang.Object) = (r6v23 java.lang.Object), (r6v0 java.lang.Object) binds: [B:28:0x006e, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x0022, blocks: (B:8:0x0014, B:29:0x0070, B:11:0x001a, B:22:0x0051, B:24:0x005c, B:27:0x0063, B:39:0x00a9, B:12:0x001e, B:20:0x003a, B:17:0x0028), top: B:50:0x0007 }] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzlo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzlo(this.c, this.d, this.e, fcxyVar);
    }
}
