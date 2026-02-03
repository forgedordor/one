package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class devw extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ devx a;

    public devw(devx devxVar) {
        this.a = devxVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        dhja.d(devx.b, "onAvailable triggered.", new Object[0]);
        this.a.d(2);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        dhja.d(devx.b, "onBlockedStatusChanged triggered. Blocked=%b", Boolean.valueOf(z));
        this.a.d(true != z ? 2 : 3);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        dhja.d(devx.b, "onCapabilitiesChanged triggered. NetworkCapabilities=%s", dhiz.GENERIC.c(networkCapabilities));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        dhja.d(devx.b, "onLinkPropertiesChanged triggered. LinkProperties=%s", dhiz.GENERIC.c(linkProperties));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        dhja.d(devx.b, "onLosing triggered.", new Object[0]);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        dhja.d(devx.b, "onLost triggered.", new Object[0]);
        this.a.d(4);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        dhja.d(devx.b, "onUnavailable triggered.", new Object[0]);
        this.a.d(4);
    }
}
