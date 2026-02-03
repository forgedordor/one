package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wbg extends fcyz implements fdat {
    int a;
    final /* synthetic */ etv b;
    final /* synthetic */ hsf c;
    final /* synthetic */ hri d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbg(etv etvVar, hri hriVar, hsf hsfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = etvVar;
        this.d = hriVar;
        this.c = hsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wbg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            hri hriVar = this.d;
            if (hriVar.c() != 0) {
                hsf hsfVar = this.c;
                if (wbi.a(hsfVar).size() > hriVar.c()) {
                    etv etvVar = this.b;
                    int iE = fcva.e(wbi.a(hsfVar));
                    this.a = 1;
                    if (etv.z(etvVar, iE, null, this, 6) == fcylVar) {
                        return fcylVar;
                    }
                }
            }
        }
        this.d.i(wbi.a(this.c).size());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wbg(this.b, this.d, this.c, fcxyVar);
    }
}
