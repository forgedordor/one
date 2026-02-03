package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffzv implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ ffzy b;

    public ffzv(ffzy ffzyVar, long j) {
        this.a = j;
        this.b = ffzyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.mObserver.onNetworkSoonToDisconnect(this.a);
    }
}
