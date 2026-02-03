package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghk extends fcyz implements fdat {
    int a;
    final /* synthetic */ ejy b;
    final /* synthetic */ fdap c;
    final /* synthetic */ hhr d;
    final /* synthetic */ fddq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghk(ejy ejyVar, fdap fdapVar, hhr hhrVar, fddq fddqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ejyVar;
        this.c = fdapVar;
        this.d = hhrVar;
        this.e = fddqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ghk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final ejy ejyVar = this.b;
            fdap fdapVar = this.c;
            hhr hhrVar = this.d;
            fddq fddqVar = this.e;
            this.a = 1;
            egc egcVar = ghx.a;
            Object objA = hsb.a(new fdae() { // from class: ggc
                @Override // defpackage.fdae
                public final Object invoke() {
                    egc egcVar2 = ghx.a;
                    return Integer.valueOf(ejyVar.b());
                }
            }).a(new ghw(ejyVar, fdapVar, hhrVar, fddqVar), this);
            if (objA != fcylVar) {
                objA = fctx.a;
            }
            if (objA == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ghk(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
