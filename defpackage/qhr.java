package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qhr extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ qhs a;

    public qhr(qhs qhsVar) {
        this.a = qhsVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        qas qasVarC = qas.c();
        String str = qht.a;
        Objects.toString(networkCapabilities);
        qasVarC.a(str, "Network capabilities changed: ".concat(networkCapabilities.toString()));
        int i = Build.VERSION.SDK_INT;
        qhs qhsVar = this.a;
        qhsVar.f(i >= 28 ? new qgj(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)) : qht.a(qhsVar.e));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        qas.c().a(qht.a, "Network connection lost");
        qhs qhsVar = this.a;
        qhsVar.f(qht.a(qhsVar.e));
    }
}
