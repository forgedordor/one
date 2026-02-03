package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbq extends fcyz implements fdat {
    int a;
    final /* synthetic */ tbt b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbq(fcxy fcxyVar, tbt tbtVar) {
        super(2, fcxyVar);
        this.b = tbtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tbq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cmfo cmfoVarA = this.b.a();
        this.a = 1;
        Object objC = cmfoVarA.c(this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tbq tbqVar = new tbq(fcxyVar, this.b);
        tbqVar.c = obj;
        return tbqVar;
    }
}
