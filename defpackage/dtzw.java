package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtzw implements Runnable {
    final /* synthetic */ dtzx a;
    private final Runnable b;

    public dtzw(dtzx dtzxVar, Runnable runnable) {
        this.a = dtzxVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } finally {
            this.a.a();
        }
    }
}
