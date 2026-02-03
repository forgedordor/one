package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qgf extends fcyz implements fdat {
    int a;
    final /* synthetic */ qgh b;
    final /* synthetic */ fdos c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgf(qgh qghVar, fdos fdosVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = qghVar;
        this.c = fdosVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qgf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            this.a = 1;
            if (fdkj.c(1000L, this) == fcylVar) {
                return fcylVar;
            }
        }
        qas.c().a(qgu.a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
        this.c.b(new qfz(7));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new qgf(this.b, this.c, fcxyVar);
    }
}
