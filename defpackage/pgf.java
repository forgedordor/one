package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pgf extends fcyz implements fdat {
    int a;
    final /* synthetic */ pgn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgf(pgn pgnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = pgnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pgf) c((phc) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        phc phcVar = (phc) this.c;
        pgn pgnVar = this.b;
        this.a = 1;
        Object objA = pgnVar.a(phcVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        pgf pgfVar = new pgf(this.b, fcxyVar);
        pgfVar.c = obj;
        return pgfVar;
    }
}
