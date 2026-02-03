package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aker extends fcyz implements fdat {
    int a;
    final /* synthetic */ akex b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aker(akex akexVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akexVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aker) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        eiju eijuVarB = this.b.b.n().b();
        eijuVarB.getClass();
        this.a = 1;
        Object objC = fdxs.c(eijuVarB, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aker(this.b, fcxyVar);
    }
}
