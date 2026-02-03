package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbtq extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ fbts a;

    public fbtq(fbts fbtsVar) {
        this.a = fbtsVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a.a.e();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (z) {
            return;
        }
        this.a.a.e();
    }
}
