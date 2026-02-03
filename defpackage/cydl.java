package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cydl extends fcyz implements fdat {
    int a;
    final /* synthetic */ cydk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cydl(fcxy fcxyVar, cydk cydkVar) {
        super(2, fcxyVar);
        this.b = cydkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cydl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        cydl cydlVar = new cydl(fcxyVar, this.b);
        cydlVar.c = obj;
        return cydlVar;
    }
}
