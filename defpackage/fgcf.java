package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgcf implements Runnable {
    final /* synthetic */ CronetBidirectionalStream a;

    public fgcf(CronetBidirectionalStream cronetBidirectionalStream) {
        this.a = cronetBidirectionalStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            CronetBidirectionalStream cronetBidirectionalStream = this.a;
            cronetBidirectionalStream.b.onCanceled(cronetBidirectionalStream, cronetBidirectionalStream.s);
        } catch (Exception e) {
            this.a.d("onCanceled", e);
        }
        this.a.f.a();
    }
}
