package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpal extends fcyz implements fdat {
    int a;
    final /* synthetic */ dpao b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpal(dpao dpaoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dpaoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpal) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            dpao dpaoVar = this.b;
            dpaoVar.bx();
            dpaoVar.bL();
        } else {
            dpao dpaoVar2 = this.b;
            if (dpaoVar2.aH != 3) {
                dpaoVar2.aH = 2;
            } else {
                if (dpao.bo(dpaoVar2).d) {
                    this.a = 1;
                    if (dpaoVar2.br(this) == fcylVar) {
                        return fcylVar;
                    }
                }
                dpao dpaoVar3 = this.b;
                dpaoVar3.bx();
                dpaoVar3.bL();
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpal(this.b, fcxyVar);
    }
}
