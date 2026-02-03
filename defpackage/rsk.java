package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rsk extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ rsl a;

    public rsk(rsl rslVar) {
        this.a = rslVar;
    }

    private final void a(boolean z) {
        rvk.k(new rsj(this, z));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        a(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        a(false);
    }
}
