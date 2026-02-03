package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecxs extends fcyz implements fdat {
    int a;
    final /* synthetic */ etvg b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecxs(etvg etvgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = etvgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ecxs) c((etuq) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        etuq etuqVar = (etuq) this.c;
        etvg etvgVar = this.b;
        this.a = 1;
        Object objB = etuqVar.b(etvgVar, new fbrg(), this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ecxs ecxsVar = new ecxs(this.b, fcxyVar);
        ecxsVar.c = obj;
        return ecxsVar;
    }
}
