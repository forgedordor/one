package defpackage;

import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.CronetBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgce implements Runnable {
    final /* synthetic */ UrlResponseInfo.HeaderBlock a;
    final /* synthetic */ CronetBidirectionalStream b;

    public fgce(CronetBidirectionalStream cronetBidirectionalStream, UrlResponseInfo.HeaderBlock headerBlock) {
        this.a = headerBlock;
        this.b = cronetBidirectionalStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CronetBidirectionalStream cronetBidirectionalStream = this.b;
        synchronized (cronetBidirectionalStream.l) {
            if (cronetBidirectionalStream.g()) {
                return;
            }
            try {
                CronetBidirectionalStream cronetBidirectionalStream2 = this.b;
                cronetBidirectionalStream2.b.onResponseTrailersReceived(cronetBidirectionalStream2, cronetBidirectionalStream2.s, this.a);
            } catch (Exception e) {
                this.b.e(e);
            }
        }
    }
}
