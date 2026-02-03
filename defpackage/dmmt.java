package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmmt extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmng b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmmt(dmng dmngVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmngVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmmt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmng dmngVar = this.b;
            int i2 = this.c;
            this.a = 1;
            dmnj dmnjVar = dmngVar.i;
            Object objA = fdin.a(dmnjVar.a.hE(), new dmni(dmnjVar, i2, null), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmmt(this.b, this.c, fcxyVar);
    }
}
