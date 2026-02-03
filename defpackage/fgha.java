package defpackage;

import android.os.Trace;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgha extends UploadDataProvider {
    final /* synthetic */ fghb a;

    public fgha(fghb fghbVar) {
        this.a = fghbVar;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        fghb fghbVar = this.a;
        int i = fghbVar.a;
        if (i != -1) {
            return i;
        }
        boolean z = fghbVar.c;
        ByteBuffer byteBuffer = fghbVar.b;
        return z ? byteBuffer.limit() : byteBuffer.position();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        new ffyu("CronetBufferedOutputStream.UploadDataProviderImpl#read");
        try {
            int iRemaining = byteBuffer.remaining();
            fghb fghbVar = this.a;
            if (iRemaining < fghbVar.b.remaining()) {
                byteBuffer.put(fghbVar.b.array(), fghbVar.b.position(), iRemaining);
                ByteBuffer byteBuffer2 = fghbVar.b;
            } else {
                byteBuffer.put(fghbVar.b);
            }
            uploadDataSink.onReadSucceeded(false);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        new ffyu("CronetBufferedOutputStream.UploadDataProviderImpl#rewind");
        try {
            uploadDataSink.onRewindSucceeded();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
