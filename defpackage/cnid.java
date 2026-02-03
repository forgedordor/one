package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnid extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cnie d;
    final /* synthetic */ cnib e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnid(cnie cnieVar, cnib cnibVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = cnieVar;
        this.e = cnibVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnid) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (r13 != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0127, code lost:
    
        if (r13 != r0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010c A[LOOP:0: B:39:0x0106->B:41:0x010c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnid.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnid(this.d, this.e, fcxyVar);
    }
}
