package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxsu extends fcyz implements fdat {
    /* synthetic */ Object a;

    public bxsu(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxsu) c((bxsm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bxsj bxsjVar = (bxsj) ((bxsm) this.a).toBuilder();
        bxsjVar.getClass();
        bxsn.c(1, bxsjVar);
        bxsn.b(1, bxsjVar);
        return bxsn.a(bxsjVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bxsu bxsuVar = new bxsu(fcxyVar);
        bxsuVar.a = obj;
        return bxsuVar;
    }
}
