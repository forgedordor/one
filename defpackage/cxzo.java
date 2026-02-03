package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxzo extends fcyz implements fdat {
    int a;
    final /* synthetic */ cxze b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxzo(fcxy fcxyVar, cxze cxzeVar) {
        super(2, fcxyVar);
        this.b = cxzeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxzo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cxze cxzeVar = this.b;
        cxzp cxzpVar = new cxzp(cxzeVar, null);
        this.a = 1;
        Object objB = cxze.b(cxzeVar, cxzpVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cxzo cxzoVar = new cxzo(fcxyVar, this.b);
        cxzoVar.c = obj;
        return cxzoVar;
    }
}
