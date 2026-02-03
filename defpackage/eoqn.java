package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoqn implements eooy {
    final /* synthetic */ eoqp a;
    final /* synthetic */ eooy b;

    public eoqn(eoqp eoqpVar, eooy eooyVar) {
        this.a = eoqpVar;
        this.b = eooyVar;
    }

    @Override // defpackage.eooy
    public final ListenableFuture a() {
        return !this.a.compareAndSet(eoqo.NOT_RUN, eoqo.STARTED) ? eork.g() : this.b.a();
    }

    public final String toString() {
        return this.b.toString();
    }
}
