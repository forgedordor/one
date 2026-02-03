package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ywh extends fcyz implements fdat {
    int a;
    final /* synthetic */ ywm b;
    final /* synthetic */ ajlt c;
    final /* synthetic */ ahat d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywh(ywm ywmVar, ajlt ajltVar, ahat ahatVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ywmVar;
        this.c = ajltVar;
        this.d = ahatVar;
        this.e = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ywh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdrw fdrwVar = new fdrw(anov.a(this.b.e.i(this.c.b())), new ywg(this.d, this.e, null));
            this.a = 1;
            if (fdpy.a(fdrwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ywh(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
