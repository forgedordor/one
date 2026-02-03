package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lkn extends fcyz implements fdat {
    /* synthetic */ Object a;

    public lkn(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lkn) c((lmv) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(!(((lmv) this.a) instanceof lmf));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        lkn lknVar = new lkn(fcxyVar);
        lknVar.a = obj;
        return lknVar;
    }
}
