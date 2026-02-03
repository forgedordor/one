package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnlc extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnlh b;
    final /* synthetic */ aubq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnlc(cnlh cnlhVar, aubq aubqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnlhVar;
        this.c = aubqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnlc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        cnlc cnlcVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            cnlcVar = this;
        } else {
            cnlh cnlhVar = this.b;
            aubq aubqVar = this.c;
            this.a = 1;
            cnlcVar = this;
            obj = cnlh.i(cnlhVar, aubqVar, null, null, null, cnlcVar, 14);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return new cnku((eqfb) obj, cnlcVar.b.a);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnlc(this.b, this.c, fcxyVar);
    }
}
