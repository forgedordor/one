package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cipd extends fcyz implements fdat {
    final /* synthetic */ ciph a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cipd(fcxy fcxyVar, ciph ciphVar) {
        super(2, fcxyVar);
        this.a = ciphVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cipd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(this.a.d.d());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cipd cipdVar = new cipd(fcxyVar, this.a);
        cipdVar.b = obj;
        return cipdVar;
    }
}
