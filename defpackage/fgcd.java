package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgcd implements Runnable {
    final /* synthetic */ CronetBidirectionalStream a;

    public fgcd(CronetBidirectionalStream cronetBidirectionalStream) {
        this.a = cronetBidirectionalStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CronetBidirectionalStream cronetBidirectionalStream = this.a;
        synchronized (cronetBidirectionalStream.l) {
            if (cronetBidirectionalStream.g()) {
                return;
            }
            cronetBidirectionalStream.q = 2;
            try {
                cronetBidirectionalStream.b.onResponseHeadersReceived(cronetBidirectionalStream, cronetBidirectionalStream.s);
            } catch (Exception e) {
                this.a.e(e);
            }
        }
    }
}
