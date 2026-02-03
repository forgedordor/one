package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoqk {
    private static final eorz c = new eorz(eoqk.class);
    public eoqj a;
    public boolean b;

    public static void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            c.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ExecutionList", "executeListener", a.c(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e);
        }
    }
}
