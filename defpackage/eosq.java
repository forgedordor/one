package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eosq implements Runnable {
    final /* synthetic */ Runnable a;

    public eosq(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        return this.a.toString();
    }
}
