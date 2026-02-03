package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlyx extends fcyz implements fdat {
    /* synthetic */ Object a;

    public dlyx(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlyx) c((dlyp) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(!(((dlyp) this.a) instanceof dlyn));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dlyx dlyxVar = new dlyx(fcxyVar);
        dlyxVar.a = obj;
        return dlyxVar;
    }
}
