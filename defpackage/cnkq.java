package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnkq extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnku b;
    final /* synthetic */ eqdi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnkq(cnku cnkuVar, eqdi eqdiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnkuVar;
        this.c = eqdiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnkq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        eqdi eqdiVar = this.c;
        this.a = 1;
        Object objB = cnkuVar.a.b(eqdiVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnkq(this.b, this.c, fcxyVar);
    }
}
