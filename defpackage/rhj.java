package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rhj implements Runnable {
    final /* synthetic */ rhm a;
    private final rtk b;

    public rhj(rhm rhmVar, rtk rtkVar) {
        this.a = rhmVar;
        this.b = rtkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rtk rtkVar = this.b;
        synchronized (rtkVar.a()) {
            rhm rhmVar = this.a;
            synchronized (rhmVar) {
                if (rhmVar.a.c(rtkVar)) {
                    rhmVar.l.d();
                    try {
                        rtkVar.e(rhmVar.l, rhmVar.h);
                        this.a.g(this.b);
                    } catch (Throwable th) {
                        throw new rgi(th);
                    }
                }
                this.a.d();
            }
        }
    }
}
