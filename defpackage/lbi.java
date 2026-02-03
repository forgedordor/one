package defpackage;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbi implements Executor {
    private final Handler a;

    public lbi(Handler handler) {
        lcg.i(handler);
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        lcg.i(runnable);
        Handler handler = this.a;
        if (handler.post(runnable)) {
            return;
        }
        Objects.toString(handler);
        throw new RejectedExecutionException(handler.toString().concat(" is shutting down"));
    }
}
