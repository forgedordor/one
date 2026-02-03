package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xnb extends fcyz implements fdat {
    int a;
    final /* synthetic */ xnn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnb(xnn xnnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xnnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xnb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xnn xnnVar = this.b;
            xna xnaVar = new xna(xnnVar);
            this.a = 1;
            if (xnnVar.g.a(xnaVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xnb(this.b, fcxyVar);
    }
}
