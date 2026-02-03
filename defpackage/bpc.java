package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpc implements Executor {
    private static volatile bpc a;

    public static Executor a() {
        if (a == null) {
            synchronized (bpc.class) {
                if (a == null) {
                    a = new bpc();
                }
            }
        }
        return a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
