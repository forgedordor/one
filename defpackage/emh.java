package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class emh extends fcyz implements fdat {
    final /* synthetic */ emi a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emh(emi emiVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = emiVar;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((emh) c((dwy) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        emi emiVar = this.a;
        elt eltVar = emiVar.d;
        int iA = eltVar.a();
        int i = this.b;
        if (iA != i || eltVar.b() != 0) {
            emiVar.j.c();
        }
        eltVar.e(i, 0);
        eltVar.b = null;
        iyq iyqVar = emiVar.g;
        if (iyqVar != null) {
            iyqVar.g();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new emh(this.a, this.b, fcxyVar);
    }
}
