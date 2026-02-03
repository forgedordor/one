package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cybi extends fcyz implements fdat {
    int a;
    final /* synthetic */ cybf b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cybi(fcxy fcxyVar, cybf cybfVar) {
        super(2, fcxyVar);
        this.b = cybfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cybi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        eiju eijuVarA = this.b.b.a();
        this.a = 1;
        Object objC = fdxs.c(eijuVarA, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cybi cybiVar = new cybi(fcxyVar, this.b);
        cybiVar.c = obj;
        return cybiVar;
    }
}
