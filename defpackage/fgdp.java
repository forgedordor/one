package defpackage;

import org.chromium.net.impl.CronetUrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgdp implements Runnable {
    final /* synthetic */ CronetUrlRequest a;

    public fgdp(CronetUrlRequest cronetUrlRequest) {
        this.a = cronetUrlRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CronetUrlRequest cronetUrlRequest = this.a;
        cronetUrlRequest.a();
        synchronized (cronetUrlRequest.c) {
            if (cronetUrlRequest.h()) {
                return;
            }
            cronetUrlRequest.k = true;
            try {
                cronetUrlRequest.e.onResponseStarted(cronetUrlRequest, cronetUrlRequest.g);
            } catch (Exception e) {
                this.a.e(e);
            }
        }
    }
}
