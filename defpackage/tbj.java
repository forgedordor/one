package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbj extends fcyz implements fdat {
    final /* synthetic */ tbn a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbj(fcxy fcxyVar, tbn tbnVar) {
        super(2, fcxyVar);
        this.a = tbnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tbj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.c.c();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tbj tbjVar = new tbj(fcxyVar, this.a);
        tbjVar.b = obj;
        return tbjVar;
    }
}
