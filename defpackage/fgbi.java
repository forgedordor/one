package defpackage;

import android.os.Process;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgbi implements Executor {
    final /* synthetic */ fgbj a;
    private final Executor b;

    public fgbi(fgbj fgbjVar, Executor executor) {
        this.a = fgbjVar;
        executor.getClass();
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws SecurityException, IllegalArgumentException {
        fgbj fgbjVar = this.a;
        if (fgbjVar.c == null) {
            Process.setThreadPriority(fgbjVar.b);
            fgbjVar.c = Thread.currentThread();
        }
        this.b.execute(runnable);
    }
}
