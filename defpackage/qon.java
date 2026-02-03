package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qon extends FutureTask {
    final /* synthetic */ qoo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qon(qoo qooVar, Callable callable) {
        super(callable);
        this.a = qooVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        if (isCancelled()) {
            return;
        }
        try {
            this.a.c((qol) get());
        } catch (InterruptedException | ExecutionException e) {
            this.a.c(new qol(e));
        }
    }
}
