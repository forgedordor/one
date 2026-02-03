package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import org.chromium.base.TraceEvent;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffzy extends ConnectivityManager.NetworkCallback {
    public Network a;
    public final /* synthetic */ NetworkChangeNotifierAutoDetect b;

    public ffzy(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.b = networkChangeNotifierAutoDetect;
    }

    private final boolean a(Network network, ffzn ffznVar) {
        if (b(network) || ffznVar == null) {
            return true;
        }
        if (!ffznVar.b(4)) {
            return false;
        }
        ffzr unused = this.b.mConnectivityManagerDelegate;
        return !ffzr.h(network);
    }

    private final boolean b(Network network) {
        Network network2 = this.a;
        return (network2 == null || network2.equals(network)) ? false : true;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Network network2;
        TraceEvent traceEventA = TraceEvent.a("NetworkChangeNotifierCallback::onAvailable");
        try {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.b;
            ffzn ffznVarE = networkChangeNotifierAutoDetect.mConnectivityManagerDelegate.e(network);
            if (!a(network, ffznVarE)) {
                boolean z = ffznVarE.b(4) && ((network2 = this.a) == null || !network.equals(network2));
                if (z) {
                    this.a = network;
                }
                networkChangeNotifierAutoDetect.runOnThread(new ffzt(this, NetworkChangeNotifierAutoDetect.networkToNetId(network), networkChangeNotifierAutoDetect.mConnectivityManagerDelegate.a(network), z));
            }
            if (traceEventA != null) {
                traceEventA.close();
            }
        } catch (Throwable th) {
            if (traceEventA == null) {
                throw th;
            }
            try {
                traceEventA.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        TraceEvent traceEventA = TraceEvent.a("NetworkChangeNotifierCallback::onCapabilitiesChanged");
        try {
            if (!a(network, new ffzn(networkCapabilities))) {
                long jNetworkToNetId = NetworkChangeNotifierAutoDetect.networkToNetId(network);
                NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.b;
                networkChangeNotifierAutoDetect.runOnThread(new ffzu(this, jNetworkToNetId, networkChangeNotifierAutoDetect.mConnectivityManagerDelegate.a(network)));
            }
            if (traceEventA != null) {
                traceEventA.close();
            }
        } catch (Throwable th) {
            if (traceEventA != null) {
                try {
                    traceEventA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        TraceEvent traceEventA = TraceEvent.a("NetworkChangeNotifierCallback::onLosing");
        try {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.b;
            if (!a(network, networkChangeNotifierAutoDetect.mConnectivityManagerDelegate.e(network))) {
                networkChangeNotifierAutoDetect.runOnThread(new ffzv(this, NetworkChangeNotifierAutoDetect.networkToNetId(network)));
            }
            if (traceEventA != null) {
                traceEventA.close();
            }
        } catch (Throwable th) {
            if (traceEventA != null) {
                try {
                    traceEventA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        TraceEvent traceEventA = TraceEvent.a("NetworkChangeNotifierCallback::onLost");
        try {
            if (!b(network)) {
                NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.b;
                networkChangeNotifierAutoDetect.runOnThread(new ffzw(this, network));
                if (this.a != null) {
                    this.a = null;
                    for (Network network2 : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(networkChangeNotifierAutoDetect.mConnectivityManagerDelegate, network)) {
                        onAvailable(network2);
                    }
                    networkChangeNotifierAutoDetect.updateCurrentNetworkState();
                    networkChangeNotifierAutoDetect.runOnThread(new ffzx(this, networkChangeNotifierAutoDetect.getCurrentNetworkState().getConnectionType()));
                }
            }
            if (traceEventA != null) {
                traceEventA.close();
            }
        } catch (Throwable th) {
            if (traceEventA != null) {
                try {
                    traceEventA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
