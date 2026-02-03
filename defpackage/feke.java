package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feke extends fcyz implements fdat {
    /* synthetic */ Object a;

    public feke(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((feke) c((doec) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(((doec) this.a) == doec.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        feke fekeVar = new feke(fcxyVar);
        fekeVar.a = obj;
        return fekeVar;
    }
}
