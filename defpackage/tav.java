package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tav extends fcyz implements fdat {
    private /* synthetic */ Object a;

    public tav(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tav) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = azqo.a;
        azql azqlVar = new azql(azqo.a);
        azqlVar.A("getMetadataInternal");
        return azqlVar.b().m();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tav tavVar = new tav(fcxyVar);
        tavVar.a = obj;
        return tavVar;
    }
}
