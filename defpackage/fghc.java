package defpackage;

import android.os.Trace;
import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fghc extends UploadDataProvider {
    final /* synthetic */ fghd a;

    public fghc(fghd fghdVar) {
        this.a = fghdVar;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return -1L;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        new ffyu("CronetChunkedOutputStream.UploadDataProviderImpl#read");
        try {
            int iRemaining = byteBuffer.remaining();
            fghd fghdVar = this.a;
            ByteBuffer byteBuffer2 = fghdVar.b;
            if (iRemaining >= byteBuffer2.remaining()) {
                byteBuffer.put(byteBuffer2);
                uploadDataSink.onReadSucceeded(fghdVar.c);
                if (!fghdVar.c) {
                    fghdVar.a.c();
                }
            } else {
                int iLimit = byteBuffer2.limit();
                byteBuffer.put(byteBuffer2);
                uploadDataSink.onReadSucceeded(false);
            }
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
        uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}
