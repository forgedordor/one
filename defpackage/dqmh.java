package defpackage;

import android.os.Process;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqmh {
    public final Thread a;
    public int b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public final AtomicLong f;
    private final boolean g;

    public /* synthetic */ dqmh(Thread thread, int i, boolean z, int i2, boolean z2, int i3) {
        thread.getClass();
        this.a = thread;
        this.b = (i3 & 2) != 0 ? -1 : i;
        boolean z3 = (i3 & 16) != 0;
        this.c = z3;
        this.g = ((i3 & 32) == 0) & z2;
        this.d = !z3;
        this.f = new AtomicLong(dqmi.a(z, false, false, (i3 & 8) != 0 ? -21 : i2, -21, -21, 0L));
    }

    private final void e(long j) {
        if (dqmg.g(j)) {
            boolean zInterrupted = false;
            while (true) {
                try {
                    LockSupport.park(this);
                    if (!dqmg.f(this.f.get())) {
                        break;
                    } else {
                        zInterrupted |= Thread.interrupted();
                    }
                } catch (Throwable th) {
                    if (zInterrupted) {
                        this.a.interrupt();
                    }
                    throw th;
                }
            }
            if (zInterrupted) {
                this.a.interrupt();
            }
        }
    }

    public final void a(int i) throws SecurityException, IllegalArgumentException {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.f;
            j = atomicLong.get();
            int iD = dqmg.d(j);
            if (!dqmg.g(j)) {
                throw new IllegalStateException("Unexpected not set, saw " + ("State{started=" + dqmg.h(j) + ", setting=" + dqmg.g(j) + ", pool=" + dqmg.c(j) + ", local=" + dqmg.b(j) + ", inherited=" + dqmg.a(j) + "}") + " " + Long.toBinaryString(j));
            }
            if (!dqmg.h(j)) {
                int iA = dqln.a(iD);
                if (iA != dqln.a(i)) {
                    this.a.setPriority(iA);
                }
            } else if (iD != i) {
                Process.setThreadPriority(this.b, iD);
                i = iD;
            }
        } while (!atomicLong.compareAndSet(j, dqmg.i(j, false, false, false, 0, 0, 0L, 121)));
        if (dqmg.f(j)) {
            LockSupport.unpark(this.a);
        }
    }

    public final void b() throws SecurityException, IllegalArgumentException {
        long j;
        boolean z;
        while (true) {
            AtomicLong atomicLong = this.f;
            j = atomicLong.get();
            long jE = dqmg.e(j);
            boolean zG = dqmg.g(j);
            z = this.g;
            long jI = dqmg.i(j, false, false, zG & (!z), 0, -21, jE + 1, 27);
            if (dqmg.g(j)) {
                if (atomicLong.compareAndSet(j, jI)) {
                    break;
                }
            } else if (dqmg.d(j) == dqmg.d(jI)) {
                if (atomicLong.compareAndSet(j, jI)) {
                    break;
                }
            } else if (atomicLong.compareAndSet(j, dqmg.i(jI, false, true, false, 0, 0, 0L, 125))) {
                a(dqmg.d(j));
                break;
            }
        }
        if (z) {
            return;
        }
        e(j);
    }

    public final void c() {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.f;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, dqmg.i(j, false, false, dqmg.g(j), 0, 0, 0L, 122)));
        e(j);
    }

    public final void d() {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.f;
            j = atomicLong.get();
            if (!dqmg.f(j)) {
                return;
            }
        } while (!atomicLong.compareAndSet(j, dqmg.i(j, false, false, false, 0, 0, 0L, 123)));
    }

    public final String toString() {
        return this.a.getName() + " " + this.b;
    }
}
