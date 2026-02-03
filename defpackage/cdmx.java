package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdmx extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdnb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdmx(fcxy fcxyVar, cdnb cdnbVar) {
        super(2, fcxyVar);
        this.b = cdnbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdmx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cdnb cdnbVar = this.b;
        cdmy cdmyVar = new cdmy(cdnbVar);
        this.a = 1;
        Object objD = cdnbVar.b.d(cdmyVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cdmx cdmxVar = new cdmx(fcxyVar, this.b);
        cdmxVar.c = obj;
        return cdmxVar;
    }
}
