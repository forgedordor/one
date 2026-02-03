package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgeo implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ fgep b;

    public fgeo(fgep fgepVar, Executor executor) {
        this.a = executor;
        this.b = fgepVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.g(e);
        }
    }
}
