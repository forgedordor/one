package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oui extends fcyz implements fdat {
    int a;
    final /* synthetic */ owd b;
    final /* synthetic */ ovw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oui(owd owdVar, ovw ovwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = owdVar;
        this.c = ovwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oui) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            owd owdVar = this.b;
            ovw ovwVar = this.c;
            this.a = 1;
            obj = owdVar.c(ovwVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        owc owcVar = (owc) obj;
        if (owcVar instanceof owb) {
            return (owb) owcVar;
        }
        if (owcVar instanceof ovy) {
            throw ((ovy) owcVar).a;
        }
        if (owcVar instanceof ovz) {
            throw new IllegalStateException("Failed to create PagedList. The provided PagingSource returned LoadResult.Invalid, but a LoadResult.Page was expected. To use a PagingSource which supports invalidation, use a PagedList builder that accepts a factory method for PagingSource or DataSource.Factory, such as LivePagedList.");
        }
        throw new fctg();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new oui(this.b, this.c, fcxyVar);
    }
}
