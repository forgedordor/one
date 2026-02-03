package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xob extends fcyz implements fdat {
    int a;
    final /* synthetic */ xog b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xob(xog xogVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xogVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xob) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xog xogVar = this.b;
            agff agffVar = new agff(crmc.LOCATION_PERMISSIONS);
            this.a = 1;
            if (xogVar.c.f(agffVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xob(this.b, fcxyVar);
    }
}
