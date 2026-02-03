package defpackage;

import org.chromium.net.CronetException;
import org.chromium.net.impl.CronetBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgcg implements Runnable {
    final /* synthetic */ CronetException a;
    final /* synthetic */ CronetBidirectionalStream b;

    public fgcg(CronetBidirectionalStream cronetBidirectionalStream, CronetException cronetException) {
        this.a = cronetException;
        this.b = cronetBidirectionalStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this.a);
    }
}
