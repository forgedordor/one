package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmoc extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmoo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmoc(dmoo dmooVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmooVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmoc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmoo dmooVar = this.b;
            fdvc fdvcVarK = dmooVar.c.k();
            dmob dmobVar = new dmob(dmooVar);
            this.a = 1;
            if (fdvcVarK.a(dmobVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmoc(this.b, fcxyVar);
    }
}
