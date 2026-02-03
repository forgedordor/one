package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egos implements eooy {
    final /* synthetic */ eooy a;
    final /* synthetic */ ListenableFuture b;

    public egos(eooy eooyVar, ListenableFuture listenableFuture) {
        this.a = eooyVar;
        this.b = listenableFuture;
    }

    @Override // defpackage.eooy
    public final ListenableFuture a() {
        return this.a.a();
    }

    public final String toString() {
        ListenableFuture listenableFuture = this.b;
        return this.a.toString() + ", input=[" + String.valueOf(listenableFuture) + "]";
    }
}
