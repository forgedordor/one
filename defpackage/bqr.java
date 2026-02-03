package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqr implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ListenableFuture b;
    final /* synthetic */ bqs c;

    public bqr(bqs bqsVar, int i, ListenableFuture listenableFuture) {
        this.c = bqsVar;
        this.a = i;
        this.b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.a, this.b);
    }
}
