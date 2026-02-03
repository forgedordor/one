package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsgu extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dsgy c;
    final /* synthetic */ ethh d;
    final /* synthetic */ String e;
    final /* synthetic */ evje f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsgu(dsgy dsgyVar, ethh ethhVar, String str, evje evjeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dsgyVar;
        this.d = ethhVar;
        this.e = str;
        this.f = evjeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsgu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        if (r1 != r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsgu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsgu(this.c, this.d, this.e, this.f, fcxyVar);
    }
}
