package defpackage;

import io.grpc.Status;
import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcjg implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw new fbtf(Status.c(th).withDescription("Uncaught exception in the SynchronizationContext. Re-thrown."));
    }
}
