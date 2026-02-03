package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eosa extends FutureTask implements ListenableFuture {
    private final eoqk a;

    public eosa(Runnable runnable) {
        super(runnable, null);
        this.a = new eoqk();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void b(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        eoqk eoqkVar = this.a;
        synchronized (eoqkVar) {
            if (eoqkVar.b) {
                eoqk.a(runnable, executor);
            } else {
                eoqkVar.a = new eoqj(runnable, executor, eoqkVar.a);
            }
        }
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        eoqk eoqkVar = this.a;
        synchronized (eoqkVar) {
            if (eoqkVar.b) {
                return;
            }
            eoqkVar.b = true;
            eoqj eoqjVar = eoqkVar.a;
            eoqj eoqjVar2 = null;
            eoqkVar.a = null;
            while (eoqjVar != null) {
                eoqj eoqjVar3 = eoqjVar.c;
                eoqjVar.c = eoqjVar2;
                eoqjVar2 = eoqjVar;
                eoqjVar = eoqjVar3;
            }
            while (eoqjVar2 != null) {
                eoqk.a(eoqjVar2.a, eoqjVar2.b);
                eoqjVar2 = eoqjVar2.c;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        return nanos <= 2147483647999999999L ? super.get(j, timeUnit) : super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    public eosa(Callable callable) {
        super(callable);
        this.a = new eoqk();
    }
}
