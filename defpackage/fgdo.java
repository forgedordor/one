package defpackage;

import org.chromium.net.impl.CronetUrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgdo implements Runnable {
    final /* synthetic */ fggl a;
    final /* synthetic */ String b;
    final /* synthetic */ CronetUrlRequest c;

    public fgdo(CronetUrlRequest cronetUrlRequest, fggl fgglVar, String str) {
        this.a = fgglVar;
        this.b = str;
        this.c = cronetUrlRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CronetUrlRequest cronetUrlRequest = this.c;
        cronetUrlRequest.a();
        synchronized (cronetUrlRequest.c) {
            if (cronetUrlRequest.h()) {
                return;
            }
            cronetUrlRequest.b = true;
            try {
                cronetUrlRequest.e.onRedirectReceived(cronetUrlRequest, this.a, this.b);
            } catch (Exception e) {
                this.c.e(e);
            }
        }
    }
}
