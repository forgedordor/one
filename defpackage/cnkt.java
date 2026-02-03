package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnkt extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnku b;
    final /* synthetic */ eqdr c;
    final /* synthetic */ eqee d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnkt(cnku cnkuVar, eqdr eqdrVar, eqee eqeeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnkuVar;
        this.c = eqdrVar;
        this.d = eqeeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnkt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cnku cnkuVar = this.b;
        eqdr eqdrVar = this.c;
        eqee eqeeVar = this.d;
        this.a = 1;
        Object objG = cnkuVar.a.g(eqdrVar, eqeeVar, this);
        return objG == fcylVar ? fcylVar : objG;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnkt(this.b, this.c, this.d, fcxyVar);
    }
}
