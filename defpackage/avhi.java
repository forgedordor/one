package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avhi extends fcyz implements fdat {
    int a;
    final /* synthetic */ avhj b;
    final /* synthetic */ cayy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avhi(avhj avhjVar, cayy cayyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = avhjVar;
        this.c = cayyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avhi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r7.a(r6) == r0) goto L27;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avhi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avhi(this.b, this.c, fcxyVar);
    }
}
