package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfwo extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ cfws a;
    final /* synthetic */ fdos b;

    public cfwo(cfws cfwsVar, fdos fdosVar) {
        this.a = cfwsVar;
        this.b = fdosVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        if (this.a.b.getNetworkCapabilities(network) == null) {
            return;
        }
        Object objB = this.b.b(new cfwg(new cfwf(network.getNetworkHandle())));
        if (objB instanceof fdof) {
            Throwable thB = fdog.b(objB);
            ekrw ekrwVarI = cfws.a.i();
            ekrwVarI.X(eksq.a, "BugleBindChannelProxy");
            ((ekrd) ((ekrd) ekrwVarI).g(thB).h("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/network/NetworkAvailabilityMonitor$createFlow$1$callback$1", "onAvailable", 63, "NetworkAvailabilityMonitor.kt")).q("trySend with NetworkAvailable failed.");
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        Object objB = this.b.b(new cfwh(new cfwf(network.getNetworkHandle())));
        if (objB instanceof fdof) {
            Throwable thB = fdog.b(objB);
            ekrw ekrwVarI = cfws.a.i();
            ekrwVarI.X(eksq.a, "BugleBindChannelProxy");
            ((ekrd) ((ekrd) ekrwVarI).g(thB).h("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/network/NetworkAvailabilityMonitor$createFlow$1$callback$1", "onLost", 70, "NetworkAvailabilityMonitor.kt")).q("trySend with NetworkLost failed.");
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        cfwi cfwiVar = new cfwi(null);
        fdos fdosVar = this.b;
        Object objB = fdosVar.b(cfwiVar);
        if (objB instanceof fdof) {
            Throwable thB = fdog.b(objB);
            ekrw ekrwVarI = cfws.a.i();
            ekrwVarI.X(eksq.a, "BugleBindChannelProxy");
            ((ekrd) ((ekrd) ekrwVarI).g(thB).h("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/network/NetworkAvailabilityMonitor$createFlow$1$callback$1", "onUnavailable", 77, "NetworkAvailabilityMonitor.kt")).q("trySend with unAvailable failed.");
        }
        fdosVar.e(new IllegalStateException("NetworkCallback removed by the platform #onUnavailable"));
    }
}
