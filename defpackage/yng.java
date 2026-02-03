package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yng extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ ynh a;

    public yng(ynh ynhVar) {
        this.a = ynhVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        this.a.d.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        this.a.d.set(false);
    }
}
