package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egpk implements Runnable {
    private final Runnable a;
    private boolean b = false;

    public egpk(Runnable runnable) {
        this.a = runnable;
    }

    final void a() {
        ecem.c();
        this.b = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ecem.c();
        if (this.b) {
            return;
        }
        this.a.run();
    }
}
