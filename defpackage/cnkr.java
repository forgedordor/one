package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnkr extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnku b;
    final /* synthetic */ eqdr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnkr(cnku cnkuVar, eqdr eqdrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnkuVar;
        this.c = eqdrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnkr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        this.a = 1;
        Object objC = cnkuVar.a.c(eqdrVar, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnkr(this.b, this.c, fcxyVar);
    }
}
