package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsnx extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ evje c;
    final /* synthetic */ dsoa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsnx(evje evjeVar, dsoa dsoaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = evjeVar;
        this.d = dsoaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsnx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00de, code lost:
    
        if (r11 == r0) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [dxnl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsnx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsnx(this.c, this.d, fcxyVar);
    }
}
