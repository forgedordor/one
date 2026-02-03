package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fer extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdap b;
    final /* synthetic */ fes c;
    final /* synthetic */ ffv d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fer(fdap fdapVar, fes fesVar, ffv ffvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdapVar;
        this.c = fesVar;
        this.d = ffvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fer) c((jkb) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            feq feqVar = new feq((jkb) this.e, this.b, this.c, this.d, null);
            this.a = 1;
            if (fdjy.a(feqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fer ferVar = new fer(this.b, this.c, this.d, fcxyVar);
        ferVar.e = obj;
        return ferVar;
    }
}
