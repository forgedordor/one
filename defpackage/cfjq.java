package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfjq extends fcyz implements fdat {
    int a;
    final /* synthetic */ cfjr b;
    final /* synthetic */ eozg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfjq(cfjr cfjrVar, eozg eozgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cfjrVar;
        this.c = eozgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfjq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cfjr cfjrVar = this.b;
        eozg eozgVar = this.c;
        this.a = 1;
        Object objE = cfjrVar.e(eozgVar, this);
        return objE == fcylVar ? fcylVar : objE;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfjq(this.b, this.c, fcxyVar);
    }
}
