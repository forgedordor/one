package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qlu implements Runnable {
    private final qcu a;
    private final qda b;
    private final boolean c;
    private final int d;

    public qlu(qcu qcuVar, qda qdaVar, boolean z, int i) {
        qcuVar.getClass();
        this.a = qcuVar;
        this.b = qdaVar;
        this.c = z;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zE;
        qfa qfaVarA;
        if (this.c) {
            qcu qcuVar = this.a;
            qda qdaVar = this.b;
            int i = this.d;
            Object obj = qcuVar.j;
            String str = qdaVar.a.a;
            synchronized (obj) {
                qfaVarA = qcuVar.a(str);
            }
            zE = qcu.e(str, qfaVarA, i);
        } else {
            qcu qcuVar2 = this.a;
            qda qdaVar2 = this.b;
            int i2 = this.d;
            Object obj2 = qcuVar2.j;
            String str2 = qdaVar2.a.a;
            synchronized (obj2) {
                if (qcuVar2.e.get(str2) != null) {
                    qas.c().a(qcu.a, a.a(str2, "Ignored stopWork. WorkerWrapper ", " is in foreground"));
                } else {
                    Set set = (Set) qcuVar2.g.get(str2);
                    if (set != null && set.contains(qdaVar2)) {
                        zE = qcu.e(str2, qcuVar2.a(str2), i2);
                    }
                }
                zE = false;
            }
        }
        qas.c().a(qas.d("StopWorkRunnable"), "StopWorkRunnable for " + this.b.a.a + "; Processor.stopWork = " + zE);
    }
}
