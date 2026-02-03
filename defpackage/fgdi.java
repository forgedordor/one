package defpackage;

import org.chromium.net.impl.CronetUploadDataStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgdi implements Runnable {
    final /* synthetic */ CronetUploadDataStream a;

    public fgdi(CronetUploadDataStream cronetUploadDataStream) {
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
            cronetUploadDataStream.j = 1;
            try {
                cronetUploadDataStream.a();
                cronetUploadDataStream.b.rewind(cronetUploadDataStream);
            } catch (Exception e) {
                this.a.b(e);
            }
        }
    }
}
