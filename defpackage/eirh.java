package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eirh implements Runnable {
    final Future a;
    final eira b;

    public eirh(Future future, eira eiraVar) {
        this.a = future;
        this.b = eiraVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            Future future = this.a;
            if (!future.isDone()) {
                throw new IllegalStateException("future is expected to be done already.");
            }
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
            this.b.b(obj);
        } catch (Error e) {
            e = e;
            this.b.a(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.b.a(e);
        } catch (ExecutionException e3) {
            e = e3;
            eira eiraVar = this.b;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            eiraVar.a(e);
        }
    }
}
