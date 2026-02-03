package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdxt implements Runnable {
    private final ListenableFuture a;
    private final fdis b;

    public fdxt(ListenableFuture listenableFuture, fdis fdisVar) {
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
            this.b.w(eote.a(listenableFuture));
        } catch (ExecutionException e) {
            this.b.w(fctl.a(fdxs.d(e)));
        }
    }
}
