package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnbd extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnbe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnbd(dnbe dnbeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnbeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnbd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dmiz dmizVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0 && (dmizVar = this.b.f) != null) {
            this.a = 1;
            if (dmizVar.E() == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnbd(this.b, fcxyVar);
    }
}
