package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agys extends fcyz implements fdat {
    int a;
    final /* synthetic */ agyw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agys(fcxy fcxyVar, agyw agywVar) {
        super(2, fcxyVar);
        this.b = agywVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agys) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cnik cnikVar = (cnik) this.b.a.b();
        this.a = 1;
        Object objA = cnikVar.a(this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        agys agysVar = new agys(fcxyVar, this.b);
        agysVar.c = obj;
        return agysVar;
    }
}
