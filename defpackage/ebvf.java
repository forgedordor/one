package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebvf implements Executor {
    public static final ebvf a = new ebvf(Looper.getMainLooper());
    private final Handler b;

    private ebvf(Looper looper) {
        this.b = new Handler(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }
}
