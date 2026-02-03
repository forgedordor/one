package defpackage;

import android.util.Pair;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdrl extends cayv implements dvjc {
    public final cqce a = cqce.g("Lighter", "LighterIncrementalSyncHandler");
    public final fcsu b;
    public final fcsu c;
    public final akhq d;
    public final dzuc e;
    private final fcsu f;
    private final eosc g;

    public cdrl(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eosc eoscVar, akhq akhqVar, dzuc dzucVar) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.f = fcsuVar3;
        this.g = eoscVar;
        this.d = akhqVar;
        this.e = dzucVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("LighterIncrementalSyncHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cdrn.a.getParserForType();
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final cdrn cdrnVar = (cdrn) evuhVar;
        int i = cdrnVar.b;
        if ((i & 1) == 0 || (i & 2) == 0) {
            this.a.r("Cannot sync without gaia_email and sync_end_timestamp");
            return eijx.e(cbcw.i());
        }
        final eiju eijuVarA = ((cdpy) this.f.b()).a(cdrnVar.c);
        final eiju eijuVarB = ((cdre) this.c.b()).b();
        return eijx.k(eijuVarA, eijuVarB).a(new Callable() { // from class: cdrk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dwje dwjeVar;
                long j;
                cqce cqceVar;
                dvjd dvjdVarF;
                dvyx dvyxVar;
                Optional optional = (Optional) eork.q(eijuVarA);
                long jLongValue = ((Long) eork.q(eijuVarB)).longValue();
                boolean zIsEmpty = optional.isEmpty();
                cdrl cdrlVar = this.a;
                cdrn cdrnVar2 = cdrnVar;
                if (zIsEmpty) {
                    cdrlVar.a.r("Incremental sync not started because the account is not registered in Lighter");
                    return cbcw.i();
                }
                dzub dzubVarD = cdrlVar.e.d();
                boolean z = true;
                try {
                    ((cdre) cdrlVar.c.b()).d(true);
                    dwjeVar = (dwje) optional.get();
                    j = cdrnVar2.d;
                    cqceVar = cdrlVar.a;
                    cqceVar.m("Start incremental sync");
                    dvjdVarF = ((dvhb) cdrlVar.b.b()).f();
                    dwhp dwhpVarC = dvpn.c(dwjeVar);
                    dwhpVarC.f(711);
                    dwhq dwhqVarA = dwhpVarC.a();
                    dvyxVar = ((dvpn) dvjdVarF).c;
                    dvyxVar.b(dwhqVarA);
                } catch (RuntimeException unused) {
                    cdrlVar.a.r("Sync interrupted because of exception");
                }
                if (jLongValue < 0 || j < 0 || j < jLongValue) {
                    dvhv.f(dvpn.a, "Return immediately because input parameters are invalid");
                    dwhp dwhpVarC2 = dvpn.c(dwjeVar);
                    dwhpVarC2.f(712);
                    dvyxVar.b(dwhpVarC2.a());
                    throw new IllegalArgumentException();
                }
                dvrd dvrdVar = ((dvpn) dvjdVarF).b;
                ekgb ekgbVarZ = dvrdVar.b(dwjeVar).z(jLongValue, j);
                ekgb ekgbVarY = dvrdVar.b(dwjeVar).y(jLongValue, j);
                int i2 = 0;
                int i3 = 0;
                while (i2 < ekgbVarZ.size() && i3 < ekgbVarY.size()) {
                    if (((dwpo) ekgbVarZ.get(i2)).d() < ((Long) ((Pair) ekgbVarY.get(i3)).second).longValue()) {
                        ((dvpn) dvjdVarF).b(dwjeVar, cdrlVar, (dwpo) ekgbVarZ.get(i2));
                        i2++;
                    } else {
                        ((dvpn) dvjdVarF).a(dwjeVar, cdrlVar, (Pair) ekgbVarY.get(i3));
                        i3++;
                    }
                }
                while (i2 < ekgbVarZ.size()) {
                    ((dvpn) dvjdVarF).b(dwjeVar, cdrlVar, (dwpo) ekgbVarZ.get(i2));
                    i2++;
                }
                while (i3 < ekgbVarY.size()) {
                    ((dvpn) dvjdVarF).a(dwjeVar, cdrlVar, (Pair) ekgbVarY.get(i3));
                    i3++;
                }
                cqceVar.m(a.e(i2 + i3, "Sync completed: ", " conversations are synced"));
                z = false;
                ((cdre) cdrlVar.c.b()).d(false);
                cdrlVar.e.f(dzubVarD, new dzfh("IncrementalSyncExecutionTime"), null, z ? dzua.ERROR : dzua.SUCCESS);
                return cbcw.i();
            }
        }, this.g);
    }
}
