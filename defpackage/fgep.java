package defpackage;

import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgep extends UploadDataSink {
    public final AtomicInteger a = new AtomicInteger(3);
    public final Executor b;
    public final fggs c;
    public ByteBuffer d;
    public long e;
    public long f;
    public int g;
    private final Executor h;

    public fgep(Executor executor, Executor executor2, UploadDataProvider uploadDataProvider) {
        this.h = new fgeo(this, executor);
        this.b = executor2;
        this.c = new fggs(uploadDataProvider);
    }

    private final void j(final Runnable runnable, final String str) {
        new ffyu("JavaUploadDataSinkBase#executeOnExecutor ".concat(str));
        try {
            this.b.execute(new Runnable() { // from class: fgem
                @Override // java.lang.Runnable
                public final void run() {
                    new ffyu("JavaUploadDataSinkBase#executeOnExecutor " + str + " running callback");
                    try {
                        runnable.run();
                        Trace.endSection();
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected abstract int a(ByteBuffer byteBuffer);

    protected abstract Runnable b(fgfx fgfxVar);

    protected abstract Runnable c(fgfx fgfxVar);

    public final void d(final fgfx fgfxVar, final String str) {
        try {
            new ffyu(a.v(str, "Cronet JavaUploadDataSinkBase#executeOnUploadExecutor "));
            try {
                this.h.execute(new Runnable() { // from class: fgej
                    @Override // java.lang.Runnable
                    public final void run() {
                        new ffyu("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor " + str + " running callback");
                        try {
                            this.a.c(fgfxVar).run();
                            Trace.endSection();
                        } catch (Throwable th) {
                            try {
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                });
                Trace.endSection();
            } finally {
            }
        } catch (RejectedExecutionException e) {
            g(e);
        }
    }

    protected abstract void e();

    protected abstract void f();

    protected abstract void g(Throwable th);

    public final void h() {
        d(new fgfx() { // from class: fgek
            @Override // defpackage.fgfx
            public final void a() {
                final fgep fgepVar = this.a;
                fgepVar.c.read(fgepVar, fgepVar.d);
                fgepVar.b.execute(new Runnable() { // from class: fgeh
                    @Override // java.lang.Runnable
                    public final void run() {
                        fgepVar.g++;
                    }
                });
            }
        }, "readFromProvider");
    }

    public final void i() {
        j(b(new fgfx() { // from class: fgel
            @Override // defpackage.fgfx
            public final void a() {
                fgep fgepVar = this.a;
                fgepVar.f();
                fgepVar.a.set(0);
                fgepVar.h();
            }
        }), "startRead");
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        g(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(final boolean z) {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(0, 2)) {
            j(b(new fgfx() { // from class: fgen
                @Override // defpackage.fgfx
                public final void a() {
                    fgep fgepVar = this.a;
                    long j = fgepVar.e;
                    if (j != -1 && j - fgepVar.f < fgepVar.d.remaining()) {
                        fgepVar.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(fgepVar.f + fgepVar.d.remaining()), Long.valueOf(fgepVar.e))));
                        return;
                    }
                    boolean z2 = z;
                    if (fgepVar.d.remaining() == 0 && !z2) {
                        fgepVar.g(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
                        return;
                    }
                    long jA = fgepVar.f + fgepVar.a(fgepVar.d);
                    fgepVar.f = jA;
                    long j2 = fgepVar.e;
                    if (jA >= j2) {
                        if (j2 == -1) {
                            if (z2) {
                                j2 = -1;
                            }
                        }
                        if (j2 == -1) {
                            fgepVar.e();
                            return;
                        } else if (j2 == jA) {
                            fgepVar.e();
                            return;
                        } else {
                            fgepVar.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(fgepVar.f), Long.valueOf(fgepVar.e))));
                            return;
                        }
                    }
                    fgepVar.a.set(0);
                    fgepVar.h();
                }
            }), "onReadSucceeded");
            return;
        }
        throw new IllegalStateException("onReadSucceeded() called when not awaiting a read result; in state: " + atomicInteger.get());
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        g(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(1, 2)) {
            i();
            return;
        }
        throw new IllegalStateException("onRewindSucceeded() called when not awaiting a rewind; in state: " + atomicInteger.get());
    }
}
