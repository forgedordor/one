package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aknc extends fcyz implements fdat {
    int a;
    final /* synthetic */ aknj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aknc(fcxy fcxyVar, aknj aknjVar) {
        super(2, fcxyVar);
        this.b = aknjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aknc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        eiju eijuVarB = this.b.d.n().b();
        eijuVarB.getClass();
        this.a = 1;
        Object objC = fdxs.c(eijuVarB, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aknc akncVar = new aknc(fcxyVar, this.b);
        akncVar.c = obj;
        return akncVar;
    }
}
