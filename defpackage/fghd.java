package defpackage;

import android.os.Trace;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fghd extends fghk {
    public final fghm a;
    public final ByteBuffer b;
    public boolean c;
    private final UploadDataProvider g = new fghc(this);

    public fghd(int i, fghm fghmVar) {
        if (i <= 0) {
            throw new IllegalArgumentException("chunkLength should be greater than 0");
        }
        this.b = ByteBuffer.allocate(i);
        this.a = fghmVar;
    }

    private final void f() {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer.hasRemaining()) {
            return;
        }
        new ffyu("CronetChunkedOutputStream#uploadBufferInternal");
        try {
            e();
            this.a.a();
            d();
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

    @Override // defpackage.fghk
    public final UploadDataProvider a() {
        return this.g;
    }

    @Override // defpackage.fghk
    public final boolean c() {
        return true;
    }

    @Override // defpackage.fghk, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.c) {
            return;
        }
        this.c = true;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        f();
        this.b.put((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        e();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2;
        while (i3 > 0) {
            ByteBuffer byteBuffer = this.b;
            int iMin = Math.min(i3, byteBuffer.remaining());
            byteBuffer.put(bArr, (i + i2) - i3, iMin);
            i3 -= iMin;
            f();
        }
    }

    @Override // defpackage.fghk
    public final void b() {
    }
}
