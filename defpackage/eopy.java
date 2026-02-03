package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eopy {
    public static final eorz a = new eorz(eopy.class);
    public final eopm b;
    public final eoqt c;
    private final AtomicReference d;

    public eopy(ListenableFuture listenableFuture) {
        this(listenableFuture, new eopm());
    }

    @Deprecated
    public static eopy b(ListenableFuture listenableFuture, Executor executor) {
        executor.getClass();
        eopy eopyVar = new eopy(eork.j(listenableFuture));
        eork.r(listenableFuture, new eopg(eopyVar, executor), eoqg.a);
        return eopyVar;
    }

    public static eopy c(eopn eopnVar, Executor executor) {
        eopm eopmVar = new eopm();
        eotc eotcVar = new eotc(new eope(eopnVar, eopmVar));
        executor.execute(eotcVar);
        return new eopy(eotcVar, eopmVar);
    }

    public static eopy d(eopk eopkVar, Executor executor) {
        eopm eopmVar = new eopm();
        eotc eotcVar = new eotc(new eopf(eopkVar, eopmVar));
        executor.execute(eotcVar);
        return new eopy(eotcVar, eopmVar);
    }

    public static void l(final AutoCloseable autoCloseable, Executor executor) {
        if (autoCloseable != null) {
            try {
                executor.execute(new Runnable() { // from class: eopb
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        eorz eorzVar = eopy.a;
                        try {
                            autoCloseable.close();
                        } catch (Exception e) {
                            eosk.b(e);
                            eopy.a.a().logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", "thrown by close()", (Throwable) e);
                        }
                    }
                });
            } catch (RejectedExecutionException e) {
                eorz eorzVar = a;
                if (eorzVar.a().isLoggable(Level.WARNING)) {
                    eorzVar.a().logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", String.format("while submitting close to %s; will close inline", executor), (Throwable) e);
                }
                l(autoCloseable, eoqg.a);
            }
        }
    }

    private final eopy o(eoqt eoqtVar) {
        eopy eopyVar = new eopy(eoqtVar);
        i(eopyVar.b);
        return eopyVar;
    }

    private final boolean p(eopv eopvVar, eopv eopvVar2) {
        AtomicReference atomicReference;
        do {
            atomicReference = this.d;
            if (atomicReference.compareAndSet(eopvVar, eopvVar2)) {
                return true;
            }
        } while (atomicReference.get() == eopvVar);
        return false;
    }

    public final eopy a(Class cls, eopo eopoVar, Executor executor) {
        return o((eoqt) eooh.g(this.c, cls, new eopj(this, eopoVar), executor));
    }

    public final eopy e(eopo eopoVar, Executor executor) {
        return o((eoqt) eooq.g(this.c, new eoph(this, eopoVar), executor));
    }

    public final eopy f(eopl eoplVar, Executor executor) {
        return o((eoqt) eooq.g(this.c, new eopi(this, eoplVar), executor));
    }

    protected final void finalize() {
        if (((eopv) this.d.get()).equals(eopv.OPEN)) {
            a.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ClosingFuture", "finalize", "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            g();
        }
    }

    public final eoqt g() {
        eopy eopyVar;
        if (p(eopv.OPEN, eopv.WILL_CLOSE)) {
            eopyVar = this;
            a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "finishToFuture", "will close {0}", eopyVar);
            eopyVar.c.b(new Runnable() { // from class: eopd
                @Override // java.lang.Runnable
                public final void run() {
                    eopy eopyVar2 = this.a;
                    eopv eopvVar = eopv.WILL_CLOSE;
                    eopv eopvVar2 = eopv.CLOSING;
                    eopyVar2.j(eopvVar, eopvVar2);
                    eopyVar2.k();
                    eopyVar2.j(eopvVar2, eopv.CLOSED);
                }
            }, eoqg.a);
        } else {
            eopyVar = this;
            int iOrdinal = ((eopv) eopyVar.d.get()).ordinal();
            if (iOrdinal == 0) {
                throw new AssertionError();
            }
            if (iOrdinal == 1) {
                throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
            }
            if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                throw new IllegalStateException("Cannot call finishToFuture() twice");
            }
            if (iOrdinal == 5) {
                throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
            }
        }
        return eopyVar.c;
    }

    public final ListenableFuture h() {
        return eork.j(eooq.f(this.c, new ejvt(null), eoqg.a));
    }

    public final void i(eopm eopmVar) {
        j(eopv.OPEN, eopv.SUBSUMED);
        eopmVar.b(this.b, eoqg.a);
    }

    public final void j(eopv eopvVar, eopv eopvVar2) {
        ejwl.r(p(eopvVar, eopvVar2), "Expected state to be %s, but it was %s", eopvVar, eopvVar2);
    }

    public final void k() {
        a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "close", "closing {0}", this);
        this.b.close();
    }

    public final void m(final eopx eopxVar, Executor executor) {
        if (p(eopv.OPEN, eopv.WILL_CREATE_VALUE_AND_CLOSER)) {
            this.c.b(new Runnable() { // from class: eopc
                @Override // java.lang.Runnable
                public final void run() {
                    eopxVar.a(new eopw(this.a));
                }
            }, executor);
            return;
        }
        AtomicReference atomicReference = this.d;
        int iOrdinal = ((eopv) atomicReference.get()).ordinal();
        if (iOrdinal == 1) {
            throw new IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
        }
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            throw new IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
        }
        if (iOrdinal == 5) {
            throw new IllegalStateException("Cannot call finishToValueAndCloser() twice");
        }
        throw new AssertionError(atomicReference);
    }

    public final void n() {
        a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "cancel", "cancelling {0}", this);
        if (this.c.cancel(false)) {
            k();
        }
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("state", this.d.get());
        ejwfVarB.a(this.c);
        return ejwfVarB.toString();
    }

    private eopy(ListenableFuture listenableFuture, eopm eopmVar) {
        this.d = new AtomicReference(eopv.OPEN);
        this.c = eoqt.t(listenableFuture);
        this.b = eopmVar;
    }
}
