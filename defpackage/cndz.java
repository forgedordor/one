package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cndz extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ ezol f;
    final /* synthetic */ ezol g;
    final /* synthetic */ eqee h;
    final /* synthetic */ cnef i;
    final /* synthetic */ Instant j;
    final /* synthetic */ eqfu k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cndz(ezol ezolVar, ezol ezolVar2, eqee eqeeVar, cnef cnefVar, Instant instant, eqfu eqfuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.f = ezolVar;
        this.g = ezolVar2;
        this.h = eqeeVar;
        this.i = cnefVar;
        this.j = instant;
        this.k = eqfuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cndz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x016b, code lost:
    
        if (r2.i(r14, "handleGroupPropertiesUpdate", r13) == r0) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9 A[PHI: r12 r14
      0x00b9: PHI (r12v3 cndz) = (r12v2 cndz), (r12v4 cndz) binds: [B:34:0x00b7, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r14v17 java.lang.Object) = (r14v15 java.lang.Object), (r14v0 java.lang.Object) binds: [B:34:0x00b7, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cndz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cndz(this.f, this.g, this.h, this.i, this.j, this.k, fcxyVar);
    }
}
