package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffzx implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ffzy b;

    public ffzx(ffzy ffzyVar, int i) {
        this.a = i;
        this.b = ffzyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.mObserver.onConnectionTypeChanged(this.a);
    }
}
