package defpackage;

import android.os.Trace;
import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fghe extends UploadDataProvider {
    final /* synthetic */ fghf a;

    public fghe(fghf fghfVar) {
        this.a = fghfVar;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.b;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        new ffyu("CronetFixedModeOutputStream.UploadDataProviderImpl#read");
        try {
            int iRemaining = byteBuffer.remaining();
            fghf fghfVar = this.a;
            ByteBuffer byteBuffer2 = fghfVar.c;
            if (iRemaining >= byteBuffer2.remaining()) {
                byteBuffer.put(byteBuffer2);
                uploadDataSink.onReadSucceeded(false);
                fghfVar.a.c();
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
