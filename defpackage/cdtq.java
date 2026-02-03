package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdtq extends cmwg {
    public static final cqce a = cqce.g("BugleMDD", "MddBackgroundStartupTask");
    public final fcsu b;
    public final fcsu c;
    public final eosc d;
    public final fcsu e;
    private final eosc f;

    public cdtq(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar3) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.f = eoscVar;
        this.d = eoscVar2;
        this.e = fcsuVar3;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("MddBackgroundStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        return eijx.f(new Runnable() { // from class: cdto
            @Override // java.lang.Runnable
            public final void run() {
                if (!((Boolean) crbf.Q.e()).booleanValue() && !((Boolean) crbf.P.e()).booleanValue()) {
                    cdtq.a.m("MDD Lib is not enabled, skipping reading config and job scheduling.");
                    return;
                }
                cdtq cdtqVar = this.a;
                dtsl dtslVar = (dtsl) cdtqVar.b.b();
                dtvs dtvsVarD = dtvt.d();
                dtvsVarD.b(true);
                cczi ccziVar = crbf.bh;
                dtvsVarD.c(((Boolean) ccziVar.e()).booleanValue());
                dtvsVarD.d(false);
                dtvt dtvtVarA = dtvsVarD.a();
                dtvs dtvsVarD2 = dtvt.d();
                dtvsVarD2.b(true);
                dtvsVarD2.c(((Boolean) ccziVar.e()).booleanValue());
                dtvsVarD2.d(false);
                dtvt dtvtVarA2 = dtvsVarD2.a();
                dtvs dtvsVarD3 = dtvt.d();
                dtvsVarD3.b(true);
                dtvsVarD3.c(false);
                dtvsVarD3.d(false);
                eika.l(dtslVar.j(ejwi.j(ekgp.n("MDD.CELLULAR.CHARGING.PERIODIC.TASK", dtvtVarA, "MDD.WIFI.CHARGING.PERIODIC.TASK", dtvtVarA2, "MDD.MAINTENANCE.PERIODIC.GCM.TASK", dtvsVarD3.a()))), new cdtp(cdtqVar), eoqg.a);
            }
        }, this.f);
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return true;
    }
}
