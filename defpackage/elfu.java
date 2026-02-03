package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elfu implements elga {
    @Override // defpackage.elga
    public final void c(Exception exc, long j) {
        elgb.a.logp(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "retryableExceptionCaught", "RetryingFuture caught exception; retrying", (Throwable) exc);
    }

    @Override // defpackage.elga
    public final void d(Exception exc) {
        elgb.a.logp(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "terminalExceptionCaught", "RetryingFuture caught terminal exception", (Throwable) exc);
    }

    @Override // defpackage.elga
    public final void a() {
    }

    @Override // defpackage.elga
    public final void b() {
    }
}
