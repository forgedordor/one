package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdzx implements Executor, Closeable {
    public static final fdzi a = new fdzi("NOT_IN_STACK");
    public final int b;
    public final int c;
    public final long d;
    public final String e;
    public final feaa f;
    public final feaa g;
    public final fdhy h;
    public final fdzd i;
    public final fdhy j;
    private final fdhw k;

    public fdzx(int i, int i2, long j, String str) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = str;
        if (i <= 0) {
            throw new IllegalArgumentException(a.e(i, "Core pool size ", " should be at least 1"));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a.s(i, i2, "Max pool size ", " should be greater than or equals to core pool size "));
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(a.e(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
        }
        if (j <= 0) {
            throw new IllegalArgumentException(a.A(j, "Idle worker keep alive time ", " must be positive"));
        }
        this.f = new feaa();
        this.g = new feaa();
        fdia fdiaVar = fdia.a;
        this.h = new fdhy(0L, fdiaVar);
        int i3 = i + 1;
        this.i = new fdzd(i3 + i3);
        this.j = new fdhy(i << 42, fdiaVar);
        this.k = new fdhw(false, fdiaVar);
    }

    public static /* synthetic */ void e(fdzx fdzxVar, Runnable runnable, boolean z, int i) {
        fdzxVar.a(runnable, false, z & ((i & 4) == 0));
    }

    public static final void f(feac feacVar) {
        try {
            feacVar.run();
        } catch (Throwable th) {
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        }
    }

    private final int g() {
        fdzd fdzdVar = this.i;
        synchronized (fdzdVar) {
            if (d()) {
                return -1;
            }
            fdhy fdhyVar = this.j;
            long j = fdhyVar.c;
            int i = (int) (j & 2097151);
            int iF = fddu.f(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (iF >= this.b) {
                return 0;
            }
            if (i >= this.c) {
                return 0;
            }
            int i2 = ((int) (fdhyVar.c & 2097151)) + 1;
            if (fdzdVar.a(i2) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            fdzw fdzwVar = new fdzw(this, i2);
            fdzdVar.b(i2, fdzwVar);
            if (i2 != ((int) (2097151 & fdhy.a.incrementAndGet(fdhyVar)))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int i3 = iF + 1;
            fdzwVar.start();
            return i3;
        }
    }

    private final fdzw h() {
        Thread threadCurrentThread = Thread.currentThread();
        fdzw fdzwVar = threadCurrentThread instanceof fdzw ? (fdzw) threadCurrentThread : null;
        if (fdzwVar == null || !fdbq.f(fdzwVar.d, this)) {
            return null;
        }
        return fdzwVar;
    }

    private final boolean i(long j) {
        int iF = fddu.f(((int) (j & 2097151)) - ((int) ((4398044413952L & j) >> 21)), 0);
        int i = this.b;
        if (iF < i) {
            int iG = g();
            if (iG == 1) {
                if (i > 1) {
                    g();
                }
            } else if (iG <= 0) {
            }
            return true;
        }
        return false;
    }

    private final boolean j() {
        fdzw fdzwVar;
        do {
            fdhy fdhyVar = this.h;
            while (true) {
                long j = fdhyVar.c;
                fdzwVar = (fdzw) this.i.a((int) (2097151 & j));
                if (fdzwVar != null) {
                    long j2 = 2097152 + j;
                    int iK = k(fdzwVar);
                    if (iK >= 0 && fdhyVar.c(j, (j2 & (-2097152)) | iK)) {
                        fdzwVar.nextParkedWorker = a;
                        break;
                    }
                } else {
                    fdzwVar = null;
                    break;
                }
            }
            if (fdzwVar == null) {
                return false;
            }
        } while (!fdzwVar.b.c(-1, 0));
        LockSupport.unpark(fdzwVar);
        return true;
    }

    private static final int k(fdzw fdzwVar) {
        int i;
        do {
            Object obj = fdzwVar.nextParkedWorker;
            if (obj == a) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            fdzwVar = (fdzw) obj;
            i = fdzwVar.indexInArray;
        } while (i == 0);
        return i;
    }

    public final void a(Runnable runnable, boolean z, boolean z2) {
        feac feadVar;
        int i;
        String str = feae.a;
        long jNanoTime = System.nanoTime();
        if (runnable instanceof feac) {
            feadVar = (feac) runnable;
            feadVar.g = jNanoTime;
            feadVar.h = z;
        } else {
            feadVar = new fead(runnable, jNanoTime, z);
        }
        boolean z3 = feadVar.h;
        long jA = z3 ? this.j.a(2097152L) : 0L;
        fdzw fdzwVarH = h();
        if (fdzwVarH != null && (i = fdzwVarH.e) != 5 && (feadVar.h || i != 2)) {
            fdzwVarH.c = true;
            feag feagVar = fdzwVarH.a;
            if (z2) {
                feadVar = feagVar.b(feadVar);
            } else {
                feac feacVar = (feac) feagVar.a.a(feadVar);
                feadVar = feacVar == null ? null : feagVar.b(feacVar);
            }
        }
        if (feadVar != null) {
            if (!(feadVar.h ? this.g.d(feadVar) : this.f.d(feadVar))) {
                throw new RejectedExecutionException(String.valueOf(this.e).concat(" was terminated"));
            }
        }
        if (!z3) {
            c();
        } else {
            if (j() || i(jA)) {
                return;
            }
            j();
        }
    }

    public final void b(fdzw fdzwVar, int i, int i2) {
        while (true) {
            fdhy fdhyVar = this.h;
            long j = fdhyVar.c;
            long j2 = 2097152 + j;
            int iK = (int) (2097151 & j);
            if (iK == i) {
                iK = i2 == 0 ? k(fdzwVar) : i2;
            }
            if (iK >= 0) {
                if (fdhyVar.c(j, iK | (j2 & (-2097152)))) {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (j() || i(this.j.c)) {
            return;
        }
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            fdhw r0 = r8.k
            r1 = 0
            r2 = 1
            boolean r0 = r0.a(r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            fdzw r0 = r8.h()
            fdzd r1 = r8.i
            monitor-enter(r1)
            fdhy r3 = r8.j     // Catch: java.lang.Throwable -> L9b
            long r3 = r3.c     // Catch: java.lang.Throwable -> L9b
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            monitor-exit(r1)
            int r1 = (int) r3
            if (r1 <= 0) goto L62
            r3 = r2
        L1f:
            fdzd r4 = r8.i
            java.lang.Object r4 = r4.a(r3)
            r4.getClass()
            fdzw r4 = (defpackage.fdzw) r4
            if (r4 == r0) goto L5d
        L2c:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L3d
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r5 = 10000(0x2710, double:4.9407E-320)
            r4.join(r5)
            goto L2c
        L3d:
            boolean r5 = defpackage.fdkb.a
            feag r4 = r4.a
            feaa r5 = r8.g
            fdhz r6 = r4.a
            r7 = 0
            java.lang.Object r6 = r6.a(r7)
            feac r6 = (defpackage.feac) r6
            if (r6 != 0) goto L4f
            goto L52
        L4f:
            r5.d(r6)
        L52:
            feac r6 = r4.c()
            if (r6 != 0) goto L59
            goto L5d
        L59:
            r5.d(r6)
            goto L52
        L5d:
            if (r3 == r1) goto L62
            int r3 = r3 + 1
            goto L1f
        L62:
            feaa r3 = r8.g
            r3.c()
            feaa r4 = r8.f
            r4.c()
        L6c:
            if (r0 == 0) goto L74
            feac r1 = r0.b(r2)
            if (r1 != 0) goto L97
        L74:
            java.lang.Object r1 = r4.b()
            feac r1 = (defpackage.feac) r1
            if (r1 != 0) goto L97
            java.lang.Object r1 = r3.b()
            feac r1 = (defpackage.feac) r1
            if (r1 != 0) goto L97
            if (r0 == 0) goto L8a
            r1 = 5
            r0.d(r1)
        L8a:
            boolean r0 = defpackage.fdkb.a
            fdhy r0 = r8.h
            r1 = 0
            r0.c = r1
            fdhy r0 = r8.j
            r0.c = r1
            return
        L97:
            f(r1)
            goto L6c
        L9b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdzx.close():void");
    }

    public final boolean d() {
        return this.k.b();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(this, runnable, false, 6);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        fdzd fdzdVar = this.i;
        int length = fdzdVar.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            fdzw fdzwVar = (fdzw) fdzdVar.a(i6);
            if (fdzwVar != null) {
                feag feagVar = fdzwVar.a;
                int iA = feagVar.a.a != null ? feagVar.a() + 1 : feagVar.a();
                int i7 = fdzwVar.e;
                int i8 = i7 - 1;
                if (i7 == 0) {
                    throw null;
                }
                if (i8 == 0) {
                    arrayList.add(a.D(iA, "c"));
                    i++;
                } else if (i8 == 1) {
                    arrayList.add(a.D(iA, "b"));
                    i2++;
                } else if (i8 == 2) {
                    i3++;
                } else if (i8 == 3) {
                    i4++;
                    if (iA > 0) {
                        arrayList.add(a.D(iA, "d"));
                    }
                } else {
                    if (i8 != 4) {
                        throw new fctg();
                    }
                    i5++;
                }
            }
        }
        fdhy fdhyVar = this.j;
        String str = this.e;
        long j = fdhyVar.c;
        String strB = fdkc.b(this);
        int i9 = this.b;
        int i10 = this.c;
        feaa feaaVar = this.f;
        feaa feaaVar2 = this.g;
        return str + "@" + strB + "[Pool Size {core = " + i9 + ", max = " + i10 + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + feaaVar.a() + ", global blocking queue size = " + feaaVar2.a() + ", Control State {created workers= " + ((int) (j & 2097151)) + ", blocking tasks = " + ((int) ((j & 4398044413952L) >> 21)) + ", CPUs acquired = " + (i9 - ((int) ((j & 9223367638808264704L) >> 42))) + "}]";
    }
}
