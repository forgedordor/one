package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnec extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    Object h;
    int i;
    final /* synthetic */ eqds j;
    final /* synthetic */ cnef k;
    final /* synthetic */ ezol l;
    final /* synthetic */ Instant m;
    final /* synthetic */ eqfu n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnec(eqds eqdsVar, cnef cnefVar, ezol ezolVar, Instant instant, eqfu eqfuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.j = eqdsVar;
        this.k = cnefVar;
        this.l = ezolVar;
        this.m = instant;
        this.n = eqfuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnec) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0133, code lost:
    
        if (r0 == r6) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0186, code lost:
    
        if (r0 != r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01fd, code lost:
    
        if (r1 == r6) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0174 A[PHI: r0 r9
      0x0174: PHI (r0v32 java.lang.Object) = (r0v28 java.lang.Object), (r0v38 java.lang.Object) binds: [B:28:0x0170, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r9v11 asrc) = (r9v9 asrc), (r9v12 asrc) binds: [B:28:0x0170, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a9  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnec.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnec(this.j, this.k, this.l, this.m, this.n, fcxyVar);
    }
}
