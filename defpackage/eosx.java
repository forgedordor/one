package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eosx implements Runnable {
    eosz a;

    public eosx(eosz eoszVar) {
        this.a = eoszVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture;
        eosz eoszVar = this.a;
        if (eoszVar == null || (listenableFuture = eoszVar.a) == null) {
            return;
        }
        this.a = null;
        if (listenableFuture.isDone()) {
            eoszVar.o(listenableFuture);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = eoszVar.b;
            eoszVar.b = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    eoszVar.setException(new eosy(str));
                    throw th;
                }
            }
            eoszVar.setException(new eosy(str + ": " + listenableFuture.toString()));
        } finally {
            listenableFuture.cancel(true);
        }
    }
}
