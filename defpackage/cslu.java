package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cslu extends fcyz implements fdat {
    int a;
    final /* synthetic */ cslz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cslu(cslz cslzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cslzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cslu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            this.a = 1;
            if (((dhyu) this.b.c.b()).c(new int[1], this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cslu(this.b, fcxyVar);
    }
}
