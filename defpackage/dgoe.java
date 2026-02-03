package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgoe extends fcyz implements fdat {
    int a;
    final /* synthetic */ dgom b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgoe(fcxy fcxyVar, dgom dgomVar) {
        super(2, fcxyVar);
        this.b = dgomVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dgoe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dgom dgomVar = this.b;
            this.a = 1;
            if (dgomVar.f(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dgoe dgoeVar = new dgoe(fcxyVar, this.b);
        dgoeVar.c = obj;
        return dgoeVar;
    }
}
