package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cngz extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnhg b;
    final /* synthetic */ eqeq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cngz(fcxy fcxyVar, cnhg cnhgVar, eqeq eqeqVar) {
        super(2, fcxyVar);
        this.b = cnhgVar;
        this.c = eqeqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cngz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cnhg cnhgVar = this.b;
        eqeq eqeqVar = this.c;
        this.a = 1;
        Object objG = cnhgVar.a.g(eqeqVar.b, this);
        return objG == fcylVar ? fcylVar : objG;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cngz cngzVar = new cngz(fcxyVar, this.b, this.c);
        cngzVar.d = obj;
        return cngzVar;
    }
}
