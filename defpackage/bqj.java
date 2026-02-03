package defpackage;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqj implements Runnable {
    final Future a;
    final bpu b;

    public bqj(Future future, bpu bpuVar) {
        this.a = future;
        this.b = bpuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Future future = this.a;
            boolean zIsDone = future.isDone();
            Objects.toString(future);
            lcg.d(zIsDone, "Future was expected to be done, ".concat(String.valueOf(future)));
            this.b.b(bqk.h(future));
        } catch (Error e) {
            e = e;
            this.b.a(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.b.a(e);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause == null) {
                this.b.a(e3);
            } else {
                this.b.a(cause);
            }
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + "," + this.b;
    }
}
