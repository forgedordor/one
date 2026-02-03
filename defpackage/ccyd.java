package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccyd extends fcyz implements fdat {
    /* synthetic */ Object a;

    public ccyd(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccyd) c((ccxy) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ccxx ccxxVar = (ccxx) ((ccxy) this.a).toBuilder();
        ccxxVar.getClass();
        ccxxVar.copyOnWrite();
        ccxy ccxyVar = (ccxy) ccxxVar.instance;
        ccxyVar.b |= 2;
        ccxyVar.c = true;
        return ccyg.a(ccxxVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ccyd ccydVar = new ccyd(fcxyVar);
        ccydVar.a = obj;
        return ccydVar;
    }
}
