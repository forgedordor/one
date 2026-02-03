package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmki implements cmkh {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/simstatetracker/SimStateSchedulerImpl");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public cmki(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar6.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar5;
        this.e = fcsuVar6;
    }

    private final void c(cmky cmkyVar, long j, eoaz eoazVar) {
        ((ekrd) a.h().h("com/google/android/apps/messaging/shared/simstatetracker/SimStateSchedulerImpl", "scheduleWorkWithPwq", 67, "SimStateSchedulerImpl.kt")).I("Scheduling %s using PWQ. Delay Seconds: %s, UpdateTrigger: %s", cmkyVar.name(), Long.valueOf(j), eoazVar);
        cmkp cmkpVar = (cmkp) this.d.b();
        cmkn cmknVar = (cmkn) cmko.a.createBuilder();
        cmknVar.getClass();
        cmkyVar.getClass();
        cmknVar.copyOnWrite();
        cmko cmkoVar = (cmko) cmknVar.instance;
        cmkoVar.c = cmkyVar.a();
        cmkoVar.b |= 1;
        cmknVar.copyOnWrite();
        cmko cmkoVar2 = (cmko) cmknVar.instance;
        cmkoVar2.e = eoazVar.a();
        cmkoVar2.b |= 2;
        evsn evsnVarBuild = cmknVar.build();
        evsnVarBuild.getClass();
        caxr caxrVar = new caxr();
        caxrVar.c = Duration.ofSeconds(j);
        caxrVar.b = "sim_state_update_deduplication_tag".concat(String.valueOf(cmkyVar.name()));
        caxrVar.a = cmkyVar.name();
        ((cazj) cmkpVar.a.b()).a(cbcu.g("sim_state_update", (cmko) evsnVarBuild, caxrVar.a()));
        cmlp cmlpVar = (cmlp) this.e.b();
        cmkyVar.getClass();
        ((ains) cmlpVar.a.b()).e("Bugle.Dsdr.SimStateScheduler", cmkyVar.ordinal());
    }

    @Override // defpackage.cmkh
    public final void a(eoaz eoazVar) {
        eoazVar.getClass();
        fcsu fcsuVar = this.b;
        cmky cmkyVar = cmky.WORK_TYPE_VERIFY_SIM_REMOVAL;
        Object objB = fcsuVar.b();
        objB.getClass();
        c(cmkyVar, ((Number) objB).longValue(), eoazVar);
    }

    @Override // defpackage.cmkh
    public final void b(eoaz eoazVar) {
        eoazVar.getClass();
        ekrd ekrdVar = (ekrd) a.h().h("com/google/android/apps/messaging/shared/simstatetracker/SimStateSchedulerImpl", "scheduleUpdatePhoneSimsState", 40, "SimStateSchedulerImpl.kt");
        fcsu fcsuVar = this.c;
        Object objB = fcsuVar.b();
        objB.getClass();
        ekrdVar.A("Scheduling UPDATE_PHONE_SIMS_STATE. Delay Seconds: %s, UpdateTrigger: %s", ((Number) objB).longValue(), eoazVar.name());
        cmky cmkyVar = cmky.WORK_TYPE_UPDATE_PHONE_SIMS_STATE;
        Object objB2 = fcsuVar.b();
        objB2.getClass();
        c(cmkyVar, ((Number) objB2).longValue(), eoazVar);
    }
}
