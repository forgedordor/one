package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpo implements Runnable {
    final /* synthetic */ Runnable a;

    public bpo(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }
}
