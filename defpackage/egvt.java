package defpackage;

import java.lang.Thread;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egvt extends fcxs implements CoroutineExceptionHandler {
    public static final egvt a = new egvt();

    private egvt() {
        super(CoroutineExceptionHandler.c);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(fcyh fcyhVar, Throwable th) {
        fcyhVar.getClass();
        th.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
        uncaughtExceptionHandler.getClass();
        uncaughtExceptionHandler.uncaughtException(threadCurrentThread, th);
    }
}
