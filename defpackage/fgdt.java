package defpackage;

import android.os.Trace;
import org.chromium.net.impl.CronetUrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgdt implements Runnable {
    final /* synthetic */ CronetUrlRequest a;

    public fgdt(CronetUrlRequest cronetUrlRequest) {
        this.a = cronetUrlRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new ffyu("CronetUrlRequest#onNativeAdapterDestroyed running callback");
        try {
            try {
                CronetUrlRequest cronetUrlRequest = this.a;
                cronetUrlRequest.e.onFailed(cronetUrlRequest, cronetUrlRequest.g, cronetUrlRequest.h);
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            this.a.d("onFailed", e);
        }
        this.a.c();
        Trace.endSection();
    }
}
