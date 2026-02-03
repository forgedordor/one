package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dozz extends fcyz implements fdat {
    int a;
    final /* synthetic */ dpao b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dozz(dpao dpaoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dpaoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dozz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dpao dpaoVar = this.b;
            fdvc fdvcVarC = dpaoVar.aW().c(dpil.aK);
            dozy dozyVar = new dozy(dpaoVar);
            this.a = 1;
            if (fdvcVarC.a(dozyVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dozz(this.b, fcxyVar);
    }
}
