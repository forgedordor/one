package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahex extends cmwf {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/profile/startup/ProfilesStartupTask");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;

    public ahex(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.a("ProfilesStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        if (!((Boolean) this.b.b()).booleanValue()) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleProfiles");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/profile/startup/ProfilesStartupTask", "run", 36, "ProfilesStartupTask.kt")).q("Profiles full refresh disabled, not scheduling refresh");
            eiju eijuVarE = eijx.e(false);
            eijuVarE.getClass();
            return eijuVarE;
        }
        if (((artb) this.d.b()).a()) {
            ekrw ekrwVarH2 = a.h();
            ekrwVarH2.X(eksq.a, "BugleProfiles");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/profile/startup/ProfilesStartupTask", "run", 41, "ProfilesStartupTask.kt")).q("Not running profiles startup task, using synclet");
            eiju eijuVarE2 = eijx.e(false);
            eijuVarE2.getClass();
            return eijuVarE2;
        }
        chqj chqjVar = (chqj) this.c.b();
        auvw.k(chqjVar.a, null, null, new chqi(chqjVar, null), 3);
        eiju eijuVarE3 = eijx.e(true);
        eijuVarE3.getClass();
        return eijuVarE3;
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return true;
    }
}
