package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class casb extends fcyz implements fdat {
    int a;
    final /* synthetic */ casd b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public casb(fcxy fcxyVar, casd casdVar) {
        super(2, fcxyVar);
        this.b = casdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((casb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = this.b.a.B();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return new Integer(((cpvs) obj).c);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        casb casbVar = new casb(fcxyVar, this.b);
        casbVar.c = obj;
        return casbVar;
    }
}
