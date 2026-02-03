package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ucn extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ uco c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucn(uco ucoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ucoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ucn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [cmfo, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            uco ucoVar = this.c;
            if (!((eoth) ((aord) ucoVar.e).a.b()).a("bugle.backfill_rcs_msisdn_missing_field")) {
                uco.a.p("Skipping RcsMsisdnBackfillMissingFieldSyncletTask run because the flag is off.");
                return fctx.a;
            }
            fcsu fcsuVar = ucoVar.d;
            byiq byiqVar = byiq.CONVERSATION_RCS_MSISDN_BACKFILL_TASK;
            aurx aurxVar = ((aurx) fcsuVar.b()).m.a;
            final String strName = byiqVar.name();
            eiju eijuVarH = aurxVar.e.get().h().h(new ejvr() { // from class: aunu
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ejvr
                public final Object apply(Object obj3) {
                    cqce cqceVar = aurx.a;
                    String str = strName;
                    aumd aumdVar = aumd.a;
                    str.getClass();
                    evub evubVar = ((aumq) obj3).F;
                    return evubVar.containsKey(str) ? (aumd) evubVar.get(str) : aumdVar;
                }
            }, aurxVar.f).h(new ejvr() { // from class: aurv
                @Override // defpackage.ejvr
                public final Object apply(Object obj3) {
                    int iA = aumb.a(((aumd) obj3).c);
                    boolean z = true;
                    if (iA != 0 && iA != 1) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }, eoqg.a);
            this.a = byiqVar;
            this.b = 1;
            obj = fdxs.c(eijuVarH, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            obj2 = byiqVar;
        }
        if (!((Boolean) obj).booleanValue()) {
            uco.a.p("Skipping RcsMsisdnBackfillMissingFieldSyncletTask because it has already run.");
            return fctx.a;
        }
        uco.a.p("Starting RcsMsisdnBackfillMissingFieldSyncletTask.");
        uco ucoVar2 = this.c;
        int iA = ucoVar2.c.a();
        byio byioVar = (byio) byir.a.createBuilder();
        byioVar.getClass();
        obj2.getClass();
        byioVar.copyOnWrite();
        byir byirVar = (byir) byioVar.instance;
        byirVar.d = ((byiq) obj2).e;
        byirVar.b |= 4;
        byis byisVar = (byis) byit.a.createBuilder();
        byisVar.getClass();
        byisVar.copyOnWrite();
        byit byitVar = (byit) byisVar.instance;
        byitVar.b = 1 | byitVar.b;
        byitVar.c = iA;
        byisVar.copyOnWrite();
        byit byitVar2 = (byit) byisVar.instance;
        byitVar2.b |= 2;
        byitVar2.d = 2;
        byisVar.copyOnWrite();
        byit byitVar3 = (byit) byisVar.instance;
        byitVar3.b |= 4;
        byitVar3.e = bzas.a(5);
        byhs.b(byim.a(byisVar), byioVar);
        byir byirVarA = byhs.a(byioVar);
        caxr caxrVar = new caxr();
        caxrVar.b = "RcsMsisdnBackfillMissingFieldSyncletTask";
        ((cazj) ucoVar2.b.a.b()).a(cbcu.g("cms_backfill_missing_field_work_handler", byirVarA, caxrVar.a()));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ucn(this.c, fcxyVar);
    }
}
