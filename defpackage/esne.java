package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esne extends UploadDataProvider {
    private final ByteBuffer a;

    public esne(esno esnoVar) {
        this.a = esnoVar.b.duplicate();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.remaining();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.a;
        if (byteBuffer2.remaining() > byteBuffer.remaining()) {
            int iLimit = byteBuffer2.limit();
            byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
            byteBuffer.put(byteBuffer2);
            byteBuffer2.limit(iLimit);
        } else {
            byteBuffer.put(byteBuffer2);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.a.rewind();
        uploadDataSink.onRewindSucceeded();
    }
}
