package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class camm extends fcyz implements fdat {
    int a;
    final /* synthetic */ cams b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public camm(fcxy fcxyVar, cams camsVar) {
        super(2, fcxyVar);
        this.b = camsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((camm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        eiju eijuVarM = this.b.c.m();
        this.a = 1;
        Object objC = fdxs.c(eijuVarM, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        camm cammVar = new camm(fcxyVar, this.b);
        cammVar.c = obj;
        return cammVar;
    }
}
