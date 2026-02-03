package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elfx implements Runnable {
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ elgb b;

    public elfx(elgb elgbVar, SettableFuture settableFuture) {
        this.a = settableFuture;
        this.b = elgbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            SettableFuture settableFuture = this.a;
            if (!settableFuture.isCancelled()) {
                if (eork.q(settableFuture) == elgb.b) {
                    return;
                }
            }
        } catch (ExecutionException unused) {
        }
        this.b.o(this.a);
    }
}
