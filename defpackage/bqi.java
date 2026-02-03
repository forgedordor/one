package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqi implements Runnable {
    final /* synthetic */ ListenableFuture a;

    public bqi(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.cancel(true);
    }
}
