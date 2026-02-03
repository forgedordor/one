package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agwu extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ agwv c;
    final /* synthetic */ efwo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agwu(agwv agwvVar, efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = agwvVar;
        this.d = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agwu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r6 == r0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4 A[SYNTHETIC] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agwu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agwu(this.c, this.d, fcxyVar);
    }
}
