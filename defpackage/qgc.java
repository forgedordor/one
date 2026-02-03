package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qgc extends ConnectivityManager.NetworkCallback {
    private final fdap a;

    public qgc(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        qas.c().a(qgu.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.a.invoke(qfy.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        qas.c().a(qgu.a, "NetworkRequestConstraintController onLost callback");
        this.a.invoke(new qfz(7));
    }
}
