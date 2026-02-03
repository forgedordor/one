package defpackage;

import org.chromium.net.impl.CronetUploadDataStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgdj implements Runnable {
    final /* synthetic */ CronetUploadDataStream a;

    public fgdj(CronetUploadDataStream cronetUploadDataStream) {
        this.a = cronetUploadDataStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            CronetUploadDataStream cronetUploadDataStream = this.a;
            cronetUploadDataStream.a();
            cronetUploadDataStream.b.close();
        } catch (Exception e) {
            ffyc.d(CronetUploadDataStream.a, "Exception thrown when closing", e);
        }
    }
}
