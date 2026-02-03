package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpq implements Executor {
    private final Executor d;
    final Deque a = new ArrayDeque();
    private final bpp e = new bpp(this);
    int c = 1;
    long b = 0;

    public bpq(Executor executor) {
        lcg.i(executor);
        this.d = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        lcg.i(runnable);
        Deque deque = this.a;
        synchronized (deque) {
            int i = this.c;
            if (i != 4 && i != 3) {
                long j = this.b;
                bpo bpoVar = new bpo(runnable);
                deque.add(bpoVar);
                this.c = 2;
                try {
                    this.d.execute(this.e);
                    if (this.c != 2) {
                        return;
                    }
                    synchronized (this.a) {
                        if (this.b == j && this.c == 2) {
                            this.c = 3;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    Deque deque2 = this.a;
                    synchronized (deque2) {
                        int i2 = this.c;
                        boolean z = false;
                        if ((i2 == 1 || i2 == 2) && deque2.removeLastOccurrence(bpoVar)) {
                            z = true;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            deque.add(runnable);
        }
    }
}
