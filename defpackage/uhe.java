package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhe extends fcyz implements fdat {
    int a;
    final /* synthetic */ bsbm b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhe(fcxy fcxyVar, bsbm bsbmVar) {
        super(2, fcxyVar);
        this.b = bsbmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uhe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        eiju eijuVarX = this.b.x();
        eijuVarX.getClass();
        this.a = 1;
        Object objC = fdxs.c(eijuVarX, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        uhe uheVar = new uhe(fcxyVar, this.b);
        uheVar.c = obj;
        return uheVar;
    }
}
