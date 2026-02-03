package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhkq implements dhkr {
    private static volatile dhkq b;
    public final ConnectivityManager a;

    private dhkq(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static dhkq f(Context context) {
        if (b == null) {
            synchronized (dhkq.class) {
                if (b == null) {
                    b = new dhkq(context);
                }
            }
        }
        return b;
    }

    @Override // defpackage.dhkr
    public final LinkProperties a(Network network) throws dhkf {
        try {
            return this.a.getLinkProperties(network);
        } catch (RuntimeException e) {
            throw new dhkf("ACCESS_NETWORK_STATE permission is missing.", e);
        }
    }

    @Override // defpackage.dhkr
    public final Network b() throws dhkf {
        try {
            return this.a.getActiveNetwork();
        } catch (SecurityException e) {
            throw new dhkf("ACCESS_NETWORK_STATE permission is missing.", e);
        }
    }

    @Override // defpackage.dhkr
    public final NetworkCapabilities c(Network network) throws dhkf {
        try {
            return this.a.getNetworkCapabilities(network);
        } catch (SecurityException e) {
            throw new dhkf("ACCESS_NETWORK_STATE permission is missing.", e);
        }
    }

    @Override // defpackage.dhkr
    public final NetworkInfo d() throws dhkf {
        try {
            return this.a.getActiveNetworkInfo();
        } catch (SecurityException e) {
            throw new dhkf("ACCESS_NETWORK_STATE permission is missing.", e);
        } catch (RuntimeException e2) {
            throw new dhkf("ACCESS_NETWORK_STATE permission is missing.", e2);
        }
    }

    @Override // defpackage.dhkr
    public final NetworkInfo e(Network network) throws dhkf {
        try {
            return this.a.getNetworkInfo(network);
        } catch (SecurityException e) {
            throw new dhkf("ACCESS_NETWORK_STATE permission is missing.", e);
        }
    }

    @Override // defpackage.dhkr
    public final void g(ConnectivityManager.NetworkCallback networkCallback) throws dhkf {
        try {
            this.a.registerDefaultNetworkCallback(networkCallback);
        } catch (SecurityException e) {
            throw new dhkf("ACCESS_NETWORK_STATE permission is missing.", e);
        }
    }

    @Override // defpackage.dhkr
    public final void h(ConnectivityManager.NetworkCallback networkCallback) {
        this.a.unregisterNetworkCallback(networkCallback);
    }

    @Override // defpackage.dhkr
    public final Network[] i() throws dhkf {
        try {
            return this.a.getAllNetworks();
        } catch (SecurityException e) {
            throw new dhkf("ACCESS_NETWORK_STATE permission is missing.", e);
        }
    }
}
