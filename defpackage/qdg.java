package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qdg implements Runnable {
    private final ListenableFuture a;
    private final fdis b;

    public qdg(ListenableFuture listenableFuture, fdis fdisVar) {
        this.a = listenableFuture;
        this.b = fdisVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.a;
        if (listenableFuture.isCancelled()) {
            this.b.h(null);
            return;
        }
        try {
            this.b.w(qfc.b(listenableFuture));
        } catch (ExecutionException e) {
            this.b.w(fctl.a(qfc.c(e)));
        }
    }
}
