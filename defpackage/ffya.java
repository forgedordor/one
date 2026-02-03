package defpackage;

import java.lang.Thread;
import org.chromium.base.JavaHandlerThread;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffya implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ JavaHandlerThread a;

    public ffya(JavaHandlerThread javaHandlerThread) {
        this.a = javaHandlerThread;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.a.b = th;
    }
}
