package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffag implements Runnable {
    public volatile AtomicInteger a = new AtomicInteger(0);
    final /* synthetic */ ffaj b;
    private final fexl c;

    public ffag(ffaj ffajVar, fexl fexlVar) {
        this.b = ffajVar;
        this.c = fexlVar;
    }

    public final String a() {
        return this.b.b.a.c;
    }

    public final void b(ExecutorService executorService) {
        byte[] bArr = fezr.a;
        try {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                this.b.e(interruptedIOException);
                this.c.a(interruptedIOException);
                this.b.a.c.c(this);
            }
        } catch (Throwable th) {
            this.b.a.c.c(this);
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        feya feyaVar;
        ffaj ffajVar = this.b;
        String strF = ffajVar.f();
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName("OkHttp ".concat(strF));
        try {
            ffajVar.e.e();
            boolean z = false;
            try {
                try {
                    try {
                        this.c.b(ffajVar.h());
                        feyaVar = ffajVar.a.c;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            ffdi ffdiVar = ffdi.b;
                            String str = true != ffajVar.l ? "" : "canceled ";
                            ffdiVar.l(a.v(str + "call to " + ffajVar.f(), "Callback failure for "), 4, e);
                        } else {
                            this.c.a(e);
                        }
                        feyaVar = ffajVar.a.c;
                        feyaVar.c(this);
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        ffajVar.b();
                        if (!z) {
                            IOException iOException = new IOException(a.l(th, "canceled due to "));
                            fcsw.a(iOException, th);
                            this.c.a(iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    ffajVar.a.c.c(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            feyaVar.c(this);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
