package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwiu extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ bwiv c;
    final /* synthetic */ ezjj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwiu(bwiv bwivVar, ezjj ezjjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bwivVar;
        this.d = ezjjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwiu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a6, code lost:
    
        if (defpackage.fdxs.c(r11, r10) == r3) goto L27;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwiu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bwiu(this.c, this.d, fcxyVar);
    }
}
