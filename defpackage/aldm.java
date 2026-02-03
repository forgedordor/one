package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aldm extends fcyz implements fdat {
    int a;
    final /* synthetic */ aldl b;
    final /* synthetic */ aldn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aldm(aldl aldlVar, aldn aldnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aldlVar;
        this.c = aldnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aldm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        albe albeVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            if (((Boolean) ((cczi) crbf.bF.get()).e()).booleanValue()) {
                aldl aldlVar = this.b;
                if ((aldlVar.b & 4) != 0) {
                    albeVar = aldlVar.e;
                    if (albeVar == null) {
                        albeVar = albe.a;
                    }
                } else {
                    albeVar = null;
                }
                if (albeVar != null) {
                    ((cdvn) this.c.b.b()).b(bary.b(albeVar.b));
                    return cbcw.i();
                }
            }
            crbi crbiVar = (crbi) this.c.a.b();
            aldl aldlVar2 = this.b;
            this.a = 1;
            if (crbiVar.i(aldlVar2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return cbcw.i();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aldm(this.b, this.c, fcxyVar);
    }
}
