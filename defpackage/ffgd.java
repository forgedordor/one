package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffgd {
    public static final ffgd j = new ffgc();
    private boolean a;
    private long b;
    private long c;
    private volatile Object d;

    public void g() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public boolean h() {
        return this.a;
    }

    public final void i(Condition condition) throws InterruptedException, InterruptedIOException {
        try {
            boolean zH = h();
            long jO = o();
            if (!zH && jO == 0) {
                condition.await();
                return;
            }
            if (zH && jO != 0) {
                jO = Math.min(jO, j() - System.nanoTime());
            } else if (zH) {
                jO = j() - System.nanoTime();
            }
            if (jO <= 0) {
                throw new InterruptedIOException("timeout");
            }
            if (condition.awaitNanos(jO) <= 0) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public long j() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public ffgd k() {
        this.a = false;
        return this;
    }

    public ffgd l() {
        this.c = 0L;
        return this;
    }

    public ffgd m(long j2) {
        this.a = true;
        this.b = j2;
        return this;
    }

    public ffgd n(long j2, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j2 < 0) {
            throw new IllegalArgumentException(a.u(j2, "timeout < 0: "));
        }
        this.c = timeUnit.toNanos(j2);
        return this;
    }

    public long o() {
        return this.c;
    }
}
