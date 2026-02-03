package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.eooi;
import defpackage.eooj;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eooj<V> extends eotf implements ListenableFuture<V> {
    static final Object k = new Object();
    static final eorz l = new eorz(eooi.class);
    static final boolean m;
    public static final a n;
    volatile eooi.d listenersField;
    volatile Object valueField;
    volatile e waitersField;

    /* compiled from: PG */
    abstract class a {
        public abstract eooi.d a(eooj eoojVar, eooi.d dVar);

        public abstract e b(eooj eoojVar, e eVar);

        public abstract void c(e eVar, e eVar2);

        public abstract void d(e eVar, Thread thread);

        public abstract boolean e(eooj eoojVar, eooi.d dVar, eooi.d dVar2);

        public abstract boolean f(eooj eoojVar, Object obj, Object obj2);

        public abstract boolean g(eooj eoojVar, e eVar, e eVar2);
    }

    /* compiled from: PG */
    final class b extends a {
        private static final AtomicReferenceFieldUpdater<e, Thread> a = AtomicReferenceFieldUpdater.newUpdater(e.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<e, e> b = AtomicReferenceFieldUpdater.newUpdater(e.class, e.class, "next");
        private static final AtomicReferenceFieldUpdater<? super eooj<?>, e> c = AtomicReferenceFieldUpdater.newUpdater(eooj.class, e.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super eooj<?>, eooi.d> d = AtomicReferenceFieldUpdater.newUpdater(eooj.class, eooi.d.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super eooj<?>, Object> e = AtomicReferenceFieldUpdater.newUpdater(eooj.class, Object.class, "valueField");

        @Override // eooj.a
        public final eooi.d a(eooj eoojVar, eooi.d dVar) {
            return d.getAndSet(eoojVar, dVar);
        }

        @Override // eooj.a
        public final e b(eooj eoojVar, e eVar) {
            return c.getAndSet(eoojVar, eVar);
        }

        @Override // eooj.a
        public final void c(e eVar, e eVar2) {
            b.lazySet(eVar, eVar2);
        }

        @Override // eooj.a
        public final void d(e eVar, Thread thread) {
            a.lazySet(eVar, thread);
        }

        @Override // eooj.a
        public final boolean e(eooj eoojVar, eooi.d dVar, eooi.d dVar2) {
            return eook.a(d, eoojVar, dVar, dVar2);
        }

        @Override // eooj.a
        public final boolean f(eooj eoojVar, Object obj, Object obj2) {
            return eook.a(e, eoojVar, obj, obj2);
        }

        @Override // eooj.a
        public final boolean g(eooj eoojVar, e eVar, e eVar2) {
            return eook.a(c, eoojVar, eVar, eVar2);
        }
    }

    /* compiled from: PG */
    final class c extends a {
        @Override // eooj.a
        public final eooi.d a(eooj eoojVar, eooi.d dVar) {
            eooi.d dVar2;
            synchronized (eoojVar) {
                dVar2 = eoojVar.listenersField;
                if (dVar2 != dVar) {
                    eoojVar.listenersField = dVar;
                }
            }
            return dVar2;
        }

        @Override // eooj.a
        public final e b(eooj eoojVar, e eVar) {
            e eVar2;
            synchronized (eoojVar) {
                eVar2 = eoojVar.waitersField;
                if (eVar2 != eVar) {
                    eoojVar.waitersField = eVar;
                }
            }
            return eVar2;
        }

        @Override // eooj.a
        public final void c(e eVar, e eVar2) {
            eVar.next = eVar2;
        }

        @Override // eooj.a
        public final void d(e eVar, Thread thread) {
            eVar.thread = thread;
        }

        @Override // eooj.a
        public final boolean e(eooj eoojVar, eooi.d dVar, eooi.d dVar2) {
            synchronized (eoojVar) {
                if (eoojVar.listenersField != dVar) {
                    return false;
                }
                eoojVar.listenersField = dVar2;
                return true;
            }
        }

        @Override // eooj.a
        public final boolean f(eooj eoojVar, Object obj, Object obj2) {
            synchronized (eoojVar) {
                if (eoojVar.valueField != obj) {
                    return false;
                }
                eoojVar.valueField = obj2;
                return true;
            }
        }

        @Override // eooj.a
        public final boolean g(eooj eoojVar, e eVar, e eVar2) {
            synchronized (eoojVar) {
                if (eoojVar.waitersField != eVar) {
                    return false;
                }
                eoojVar.waitersField = eVar2;
                return true;
            }
        }
    }

    /* compiled from: PG */
    final class d extends a {
        static final Unsafe a;
        static final long b;
        static final long c;
        static final long d;
        static final long e;
        static final long f;
        public static final /* synthetic */ int g = 0;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: eoom
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() throws IllegalAccessException, IllegalArgumentException {
                        int i = eooj.d.g;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                c = unsafe.objectFieldOffset(eooj.class.getDeclaredField("waitersField"));
                b = unsafe.objectFieldOffset(eooj.class.getDeclaredField("listenersField"));
                d = unsafe.objectFieldOffset(eooj.class.getDeclaredField("valueField"));
                e = unsafe.objectFieldOffset(e.class.getDeclaredField("thread"));
                f = unsafe.objectFieldOffset(e.class.getDeclaredField("next"));
                a = unsafe;
            } catch (NoSuchFieldException e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // eooj.a
        public final eooi.d a(eooj eoojVar, eooi.d dVar) {
            eooi.d dVar2;
            do {
                dVar2 = eoojVar.listenersField;
                if (dVar == dVar2) {
                    break;
                }
            } while (!e(eoojVar, dVar2, dVar));
            return dVar2;
        }

        @Override // eooj.a
        public final e b(eooj eoojVar, e eVar) {
            e eVar2;
            do {
                eVar2 = eoojVar.waitersField;
                if (eVar == eVar2) {
                    break;
                }
            } while (!g(eoojVar, eVar2, eVar));
            return eVar2;
        }

        @Override // eooj.a
        public final void c(e eVar, e eVar2) {
            a.putObject(eVar, f, eVar2);
        }

        @Override // eooj.a
        public final void d(e eVar, Thread thread) {
            a.putObject(eVar, e, thread);
        }

        @Override // eooj.a
        public final boolean e(eooj eoojVar, eooi.d dVar, eooi.d dVar2) {
            return eool.a(a, eoojVar, b, dVar, dVar2);
        }

        @Override // eooj.a
        public final boolean f(eooj eoojVar, Object obj, Object obj2) {
            return eool.a(a, eoojVar, d, obj, obj2);
        }

        @Override // eooj.a
        public final boolean g(eooj eoojVar, e eVar, e eVar2) {
            return eool.a(a, eoojVar, c, eVar, eVar2);
        }
    }

    /* compiled from: PG */
    final class e {
        static final e a = new e(null);
        volatile e next;
        volatile Thread thread;

        public e(byte[] bArr) {
        }

        public e() {
            eooj.n.d(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        a cVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        m = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                cVar = new d();
            } catch (Error | Exception e2) {
                try {
                    cVar = new b();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    cVar = new c();
                }
                th = th3;
                th2 = e2;
            }
        } else {
            try {
                cVar = new b();
            } catch (NoClassDefFoundError unused2) {
                cVar = new c();
            }
        }
        th = null;
        th2 = null;
        n = cVar;
        if (th != null) {
            eorz eorzVar = l;
            eorzVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            eorzVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    private static void a(e eVar, e eVar2) {
        n.c(eVar, eVar2);
    }

    private final void c(e eVar) {
        eVar.thread = null;
        while (true) {
            e eVar2 = this.waitersField;
            if (eVar2 != e.a) {
                e eVar3 = null;
                while (eVar2 != null) {
                    e eVar4 = eVar2.next;
                    if (eVar2.thread != null) {
                        eVar3 = eVar2;
                    } else if (eVar3 != null) {
                        eVar3.next = eVar4;
                        if (eVar3.thread == null) {
                            break;
                        }
                    } else if (!ha(eVar2, eVar4)) {
                        break;
                    }
                    eVar2 = eVar4;
                }
                return;
            }
            return;
        }
    }

    private final boolean ha(e eVar, e eVar2) {
        return n.g(this, eVar, eVar2);
    }

    static boolean s(eooj eoojVar, Object obj, Object obj2) {
        return n.f(eoojVar, obj, obj2);
    }

    public final Object q() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && eooi.n(obj2)) {
            return eooi.h(obj2);
        }
        e eVar = this.waitersField;
        if (eVar != e.a) {
            e eVar2 = new e();
            do {
                a(eVar2, eVar);
                if (ha(eVar, eVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            c(eVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & eooi.n(obj)));
                    return eooi.h(obj);
                }
                eVar = this.waitersField;
            } while (eVar != e.a);
        }
        Object obj3 = this.valueField;
        obj3.getClass();
        return eooi.h(obj3);
    }

    public final Object r(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && eooi.n(obj)) {
            return eooi.h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            e eVar = this.waitersField;
            if (eVar != e.a) {
                e eVar2 = new e();
                while (true) {
                    a(eVar2, eVar);
                    if (ha(eVar, eVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                c(eVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && eooi.n(obj2)) {
                                return eooi.h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        c(eVar2);
                    } else {
                        e eVar3 = this.waitersField;
                        if (eVar3 == e.a) {
                            break;
                        }
                        eVar = eVar3;
                    }
                }
            }
            Object obj3 = this.valueField;
            obj3.getClass();
            return eooi.h(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && eooi.n(obj4)) {
                return eooi.h(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
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
}
