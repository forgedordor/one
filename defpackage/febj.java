package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class febj implements Executor {
    public static final febj a = new febj();

    private febj() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
