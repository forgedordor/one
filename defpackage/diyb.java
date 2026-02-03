package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diyb extends fcyz implements fdat {
    int a;
    final /* synthetic */ ejy b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public diyb(ejy ejyVar, int i, int i2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ejyVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((diyb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ejy ejyVar = this.b;
            int i2 = 0;
            for (eji ejiVar : ejyVar.d().i()) {
                if (fdbq.f(ejiVar.d, new Integer(this.c))) {
                    i2 = ejiVar.h;
                }
            }
            int i3 = this.c;
            this.a = 1;
            if (ejyVar.j(i3, ((-this.d) / 2) + (i2 / 2), this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new diyb(this.b, this.c, this.d, fcxyVar);
    }
}
