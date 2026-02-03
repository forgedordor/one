package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvhw implements Executor {
    private static Reference a = new WeakReference(null);
    private final Handler b = new Handler(Looper.getMainLooper());

    private dvhw() {
    }

    public static synchronized Executor a() {
        Executor executor = (Executor) a.get();
        if (executor != null) {
            return executor;
        }
        dvhw dvhwVar = new dvhw();
        a = new WeakReference(dvhwVar);
        return dvhwVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }
}
