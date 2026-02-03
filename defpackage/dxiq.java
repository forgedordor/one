package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxiq extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxit b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxiq(dxit dxitVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxitVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxiq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dxfg dxfgVar = (dxfg) ((ejwi) ((eyig) this.b.b).a).c();
            this.a = 1;
            if (dxfgVar.a() == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxiq(this.b, fcxyVar);
    }
}
