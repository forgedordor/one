package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abki implements cqto {
    public static final cqce a = cqce.g("Bugle", "FailToLoadHandler");
    public final abpt b;
    public final fcsu c;
    public final fcsu d;
    public final eosc e;
    public final eigp f;
    public cquc h;
    public cquc i;
    public cquc j;
    private final eosd l;
    private final AtomicReference k = new AtomicReference();
    public final AtomicBoolean g = new AtomicBoolean(false);

    public abki(abpt abptVar, fcsu fcsuVar, eigp eigpVar, fcsu fcsuVar2, eosc eoscVar, eosd eosdVar) {
        this.b = abptVar;
        this.c = fcsuVar;
        this.f = eigpVar;
        this.d = fcsuVar2;
        this.e = eoscVar;
        this.l = eosdVar;
    }

    public final void a() {
        eiju eijuVar = (eiju) this.k.get();
        if (eijuVar == null || eijuVar.isDone()) {
            a.p("failToLoadTimer is already done.");
        } else {
            eijuVar.cancel(true);
            a.p("failToLoadTimer cancelled.");
        }
    }

    public final void d() {
        a();
        a.p("Starting failToLoadTimer.");
        this.k.set(eiju.g(this.l.schedule(new Runnable() { // from class: abkh
            @Override // java.lang.Runnable
            public final void run() {
                cqce cqceVar = abki.a;
                cqbd cqbdVarC = cqceVar.c();
                cqbdVarC.I("failToLoadTimer triggered.");
                cqbdVarC.r();
                abki abkiVar = this.a;
                eieh eiehVarC = abkiVar.f.c("triggerFailToLoadTimer", "com/google/android/apps/messaging/dittosatellite/impl/FailToLoadHandler", "triggerFailToLoadTimer", 159);
                try {
                    cqbd cqbdVarC2 = cqceVar.c();
                    cqbdVarC2.I("Store ShouldShowFailToLoadDialog.");
                    cqbdVarC2.r();
                    ((abfv) abkiVar.c.b()).j(true).k(auvh.b(), abkiVar.e);
                    eiehVarC.close();
                } catch (Throwable th) {
                    try {
                        eiehVarC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, ((Long) abmt.f.e()).longValue(), TimeUnit.MILLISECONDS)));
    }

    @Override // defpackage.cqto
    public final /* synthetic */ void fJ() {
    }

    @Override // defpackage.cqto
    public final /* synthetic */ void fK() {
    }
}
