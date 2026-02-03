package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxsx extends fcyz implements fdat {
    /* synthetic */ Object a;

    public bxsx(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxsx) c((bxsm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bxsj bxsjVar = (bxsj) ((bxsm) this.a).toBuilder();
        bxsjVar.getClass();
        bxsn.b(2, bxsjVar);
        return bxsn.a(bxsjVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bxsx bxsxVar = new bxsx(fcxyVar);
        bxsxVar.a = obj;
        return bxsxVar;
    }
}
