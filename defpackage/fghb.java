package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fghb extends fghk {
    public final int a;
    public ByteBuffer b;
    public boolean c;
    private final fghh g;
    private final UploadDataProvider h;
    private boolean i;

    public fghb(fghh fghhVar) {
        this.h = new fgha(this);
        this.g = fghhVar;
        this.a = -1;
        this.b = ByteBuffer.allocate(16384);
    }

    private final void f(int i) throws ProtocolException {
        int i2 = this.a;
        if (i2 != -1) {
            if (this.b.position() + i > i2) {
                throw new ProtocolException(a.e(i2, "exceeded content-length limit of ", " bytes"));
            }
        } else if (this.b.limit() - this.b.position() <= i) {
            int iCapacity = this.b.capacity();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(Math.max(iCapacity + iCapacity, this.b.capacity() + i));
            byteBufferAllocate.put(this.b);
            this.b = byteBufferAllocate;
        }
    }

    @Override // defpackage.fghk
    public final UploadDataProvider a() {
        return this.h;
    }

    @Override // defpackage.fghk
    public final boolean c() throws ProtocolException {
        if (!this.e) {
            this.i = true;
            return false;
        }
        this.c = true;
        if (this.b.position() < this.a) {
            throw new ProtocolException("Content received is less than Content-Length");
        }
        return true;
    }

    @Override // defpackage.fghk, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws ProtocolException {
        super.close();
        if (this.i) {
            this.g.connect();
            this.i = false;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        e();
        f(1);
        this.b.put((byte) i);
    }

    public fghb(fghh fghhVar, long j) {
        this.h = new fgha(this);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        }
        if (j >= 0) {
            this.g = fghhVar;
            int i = (int) j;
            this.a = i;
            this.b = ByteBuffer.allocate(i);
            return;
        }
        throw new IllegalArgumentException("Content length < 0.");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        e();
        f(i2);
        this.b.put(bArr, i, i2);
    }

    @Override // defpackage.fghk
    public final void b() {
    }
}
