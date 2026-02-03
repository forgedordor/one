package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmbh extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmbi b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmbh(dmbi dmbiVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmbiVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmbh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dmbi dmbiVar = this.b;
        dmbg dmbgVar = new dmbg(dmbiVar, this.c, null);
        this.a = 1;
        Object objE = dmbiVar.e.e("GalleryLoaderImpl#loadMedia", dmbgVar, this);
        return objE == fcylVar ? fcylVar : objE;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmbh(this.b, this.c, fcxyVar);
    }
}
