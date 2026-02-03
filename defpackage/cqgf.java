package defpackage;

import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqgf {
    final /* synthetic */ cqgh a;

    public cqgf(final cqgh cqghVar) {
        this.a = cqghVar;
        ((ConnectivityManager) cqghVar.f.b()).registerDefaultNetworkCallback(new cqgb(this));
        if (craf.h) {
            ekrg ekrgVar = cqgh.c;
            ekrw ekrwVarH = ekrgVar.h();
            ekrz ekrzVar = eksq.a;
            ekrwVarH.X(ekrzVar, "BugleConnectivity");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer", "<init>", 1139, "ConnectivityUtilImpl.java")).q("Registering BugleCarrierRoamingNtnModeListenerWrapper");
            final cqge cqgeVar = new cqge(this);
            ((crny) cqghVar.m.b()).o(new crnx() { // from class: cqfv
                @Override // defpackage.crnx
                public final boolean a(int i) {
                    ekrw ekrwVarE = cqgh.c.e();
                    ekrwVarE.X(eksq.a, "BugleConnectivity");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer", "<init>", 1235, "ConnectivityUtilImpl.java")).r("Registering CarrierRoamingNtnModeChangedListener for subId %d", i);
                    ((clhx) cqghVar.l.b()).a(i, cqgeVar);
                    return true;
                }
            });
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "BugleConnectivity");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer", "<init>", 1243, "ConnectivityUtilImpl.java")).q("Registering listener for satellite modem state changes.");
            ((clhx) cqghVar.l.b()).d(new cqfw(this, cqghVar));
        }
    }

    public final void a(int i) {
        cqgh cqghVar = this.a;
        cqghVar.u.set(i);
        cqghVar.A("onSatelliteModemStateChanged (" + i + ")");
        if (cqghVar.G()) {
            if (i == 8) {
                ekrw ekrwVarH = cqgh.c.h();
                ekrwVarH.X(eksq.a, "BugleConnectivity");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer", "onSatelliteModemStateChangedInternal", 1265, "ConnectivityUtilImpl.java")).q("Manual satellite eligible, modem is now in ENABLING state. Notifying listeners.");
                cqghVar.C(clif.e, "registerForModemStateChanged");
                return;
            }
            if (cqghVar.r.get() != clie.e || cqghVar.t.get()) {
                return;
            }
            if (i == -1 || i == 4 || i == 5) {
                ekrw ekrwVarH2 = cqgh.c.h();
                ekrwVarH2.X(eksq.a, "BugleConnectivity");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer", "onSatelliteModemStateChangedInternal", 1275, "ConnectivityUtilImpl.java")).q("Manual satellite eligible, modem is now OFF. Notifying listeners about manual satellite eligibility.");
                cqghVar.C(clif.a, "registerForModemStateChanged");
            }
        }
    }
}
