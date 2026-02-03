package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffzp implements Runnable {
    final /* synthetic */ NetworkChangeNotifierAutoDetect a;

    public ffzp(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.a = networkChangeNotifierAutoDetect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.a;
        if (networkChangeNotifierAutoDetect.mIgnoreNextBroadcast) {
            networkChangeNotifierAutoDetect.mIgnoreNextBroadcast = false;
        } else {
            networkChangeNotifierAutoDetect.connectionTypeChanged();
        }
    }
}
