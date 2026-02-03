package defpackage;

import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbyg implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (!(th instanceof Error)) {
            throw new RuntimeException(th);
        }
        throw new Error(th);
    }
}
