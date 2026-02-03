package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xoq extends fcyz implements fdat {
    final /* synthetic */ xoy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoq(xoy xoyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = xoyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((xoq) c(bool, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        xoy xoyVar = this.a;
        auvw.k(xoyVar.e, null, null, new xop(xoyVar, null), 3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xoq(this.a, fcxyVar);
    }
}
