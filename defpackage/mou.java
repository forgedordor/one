package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mou {
    public final Object a = new Object();
    public final Queue b = new ArrayDeque();
    public boolean c;
    private final boolean d;
    private final ExecutorService e;
    private final Future f;
    private final mos g;

    public mou(ExecutorService executorService, boolean z, mos mosVar) {
        this.e = executorService;
        this.f = executorService.submit(new Callable() { // from class: moq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Thread.currentThread();
            }
        });
        this.d = z;
        this.g = mosVar;
    }

    private final boolean i() throws InterruptedException {
        try {
            return Thread.currentThread() == ((Thread) this.f.get(500L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            throw e;
        } catch (Exception e2) {
            a(e2);
            return false;
        }
    }

    public final void a(Exception exc) {
        synchronized (this.a) {
            if (this.c) {
                return;
            }
            this.c = true;
            this.g.a(mcw.a(exc));
        }
    }

    public final void b(final mot motVar) throws ExecutionException, InterruptedException, TimeoutException {
        if (i()) {
            try {
                motVar.a();
                return;
            } catch (Exception e) {
                a(e);
                return;
            }
        }
        try {
            this.e.submit(new Runnable() { // from class: mop
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        motVar.a();
                    } catch (Exception e2) {
                        this.a.a(e2);
                    }
                }
            }).get(500L, TimeUnit.MILLISECONDS);
        } catch (RuntimeException | ExecutionException | TimeoutException e2) {
            a(e2);
        }
    }

    public final void c(mot motVar) {
        mee.c(!i());
        synchronized (this.a) {
            this.c = true;
            this.b.clear();
        }
        h(motVar, false);
        if (this.d) {
            ExecutorService executorService = this.e;
            executorService.shutdown();
            if (executorService.awaitTermination(500L, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.g.a(new mcw("Release timed out. OpenGL resources may not be cleaned up properly."));
        }
    }

    public final void d(mot motVar) {
        e(motVar, true);
    }

    public final void e(mot motVar, boolean z) {
        synchronized (this.a) {
            if (this.c && z) {
                return;
            }
            try {
                h(motVar, z);
                e = null;
            } catch (RejectedExecutionException e) {
                e = e;
            }
            if (e != null) {
                a(e);
            }
        }
    }

    public final void f(mot motVar) {
        synchronized (this.a) {
            if (this.c) {
                return;
            }
            this.b.add(motVar);
            d(new mot() { // from class: moo
                @Override // defpackage.mot
                public final void a() {
                }
            });
        }
    }

    public final void g() {
        try {
            mee.c(i());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            a(e);
        }
    }

    public final void h(final mot motVar, final boolean z) {
        this.e.submit(new Runnable() { // from class: mon
            @Override // java.lang.Runnable
            public final void run() {
                mot motVar2;
                mou mouVar = this.a;
                mot motVar3 = motVar;
                try {
                    Object obj = mouVar.a;
                    synchronized (obj) {
                        if (mouVar.c && z) {
                            return;
                        }
                        while (true) {
                            synchronized (obj) {
                                motVar2 = (mot) mouVar.b.poll();
                            }
                            if (motVar2 == null) {
                                motVar3.a();
                                return;
                            }
                            motVar2.a();
                        }
                    }
                } catch (Exception e) {
                    mouVar.a(e);
                }
            }
        });
    }
}
