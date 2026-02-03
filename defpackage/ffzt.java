package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffzt implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ffzy d;

    public ffzt(ffzy ffzyVar, long j, int i, boolean z) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = ffzyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.d.b;
        NetworkChangeNotifierAutoDetect.Observer observer = networkChangeNotifierAutoDetect.mObserver;
        long j = this.a;
        int i = this.b;
        observer.onNetworkConnect(j, i);
        if (this.c) {
            networkChangeNotifierAutoDetect.mObserver.onConnectionTypeChanged(i);
            networkChangeNotifierAutoDetect.mObserver.purgeActiveNetworkList(new long[]{j});
        }
    }
}
