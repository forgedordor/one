package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.eooj;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eooi<V> extends eooj<V> {

    /* compiled from: PG */
    final class a {
        static final a a;
        static final a b;
        final boolean c;
        final Throwable d;

        static {
            if (eooj.m) {
                b = null;
                a = null;
            } else {
                b = new a(false, null);
                a = new a(true, null);
            }
        }

        public a(boolean z, Throwable th) {
            this.c = z;
            this.d = th;
        }
    }

    /* compiled from: PG */
    final class b<V> implements Runnable {
        final eooi<V> a;
        final ListenableFuture<? extends V> b;

        public b(eooi eooiVar, ListenableFuture listenableFuture) {
            this.a = eooiVar;
            this.b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.a.valueField != this) {
                return;
            }
            if (eooj.s(this.a, this, eooi.i(this.b))) {
                eooi.k(this.a, false);
            }
        }
    }

    /* compiled from: PG */
    final class c {
        static final c a = new c(new Throwable() { // from class: eooi.c.1
            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable b;

        public c(Throwable th) {
            th.getClass();
            this.b = th;
        }
    }

    /* compiled from: PG */
    final class d {
        static final d a = new d();
        final Runnable b;
        final Executor c;
        d next;

        public d() {
            this.b = null;
            this.c = null;
        }

        public d(Runnable runnable, Executor executor) {
            this.b = runnable;
            this.c = executor;
        }
    }

    /* compiled from: PG */
    interface e<V> extends ListenableFuture<V> {
    }

    /* compiled from: PG */
    public abstract class f<V> extends eooi<V> implements e<V> {
    }

    private static Object d(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    eosk.a();
                }
                throw th;
            }
        }
        if (z) {
            eosk.a();
        }
        return obj;
    }

    private final void e(StringBuilder sb) {
        try {
            Object objD = d(this);
            sb.append("SUCCESS, result=[");
            if (objD == null) {
                sb.append("null");
            } else if (objD == this) {
                sb.append("this future");
            } else {
                sb.append(objD.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objD)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (Exception e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            l.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", defpackage.a.c(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e2);
        }
    }

    static Object h(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th = ((a) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).b);
        }
        if (obj == k) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object i(ListenableFuture listenableFuture) {
        Throwable thJ;
        if (listenableFuture instanceof e) {
            Object aVar = ((eooi) listenableFuture).valueField;
            if (aVar instanceof a) {
                a aVar2 = (a) aVar;
                if (aVar2.c) {
                    Throwable th = aVar2.d;
                    aVar = th != null ? new a(false, th) : a.b;
                }
            }
            aVar.getClass();
            return aVar;
        }
        if ((listenableFuture instanceof eotf) && (thJ = ((eotf) listenableFuture).j()) != null) {
            return new c(thJ);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!m) && zIsCancelled) {
            a aVar3 = a.b;
            aVar3.getClass();
            return aVar3;
        }
        try {
            Object objD = d(listenableFuture);
            return zIsCancelled ? new a(false, new IllegalArgumentException(defpackage.a.E(listenableFuture, "get() did not throw CancellationException, despite reporting isCancelled() == true: "))) : objD == null ? k : objD;
        } catch (Error | Exception e2) {
            return new c(e2);
        } catch (CancellationException e3) {
            return !zIsCancelled ? new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(listenableFuture))), e3)) : new a(false, e3);
        } catch (ExecutionException e4) {
            return zIsCancelled ? new a(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(listenableFuture))), e4)) : new c(e4.getCause());
        }
    }

    public static void k(eooi eooiVar, boolean z) {
        d dVar = null;
        while (true) {
            for (eooj.e eVarB = eooj.n.b(eooiVar, eooj.e.a); eVarB != null; eVarB = eVarB.next) {
                Thread thread = eVarB.thread;
                if (thread != null) {
                    eVarB.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                eooiVar.l();
            }
            eooiVar.gv();
            d dVar2 = dVar;
            d dVarA = eooj.n.a(eooiVar, d.a);
            d dVar3 = dVar2;
            while (dVarA != null) {
                d dVar4 = dVarA.next;
                dVarA.next = dVar3;
                dVar3 = dVarA;
                dVarA = dVar4;
            }
            while (dVar3 != null) {
                Runnable runnable = dVar3.b;
                dVar = dVar3.next;
                runnable.getClass();
                if (runnable instanceof b) {
                    b bVar = (b) runnable;
                    eooiVar = bVar.a;
                    if (eooiVar.valueField != bVar || !s(eooiVar, bVar, i(bVar.b))) {
                    }
                } else {
                    Executor executor = dVar3.c;
                    executor.getClass();
                    f(runnable, executor);
                }
                dVar3 = dVar;
            }
            return;
            z = false;
        }
    }

    static boolean n(Object obj) {
        return !(obj instanceof b);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void b(Runnable runnable, Executor executor) {
        d dVar;
        runnable.getClass();
        executor.getClass();
        if (!isDone() && (dVar = this.listenersField) != d.a) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.next = dVar;
                if (eooj.n.e(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.listenersField;
                }
            } while (dVar != d.a);
        }
        f(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.valueField
            boolean r1 = r0 instanceof eooi.b
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = defpackage.eooi.m
            if (r1 == 0) goto L1f
            eooi$a r1 = new eooi$a
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            eooi$a r1 = eooi.a.a
            goto L26
        L24:
            eooi$a r1 = eooi.a.b
        L26:
            r1.getClass()
        L29:
            r4 = r7
            r5 = r2
        L2b:
            boolean r6 = s(r4, r0, r1)
            if (r6 == 0) goto L56
            k(r4, r8)
            boolean r4 = r0 instanceof eooi.b
            if (r4 == 0) goto L55
            eooi$b r0 = (eooi.b) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.b
            boolean r4 = r0 instanceof eooi.e
            if (r4 == 0) goto L52
            r4 = r0
            eooi r4 = (defpackage.eooi) r4
            java.lang.Object r0 = r4.valueField
            if (r0 != 0) goto L49
            r5 = r3
            goto L4a
        L49:
            r5 = r2
        L4a:
            boolean r6 = r0 instanceof eooi.b
            r5 = r5 | r6
            if (r5 == 0) goto L51
            r5 = r3
            goto L2b
        L51:
            return r3
        L52:
            r0.cancel(r8)
        L55:
            return r3
        L56:
            java.lang.Object r0 = r4.valueField
            boolean r6 = n(r0)
            if (r6 == 0) goto L2b
            return r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eooi.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String gu() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof a;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & n(obj);
    }

    @Override // defpackage.eotf
    public final Throwable j() {
        if (!(this instanceof e)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof c) {
            return ((c) obj).b;
        }
        return null;
    }

    final void m(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(p());
        }
    }

    public final boolean o(ListenableFuture listenableFuture) {
        c cVar;
        listenableFuture.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!s(this, null, i(listenableFuture))) {
                    return false;
                }
                k(this, false);
                return true;
            }
            b bVar = new b(this, listenableFuture);
            if (s(this, null, bVar)) {
                try {
                    listenableFuture.b(bVar, eoqg.a);
                } catch (Throwable th) {
                    try {
                        cVar = new c(th);
                    } catch (Error | Exception unused) {
                        cVar = c.a;
                    }
                    s(this, bVar, cVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof a) {
            listenableFuture.cancel(((a) obj).c);
        }
        return false;
    }

    protected final boolean p() {
        Object obj = this.valueField;
        return (obj instanceof a) && ((a) obj).c;
    }

    public boolean set(V v) {
        if (v == null) {
            v = (V) k;
        }
        if (!s(this, null, v)) {
            return false;
        }
        k(this, false);
        return true;
    }

    public boolean setException(Throwable th) {
        th.getClass();
        if (!s(this, null, new c(th))) {
            return false;
        }
        k(this, false);
        return true;
    }

    public String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof b) {
                sb.append(", setFuture=[");
                ListenableFuture<? extends V> listenableFuture = ((b) obj).b;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (Throwable th) {
                    eosk.c(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = ejwk.a(gu());
                } catch (Throwable th2) {
                    eosk.c(th2);
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(th2.getClass())));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                e(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return r(j, timeUnit);
    }

    protected void gv() {
    }

    protected void l() {
    }
}
