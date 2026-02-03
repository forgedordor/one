package defpackage;

import io.grpc.Status;
import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcfu implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ fcgx a;

    public fcfu(fcgx fcgxVar) {
        this.a = fcgxVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = fcgx.a;
        Level level = Level.SEVERE;
        fcgx fcgxVar = this.a;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + String.valueOf(fcgxVar.h) + "] Uncaught exception in the SynchronizationContext. Panic!", th);
        try {
            if (fcgxVar.v) {
                return;
            }
            fcgxVar.v = true;
            try {
                fcgxVar.i(true);
                fcgxVar.n(false);
            } finally {
                fcgxVar.o(new fbpz(fbqc.a(Status.o.withDescription("Panic! This is a bug!").d(th))));
                fcgxVar.J.d(null);
                fcgxVar.H.a(4, "PANIC! Entering TRANSIENT_FAILURE");
                fcgxVar.p.a(fbnv.TRANSIENT_FAILURE);
            }
        } catch (Throwable th2) {
            fcgx fcgxVar2 = this.a;
            fcgx.a.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + String.valueOf(fcgxVar2.h) + "] Uncaught exception while panicking", th2);
        }
    }
}
