package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class camk extends fcyz implements fdat {
    final /* synthetic */ cams a;
    final /* synthetic */ emec b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public camk(fcxy fcxyVar, cams camsVar, emec emecVar) {
        super(2, fcxyVar);
        this.a = camsVar;
        this.b = emecVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((camk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.e.t(this.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        camk camkVar = new camk(fcxyVar, this.a, this.b);
        camkVar.c = obj;
        return camkVar;
    }
}
