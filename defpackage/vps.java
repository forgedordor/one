package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vps extends fcyz implements fdat {
    int a;
    final /* synthetic */ vpt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vps(vpt vptVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vptVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vps) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            vpt vptVar = this.b;
            vpr vprVar = new vpr(vptVar);
            this.a = 1;
            if (vptVar.a.a(vprVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vps(this.b, fcxyVar);
    }
}
