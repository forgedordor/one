package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqkn extends fcyz implements fdat {
    final /* synthetic */ cqkx a;
    final /* synthetic */ cbpt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqkn(cqkx cqkxVar, cbpt cbptVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cqkxVar;
        this.b = cbptVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((cqkn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cqkn(this.a, this.b, fcxyVar);
    }
}
