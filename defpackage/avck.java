package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avck extends fcyz implements fdat {
    int a;
    final /* synthetic */ avco b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avck(avco avcoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = avcoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avck) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            avco avcoVar = this.b;
            this.a = 1;
            if (avcoVar.f(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avck(this.b, fcxyVar);
    }
}
