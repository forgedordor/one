package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqij implements clhv {
    final /* synthetic */ cqik a;

    public cqij(cqik cqikVar) {
        this.a = cqikVar;
    }

    @Override // defpackage.clhv
    public final void a(boolean z, int i) {
        cqik cqikVar = this.a;
        cqikVar.c("SubID = " + i + " onCarrierRoamingNtnEligibleStateChanged (" + z + ")");
        cqikVar.e.put(Integer.valueOf(i), Boolean.valueOf(z));
        if (!z) {
            if (cqikVar.d()) {
                return;
            }
            ekrw ekrwVarH = cqik.a.h();
            ekrwVarH.X(eksq.a, "BugleConnectivity");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/connectivity/satellite/ManualSatelliteEligibilityTrackerImpl", "processCarrierRoamingNtnEligibleChanged", 227, "ManualSatelliteEligibilityTrackerImpl.kt")).q("Lost eligibility for manual satellite.");
            cqikVar.e(false);
            return;
        }
        AtomicReference atomicReference = cqikVar.b;
        if (((clie) atomicReference.get()).equals(clie.c) && !cqikVar.c.get()) {
            ekrw ekrwVarH2 = cqik.a.h();
            ekrwVarH2.X(eksq.a, "BugleConnectivity");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/util/connectivity/satellite/ManualSatelliteEligibilityTrackerImpl", "processCarrierRoamingNtnEligibleChanged", 210, "ManualSatelliteEligibilityTrackerImpl.kt")).q("Eligible for manual satellite. Ignoring active CELLULAR network and notifying listeners about eligibility");
            cqikVar.e(true);
            return;
        }
        if (((clie) atomicReference.get()).a() || atomicReference.get() == clie.b || cqikVar.c.get()) {
            ekrw ekrwVarH3 = cqik.a.h();
            ekrwVarH3.X(eksq.a, "BugleConnectivity");
            ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/shared/util/connectivity/satellite/ManualSatelliteEligibilityTrackerImpl", "processCarrierRoamingNtnEligibleChanged", 223, "ManualSatelliteEligibilityTrackerImpl.kt")).q("Active data network is available. Not eligible for manual connection.");
            cqikVar.e(false);
            return;
        }
        ekrw ekrwVarH4 = cqik.a.h();
        ekrwVarH4.X(eksq.a, "BugleConnectivity");
        ((ekrd) ekrwVarH4.h("com/google/android/apps/messaging/shared/util/connectivity/satellite/ManualSatelliteEligibilityTrackerImpl", "processCarrierRoamingNtnEligibleChanged", 220, "ManualSatelliteEligibilityTrackerImpl.kt")).q("No active data network. Eligible for manual connection.");
        cqikVar.e(true);
    }

    @Override // defpackage.clhv
    public final void b(boolean z, int i) {
        cqik cqikVar = this.a;
        cqikVar.c("SubID = " + i + " onCarrierRoamingNtnModeChanged (" + z + ")");
        cqikVar.c.set(z);
        cqikVar.d.put(Integer.valueOf(i), Boolean.valueOf(z));
        if (z) {
            cqikVar.e(false);
        } else if (cqikVar.d()) {
            cqikVar.e(true);
        } else {
            cqikVar.e(false);
        }
    }
}
