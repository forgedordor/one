package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmlv extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ cmlx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmlv(cmlx cmlxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cmlxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmlv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9 A[LOOP:0: B:17:0x00a3->B:19:0x00a9, LOOP_END] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmlv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmlv(this.c, fcxyVar);
    }
}
