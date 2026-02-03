package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dodb extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ dode d;
    final /* synthetic */ String e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dodb(dode dodeVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = dodeVar;
        this.e = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dodb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dodb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dodb dodbVar = new dodb(this.d, this.e, fcxyVar);
        dodbVar.f = obj;
        return dodbVar;
    }
}
