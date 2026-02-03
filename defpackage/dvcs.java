package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvcs extends fcyz implements fdat {
    int a;
    final /* synthetic */ dvcu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvcs(dvcu dvcuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dvcuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvcs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dvcu dvcuVar = this.b;
        dvct dvctVar = dvcv.a;
        this.a = 1;
        Object objA = dvctVar.a(dvcuVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dvcs(this.b, fcxyVar);
    }
}
