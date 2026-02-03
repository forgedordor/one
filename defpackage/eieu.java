package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eieu implements Runnable, eifp {
    public eifn a;
    private eifn b;
    private final boolean c = ecem.h(Thread.currentThread());
    private boolean d;
    private boolean e;
    private boolean f;

    public eieu(eifn eifnVar, boolean z) {
        this.f = false;
        this.a = eifnVar;
        this.b = eifnVar;
        this.f = z;
    }

    private final void c() {
        this.d = true;
        this.a.q(this.c && !this.e && ecem.g());
        this.a = null;
    }

    public final void a(eopy eopyVar) {
        b(eopyVar.h());
    }

    public final void b(ListenableFuture listenableFuture) {
        if (this.d) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.e) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.e = true;
        this.a.u();
        listenableFuture.b(this, eoqg.a);
    }

    @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        eifn eifnVar = this.b;
        try {
            this.b = null;
            if (!this.e) {
                if (this.d) {
                    throw new IllegalStateException("Span was already closed!");
                }
                c();
            }
            if (eifnVar != null) {
                eifnVar.close();
            }
            if (this.f) {
                eidc.g(eieo.a);
            }
        } catch (Throwable th) {
            if (eifnVar != null) {
                try {
                    eifnVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d || !this.e) {
            ecem.e(new Runnable() { // from class: eiet
                @Override // java.lang.Runnable
                public final void run() {
                    throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
                }
            });
        } else {
            c();
        }
    }
}
