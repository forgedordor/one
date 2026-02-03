package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avid extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ avie c;
    final /* synthetic */ cayy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avid(avie avieVar, cayy cayyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = avieVar;
        this.d = cayyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avid) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf A[Catch: Exception -> 0x0012, TryCatch #1 {Exception -> 0x0012, blocks: (B:6:0x000d, B:37:0x00d4, B:32:0x009d, B:34:0x00cf), top: B:59:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avid.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avid(this.c, this.d, fcxyVar);
    }
}
