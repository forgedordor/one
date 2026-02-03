package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eyis extends eooi implements Runnable {
    private ListenableFuture a;

    public eyis(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    public final boolean d() {
        return super.p();
    }

    @Override // defpackage.eooi
    protected final String gu() {
        ListenableFuture listenableFuture = this.a;
        if (listenableFuture != null) {
            return a.h(listenableFuture, "delegate=[", "]");
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
