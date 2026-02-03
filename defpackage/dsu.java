package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsu extends fcyz implements fdat {
    int a;
    final /* synthetic */ dsw b;
    final /* synthetic */ dod c;
    final /* synthetic */ fdat d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsu(dsw dswVar, dod dodVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dswVar;
        this.c = dodVar;
        this.d = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dsw dswVar = this.b;
            dod dodVar = this.c;
            fdat fdatVar = this.d;
            this.a = 1;
            if (dswVar.c.b(dswVar.b, dodVar, fdatVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsu(this.b, this.c, this.d, fcxyVar);
    }
}
