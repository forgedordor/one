package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auvp extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdat b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auvp(fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auvp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fdjx fdjxVar = (fdjx) this.c;
        fdat fdatVar = this.b;
        this.a = 1;
        Object objA = fdatVar.a(fdjxVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        auvp auvpVar = new auvp(this.b, fcxyVar);
        auvpVar.c = obj;
        return auvpVar;
    }
}
