package defpackage;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqkn implements Runnable {
    private static final ejxr a = ejxx.a(new ejxr() { // from class: dqkm
        @Override // defpackage.ejxr
        public final Object get() {
            return ekrg.c("com/google/android/libraries/concurrent/ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable");
        }
    });
    private static final Logger b = Logger.getLogger("ErrorLoggingExecutor");
    private final Runnable c;
    private final fcsu d;

    public dqkn(Runnable runnable, fcsu fcsuVar) {
        this.c = runnable;
        this.d = fcsuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.c.run();
        } catch (Throwable th) {
            if (((Boolean) ((ejwi) ((eyig) this.d).a).e(false)).booleanValue()) {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                return;
            }
            try {
                ((ekrd) ((ekrd) ((ekrd) ((ekrg) a.get()).i()).g(th)).h("com/google/android/libraries/concurrent/ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", 95, "ExceptionHandlingExecutorFactory.java")).q("Uncaught exception from runnable");
            } catch (Throwable th2) {
                Logger logger = b;
                logger.logp(Level.SEVERE, "com.google.android.libraries.concurrent.ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", "GoogleLogger failed to log", th2);
                Log.e("ErrorLoggingExecutor", "GoogleLogger failed to log", th2);
                logger.logp(Level.SEVERE, "com.google.android.libraries.concurrent.ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", "Uncaught exception from runnable", th);
                Log.e("ErrorLoggingExecutor", "Uncaught exception from runnable", th);
            }
        }
    }

    public final String toString() {
        return this.c.toString();
    }
}
