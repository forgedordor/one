package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eoqe extends eory {
    private final Executor a;
    final /* synthetic */ eoqf b;

    public eoqe(eoqf eoqfVar, Executor executor) {
        this.b = eoqfVar;
        executor.getClass();
        this.a = executor;
    }

    public abstract void c(Object obj);

    @Override // defpackage.eory
    public final void d(Throwable th) {
        eoqf eoqfVar = this.b;
        eoqfVar.b = null;
        if (th instanceof ExecutionException) {
            eoqfVar.setException(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            eoqfVar.cancel(false);
        } else {
            eoqfVar.setException(th);
        }
    }

    @Override // defpackage.eory
    public final void e(Object obj) {
        this.b.b = null;
        c(obj);
    }

    final void f() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            this.b.setException(e);
        }
    }

    @Override // defpackage.eory
    public final boolean g() {
        return this.b.isDone();
    }
}
