package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coab extends fcyz implements fdat {
    int a;
    final /* synthetic */ coaf b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coab(fcxy fcxyVar, coaf coafVar) {
        super(2, fcxyVar);
        this.b = coafVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((coab) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        eiju eijuVarH = this.b.a().h();
        this.a = 1;
        Object objC = fdxs.c(eijuVarH, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        coab coabVar = new coab(fcxyVar, this.b);
        coabVar.c = obj;
        return coabVar;
    }
}
