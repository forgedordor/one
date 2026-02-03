package defpackage;

import android.net.Network;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffzw implements Runnable {
    final /* synthetic */ Network a;
    final /* synthetic */ ffzy b;

    public ffzw(ffzy ffzyVar, Network network) {
        this.a = network;
        this.b = ffzyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.mObserver.onNetworkDisconnect(NetworkChangeNotifierAutoDetect.networkToNetId(this.a));
    }
}
