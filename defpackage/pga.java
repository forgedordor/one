package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pga extends fcyz implements fdat {
    int a;
    final /* synthetic */ pgn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pga(pgn pgnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = pgnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pga) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            pgn pgnVar = this.b;
            this.a = 1;
            if (pgnVar.e(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new pga(this.b, fcxyVar);
    }
}
