package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxkb extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxkd b;
    final /* synthetic */ dxjx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxkb(dxkd dxkdVar, dxjx dxjxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxkdVar;
        this.c = dxjxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxkb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dxkd dxkdVar = this.b;
        dxjx dxjxVar = this.c;
        this.a = 1;
        Object objC = dxkdVar.c(dxjxVar, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxkb(this.b, this.c, fcxyVar);
    }
}
