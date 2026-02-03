package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffzq extends ConnectivityManager.NetworkCallback {
    LinkProperties a;
    ffzn b;
    final /* synthetic */ NetworkChangeNotifierAutoDetect c;

    public ffzq(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.c = networkChangeNotifierAutoDetect;
    }

    private final NetworkChangeNotifierAutoDetect.NetworkState a(Network network) {
        int i;
        int subtype;
        int type;
        if (!this.b.b(1) && !this.b.b(5)) {
            if (this.b.b(0)) {
                NetworkInfo networkInfoD = this.c.mConnectivityManagerDelegate.d(network);
                subtype = networkInfoD != null ? networkInfoD.getSubtype() : -1;
                i = 0;
            } else {
                if (this.b.b(3)) {
                    type = 9;
                } else if (this.b.b(2)) {
                    type = 7;
                } else if (this.b.b(4)) {
                    NetworkInfo networkInfoC = this.c.mConnectivityManagerDelegate.c(network);
                    type = networkInfoC != null ? networkInfoC.getType() : 17;
                } else {
                    i = -1;
                    subtype = -1;
                }
                i = type;
            }
            return new NetworkChangeNotifierAutoDetect.NetworkState(true, i, subtype, !this.b.a(11), String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(network)), this.a.isPrivateDnsActive(), this.a.getPrivateDnsServerName());
        }
        i = 1;
        subtype = -1;
        return new NetworkChangeNotifierAutoDetect.NetworkState(true, i, subtype, !this.b.a(11), String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(network)), this.a.isPrivateDnsActive(), this.a.getPrivateDnsServerName());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a = null;
        this.b = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        this.b = new ffzn(networkCapabilities);
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.c;
        if (!networkChangeNotifierAutoDetect.mRegistered || this.a == null || this.b == null) {
            return;
        }
        networkChangeNotifierAutoDetect.connectionTypeChangedTo(a(network));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.a = linkProperties;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.c;
        if (!networkChangeNotifierAutoDetect.mRegistered || this.a == null || this.b == null) {
            return;
        }
        networkChangeNotifierAutoDetect.connectionTypeChangedTo(a(network));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a = null;
        this.b = null;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.c;
        if (networkChangeNotifierAutoDetect.mRegistered) {
            networkChangeNotifierAutoDetect.connectionTypeChangedTo(new NetworkChangeNotifierAutoDetect.NetworkState(false, -1, -1, false, null, false, ""));
        }
    }
}
