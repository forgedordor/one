package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpn {
    public static Executor a() {
        final Handler handlerCreateAsync = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
        handlerCreateAsync.getClass();
        return new Executor() { // from class: lpl
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handlerCreateAsync.post(runnable);
            }
        };
    }
}
