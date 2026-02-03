package defpackage;

import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebey {
    private static final ebew a = new ebex();
    private final eosc b;
    private final dhkr c;
    private final dhkv d;
    private final ebff e;
    private final dfxx f;

    public ebey(eosc eoscVar, dhkr dhkrVar, dhkv dhkvVar, ebff ebffVar, dfxx dfxxVar) {
        this.b = eoscVar;
        this.c = dhkrVar;
        this.d = dhkvVar;
        this.e = ebffVar;
        this.f = dfxxVar;
    }

    public final ebew a(Optional optional, ebjf ebjfVar) {
        if (!((Boolean) dfog.o().a.x.a()).booleanValue() || dfog.o().M()) {
            dhja.c("Flag enableMsrpOverDedicatedBearer is false, won't establish dedicated bearer.", new Object[0]);
            return a;
        }
        if (!this.f.f()) {
            dhja.c("SIP connection type is Dual Registration, won't establish dedicated bearer.", new Object[0]);
            return a;
        }
        if (optional.isEmpty()) {
            dhja.g("No network present, can't establish dedicated bearer.", new Object[0]);
            return a;
        }
        try {
            NetworkInfo networkInfoE = this.c.e((Network) optional.get());
            networkInfoE.getClass();
            dhja.c("Creating QosHandler. Current network: %s", networkInfoE.getTypeName());
        } catch (dhkf unused) {
        }
        try {
            NetworkCapabilities networkCapabilitiesC = this.c.c((Network) optional.get());
            networkCapabilitiesC.getClass();
            if (!networkCapabilitiesC.hasCapability(4)) {
                dhja.c("Not on IMS network, shouldn't establish dedicated bearer.", new Object[0]);
                return a;
            }
            int iA = this.d.a();
            if (iA == 13 || iA == 20) {
                dhja.c("Current data network type: %s", iA == 13 ? "LTE" : "5G");
                return new ebfc(this.b, this.c, (Network) optional.get(), ebjfVar, this.e);
            }
            dhja.c("Not on LTE nor 5G, shouldn't establish dedicated bearer.", new Object[0]);
            return a;
        } catch (dhkf e) {
            dhja.i(e, "Can't establish dedicated bearer.", new Object[0]);
            return a;
        }
    }
}
