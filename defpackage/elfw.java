package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elfw implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ elgb b;

    public elfw(elgb elgbVar, Executor executor) {
        this.a = executor;
        this.b = elgbVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.setException(e);
        }
    }
}
