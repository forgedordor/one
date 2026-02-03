package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffew extends ffgd {
    public static final ReentrantLock b;
    public static final Condition c;
    public static final long d;
    public static final long e;
    public static ffew f;
    public int g;
    public ffew h;
    public long i;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        b = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        c = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        d = millis;
        e = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final long c(long j) {
        return this.i - j;
    }

    protected IOException d(IOException iOException) {
        throw null;
    }

    public final void e() {
        ffew ffewVar;
        long jO = o();
        boolean zH = h();
        if (jO == 0) {
            if (!zH) {
                return;
            } else {
                jO = 0;
            }
        }
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            if (this.g != 0) {
                throw new IllegalStateException("Unbalanced enter/exit");
            }
            this.g = 1;
            if (f == null) {
                f = new ffew();
                new ffet().start();
            }
            long jNanoTime = System.nanoTime();
            if (jO != 0 && zH) {
                this.i = Math.min(jO, j() - jNanoTime) + jNanoTime;
            } else if (jO != 0) {
                this.i = jO + jNanoTime;
            } else {
                if (!zH) {
                    throw new AssertionError();
                }
                this.i = j();
            }
            long jC = c(jNanoTime);
            ffew ffewVar2 = f;
            ffewVar2.getClass();
            while (true) {
                ffewVar = ffewVar2.h;
                if (ffewVar == null || jC < ffewVar.c(jNanoTime)) {
                    break;
                } else {
                    ffewVar2 = ffewVar;
                }
            }
            this.h = ffewVar;
            ffewVar2.h = this;
            if (ffewVar2 == f) {
                c.signal();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean f() {
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            int i = this.g;
            this.g = 0;
            if (i != 1) {
                return i == 2;
            }
            ffew ffewVar = f;
            while (ffewVar != null) {
                ffew ffewVar2 = ffewVar.h;
                if (ffewVar2 == this) {
                    ffewVar.h = this.h;
                    this.h = null;
                    return false;
                }
                ffewVar = ffewVar2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    protected void a() {
    }
}
