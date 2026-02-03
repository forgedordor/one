package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgcc implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ CronetBidirectionalStream b;

    public fgcc(CronetBidirectionalStream cronetBidirectionalStream, boolean z) {
        this.a = z;
        this.b = cronetBidirectionalStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CronetBidirectionalStream cronetBidirectionalStream = this.b;
        synchronized (cronetBidirectionalStream.l) {
            if (cronetBidirectionalStream.g()) {
                return;
            }
            cronetBidirectionalStream.m = this.a;
            cronetBidirectionalStream.q = 2;
            if (CronetBidirectionalStream.f(cronetBidirectionalStream.c) || !cronetBidirectionalStream.m) {
                cronetBidirectionalStream.r = 8;
            } else {
                cronetBidirectionalStream.r = 10;
            }
            try {
                cronetBidirectionalStream.b.onStreamReady(cronetBidirectionalStream);
            } catch (Exception e) {
                this.b.e(e);
            }
        }
    }
}
