package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class casg extends fcyz implements fdat {
    int a;
    final /* synthetic */ Ccase b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public casg(fcxy fcxyVar, Ccase ccase) {
        super(2, fcxyVar);
        this.b = ccase;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((casg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        casd casdVarCP = this.b.cP();
        this.a = 1;
        Object objA = fdjy.a(new casc(casdVarCP, null), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        casg casgVar = new casg(fcxyVar, this.b);
        casgVar.c = obj;
        return casgVar;
    }
}
