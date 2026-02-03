package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxyy extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdjx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxyy(fdjx fdjxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdjxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxyy) c((cxzd) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cxzd cxzdVar = (cxzd) this.b;
        this.a = 1;
        Duration durationOfSeconds = Duration.ofSeconds(1L);
        cxzb cxzbVar = cxzdVar.a;
        dqws dqwsVarB = cxzbVar.b();
        dqwsVarB.A("BugleDbCmsColumnsDebugData.countsPerLifeCycle");
        dqwsVarB.s();
        dqwsVarB.w(cxzbVar.a().a());
        dqwsVarB.n(new dqxm("COUNT(*)"), "count");
        fdpl fdplVarB = fdsn.b(avbe.a(dqwp.a(dqwsVarB.b()), durationOfSeconds), new cxzc(cxzdVar, null));
        return fdplVarB == fcylVar ? fcylVar : fdplVarB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cxyy cxyyVar = new cxyy(this.c, fcxyVar);
        cxyyVar.b = obj;
        return cxyyVar;
    }
}
