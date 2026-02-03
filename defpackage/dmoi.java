package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmoi extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmoo b;
    final /* synthetic */ lvj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmoi(dmoo dmooVar, lvj lvjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmooVar;
        this.c = lvjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmoi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmoo dmooVar = this.b;
            dmooVar.g(this.c, 4);
            dmbu dmbuVar = dmbu.b;
            this.a = 1;
            if (dmooVar.c.r(dmbuVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmoi(this.b, this.c, fcxyVar);
    }
}
