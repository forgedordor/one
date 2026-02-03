package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdir extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdiv b;
    final /* synthetic */ efwo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdir(cdiv cdivVar, efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cdivVar;
        this.c = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdir) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cdiv cdivVar = this.b;
        efwo efwoVar = this.c;
        this.a = 1;
        Object objB = cdivVar.b(efwoVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdir(this.b, this.c, fcxyVar);
    }
}
