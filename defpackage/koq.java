package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class koq implements Runnable {
    private final ListenableFuture a;
    private final fdis b;

    public koq(ListenableFuture listenableFuture, fdis fdisVar) {
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
            this.b.w(koe.c(listenableFuture));
        } catch (ExecutionException e) {
            this.b.w(fctl.a(koo.b(e)));
        }
    }
}
