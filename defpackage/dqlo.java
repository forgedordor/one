package defpackage;

import android.os.Process;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqlo extends Thread {
    public Runnable a;
    public Runnable b;
    public final dqmh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqlo(int i, Runnable runnable) throws SecurityException, IllegalArgumentException {
        super(runnable);
        runnable.getClass();
        this.c = new dqmh(this, 0, false, 0, true, 26);
        a(i);
    }

    public final void a(int i) throws SecurityException, IllegalArgumentException {
        dqmh dqmhVar = this.c;
        if (!dqmhVar.c) {
            throw new IllegalStateException("Cannot override priority of non-boostable thread");
        }
        while (true) {
            AtomicLong atomicLong = dqmhVar.f;
            long j = atomicLong.get();
            long jI = dqmg.i(j, false, false, false, i, 0, 0L, 119);
            if (dqmg.g(j)) {
                if (atomicLong.compareAndSet(j, jI)) {
                    return;
                }
            } else if (dqmg.d(j) == dqmg.d(jI)) {
                if (atomicLong.compareAndSet(j, jI)) {
                    return;
                }
            } else if (atomicLong.compareAndSet(j, dqmg.i(jI, false, true, false, 0, 0, 0L, 125))) {
                dqmhVar.a(dqmg.d(j));
                return;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        AtomicLong atomicLong;
        long j;
        dqmh dqmhVar = this.c;
        dqmhVar.b = Process.myTid();
        do {
            atomicLong = dqmhVar.f;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, dqmg.i(j, true, true, false, 0, 0, 0L, 124)));
        if (!dqmg.g(j)) {
            dqmhVar.a(-21);
        }
        Runnable runnable = null;
        try {
            try {
                Runnable runnable2 = this.a;
                if (runnable2 == null) {
                    fdbq.c("startedCallback");
                    runnable2 = null;
                }
                runnable2.run();
                super.run();
                Runnable runnable3 = this.b;
                if (runnable3 == null) {
                    fdbq.c("finishedCallback");
                } else {
                    runnable = runnable3;
                }
                runnable.run();
                this.c.c();
            } catch (Throwable th) {
                th = th;
                Runnable runnable4 = this.b;
                if (runnable4 == null) {
                    fdbq.c("finishedCallback");
                } else {
                    runnable = runnable4;
                }
                runnable.run();
                this.c.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            this.c.c();
            throw th;
        }
    }
}
