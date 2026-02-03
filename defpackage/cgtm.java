package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgtm extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgum b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgtm(cgum cgumVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cgumVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgtm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        if (!((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue()) {
            return true;
        }
        cgum cgumVar = this.b;
        this.a = 1;
        Object objF = cgumVar.f(this);
        return objF == fcylVar ? fcylVar : objF;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cgtm(this.b, fcxyVar);
    }
}
