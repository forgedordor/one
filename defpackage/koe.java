package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class koe<V> implements ListenableFuture<V> {
    static final a b;
    private static final Object d;
    volatile d listeners;
    public volatile Object value;
    volatile h waiters;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger c = Logger.getLogger(koe.class.getName());

    /* compiled from: PG */
    abstract class a {
        public abstract void a(h hVar, h hVar2);

        public abstract void b(h hVar, Thread thread);

        public abstract boolean c(koe koeVar, d dVar, d dVar2);

        public abstract boolean d(koe koeVar, Object obj, Object obj2);

        public abstract boolean e(koe koeVar, h hVar, h hVar2);
    }

    /* compiled from: PG */
    public final class b {
        static final b a;
        static final b b;
        public final boolean c;
        final Throwable d;

        static {
            if (koe.a) {
                b = null;
                a = null;
            } else {
                b = new b(false, null);
                a = new b(true, null);
            }
        }

        public b(boolean z, Throwable th) {
            this.c = z;
            this.d = th;
        }
    }

    /* compiled from: PG */
    final class c {
        static final c a = new c(new Throwable() { // from class: koe.c.1
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable b;

        public c(Throwable th) {
            koe.i(th);
            this.b = th;
        }
    }

    /* compiled from: PG */
    final class d {
        static final d a = new d(null, null);
        final Runnable b;
        final Executor c;
        d next;

        public d(Runnable runnable, Executor executor) {
            this.b = runnable;
            this.c = executor;
        }
    }

    /* compiled from: PG */
    final class e extends a {
        final AtomicReferenceFieldUpdater<h, Thread> a;
        final AtomicReferenceFieldUpdater<h, h> b;
        final AtomicReferenceFieldUpdater<koe, h> c;
        final AtomicReferenceFieldUpdater<koe, d> d;
        final AtomicReferenceFieldUpdater<koe, Object> e;

        public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // koe.a
        public final void a(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // koe.a
        public final void b(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }

        @Override // koe.a
        public final boolean c(koe koeVar, d dVar, d dVar2) {
            return kof.a(this.d, koeVar, dVar, dVar2);
        }

        @Override // koe.a
        public final boolean d(koe koeVar, Object obj, Object obj2) {
            return kof.a(this.e, koeVar, obj, obj2);
        }

        @Override // koe.a
        public final boolean e(koe koeVar, h hVar, h hVar2) {
            return kof.a(this.c, koeVar, hVar, hVar2);
        }
    }

    /* compiled from: PG */
    final class f<V> implements Runnable {
        final koe<V> a;
        final ListenableFuture<? extends V> b;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: PG */
    final class g extends a {
        @Override // koe.a
        public final void a(h hVar, h hVar2) {
            hVar.next = hVar2;
        }

        @Override // koe.a
        public final void b(h hVar, Thread thread) {
            hVar.thread = thread;
        }

        @Override // koe.a
        public final boolean c(koe koeVar, d dVar, d dVar2) {
            synchronized (koeVar) {
                if (koeVar.listeners != dVar) {
                    return false;
                }
                koeVar.listeners = dVar2;
                return true;
            }
        }

        @Override // koe.a
        public final boolean d(koe koeVar, Object obj, Object obj2) {
            synchronized (koeVar) {
                if (koeVar.value != obj) {
                    return false;
                }
                koeVar.value = obj2;
                return true;
            }
        }

        @Override // koe.a
        public final boolean e(koe koeVar, h hVar, h hVar2) {
            synchronized (koeVar) {
                if (koeVar.waiters != hVar) {
                    return false;
                }
                koeVar.waiters = hVar2;
                return true;
            }
        }
    }

    /* compiled from: PG */
    final class h {
        static final h a = new h(null);
        volatile h next;
        volatile Thread thread;

        public h(byte[] bArr) {
        }

        final void a(h hVar) {
            koe.b.a(this, hVar);
        }

        public h() {
            koe.b.b(this, Thread.currentThread());
        }
    }

    static {
        a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "next"), AtomicReferenceFieldUpdater.newUpdater(koe.class, h.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(koe.class, d.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(koe.class, Object.class, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        b = gVar;
        if (th != null) {
            c.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        d = new Object();
    }

    protected koe() {
    }

    static Object a(ListenableFuture listenableFuture) {
        if (listenableFuture instanceof koe) {
            Object obj = ((koe) listenableFuture).value;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar = (b) obj;
            if (!bVar.c) {
                return obj;
            }
            Throwable th = bVar.d;
            return th != null ? new b(false, th) : b.b;
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!a) && zIsCancelled) {
            return b.b;
        }
        try {
            Object objC = c(listenableFuture);
            return objC == null ? d : objC;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new b(false, e2);
            }
            Objects.toString(listenableFuture);
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e2));
        } catch (ExecutionException e3) {
            return new c(e3.getCause());
        } catch (Throwable th2) {
            return new c(th2);
        }
    }

    static Object c(Future future) {
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
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    static void f(koe koeVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = koeVar.waiters;
            if (b.e(koeVar, hVar, h.a)) {
                while (hVar != null) {
                    Thread thread = hVar.thread;
                    if (thread != null) {
                        hVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.next;
                }
                koeVar.e();
                do {
                    dVar = koeVar.listeners;
                } while (!b.c(koeVar, dVar, d.a));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.next;
                    dVar3.next = dVar2;
                }
                while (dVar2 != null) {
                    Runnable runnable = dVar2.b;
                    d dVar4 = dVar2.next;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        koeVar = fVar.a;
                        if (koeVar.value == fVar) {
                            if (b.d(koeVar, fVar, a(fVar.b))) {
                                dVar3 = dVar4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        l(runnable, dVar2.c);
                    }
                    dVar2 = dVar4;
                }
                return;
            }
        }
    }

    static void i(Object obj) {
        obj.getClass();
    }

    private final String j(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private final void k(StringBuilder sb) {
        try {
            Object objC = c(this);
            sb.append("SUCCESS, result=[");
            sb.append(j(objC));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    private static void l(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            c.log(Level.SEVERE, defpackage.a.i(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e2);
        }
    }

    private final void m(h hVar) {
        hVar.thread = null;
        while (true) {
            h hVar2 = this.waiters;
            if (hVar2 != h.a) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.next;
                    if (hVar2.thread != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.next = hVar4;
                        if (hVar3.thread == null) {
                            break;
                        }
                    } else if (!b.e(this, hVar2, hVar4)) {
                        break;
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object n(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th = ((b) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).b);
        }
        if (obj == d) {
            return null;
        }
        return obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void b(Runnable runnable, Executor executor) {
        i(runnable);
        i(executor);
        d dVar = this.listeners;
        if (dVar != d.a) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.next = dVar;
                if (b.c(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.listeners;
                }
            } while (dVar != d.a);
        }
        l(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof koe.f
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5c
            boolean r1 = defpackage.koe.a
            if (r1 == 0) goto L1f
            koe$b r1 = new koe$b
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            koe$b r1 = koe.b.a
            goto L26
        L24:
            koe$b r1 = koe.b.b
        L26:
            r4 = r7
            r5 = r2
        L28:
            koe$a r6 = defpackage.koe.b
            boolean r6 = r6.d(r4, r0, r1)
            if (r6 == 0) goto L55
            f(r4)
            boolean r4 = r0 instanceof koe.f
            if (r4 == 0) goto L54
            koe$f r0 = (koe.f) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.b
            boolean r4 = r0 instanceof defpackage.koe
            if (r4 == 0) goto L51
            r4 = r0
            koe r4 = (defpackage.koe) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L48
            r5 = r3
            goto L49
        L48:
            r5 = r2
        L49:
            boolean r6 = r0 instanceof koe.f
            r5 = r5 | r6
            if (r5 == 0) goto L50
            r5 = r3
            goto L28
        L50:
            return r3
        L51:
            r0.cancel(r8)
        L54:
            return r3
        L55:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof koe.f
            if (r6 != 0) goto L28
            return r5
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.koe.cancel(boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String d() {
        Object obj = this.value;
        if (obj instanceof f) {
            return "setFuture=[" + j(((f) obj).b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final boolean g(Object obj) {
        if (obj == null) {
            obj = d;
        }
        if (!b.d(this, null, obj)) {
            return false;
        }
        f(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof f))) {
            return n(obj2);
        }
        h hVar = this.waiters;
        if (hVar != h.a) {
            h hVar2 = new h();
            do {
                hVar2.a(hVar);
                if (b.e(this, hVar, hVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m(hVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof f))));
                    return n(obj);
                }
                hVar = this.waiters;
            } while (hVar != h.a);
        }
        return n(this.value);
    }

    public final boolean h(Throwable th) {
        i(th);
        if (!b.d(this, null, new c(th))) {
            return false;
        }
        f(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.value != null) & (!(r0 instanceof f));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            k(sb);
        } else {
            try {
                strConcat = d();
            } catch (RuntimeException e2) {
                Class<?> cls = e2.getClass();
                Objects.toString(cls);
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                k(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof f))) {
                return n(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                h hVar = this.waiters;
                if (hVar != h.a) {
                    h hVar2 = new h();
                    do {
                        hVar2.a(hVar);
                        if (b.e(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof f))) {
                                        return n(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    m(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m(hVar2);
                        } else {
                            hVar = this.waiters;
                        }
                    } while (hVar != h.a);
                }
                return n(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if ((obj3 != null) & (!(obj3 instanceof f))) {
                    return n(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j2 = -nanos;
                long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(jConvert);
                if (jConvert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(defpackage.a.q(string, strConcat, " for "));
        }
        throw new InterruptedException();
    }

    protected void e() {
    }
}
