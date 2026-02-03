package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnld extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnlh b;
    final /* synthetic */ aubq c;
    final /* synthetic */ eqfh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnld(cnlh cnlhVar, aubq aubqVar, eqfh eqfhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnlhVar;
        this.c = aubqVar;
        this.d = eqfhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnld) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        cnld cnldVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            cnldVar = this;
        } else {
            cnlh cnlhVar = this.b;
            aubq aubqVar = this.c;
            eqfh eqfhVar = this.d;
            this.a = 1;
            cnldVar = this;
            obj = cnlh.i(cnlhVar, aubqVar, eqfhVar, null, null, cnldVar, 12);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return new cnku((eqfb) obj, cnldVar.b.a);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnld(this.b, this.c, this.d, fcxyVar);
    }
}
