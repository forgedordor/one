package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlxe extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dlxf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlxe(dlxf dlxfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dlxfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlxe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlxe.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlxe(this.c, fcxyVar);
    }
}
