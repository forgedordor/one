package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edxb extends fcyz implements fdat {
    int a;
    final /* synthetic */ edxi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edxb(edxi edxiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = edxiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((edxb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            edxi edxiVar = this.b;
            fdpl fdplVarC = fdud.c(((edwi) edxiVar.a).f, edxiVar.g, edxiVar.h, new fdpp(new edxa(edxiVar, null)), edxiVar.f, new edwy(null));
            edwz edwzVar = new edwz(edxiVar);
            this.a = 1;
            if (fdplVarC.a(edwzVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new edxb(this.b, fcxyVar);
    }
}
