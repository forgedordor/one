package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esss implements Executor {
    private volatile Executor a;

    public esss(Executor executor) {
        this.a = executor;
    }

    public final void a() {
        this.a = eoqg.a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
