package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amwz extends fcyz implements fdat {
    int a;
    final /* synthetic */ amxa b;
    final /* synthetic */ amxd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amwz(amxa amxaVar, amxd amxdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = amxaVar;
        this.c = amxdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amwz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        amxa amxaVar = this.b;
        amxd amxdVar = this.c;
        this.a = 1;
        Object objK = amxaVar.k(amxdVar, this);
        return objK == fcylVar ? fcylVar : objK;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amwz(this.b, this.c, fcxyVar);
    }
}
