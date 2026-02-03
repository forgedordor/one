package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetUrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgdu implements Runnable {
    public ByteBuffer a;
    final /* synthetic */ CronetUrlRequest b;

    public fgdu(CronetUrlRequest cronetUrlRequest) {
        this.b = cronetUrlRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CronetUrlRequest cronetUrlRequest = this.b;
        cronetUrlRequest.a();
        ByteBuffer byteBuffer = this.a;
        this.a = null;
        try {
            synchronized (cronetUrlRequest.c) {
                if (cronetUrlRequest.h()) {
                    return;
                }
                cronetUrlRequest.k = true;
                cronetUrlRequest.e.onReadCompleted(cronetUrlRequest, cronetUrlRequest.g, byteBuffer);
            }
        } catch (Exception e) {
            this.b.e(e);
        }
    }
}
