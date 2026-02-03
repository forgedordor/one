package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qln implements Runnable {
    final qlo a;
    final Runnable b;

    public qln(qlo qloVar, Runnable runnable) {
        this.a = qloVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
            qlo qloVar = this.a;
            synchronized (qloVar.b) {
                qloVar.a();
            }
        } catch (Throwable th) {
            qlo qloVar2 = this.a;
            synchronized (qloVar2.b) {
                qloVar2.a();
                throw th;
            }
        }
    }
}
