package defpackage;

import org.chromium.net.impl.CronetUrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgdq implements Runnable {
    final /* synthetic */ CronetUrlRequest a;

    public fgdq(CronetUrlRequest cronetUrlRequest) {
        this.a = cronetUrlRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CronetUrlRequest cronetUrlRequest = this.a;
        synchronized (cronetUrlRequest.c) {
            if (cronetUrlRequest.h()) {
                return;
            }
            cronetUrlRequest.b(0);
            try {
                cronetUrlRequest.e.onSucceeded(cronetUrlRequest, cronetUrlRequest.g);
            } catch (Exception e) {
                this.a.d("onSucceeded", e);
            }
            this.a.c();
        }
    }
}
