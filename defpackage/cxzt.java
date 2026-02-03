package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxzt extends fcyz implements fdat {
    int a;
    final /* synthetic */ cxze b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxzt(fcxy fcxyVar, cxze cxzeVar) {
        super(2, fcxyVar);
        this.b = cxzeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxzt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        cxzu cxzuVar = new cxzu(cxzeVar, null);
        this.a = 1;
        Object objB = cxze.b(cxzeVar, cxzuVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cxzt cxztVar = new cxzt(fcxyVar, this.b);
        cxztVar.c = obj;
        return cxztVar;
    }
}
