package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bps implements Runnable {
    final /* synthetic */ ListenableFuture a;
    final /* synthetic */ bpt b;

    public bps(bpt bptVar, ListenableFuture listenableFuture) {
        this.b = bptVar;
        this.a = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                bpt bptVar = this.b;
                Object objH = bqk.h(this.a);
                kog kogVar = bptVar.b;
                if (kogVar != null) {
                    kogVar.b(objH);
                }
                this.b.a = null;
            } catch (CancellationException unused) {
                this.b.cancel(false);
                this.b.a = null;
            } catch (ExecutionException e) {
                bpt bptVar2 = this.b;
                bptVar2.c(e.getCause());
                bptVar2.a = null;
            }
        } catch (Throwable th) {
            this.b.a = null;
            throw th;
        }
    }
}
