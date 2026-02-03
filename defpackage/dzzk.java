package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzzk {
    public static final void a(final Level level, Executor executor, final Throwable th, final String str, final Object... objArr) {
        executor.execute(eiid.k(new Runnable() { // from class: dzzi
            @Override // java.lang.Runnable
            public final void run() {
                ((ekrd) ((ekrd) dzzj.a.a(level).g(th)).h("com/google/android/libraries/phenotype/client/Phlogger", "logInternal", 49, "Phlogger.java")).P(str, objArr);
            }
        }));
    }

    public static final void b(Level level, Executor executor, String str, Object... objArr) {
        a(level, executor, null, str, objArr);
    }
}
