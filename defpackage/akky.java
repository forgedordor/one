package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akky extends fcyz implements fdat {
    int a;
    final /* synthetic */ akkz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akky(akkz akkzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akkzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akky) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = this.b.b.n().b();
            eijuVarB.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        obj.getClass();
        return new akkx(this.b.a, (ajts) obj);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akky(this.b, fcxyVar);
    }
}
