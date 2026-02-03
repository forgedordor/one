package defpackage;

import j$.io.InputStreamRetargetInterface;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fffu extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ fffv a;

    public fffu(fffv fffvVar) {
        this.a = fffvVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        fffv fffvVar = this.a;
        if (fffvVar.c) {
            throw new IOException("closed");
        }
        return (int) Math.min(fffvVar.b.b, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        fffv fffvVar = this.a;
        if (fffvVar.c) {
            throw new IOException("closed");
        }
        ffez ffezVar = fffvVar.b;
        if (ffezVar.b == 0 && fffvVar.a.b(ffezVar, 8192L) == -1) {
            return -1;
        }
        return ffezVar.d() & 255;
    }

    public final String toString() {
        fffv fffvVar = this.a;
        Objects.toString(fffvVar);
        return fffvVar.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final long transferTo(OutputStream outputStream) throws IOException {
        outputStream.getClass();
        fffv fffvVar = this.a;
        if (fffvVar.c) {
            throw new IOException("closed");
        }
        long j = 0;
        while (true) {
            ffez ffezVar = fffvVar.b;
            if (ffezVar.b == 0 && fffvVar.a.b(ffezVar, 8192L) == -1) {
                return j;
            }
            long j2 = ffezVar.b;
            j += j2;
            ffezVar.U(outputStream, j2);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        fffv fffvVar = this.a;
        if (!fffvVar.c) {
            ffes.b(bArr.length, i, i2);
            ffez ffezVar = fffvVar.b;
            if (ffezVar.b == 0 && fffvVar.a.b(ffezVar, 8192L) == -1) {
                return -1;
            }
            return ffezVar.e(bArr, i, i2);
        }
        throw new IOException("closed");
    }
}
