package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class eyix extends eyiw implements Executor, eooz {
    private final eyik b;
    private final eyji c;
    private final eyik d;
    private volatile eyjh e = null;

    protected eyix(eyik eyikVar, eyji eyjiVar, eyik eyikVar2) {
        this.b = eyikVar;
        this.c = eyjiVar;
        this.d = eyikVar2;
    }

    @Override // defpackage.eooz
    @Deprecated
    public final ListenableFuture a(Object obj) {
        this.e.d();
        try {
            return b(obj);
        } finally {
            this.e.c();
        }
    }

    protected abstract ListenableFuture b(Object obj);

    protected abstract ListenableFuture c();

    @Override // defpackage.eyiw
    protected final ListenableFuture e() {
        this.e = ((eyjm) this.b.b()).a(this.c);
        this.e.f();
        ListenableFuture listenableFutureG = eooq.g(c(), this, this);
        this.e.a(listenableFutureG);
        return listenableFutureG;
    }

    @Override // java.util.concurrent.Executor
    @Deprecated
    public final void execute(Runnable runnable) {
        this.e.e();
        ((Executor) this.d.b()).execute(runnable);
    }
}
