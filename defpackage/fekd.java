package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fekd extends fcyz implements fdat {
    /* synthetic */ Object a;

    public fekd(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fekd) c((dofj) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ((dofj) this.a).l;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fekd fekdVar = new fekd(fcxyVar);
        fekdVar.a = obj;
        return fekdVar;
    }
}
