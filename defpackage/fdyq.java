package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdyq implements Runnable {
    final /* synthetic */ fdyr a;
    private Runnable b;

    public fdyq(fdyr fdyrVar, Runnable runnable) {
        this.a = fdyrVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            try {
                this.b.run();
            } catch (Throwable th) {
                fdjs.b(fcyi.a, th);
            }
            fdyr fdyrVar = this.a;
            Runnable runnableG = fdyrVar.g();
            if (runnableG == null) {
                return;
            }
            try {
                this.b = runnableG;
                i++;
                if (i >= 16) {
                    fdjq fdjqVar = fdyrVar.a;
                    if (fdyf.c(fdjqVar, fdyrVar)) {
                        fdyf.b(fdjqVar, fdyrVar, this);
                        return;
                    }
                }
            } catch (Throwable th2) {
                fdyr fdyrVar2 = this.a;
                synchronized (fdyrVar2.c) {
                    fdyrVar2.b.a();
                    throw th2;
                }
            }
        }
    }
}
