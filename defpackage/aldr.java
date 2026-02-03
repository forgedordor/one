package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aldr extends fcyz implements fdat {
    int a;
    final /* synthetic */ alec b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aldr(fcxy fcxyVar, alec alecVar) {
        super(2, fcxyVar);
        this.b = alecVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aldr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        eiju eijuVarB = this.b.h.b();
        this.a = 1;
        Object objC = fdxs.c(eijuVarB, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aldr aldrVar = new aldr(fcxyVar, this.b);
        aldrVar.c = obj;
        return aldrVar;
    }
}
