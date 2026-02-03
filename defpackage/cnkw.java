package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnkw extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnkx b;
    final /* synthetic */ eqdb c;
    final /* synthetic */ eqeq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnkw(cnkx cnkxVar, eqdb eqdbVar, eqeq eqeqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnkxVar;
        this.c = eqdbVar;
        this.d = eqeqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnkw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cnkx cnkxVar = this.b;
        eqdb eqdbVar = this.c;
        eqeq eqeqVar = this.d;
        this.a = 1;
        Object objJ = cnkxVar.a.j(eqdbVar, eqeqVar, this);
        return objJ == fcylVar ? fcylVar : objJ;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnkw(this.b, this.c, this.d, fcxyVar);
    }
}
