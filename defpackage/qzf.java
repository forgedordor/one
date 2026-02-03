package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qzf implements Runnable {
    private final qzo a;
    private final qzu b;
    private final Runnable c;

    public qzf(qzo qzoVar, qzu qzuVar, Runnable runnable) {
        this.a = qzoVar;
        this.b = qzuVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qzs qzsVar;
        qzo qzoVar = this.a;
        if (qzoVar.j()) {
            qzoVar.g("canceled-at-delivery");
            return;
        }
        qzu qzuVar = this.b;
        if (qzuVar.a()) {
            qzoVar.f(qzuVar.a);
        } else {
            synchronized (qzoVar.d) {
                qzsVar = qzoVar.e;
            }
            if (qzsVar != null) {
                qzsVar.a(qzuVar.c);
            }
        }
        if (this.b.d) {
            this.a.d("intermediate-response");
        } else {
            this.a.g("done");
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
