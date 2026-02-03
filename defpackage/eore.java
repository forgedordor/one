package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eore implements Runnable {
    ListenableFuture a;
    Future b;

    public eore(ListenableFuture listenableFuture, Future future) {
        this.a = listenableFuture;
        this.b = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eork.s(this.a, this.b);
        this.a = null;
        this.b = null;
    }
}
