package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffzu implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ int b;
    final /* synthetic */ ffzy c;

    public ffzu(ffzy ffzyVar, long j, int i) {
        this.a = j;
        this.b = i;
        this.c = ffzyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.mObserver.onNetworkConnect(this.a, this.b);
    }
}
