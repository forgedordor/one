package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class curv extends fcyz implements fdat {
    int a;
    final /* synthetic */ adhu b;
    final /* synthetic */ adik c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public curv(adhu adhuVar, adik adikVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = adhuVar;
        this.c = adikVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((curv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            adhu adhuVar = this.b;
            adik adikVar = this.c;
            this.a = 1;
            if (adhuVar.e(adikVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new curv(this.b, this.c, fcxyVar);
    }
}
