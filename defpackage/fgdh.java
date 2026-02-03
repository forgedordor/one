package defpackage;

import org.chromium.net.impl.CronetUploadDataStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgdh implements Runnable {
    final /* synthetic */ CronetUploadDataStream a;

    public fgdh(CronetUploadDataStream cronetUploadDataStream) {
        this.a = cronetUploadDataStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CronetUploadDataStream cronetUploadDataStream = this.a;
        synchronized (cronetUploadDataStream.h) {
            if (cronetUploadDataStream.i == 0) {
                return;
            }
            cronetUploadDataStream.e(3);
            if (cronetUploadDataStream.g == null) {
                throw new IllegalStateException("Unexpected readData call. Buffer is null");
            }
            cronetUploadDataStream.j = 0;
            try {
                cronetUploadDataStream.a();
                cronetUploadDataStream.b.read(cronetUploadDataStream, cronetUploadDataStream.g);
                cronetUploadDataStream.f.incrementAndGet();
            } catch (Exception e) {
                this.a.b(e);
            }
        }
    }
}
