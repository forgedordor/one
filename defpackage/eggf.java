package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eggf extends eoqy {
    final /* synthetic */ eggg a;
    private final ListenableFuture b;

    public eggf(eggg egggVar, ListenableFuture listenableFuture) {
        this.a = egggVar;
        this.b = listenableFuture;
    }

    @Override // defpackage.eoqy, com.google.common.util.concurrent.ListenableFuture
    public final void b(Runnable runnable, Executor executor) {
        if (isDone()) {
            this.b.b(runnable, executor);
        }
        this.b.b(runnable, new eggc(this.a, executor));
    }

    @Override // defpackage.eoqy
    protected final ListenableFuture gM() {
        return this.b;
    }

    @Override // defpackage.eoqy, defpackage.eoqw
    protected final /* synthetic */ Future gN() {
        return this.b;
    }

    @Override // defpackage.eoqw, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.b;
    }
}
