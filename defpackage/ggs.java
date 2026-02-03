package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ggs extends fcyz implements fdat {
    int a;
    final /* synthetic */ ejy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggs(ejy ejyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ejyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ggs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                ejy ejyVar = this.b;
                int iB = ejyVar.b() + 1;
                this.a = 1;
                if (ejyVar.j(iB, 0, this) == fcylVar) {
                    return fcylVar;
                }
            }
        } catch (IllegalArgumentException unused) {
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ggs(this.b, fcxyVar);
    }
}
