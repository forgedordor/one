package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qmd implements Runnable {
    private final qme a;
    private final qiw b;

    public qmd(qme qmeVar, qiw qiwVar) {
        this.a = qmeVar;
        this.b = qiwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qme qmeVar = this.a;
        synchronized (qmeVar.e) {
            Map map = qmeVar.c;
            qiw qiwVar = this.b;
            if (((qmd) map.remove(qiwVar)) != null) {
                qmc qmcVar = (qmc) qmeVar.d.remove(qiwVar);
                if (qmcVar != null) {
                    qmcVar.b(qiwVar);
                }
            } else {
                qas.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", qiwVar));
            }
        }
    }
}
