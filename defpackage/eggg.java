package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eggg {
    public final ecjh a;
    public final Executor b;
    public final dqme c;

    public eggg(ecjh ecjhVar, Executor executor, dqme dqmeVar) {
        this.a = ecjhVar;
        this.b = executor;
        this.c = dqmeVar;
    }

    final ListenableFuture a() {
        ListenableFuture listenableFutureA = this.a.a();
        return listenableFutureA.isDone() ? listenableFutureA : new eggf(this, listenableFutureA);
    }

    final ListenableFuture b(ejvr ejvrVar, Executor executor) {
        return new eggf(this, this.a.b(ejvrVar, new eggc(this, executor)));
    }
}
