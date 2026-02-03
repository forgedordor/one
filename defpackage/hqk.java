package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqk extends fcyz implements fdat {
    /* synthetic */ Object a;

    public hqk(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hqk) c((hqj) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(((hqj) this.a) == hqj.a);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        hqk hqkVar = new hqk(fcxyVar);
        hqkVar.a = obj;
        return hqkVar;
    }
}
