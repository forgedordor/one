package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqge implements clhv {
    final /* synthetic */ cqgf a;

    public cqge(cqgf cqgfVar) {
        this.a = cqgfVar;
    }

    @Override // defpackage.clhv
    public final void a(final boolean z, final int i) throws InterruptedException {
        cqgh cqghVar = this.a.a;
        if (((asaq) cqghVar.y.b()).a()) {
            cqghVar.D(new Runnable() { // from class: cqgd
                @Override // java.lang.Runnable
                public final void run() throws InterruptedException {
                    this.a.c(z, i);
                }
            });
        } else {
            c(z, i);
        }
    }

    @Override // defpackage.clhv
    public final void b(final boolean z, final int i) throws InterruptedException {
        cqgh cqghVar = this.a.a;
        if (((asaq) cqghVar.y.b()).a()) {
            cqghVar.D(new Runnable() { // from class: cqgc
                @Override // java.lang.Runnable
                public final void run() throws InterruptedException {
                    this.a.d(z, i);
                }
            });
        } else {
            d(z, i);
        }
    }

    public final void c(boolean z, int i) throws InterruptedException {
        cqgh cqghVar = this.a.a;
        cqghVar.A("SubID = " + i + " onCarrierRoamingNtnEligibleStateChanged (" + z + ")");
        Map map = cqghVar.w;
        boolean zG = cqghVar.G();
        map.put(Integer.valueOf(i), Boolean.valueOf(z));
        if (!z) {
            if (!zG || cqghVar.G()) {
                return;
            }
            ekrw ekrwVarH = cqgh.c.h();
            ekrwVarH.X(eksq.a, "BugleConnectivity");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer$2", "onCarrierRoamingNtnEligibleStateChangedInternal", 1222, "ConnectivityUtilImpl.java")).q("Eligibility switched from true to false. Notify the listeners.");
            cqghVar.C(clif.e, "onCarrierRoamingNtnEligibleStateChanged");
            return;
        }
        AtomicReference atomicReference = cqghVar.r;
        if (((clie) atomicReference.get()).equals(clie.c) && !cqghVar.t.get()) {
            ekrw ekrwVarH2 = cqgh.c.h();
            ekrwVarH2.X(eksq.a, "BugleConnectivity");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer$2", "onCarrierRoamingNtnEligibleStateChangedInternal", 1201, "ConnectivityUtilImpl.java")).q("Eligible for manual satellite. Ignoring active CELLULAR network and notifying listeners about eligibility");
            cqghVar.C(clif.a, "onCarrierRoamingNtnEligibleStateChanged");
            return;
        }
        if (((clie) atomicReference.get()).a() || atomicReference.get() == clie.b || cqghVar.t.get()) {
            ekrw ekrwVarH3 = cqgh.c.h();
            ekrwVarH3.X(eksq.a, "BugleConnectivity");
            ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer$2", "onCarrierRoamingNtnEligibleStateChangedInternal", 1216, "ConnectivityUtilImpl.java")).q("Active data network is available, not notifying listeners");
        } else {
            ekrw ekrwVarH4 = cqgh.c.h();
            ekrwVarH4.X(eksq.a, "BugleConnectivity");
            ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer$2", "onCarrierRoamingNtnEligibleStateChangedInternal", 1210, "ConnectivityUtilImpl.java")).q("No active data network, notifying listeners about eligibility");
            cqghVar.C(clif.a, "onCarrierRoamingNtnEligibleStateChanged");
        }
    }

    public final void d(boolean z, int i) throws InterruptedException {
        cqgh cqghVar = this.a.a;
        cqghVar.A("SubID = " + i + " onCarrierRoamingNtnModeChanged (" + z + ")");
        cqghVar.t.set(z);
        cqghVar.v.put(Integer.valueOf(i), Boolean.valueOf(z));
        if (!z) {
            if (cqghVar.G()) {
                cqghVar.C(clif.a, "onCarrierRoamingNtnModeChanged");
                return;
            } else {
                cqghVar.C(clif.e, "onCarrierRoamingNtnModeChanged");
                return;
            }
        }
        if (!((asao) cqghVar.x.b()).a() || cqghVar.G()) {
            cqghVar.C(clif.c, "onCarrierRoamingNtnModeChanged");
        } else {
            cqghVar.C(clif.b, "onCarrierRoamingNtnModeChanged");
        }
    }
}
