package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dfzd extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ dfze b;

    public dfzd(dfze dfzeVar) {
        this.b = dfzeVar;
    }

    private final void c() {
        NetworkInfo networkInfoD;
        try {
            networkInfoD = dhkq.f(this.b.a).d();
        } catch (dhkf e) {
            dhja.s(e, "Can't get active network info, missing permissions.", new Object[0]);
            networkInfoD = null;
        }
        dhja.k("Connected state: [%s], networkType: [%s]", Integer.valueOf(this.b.d), networkInfoD == null ? "null" : networkInfoD.getTypeName());
    }

    private final void d() {
        b();
        c();
    }

    protected abstract void a();

    protected abstract void b();

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        dhja.c("onAvailable triggered for default network.", new Object[0]);
        d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        dhja.c("onCapabilitiesChanged triggered for default network. NetworkCapabilities=%s", networkCapabilities);
        a();
        c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        dhja.c("onLosing triggered for default network.", new Object[0]);
        d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        dhja.c("onLost triggered for default network.", new Object[0]);
        d();
    }
}
