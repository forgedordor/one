package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eadw {
    static void a(final ListenableFuture listenableFuture) {
        listenableFuture.b(new Runnable() { // from class: eadu
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    eork.q(listenableFuture);
                } catch (ExecutionException e) {
                    ecem.e(new Runnable() { // from class: eadv
                        @Override // java.lang.Runnable
                        public final void run() {
                            throw new RuntimeException(e.getCause());
                        }
                    });
                }
            }
        }, eoqg.a);
    }
}
