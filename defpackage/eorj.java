package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.eooi;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eorj extends eooi.f implements Runnable {
    private ListenableFuture a;

    public eorj(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    @Override // defpackage.eooi
    protected final String gu() {
        ListenableFuture listenableFuture = this.a;
        if (listenableFuture != null) {
            return a.b(listenableFuture, "delegate=[", "]");
        }
        return null;
    }

    @Override // defpackage.eooi
    protected final void gv() {
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.a;
        if (listenableFuture != null) {
            o(listenableFuture);
        }
    }
}
