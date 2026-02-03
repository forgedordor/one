package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egfp extends fcyz implements fdat {
    long a;
    Object b;
    int c;
    final /* synthetic */ egfq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egfp(egfq egfqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = egfqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egfp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (defpackage.fdxs.c(r12, r11) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e2, code lost:
    
        if (defpackage.fdxs.c(r12, r11) != r0) goto L22;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egfp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new egfp(this.d, fcxyVar);
    }
}
