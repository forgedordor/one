package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esnc implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ SettableFuture b;
    final /* synthetic */ UrlRequest c;

    public esnc(int i, SettableFuture settableFuture, UrlRequest urlRequest) {
        this.a = i;
        this.b = settableFuture;
        this.c = urlRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eksl ekslVar = (eksl) esnj.a.n().h("com/google/frameworks/client/data/android/HttpClientImpl$1", "run", 165, "HttpClientImpl.java");
        int i = this.a;
        SettableFuture settableFuture = this.b;
        ekslVar.x("[%d] HTTP request complete, cancelled=%b", i, settableFuture.isCancelled());
        if (settableFuture.isCancelled()) {
            this.c.cancel();
        }
    }
}
