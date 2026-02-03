package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfdj extends fcyz implements fdat {
    public cfdj(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return new cfdj((fcxy) obj2).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        epnk epnkVar = (epnk) epnl.a.createBuilder();
        epnkVar.getClass();
        epnm.b(epnkVar);
        return epnm.a(epnkVar).toByteString();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfdj(fcxyVar);
    }
}
