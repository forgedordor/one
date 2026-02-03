package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dvy extends fcyz implements fdat {
    int a;
    private /* synthetic */ Object b;

    public dvy(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdjx fdjxVar;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fdjxVar = (fdjx) this.b;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            fdjxVar = (fdjx) this.b;
        }
        while (fdlw.h(fdjxVar.hE())) {
            fdap fdapVar = new fdap() { // from class: dvx
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    ((Long) obj2).longValue();
                    return fctx.a;
                }
            };
            this.b = fdjxVar;
            this.a = 1;
            if (hos.c(fdapVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dvy dvyVar = new dvy(fcxyVar);
        dvyVar.b = obj;
        return dvyVar;
    }
}
