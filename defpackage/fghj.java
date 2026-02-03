package defpackage;

import android.os.Trace;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fghj extends InputStream implements InputStreamRetargetInterface {
    public boolean a;
    public ByteBuffer b;
    public IOException c;
    private final fghh d;

    public fghj(fghh fghhVar) {
        this.d = fghhVar;
    }

    private final void a() throws IOException {
        if (this.a) {
            IOException iOException = this.c;
            if (iOException != null) {
                throw iOException;
            }
            return;
        }
        if (b()) {
            return;
        }
        if (this.b == null) {
            this.b = ByteBuffer.allocateDirect(32768);
        }
        fghh fghhVar = this.d;
        ByteBuffer byteBuffer = this.b;
        new ffyu("CronetHttpURLConnection#getMoreData");
        try {
            fghhVar.b.read(byteBuffer);
            fghhVar.a.b(fghhVar.getReadTimeout());
            Trace.endSection();
            IOException iOException2 = this.c;
            if (iOException2 != null) {
                throw iOException2;
            }
            ByteBuffer byteBuffer2 = this.b;
            if (byteBuffer2 != null) {
            }
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final boolean b() {
        ByteBuffer byteBuffer = this.b;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (!this.a) {
            if (b()) {
                return this.b.remaining();
            }
            return 0;
        }
        IOException iOException = this.c;
        if (iOException == null) {
            return 0;
        }
        throw iOException;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        a();
        if (b()) {
            return this.b.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        a();
        if (!b()) {
            return -1;
        }
        int iMin = Math.min(this.b.limit() - this.b.position(), i2);
        this.b.get(bArr, i, iMin);
        return iMin;
    }
}
