package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eoqy<V> extends eoqw<V> implements ListenableFuture<V> {
    protected eoqy() {
    }

    public void b(Runnable runnable, Executor executor) {
        gM().b(runnable, executor);
    }

    protected abstract ListenableFuture gM();

    @Override // defpackage.eoqw
    protected /* bridge */ /* synthetic */ Future gN() {
        throw null;
    }
}
