package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajca extends fcyz implements fdat {
    int a;
    final /* synthetic */ ajcb b;
    final /* synthetic */ efwo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajca(ajcb ajcbVar, efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ajcbVar;
        this.c = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajca) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ajcb ajcbVar = this.b;
            ajbz ajbzVar = new ajbz(ajcbVar, this.c, null);
            this.a = 1;
            if (ajcbVar.a.a(ajbzVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ajca(this.b, this.c, fcxyVar);
    }
}
