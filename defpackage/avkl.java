package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avkl extends fcyz implements fdat {
    int a;
    final /* synthetic */ avkm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avkl(avkm avkmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = avkmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avkl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            avkm avkmVar = this.b;
            this.a = 1;
            if (avkmVar.a.a(this) == fcylVar) {
                return fcylVar;
            }
        }
        return cbcw.i();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avkl(this.b, fcxyVar);
    }
}
