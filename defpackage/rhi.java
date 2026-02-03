package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rhi implements Runnable {
    final /* synthetic */ rhm a;
    private final rtk b;

    public rhi(rhm rhmVar, rtk rtkVar) {
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
                    try {
                        rtkVar.d(rhmVar.j);
                    } catch (Throwable th) {
                        throw new rgi(th);
                    }
                }
                this.a.d();
            }
        }
    }
}
