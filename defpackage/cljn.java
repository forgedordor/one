package defpackage;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cljn implements cljm {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PeriodPullWorkManagerImpl");
    private final egsh b;
    private final Duration c;

    public cljn(egsh egshVar, Duration duration) {
        egshVar.getClass();
        this.b = egshVar;
        this.c = duration;
    }

    @Override // defpackage.cljm
    public final void a() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PeriodPullWorkManagerImpl", "cancelWork", 53, "PeriodPullWorkManagerImpl.kt")).q("Cancel period pull work.");
        auvh.h(this.b.a("PeriodicPullWorker"));
    }

    @Override // defpackage.cljm
    public final void b() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PeriodPullWorkManagerImpl", "scheduleWork", 28, "PeriodPullWorkManagerImpl.kt")).q("Schedule period pull work.");
        egsj egsjVarN = egsn.n(cljp.class);
        egsjVarN.g(new egsb("PeriodicPullWorker", pzy.d));
        ((egrx) egsjVarN).c = new egsa(0L, TimeUnit.MILLISECONDS);
        egsjVarN.e(new egrz(new egsa(this.c.toMinutes(), TimeUnit.MINUTES), ejud.a));
        auvh.h(this.b.c(egsjVarN.h()));
    }
}
