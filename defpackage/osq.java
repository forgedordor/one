package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class osq extends fcyz implements fdat {
    int a;
    final /* synthetic */ osu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osq(osu osuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = osuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((osq) c((owr) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            owr owrVar = (owr) this.c;
            osu osuVar = this.b;
            fdpl fdplVarB = oqf.b(new fdtj(new fdui(new oqc(new fdqz(new osk(null), osuVar.c.a), new osm(osuVar, null), null))), new osp(null, osuVar));
            oso osoVar = new oso(owrVar);
            this.a = 1;
            if (fdplVarB.a(osoVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        osq osqVar = new osq(this.b, fcxyVar);
        osqVar.c = obj;
        return osqVar;
    }
}
