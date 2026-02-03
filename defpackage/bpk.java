package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpk implements Executor {
    private static volatile Executor a;
    private final ExecutorService b = Executors.newSingleThreadExecutor(new bpj());

    public static Executor a() {
        if (a == null) {
            synchronized (bpk.class) {
                if (a == null) {
                    a = new bpk();
                }
            }
        }
        return a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.execute(runnable);
    }
}
