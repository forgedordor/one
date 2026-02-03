package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmek extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmhi b;
    final /* synthetic */ lvj c;
    final /* synthetic */ jfw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmek(dmhi dmhiVar, lvj lvjVar, jfw jfwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmhiVar;
        this.c = lvjVar;
        this.d = jfwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmek) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmhi dmhiVar = this.b;
            lvj lvjVar = this.c;
            jfw jfwVar = this.d;
            fdau fdauVarD = dmhiVar.d();
            this.a = 1;
            if (fdauVarD.a(lvjVar, jfwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmek(this.b, this.c, this.d, fcxyVar);
    }
}
