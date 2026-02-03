package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbhh extends fcyz implements fdat {
    private /* synthetic */ Object a;

    public cbhh(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbhh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbhh cbhhVar = new cbhh(fcxyVar);
        cbhhVar.a = obj;
        return cbhhVar;
    }
}
