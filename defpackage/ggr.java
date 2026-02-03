package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ggr extends fcyz implements fdat {
    int a;
    final /* synthetic */ ejy b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggr(ejy ejyVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ejyVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ggr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ejy ejyVar = this.b;
            if (!ejyVar.i()) {
                int iB = ejyVar.b();
                int i2 = this.c;
                if (iB != i2) {
                    this.a = 1;
                    if (ejy.n(ejyVar, i2, this) == fcylVar) {
                        return fcylVar;
                    }
                }
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ggr(this.b, this.c, fcxyVar);
    }
}
