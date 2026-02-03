package defpackage;

import android.os.Binder;
import android.os.Process;
import android.os.StrictMode;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqle {
    public static final /* synthetic */ int a = 0;
    private static final ekrg b = ekrg.c("com/google/android/libraries/concurrent/blockable/BlockableFutures");
    private static final ThreadLocal c = new dqld();

    public static Object a(Future future) {
        c();
        return future.get();
    }

    public static Object b(Future future, long j, TimeUnit timeUnit) {
        c();
        return future.get(j, timeUnit);
    }

    public static void c() {
        if (((Boolean) c.get()).booleanValue()) {
            return;
        }
        if (Binder.getCallingPid() != Process.myPid()) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!threadCurrentThread.getName().startsWith("Binder:")) {
                StackTraceElement[] stackTrace = threadCurrentThread.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[length];
                    if (Binder.class.getName().equals(stackTraceElement.getClassName()) && "execTransact".equals(stackTraceElement.getMethodName())) {
                        d();
                        return;
                    }
                }
            } else {
                d();
                return;
            }
        }
        final IllegalStateException illegalStateException = new IllegalStateException("Cannot block on non-blocking thread: ".concat(String.valueOf(Thread.currentThread().getName())));
        int iOrdinal = dqlg.d.ordinal();
        if (iOrdinal == 0) {
            ((ekrd) ((ekrd) ((ekrd) b.i()).g(illegalStateException)).h("com/google/android/libraries/concurrent/blockable/BlockableFutures", "validateThreadIsBlockable", (char) 132, "BlockableFutures.java")).q("Cannot block on non-blocking thread");
        } else if (iOrdinal == 1) {
            StrictMode.noteSlowCall(illegalStateException.getMessage());
        } else {
            if (iOrdinal != 2) {
                return;
            }
            ecem.e(new Runnable() { // from class: dqlc
                @Override // java.lang.Runnable
                public final void run() {
                    int i = dqle.a;
                    throw illegalStateException;
                }
            });
            throw illegalStateException;
        }
    }

    public static void d() {
        c.set(true);
    }
}
