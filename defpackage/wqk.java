package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wqk extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ wqm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqk(wqm wqmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = wqmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wqk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dc, code lost:
    
        if (r13.b((defpackage.vvw) r1, r12) != r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fd, code lost:
    
        if (defpackage.fdxs.c(r13, r12) != r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wqk(this.c, fcxyVar);
    }
}
