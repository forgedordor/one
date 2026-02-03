package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clin extends fcyz implements fdat {
    int a;
    final /* synthetic */ clir b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clin(fcxy fcxyVar, clir clirVar) {
        super(2, fcxyVar);
        this.b = clirVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clin) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        clir clirVar = this.b;
        this.a = 1;
        Object objD = clirVar.d(this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        clin clinVar = new clin(fcxyVar, this.b);
        clinVar.c = obj;
        return clinVar;
    }
}
