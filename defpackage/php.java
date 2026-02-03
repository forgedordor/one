package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class php extends fcyz implements fdat {
    final /* synthetic */ fdap a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public php(fcxy fcxyVar, fdap fdapVar) {
        super(2, fcxyVar);
        this.a = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((php) c((phc) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        phc phcVar = (phc) this.b;
        phcVar.getClass();
        return this.a.invoke(phcVar.d());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        php phpVar = new php(fcxyVar, this.a);
        phpVar.b = obj;
        return phpVar;
    }
}
