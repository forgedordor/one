package defpackage;

import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elfi extends AbstractExecutorService implements AutoCloseable {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public boolean g;
    public final ThreadFactory i;
    public final boolean j;
    public final Runnable k;
    public final Runnable l;
    public final elfg[] m;
    public final elfg[] n;
    public final CountDownLatch o;
    public final AtomicReference p;
    private final int q;
    private boolean r;
    private final boolean s;
    private final elfh[] t;
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger e = new AtomicInteger();
    public final AtomicInteger f = new AtomicInteger();
    public final AtomicBoolean h = new AtomicBoolean();

    public elfi(int i, ThreadFactory threadFactory, Runnable runnable, Runnable runnable2) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.g(i, "numThreads must be positive: "));
        }
        this.q = Alert.DURATION_SHOW_INDEFINITELY;
        this.i = threadFactory;
        this.j = true;
        this.k = runnable;
        this.l = runnable2;
        this.s = true;
        this.o = new CountDownLatch(i);
        int i2 = i + 1;
        elfg[] elfgVarArr = new elfg[i2];
        elfg[] elfgVarArr2 = new elfg[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            elfgVarArr[i4] = new elfg(b, i4);
            elfgVarArr2[i4] = new elfg(a, i4);
        }
        this.m = elfgVarArr;
        this.n = elfgVarArr2;
        elfh[] elfhVarArr = new elfh[i];
        elfg elfgVar = elfgVarArr[0];
        while (i3 < i) {
            elfg elfgVar2 = new elfg(elfgVar, i3);
            elfhVarArr[i3] = new elfh(this, i3);
            i3++;
            elfgVar = elfgVar2;
        }
        this.t = elfhVarArr;
        this.p = new AtomicReference(elfgVar);
    }

    private final void b(boolean z) {
        this.r = true;
        while (true) {
            AtomicReference atomicReference = this.p;
            elfg elfgVar = (elfg) atomicReference.get();
            Object obj = elfgVar.a;
            if (obj == a) {
                return;
            }
            Object obj2 = b;
            if (elff.a(atomicReference, elfgVar, (obj != obj2 || z) ? this.n[0] : this.n[elfgVar.b])) {
                while (elfgVar.a != obj2) {
                    elfh elfhVar = this.t[elfgVar.b];
                    Thread thread = elfhVar.b;
                    elfhVar.i = 3;
                    if (thread != null) {
                        LockSupport.unpark(thread);
                    } else {
                        elfhVar.a();
                    }
                    elfgVar = (elfg) elfgVar.a;
                }
            }
        }
    }

    public final void a() {
        if (this.s) {
            this.d.decrementAndGet();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.o.await(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        if (this == ForkJoinPool.commonPool() || isTerminated()) {
            return;
        }
        shutdown();
        boolean zAwaitTermination = false;
        boolean z = false;
        while (!zAwaitTermination) {
            try {
                zAwaitTermination = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                }
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AtomicInteger atomicInteger;
        int i;
        runnable.getClass();
        if (!this.r) {
            if (this.s) {
                int i2 = this.q;
                if (i2 != Integer.MAX_VALUE) {
                    do {
                        atomicInteger = this.d;
                        i = atomicInteger.get();
                        if (i != i2) {
                        }
                    } while (!atomicInteger.compareAndSet(i, i + 1));
                } else {
                    this.d.incrementAndGet();
                }
            }
            elfg elfgVar = new elfg(runnable, -1);
            ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
            concurrentLinkedQueue.add(elfgVar);
            while (true) {
                AtomicReference atomicReference = this.p;
                elfg elfgVar2 = (elfg) atomicReference.get();
                Object obj = elfgVar2.a;
                if (obj == b) {
                    int i3 = elfgVar2.b;
                    int iMin = Math.min(i3 + 1, this.t.length);
                    if (iMin == i3 || elff.a(atomicReference, elfgVar2, this.m[iMin])) {
                        return;
                    }
                } else {
                    if (obj == a) {
                        if (concurrentLinkedQueue.remove(elfgVar)) {
                            a();
                            throw new RejectedExecutionException();
                        }
                        return;
                    }
                    int i4 = elfgVar2.b;
                    if (elff.a(atomicReference, elfgVar2, (elfg) obj)) {
                        elfh elfhVar = this.t[i4];
                        Thread thread = elfhVar.b;
                        elfhVar.i = 1;
                        if (thread != null) {
                            LockSupport.unpark(thread);
                            return;
                        } else {
                            elfhVar.h.e.incrementAndGet();
                            elfhVar.b();
                            return;
                        }
                    }
                }
            }
        }
        throw new RejectedExecutionException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return ((elfg) this.p.get()).a == a;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.o.getCount() == 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        b(false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        b(true);
        ArrayList arrayList = new ArrayList();
        if (this.h.compareAndSet(false, true)) {
            while (true) {
                elfg elfgVar = (elfg) this.c.poll();
                if (elfgVar == null) {
                    break;
                }
                a();
                arrayList.add((Runnable) elfgVar.a);
            }
            this.g = true;
            for (elfh elfhVar : this.t) {
                Thread thread = elfhVar.c;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        return arrayList;
    }
}
