package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crlq extends fcyz implements fdat {
    final /* synthetic */ crlr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crlq(crlr crlrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = crlrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crlq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cczi ccziVar = crls.a;
        Object objE = crls.a.e();
        objE.getClass();
        this.a.a.k(((Number) objE).longValue());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crlq(this.a, fcxyVar);
    }
}
