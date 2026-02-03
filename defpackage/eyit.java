package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eyit implements Runnable {
    final /* synthetic */ eyiz a;
    final /* synthetic */ eyiu b;

    public eyit(eyiu eyiuVar, eyiz eyizVar) {
        this.a = eyizVar;
        this.b = eyiuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.b.a;
        if (listenableFuture.isCancelled()) {
            boolean z = false;
            if ((listenableFuture instanceof eyis) && ((eyis) listenableFuture).d()) {
                z = true;
            }
            this.a.a(z);
        }
    }
}
