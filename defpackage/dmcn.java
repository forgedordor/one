package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmcn extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmdo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmcn(dmdo dmdoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmdoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmcn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmdo dmdoVar = this.b;
            int iIntValue = dmdoVar.e.d.intValue();
            this.a = 1;
            if (dmdoVar.f.a(iIntValue, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmcn(this.b, fcxyVar);
    }
}
