package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drlv extends drkp {
    public static final drlv a = new drlv(false);
    public static final drlv b = new drlv(true);
    private final Handler c = new Handler(Looper.getMainLooper());
    private final boolean d;

    private drlv(boolean z) {
        this.d = z;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.d || !drjz.b()) {
            this.c.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // defpackage.drkp
    protected final void h(Runnable runnable, long j, TimeUnit timeUnit) {
        this.c.postDelayed(runnable, timeUnit.toMillis(j));
    }

    @Override // defpackage.drkp, java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("UiThreadExecutor cannot be terminated.");
    }

    @Override // defpackage.drkp, java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException("UiThreadExecutor cannot be terminated.");
    }
}
