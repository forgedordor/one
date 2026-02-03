package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class drn extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdae b;
    final /* synthetic */ fdat c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drn(fdae fdaeVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdaeVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.d;
            fdci fdciVar = new fdci();
            fdae fdaeVar = this.b;
            fdat fdatVar = this.c;
            fdpl fdplVarA = hsb.a(fdaeVar);
            drm drmVar = new drm(fdciVar, fdjxVar, fdatVar);
            this.a = 1;
            if (fdplVarA.a(drmVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        drn drnVar = new drn(this.b, this.c, fcxyVar);
        drnVar.d = obj;
        return drnVar;
    }
}
