package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnp extends FilterOutputStream {
    final OutputStream a;
    public ByteOrder b;

    public bnp(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.a = outputStream;
        this.b = byteOrder;
    }

    public final void a(int i) throws IOException {
        if (this.b == ByteOrder.LITTLE_ENDIAN) {
            OutputStream outputStream = this.a;
            outputStream.write(i & 255);
            outputStream.write((i >>> 8) & 255);
            outputStream.write((i >>> 16) & 255);
            outputStream.write(i >>> 24);
            return;
        }
        if (this.b == ByteOrder.BIG_ENDIAN) {
            OutputStream outputStream2 = this.a;
            outputStream2.write(i >>> 24);
            outputStream2.write((i >>> 16) & 255);
            outputStream2.write((i >>> 8) & 255);
            outputStream2.write(i & 255);
        }
    }

    public final void b(short s) throws IOException {
        if (this.b == ByteOrder.LITTLE_ENDIAN) {
            OutputStream outputStream = this.a;
            outputStream.write(s & 255);
            outputStream.write((s >>> 8) & 255);
            return;
        }
        if (this.b == ByteOrder.BIG_ENDIAN) {
            OutputStream outputStream2 = this.a;
            outputStream2.write((s >>> 8) & 255);
            outputStream2.write(s & 255);
        }
    }

    public final void c(long j) throws IOException {
        a((int) j);
    }

    public final void d(int i) throws IOException {
        b((short) i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }
}
