package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pgh extends fcyz implements fdat {
    int a;
    final /* synthetic */ pgn b;
    final /* synthetic */ fdae c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgh(pgn pgnVar, fdae fdaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = pgnVar;
        this.c = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pgh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            pgn pgnVar = this.b;
            this.a = 1;
            obj = pgnVar.b(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new pgh(this.b, this.c, fcxyVar);
    }
}
