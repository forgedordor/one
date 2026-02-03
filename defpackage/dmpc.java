package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmpc extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmpe b;
    final /* synthetic */ dojw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmpc(dmpe dmpeVar, dojw dojwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmpeVar;
        this.c = dojwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmpc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmpe dmpeVar = this.b;
            dojw dojwVar = this.c;
            this.a = 1;
            if (dmpeVar.b.fO(dojwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmpc(this.b, this.c, fcxyVar);
    }
}
