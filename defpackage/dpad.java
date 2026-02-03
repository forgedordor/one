package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpad extends fcyz implements fdat {
    int a;
    final /* synthetic */ dpao b;
    final /* synthetic */ doyt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpad(dpao dpaoVar, doyt doytVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dpaoVar;
        this.c = doytVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpad) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnhq dnhqVar = ((dnhl) this.b.bG().invoke()).b;
            doyt doytVar = this.c;
            doytVar.getClass();
            this.a = 1;
            obj = dnhqVar.b(doytVar, null, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            dpao dpaoVar = this.b;
            doyt doytVar2 = this.c;
            doytVar2.getClass();
            dpaoVar.e(doytVar2, null);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpad(this.b, this.c, fcxyVar);
    }
}
